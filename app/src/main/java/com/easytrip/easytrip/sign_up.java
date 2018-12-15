package com.easytrip.easytrip;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sign_up extends AppCompatActivity {

    sqlite db;
    Cursor res;
    EditText username, email, password;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);

        db = new sqlite(this);

        res = db.getAllData();

        Button cancel = (Button) findViewById(R.id.cancel);
        Button create = (Button) findViewById(R.id.create);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sign_up.this, login.class));
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                res = db.getAllData();

                if(username.getText().toString().isEmpty() || email.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
                    if(username.getText().toString().isEmpty()){
                        username.setError("Enter Username");
                    }
                    if(email.getText().toString().isEmpty()){
                        email.setError("Enter Email");
                    }
                    if(password.getText().toString().isEmpty()){
                        password.setError("Enter Password");
                    }
                }else {

                    while (res.moveToNext()) {
                        if (username.getText().toString().equals(res.getString(res.getColumnIndex("username"))) || email.getText().toString().equals(res.getString(res.getColumnIndex("email")))) {
                            counter = 1;
                        }
                    }
                    if (counter == 1) {
                        Toast.makeText(sign_up.this, "Username/Email already exist", Toast.LENGTH_SHORT).show();
                        counter = 0;
                    } else {
                        insertToSqlite(username.getText().toString(), email.getText().toString(), password.getText().toString());
                        startActivity(new Intent(sign_up.this, login.class));
                    }
                }
            }
        });

    }

    public void insertToSqlite(String username, String email, String password) {
        db.insertData(username, email, password);
    }


}
