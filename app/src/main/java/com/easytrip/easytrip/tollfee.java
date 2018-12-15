package com.easytrip.easytrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tollfee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tollfee);

        Button nlex = (Button) findViewById(R.id.nlex);
        Button slex = (Button) findViewById(R.id.slex);
        Button back = (Button) findViewById(R.id.back);

        nlex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tollfee.this, tollfee_nlex.class));
            }
        });

        slex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tollfee.this, tollfee_slex.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tollfee.this, home.class));
            }
        });
    }
}
