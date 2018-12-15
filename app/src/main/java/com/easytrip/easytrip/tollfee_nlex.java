package com.easytrip.easytrip;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class tollfee_nlex extends AppCompatActivity {

    Dialog dialog_class, dialog_nlex;
    Button cancel, confirm, btn_class, entry, exit;
    TextView rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tollfee_nlex);

        cancel = (Button) findViewById(R.id.cancel);
        confirm = (Button) findViewById(R.id.confirm);
        btn_class = (Button) findViewById(R.id.btn_class);
        entry = (Button) findViewById(R.id.entry);
        exit = (Button) findViewById(R.id.exit);

        rate  = (TextView) findViewById(R.id.rate);

        btn_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog_class = new Dialog(tollfee_nlex.this);
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
                dialog_nlex = new Dialog(tollfee_nlex.this);
                dialog_nlex.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog_nlex.setContentView(R.layout.dialog_nlex);
                dialog_nlex.setCancelable(false);
                dialog_nlex.show();

                final Button balintawak = (Button) dialog_nlex.findViewById(R.id.Balintawak);
                balintawak.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Balintawak");
                        dialog_nlex.dismiss();
                    }
                });
                final Button meycauayan = (Button) dialog_nlex.findViewById(R.id.Meycauayan);
                meycauayan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Meycauayan");
                        dialog_nlex.dismiss();
                    }
                });
                final Button marilao = (Button) dialog_nlex.findViewById(R.id.Marilao);
                marilao.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Marilao");
                        dialog_nlex.dismiss();
                    }
                });
                final Button san_Fernando = (Button) dialog_nlex.findViewById(R.id.San_Fernando);
                san_Fernando.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("San Fernando");
                        dialog_nlex.dismiss();
                    }
                });
                final Button mexico = (Button) dialog_nlex.findViewById(R.id.Mexico);
                mexico.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Mexico");
                        dialog_nlex.dismiss();
                    }
                });
                final Button angeles = (Button) dialog_nlex.findViewById(R.id.Angeles);
                angeles.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Angeles");
                        dialog_nlex.dismiss();
                    }
                });
                final Button dau = (Button) dialog_nlex.findViewById(R.id.Dau);
                dau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Dau");
                        dialog_nlex.dismiss();
                    }
                });
                final Button clark_South = (Button) dialog_nlex.findViewById(R.id.Clark_South);
                clark_South.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Clark South");
                        dialog_nlex.dismiss();
                    }
                });
                final Button san_Miguel = (Button) dialog_nlex.findViewById(R.id.San_Miguel);
                san_Miguel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("San Miguel");
                        dialog_nlex.dismiss();
                    }
                });
                final Button tarlac = (Button) dialog_nlex.findViewById(R.id.Tarlac);
                tarlac.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        entry.setText("Tarlac");
                        dialog_nlex.dismiss();
                    }
                });

                final TextView back = (TextView) dialog_nlex.findViewById(R.id.back);

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_nlex.dismiss();
                    }
                });
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog_nlex = new Dialog(tollfee_nlex.this);
                dialog_nlex.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog_nlex.setContentView(R.layout.dialog_nlex);
                dialog_nlex.setCancelable(false);
                dialog_nlex.show();

                final Button balintawak = (Button) dialog_nlex.findViewById(R.id.Balintawak);
                balintawak.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Balintawak");
                        dialog_nlex.dismiss();
                    }
                });
                final Button meycauayan = (Button) dialog_nlex.findViewById(R.id.Meycauayan);
                meycauayan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Meycauayan");
                        dialog_nlex.dismiss();
                    }
                });
                final Button marilao = (Button) dialog_nlex.findViewById(R.id.Marilao);
                marilao.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Marilao");
                        dialog_nlex.dismiss();
                    }
                });
                final Button san_Fernando = (Button) dialog_nlex.findViewById(R.id.San_Fernando);
                san_Fernando.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("San Fernando");
                        dialog_nlex.dismiss();
                    }
                });
                final Button mexico = (Button) dialog_nlex.findViewById(R.id.Mexico);
                mexico.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Mexico");
                        dialog_nlex.dismiss();
                    }
                });
                final Button angeles = (Button) dialog_nlex.findViewById(R.id.Angeles);
                angeles.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Angeles");
                        dialog_nlex.dismiss();
                    }
                });
                final Button dau = (Button) dialog_nlex.findViewById(R.id.Dau);
                dau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Dau");
                        dialog_nlex.dismiss();
                    }
                });
                final Button clark_South = (Button) dialog_nlex.findViewById(R.id.Clark_South);
                clark_South.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Clark South");
                        dialog_nlex.dismiss();
                    }
                });
                final Button san_Miguel = (Button) dialog_nlex.findViewById(R.id.San_Miguel);
                san_Miguel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("San Miguel");
                        dialog_nlex.dismiss();
                    }
                });
                final Button tarlac = (Button) dialog_nlex.findViewById(R.id.Tarlac);
                tarlac.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        exit.setText("Tarlac");
                        dialog_nlex.dismiss();
                    }
                });

                final TextView back = (TextView) dialog_nlex.findViewById(R.id.back);

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_nlex.dismiss();
                    }
                });
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tollfee_nlex.this, tollfee.class));
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btn_class.getText().toString().equals("Class 1")){
                    if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Meycauayan")  || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Meycauayan")){
                        rate.setText("45.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Marilao") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Marilao")){
                        rate.setText("45.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("San Fernando")){
                        rate.setText("169.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Mexico")){
                        rate.setText("190.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Angeles")){
                        rate.setText("215.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Dau")){
                        rate.setText("236.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Clark South")){
                        rate.setText("240.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("325.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("340.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Marilao") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Marilao")){
                        rate.setText("45.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("San Fernando")){
                        rate.setText("169.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Mexico")){
                        rate.setText("190.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Angeles")){
                        rate.setText("215.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Dau")){
                        rate.setText("236.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Clark South")){
                        rate.setText("240.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("325.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("340.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("San Fernando")){
                        rate.setText("169.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Mexico")){
                        rate.setText("190.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Angeles")){
                        rate.setText("215.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Dau")){
                        rate.setText("236.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Clark South")){
                        rate.setText("240.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("325.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("340.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Mexico")){
                        rate.setText("21.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Angeles")){
                        rate.setText("46.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Dau")){
                        rate.setText("67.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Clark South")){
                        rate.setText("71.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("156.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("171.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Angeles")){
                        rate.setText("25.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Dau")){
                        rate.setText("46.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Clark South")){
                        rate.setText("50.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("135.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("150.00");
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Dau")){
                        rate.setText("22.00");
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Clark South")){
                        rate.setText("26.00");
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("111.00");
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("126.00");
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("Clark South")){
                        rate.setText("20.00");
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("105.00");
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("120.00");
                    }
                    else if(entry.getText().toString().equals("Clark South") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Clark South") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("94.00");
                    }
                    else if(entry.getText().toString().equals("Clark South") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Clark South") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("108.00");
                    }
                    else if(entry.getText().toString().equals("San Miguel") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("San Miguel") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("14.00");
                    }
                    else {
                        rate.setText("0.00");
                    }
                }
                else if (btn_class.getText().toString().equals("Class 2")){
                    if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Meycauayan")  || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Meycauayan")){
                        rate.setText("114.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Marilao") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Marilao")){
                        rate.setText("114.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("San Fernando")){
                        rate.setText("422.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Mexico")){
                        rate.setText("474.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Angeles")){
                        rate.setText("536.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Dau")){
                        rate.setText("590.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Clark South")){
                        rate.setText("600.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("769.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("798.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Marilao") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Marilao")){
                        rate.setText("114.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("San Fernando")){
                        rate.setText("422.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Mexico")){
                        rate.setText("474.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Angeles")){
                        rate.setText("536.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Dau")){
                        rate.setText("590.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Clark South")){
                        rate.setText("600.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("769.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("798.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("San Fernando")){
                        rate.setText("422.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Mexico")){
                        rate.setText("474.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Angeles")){
                        rate.setText("536.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Dau")){
                        rate.setText("590.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Clark South")){
                        rate.setText("600.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("769.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("798.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Mexico")){
                        rate.setText("52.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Angeles")){
                        rate.setText("114.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Dau")){
                        rate.setText("168.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Clark South")){
                        rate.setText("178.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("347.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("376.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Angeles")){
                        rate.setText("62.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Dau")){
                        rate.setText("116.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Clark South")){
                        rate.setText("126.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("295.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("324.00");
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Dau")){
                        rate.setText("54.00");
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Clark South")){
                        rate.setText("64.00");
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("233.00");
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("262.00");
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("Clark South")){
                        rate.setText("49.00");
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("218.00");
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("247.00");
                    }
                    else if(entry.getText().toString().equals("Clark South") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Clark South") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("189.00");
                    }
                    else if(entry.getText().toString().equals("Clark South") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Clark South") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("218.00");
                    }
                    else if(entry.getText().toString().equals("San Miguel") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("San Miguel") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("29.00");
                    }
                    else {
                        rate.setText("0.00");
                    }
                }
                else if (btn_class.getText().toString().equals("Class 3")){
                    if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Meycauayan")  || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Meycauayan")){
                        rate.setText("136.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Marilao") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Marilao")){
                        rate.setText("136.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("San Fernando")){
                        rate.setText("506.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Mexico")){
                        rate.setText("568.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Angeles")){
                        rate.setText("643.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Dau")){
                        rate.setText("708.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Clark South")){
                        rate.setText("722.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("976.00");
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("1020.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Marilao") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Marilao")){
                        rate.setText("136.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("San Fernando")){
                        rate.setText("506.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Mexico")){
                        rate.setText("568.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Angeles")){
                        rate.setText("643.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Dau")){
                        rate.setText("708.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Clark South")){
                        rate.setText("722.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("976.00");
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("1020.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("San Fernando")){
                        rate.setText("506.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Mexico")){
                        rate.setText("568.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Angeles")){
                        rate.setText("643.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Dau")){
                        rate.setText("708.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Clark South")){
                        rate.setText("722.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("976.00");
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("1020.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Mexico")){
                        rate.setText("62.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Angeles")){
                        rate.setText("137.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Dau")){
                        rate.setText("201.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Clark South")){
                        rate.setText("215.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("469.00");
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("513.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Angeles")){
                        rate.setText("74.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Dau")){
                        rate.setText("139.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Clark South")){
                        rate.setText("153.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("407.00");
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("451.00");
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Dau")){
                        rate.setText("65.00");
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Clark South")){
                        rate.setText("79.00");
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("333.00");
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("377.00");
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("Clark South")){
                        rate.setText("61.00");
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("315.00");
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("359.00");
                    }
                    else if(entry.getText().toString().equals("Clark South") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Clark South") && entry.getText().toString().equals("San Miguel")){
                        rate.setText("283.00");
                    }
                    else if(entry.getText().toString().equals("Clark South") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Clark South") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("327.00");
                    }
                    else if(entry.getText().toString().equals("San Miguel") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("San Miguel") && entry.getText().toString().equals("Tarlac")){
                        rate.setText("43.00");
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
