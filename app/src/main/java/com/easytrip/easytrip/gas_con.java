package com.easytrip.easytrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class gas_con extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas_con);

        Button nlex = (Button) findViewById(R.id.nlex);
        Button slex = (Button) findViewById(R.id.slex);
        Button back = (Button) findViewById(R.id.back);

        nlex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(gas_con.this, gas_nlex.class));
            }
        });

        slex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(gas_con.this, gas_slex.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(gas_con.this, home.class));
            }
        });
    }
}
