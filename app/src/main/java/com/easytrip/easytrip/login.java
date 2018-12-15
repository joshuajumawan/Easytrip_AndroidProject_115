package com.easytrip.easytrip;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText username, password;
    String username_input, email;
    sqlite db;
    Cursor res;
    int counter = 0;
    SharedPreferences pref;
    String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        pref = getSharedPreferences("AppPref", MODE_PRIVATE);
        token = pref.getString("token", "");

        if(token.toString().isEmpty()) {

        }else{
            startActivity(new Intent(login.this, home.class));
            finish();
        }

        db = new sqlite(this);

        res = db.getAllData();

        final TextView signup = (TextView) findViewById(R.id.signup);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login.this, sign_up.class));
            }
        });

        Button login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = db.getAllData();
                if(username.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
                    if(username.getText().toString().isEmpty()){
                        username.setError("Enter Username!");
                    }
                    if(password.getText().toString().isEmpty()){
                        password.setError("Enter Password!");
                    }
                }else {
                    while (res.moveToNext()) {
                        if (username.getText().toString().equals(res.getString(res.getColumnIndex("username"))) && password.getText().toString().equals(res.getString(res.getColumnIndex("password")))) {
                            email = res.getString(res.getColumnIndex("email"));
                            username_input = username.getText().toString();
                            SharedPreferences.Editor edit = pref.edit();
                            edit.putString("token", username_input);
                            edit.putString("username", username_input);
                            edit.putString("email", email);
                            edit.commit();
                            startActivity(new Intent(login.this, home.class));
                            counter = 1;
                        }
                    }

                    if(counter == 0) {
                        Toast.makeText(login.this, "Incorrect Username/Password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}
