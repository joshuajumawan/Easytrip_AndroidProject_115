package com.easytrip.easytrip;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class tollfee_slex extends AppCompatActivity {

    Dialog dialog_class, dialog_slex;
    Button cancel, confirm, btn_class, entry, exit;
    TextView rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tollfee_slex);

        cancel = (Button) findViewById(R.id.cancel);
        confirm = (Button) findViewById(R.id.confirm);
        btn_class = (Button) findViewById(R.id.btn_class);
        entry = (Button) findViewById(R.id.entry);
        exit = (Button) findViewById(R.id.exit);

        rate  = (TextView) findViewById(R.id.rate);

        btn_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog_class = new Dialog(tollfee_slex.this);
                dialog_class.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog_class.setContentView(R.layout.dialog_class);
                dialog_class.setCancelable(false);
                dialog_class.show();
                final Button class_1 = (Button) dialog_class.findViewById(R.id.class_1);
                final Button class_2 = (Button) dialog_class.findViewById(R.id.class_2);
                final Button class_3 = (Button) dialog_class.findViewById(R.id.class_3);
                final TextView back = (TextView) dialog_class.findViewById(R.id.back);

                class_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btn_class.setText("Class 1");
                        dialog_class.dismiss();
                    }
                });

                class_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btn_class.setText("Class 2");
                        dialog_class.dismiss();
                    }
                });

                class_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btn_class.setText("Class 3");
                        dialog_class.dismiss();
                    }
                });

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_class.dismiss();
                    }
                });

            }
        });

        entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog_slex = new Dialog(tollfee_slex.this);
                dialog_slex.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog_slex.setContentView(R.layout.dialog_slex);
                dialog_slex.setCancelable(false);
                dialog_slex.show();

                final Button sucat = (Button) dialog_slex.findViewById(R.id.Sucat);
                sucat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Sucat");
                        dialog_slex.dismiss();
                    }
                });
                final Button alabang = (Button) dialog_slex.findViewById(R.id.Alabang);
                alabang.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Alabang");
                        dialog_slex.dismiss();
                    }
                });
                final Button filinvest = (Button) dialog_slex.findViewById(R.id.Filinvest);
                filinvest.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Filinvest");
                        dialog_slex.dismiss();
                    }
                });
                final Button san_Pedro = (Button) dialog_slex.findViewById(R.id.San_Pedro);
                san_Pedro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("San Pedro");
                        dialog_slex.dismiss();
                    }
                });
                final Button southwoods = (Button) dialog_slex.findViewById(R.id.Southwoods);
                southwoods.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Southwoods");
                        dialog_slex.dismiss();
                    }
                });
                final Button carmona = (Button) dialog_slex.findViewById(R.id.Carmona);
                carmona.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Carmona");
                        dialog_slex.dismiss();
                    }
                });
                final Button sta_Rosa = (Button) dialog_slex.findViewById(R.id.Sta__Rosa);
                sta_Rosa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Sta. Rosa");
                        dialog_slex.dismiss();
                    }
                });
                final Button cabuyao = (Button) dialog_slex.findViewById(R.id.Cabuyao);
                cabuyao.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Cabuyao");
                        dialog_slex.dismiss();
                    }
                });
                final Button silangan = (Button) dialog_slex.findViewById(R.id.Silangan);
                silangan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Silangan");
                        dialog_slex.dismiss();
                    }
                });
                final Button calamba = (Button) dialog_slex.findViewById(R.id.Calamba);
                calamba.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Calamba");
                        dialog_slex.dismiss();
                    }
                });

                final TextView back = (TextView) dialog_slex.findViewById(R.id.back);

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_slex.dismiss();
                        dialog_slex.dismiss();
                    }
                });
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog_slex = new Dialog(tollfee_slex.this);
                dialog_slex.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog_slex.setContentView(R.layout.dialog_slex);
                dialog_slex.setCancelable(false);
                dialog_slex.show();


                final Button sucat = (Button) dialog_slex.findViewById(R.id.Sucat);
                sucat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Sucat");
                        dialog_slex.dismiss();
                    }
                });
                final Button alabang = (Button) dialog_slex.findViewById(R.id.Alabang);
                alabang.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Alabang");
                        dialog_slex.dismiss();
                    }
                });
                final Button filinvest = (Button) dialog_slex.findViewById(R.id.Filinvest);
                filinvest.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Filinvest");
                        dialog_slex.dismiss();
                    }
                });
                final Button san_Pedro = (Button) dialog_slex.findViewById(R.id.San_Pedro);
                san_Pedro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("San Pedro");
                        dialog_slex.dismiss();
                    }
                });
                final Button southwoods = (Button) dialog_slex.findViewById(R.id.Southwoods);
                southwoods.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Southwoods");
                        dialog_slex.dismiss();
                    }
                });
                final Button carmona = (Button) dialog_slex.findViewById(R.id.Carmona);
                carmona.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Carmona");
                        dialog_slex.dismiss();
                    }
                });
                final Button sta_Rosa = (Button) dialog_slex.findViewById(R.id.Sta__Rosa);
                sta_Rosa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Sta. Rosa");
                        dialog_slex.dismiss();
                    }
                });
                final Button cabuyao = (Button) dialog_slex.findViewById(R.id.Cabuyao);
                cabuyao.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Cabuyao");
                        dialog_slex.dismiss();
                    }
                });
                final Button silangan = (Button) dialog_slex.findViewById(R.id.Silangan);
                silangan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Silangan");
                        dialog_slex.dismiss();
                    }
                });
                final Button calamba = (Button) dialog_slex.findViewById(R.id.Calamba);
                calamba.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Calamba");
                        dialog_slex.dismiss();
                    }
                });

                final TextView back = (TextView) dialog_slex.findViewById(R.id.back);

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_slex.dismiss();
                    }
                });
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tollfee_slex.this, tollfee.class));
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn_class.getText().toString().equals("Class 1")){
                    if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Alabang")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Alabang")){
                        rate.setText("34.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Filinvest")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Filinvest")){
                        rate.setText("38.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("San Pedro")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("San Pedro")){
                        rate.setText("55.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Southwoods")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Southwoods")){
                        rate.setText("68.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Carmona")){
                        rate.setText("74.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("91.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("109.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Silangan")){
                        rate.setText("114.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Calamba")){
                        rate.setText("130.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Filinvest")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Filinvest")){
                        rate.setText("4.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("San Pedro")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("San Pedro")){
                        rate.setText("21.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Southwoods")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Southwoods")){
                        rate.setText("34.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Carmona")){
                        rate.setText("40.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("57.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("75.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Silangan")){
                        rate.setText("80.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Calamba")){
                        rate.setText("96.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("San Pedro")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("San Pedro")){
                        rate.setText("16.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Southwoods")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Southwoods")){
                        rate.setText("30.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Carmona")){
                        rate.setText("35.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("52.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("70.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Silangan")){
                        rate.setText("76.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Calamba")){
                        rate.setText("91.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Southwoods")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Southwoods")){
                        rate.setText("13.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Carmona")){
                        rate.setText("19.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("35.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("53.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Silangan")){
                        rate.setText("59.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Calamba")){
                        rate.setText("75.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Carmona")){
                        rate.setText("5.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("22.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("40.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Silangan")){
                        rate.setText("45.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Calamba")){
                        rate.setText("61.00");
                    }
                    else if(entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("16.00");
                    }
                    else if(entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("35.00");
                    }
                    else if(entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Silangan")){
                        rate.setText("40.00");
                    }
                    else if(entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Calamba")){
                        rate.setText("56.00");
                    }
                    else if(entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("19.00");
                    }
                    else if(entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Silangan")){
                        rate.setText("23.00");
                    }
                    else if(entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Calamba")){
                        rate.setText("39.00");
                    }
                    else if(entry.getText().toString().equals("Cabuyao") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Cabuyao") && entry.getText().toString().equals("Silangan")){
                        rate.setText("4.00");
                    }
                    else if(entry.getText().toString().equals("Cabuyao") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Cabuyao") && entry.getText().toString().equals("Calamba")){
                        rate.setText("21.00");
                    }
                    else if(entry.getText().toString().equals("Silangan") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Silangan") && entry.getText().toString().equals("Calamba")){
                        rate.setText("15.00");
                    }
                    else {
                        rate.setText("0.00");
                    }
                }
                else if (btn_class.getText().toString().equals("Class 2")){
                    if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Alabang")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Alabang")){
                        rate.setText("69.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Filinvest")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Filinvest")){
                        rate.setText("77.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("San Pedro")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("San Pedro")){
                        rate.setText("111.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Southwoods")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Southwoods")){
                        rate.setText("138.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Carmona")){
                        rate.setText("148.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("182.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("219.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Silangan")){
                        rate.setText("229.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Calamba")){
                        rate.setText("261.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Filinvest")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Filinvest")){
                        rate.setText("8.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("San Pedro")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("San Pedro")){
                        rate.setText("42.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Southwoods")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Southwoods")){
                        rate.setText("69.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Carmona")){
                        rate.setText("79.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("113.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("150.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Silangan")){
                        rate.setText("160.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Calamba")){
                        rate.setText("192.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("San Pedro")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("San Pedro")){
                        rate.setText("34.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Southwoods")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Southwoods")){
                        rate.setText("60.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Carmona")){
                        rate.setText("71.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("105.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("142.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Silangan")){
                        rate.setText("152.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Calamba")){
                        rate.setText("183.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Southwoods")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Southwoods")){
                        rate.setText("26.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Carmona")){
                        rate.setText("36.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("70.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("107.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Silangan")){
                        rate.setText("117.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Calamba")){
                        rate.setText("150.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Carmona")){
                        rate.setText("10.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("43.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("81.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Silangan")){
                        rate.setText("90.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Calamba")){
                        rate.setText("123.00");
                    }
                    else if(entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("33.00");
                    }
                    else if(entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("70.00");
                    }
                    else if(entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Silangan")){
                        rate.setText("80.00");
                    }
                    else if(entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Calamba")){
                        rate.setText("112.00");
                    }
                    else if(entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("36.00");
                    }
                    else if(entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Silangan")){
                        rate.setText("47.00");
                    }
                    else if(entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Calamba")){
                        rate.setText("78.00");
                    }
                    else if(entry.getText().toString().equals("Cabuyao") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Cabuyao") && entry.getText().toString().equals("Silangan")){
                        rate.setText("10.00");
                    }
                    else if(entry.getText().toString().equals("Cabuyao") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Cabuyao") && entry.getText().toString().equals("Calamba")){
                        rate.setText("41.00");
                    }
                    else if(entry.getText().toString().equals("Silangan") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Silangan") && entry.getText().toString().equals("Calamba")){
                        rate.setText("31.00");
                    }
                    else {
                        rate.setText("0.00");
                    }
                }
                else if (btn_class.getText().toString().equals("Class 3")){
                    if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Alabang")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Alabang")){
                        rate.setText("104.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Filinvest")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Filinvest")){
                        rate.setText("116.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("San Pedro")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("San Pedro")){
                        rate.setText("167.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Southwoods")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Southwoods")){
                        rate.setText("208.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Carmona")){
                        rate.setText("223.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("274.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("330.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Silangan")){
                        rate.setText("344.00");
                    }
                    else if(entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Calamba")){
                        rate.setText("392.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Filinvest")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Filinvest")){
                        rate.setText("12.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("San Pedro")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("San Pedro")){
                        rate.setText("63.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Southwoods")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Southwoods")){
                        rate.setText("104.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Carmona")){
                        rate.setText("119.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("170.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("226.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Silangan")){
                        rate.setText("240.00");
                    }
                    else if(entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Calamba")){
                        rate.setText("288.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("San Pedro")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("San Pedro")){
                        rate.setText("51.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Southwoods")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Southwoods")){
                        rate.setText("91.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Carmona")){
                        rate.setText("107.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("157.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("212.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Silangan")){
                        rate.setText("228.00");
                    }
                    else if(entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Calamba")){
                        rate.setText("275.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Southwoods")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Southwoods")){
                        rate.setText("40.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Carmona")){
                        rate.setText("56.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("106.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("161.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Silangan")){
                        rate.setText("176.00");
                    }
                    else if(entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Calamba")){
                        rate.setText("224.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Carmona")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Carmona")){
                        rate.setText("15.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("66.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("122.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Silangan")){
                        rate.setText("136.00");
                    }
                    else if(entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Calamba")){
                        rate.setText("184.00");
                    }
                    else if(entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Sta. Rosa")  || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Sta. Rosa")){
                        rate.setText("50.00");
                    }
                    else if(entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("106.00");
                    }
                    else if(entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Silangan")){
                        rate.setText("120.00");
                    }
                    else if(entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Calamba")){
                        rate.setText("169.00");
                    }
                    else if(entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Cabuyao")  || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Cabuyao")){
                        rate.setText("56.00");
                    }
                    else if(entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Silangan")){
                        rate.setText("70.00");
                    }
                    else if(entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Calamba")){
                        rate.setText("118.00");
                    }
                    else if(entry.getText().toString().equals("Cabuyao") && exit.getText().toString().equals("Silangan")  || exit.getText().toString().equals("Cabuyao") && entry.getText().toString().equals("Silangan")){
                        rate.setText("14.00");
                    }
                    else if(entry.getText().toString().equals("Cabuyao") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Cabuyao") && entry.getText().toString().equals("Calamba")){
                        rate.setText("62.00");
                    }
                    else if(entry.getText().toString().equals("Silangan") && exit.getText().toString().equals("Calamba")  || exit.getText().toString().equals("Silangan") && entry.getText().toString().equals("Calamba")){
                        rate.setText("48.00");
                    }
                    else {
                        rate.setText("0.00");
                    }
                }
                else{
                    rate.setText("0.00");
                }
            }
        });

    }
}
