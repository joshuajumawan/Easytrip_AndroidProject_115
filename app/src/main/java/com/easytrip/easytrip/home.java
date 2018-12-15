package com.easytrip.easytrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button profile = (Button) findViewById(R.id.profile);
        Button tollfee = (Button) findViewById(R.id.tollfee);
        Button gas = (Button) findViewById(R.id.gas);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this, profile.class));
            }
        });

        tollfee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this, tollfee.class));
            }
        });

        gas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this, gas_con.class));
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}
