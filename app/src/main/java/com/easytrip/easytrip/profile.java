package com.easytrip.easytrip;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class profile extends AppCompatActivity {

    TextView username, email;
    SharedPreferences pref;
    String username_txt, email_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        pref = getSharedPreferences("AppPref", MODE_PRIVATE);
        username_txt = pref.getString("username", "");
        email_txt = pref.getString("email", "");

        Button logout = (Button) findViewById(R.id.logout);
        Button back = (Button) findViewById(R.id.back);
        username = (TextView) findViewById(R.id.username);
        email = (TextView) findViewById(R.id.email);

        username.setText(username_txt);
        email.setText(email_txt);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor edit = pref.edit();
                edit.clear();
                edit.commit();
                startActivity(new Intent(profile.this, login.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(profile.this, home.class));
            }
        });
    }
}
