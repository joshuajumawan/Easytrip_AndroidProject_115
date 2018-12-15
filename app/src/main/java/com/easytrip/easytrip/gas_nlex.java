package com.easytrip.easytrip;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class gas_nlex extends AppCompatActivity {

    Dialog dialog_nlex, dialog_fuel;
    Button entry, exit, fuel;
    TextView distance, gas_price, cost;
    double i = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas_nlex);

        entry = (Button) findViewById(R.id.entry);
        exit = (Button) findViewById(R.id.exit);
        fuel = (Button) findViewById(R.id.fuel);
        Button cancel = (Button) findViewById(R.id.cancel);
        Button confirm = (Button) findViewById(R.id.confirm);
        distance = (TextView) findViewById(R.id.distance);
        gas_price = (TextView) findViewById(R.id.gas_price);
        cost = (TextView) findViewById(R.id.cost);

        fuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog_fuel = new Dialog(gas_nlex.this);
                dialog_fuel.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog_fuel.setContentView(R.layout.dialog_fuel);
                dialog_fuel.setCancelable(false);
                dialog_fuel.show();
                final Button class_1 = (Button) dialog_fuel.findViewById(R.id.class_1);
                final Button class_2 = (Button) dialog_fuel.findViewById(R.id.class_2);
                final Button class_3 = (Button) dialog_fuel.findViewById(R.id.class_3);
                final TextView back = (TextView) dialog_fuel.findViewById(R.id.back);

                class_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        fuel.setText("Diesel");
                        dialog_fuel.dismiss();
                    }
                });

                class_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        fuel.setText("Unleaded");
                        dialog_fuel.dismiss();
                    }
                });

                class_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        fuel.setText("Premium");
                        dialog_fuel.dismiss();
                    }
                });

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog_fuel.dismiss();
                    }
                });

            }
        });

        entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog_nlex = new Dialog(gas_nlex.this);
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
                dialog_nlex = new Dialog(gas_nlex.this);
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

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fuel.getText().toString().equals("Diesel")){
                    gas_price.setText("38.25");
                    if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Meycauayan")  || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Meycauayan")){
                        distance.setText("9");
                        i = 9 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Marilao") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Marilao")){
                        distance.setText("13");
                        i = 12 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("San Fernando")){
                        distance.setText("34");
                        i = 34 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Mexico")){
                        distance.setText("59");
                        i = 59 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Angeles")){
                        distance.setText("71");
                        i = 71 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Dau")){
                        distance.setText("74");
                        i = 74 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Clark South")){
                        distance.setText("78");
                        i = 78 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("85");
                        i = 85 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("116");
                        i = 116 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Marilao") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Marilao")){
                        distance.setText("9");
                        i = 9 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("San Fernando")){
                        distance.setText("11");
                        i = 11 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Mexico")){
                        distance.setText("12");
                        i = 12 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Angeles")){
                        distance.setText("60");
                        i = 60 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Dau")){
                        distance.setText("62");
                        i = 62 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Clark South")){
                        distance.setText("72");
                        i = 72 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("75");
                        i = 75 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("120");
                        i = 120 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("San Fernando")){
                        distance.setText("47");
                        i = 47 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Mexico")){
                        distance.setText("59");
                        i = 59 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Angeles")){
                        distance.setText("62");
                        i = 62 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Dau")){
                        distance.setText("67");
                        i = 67 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Clark South")){
                        distance.setText("69");
                        i = 69 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("81");
                        i = 81 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("103");
                        i = 103 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Mexico")){
                        distance.setText("6");
                        i = 6 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Angeles")){
                        distance.setText("17");
                        i = 17 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Dau")){
                        distance.setText("20");
                        i = 20 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Clark South")){
                        distance.setText("23");
                        i = 23 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("43");
                        i = 43 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("62");
                        i = 62 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Angeles")){
                        distance.setText("12");
                        i = 12 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Dau")){
                        distance.setText("15");
                        i = 15 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Clark South")){
                        distance.setText("23");
                        i = 23 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("45");
                        i = 45 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("60");
                        i = 60 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Dau")){
                        distance.setText("26");
                        i = 26 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Clark South")){
                        distance.setText("33");
                        i = 33 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("56");
                        i = 56 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("70");
                        i = 170 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("Clark South")){
                        distance.setText("32");
                        i = 32 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("42");
                        i = 42 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("51");
                        i = 51 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Clark South") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Clark South") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("80");
                        i = 80 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Clark South") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Clark South") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("103");
                        i = 103 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Miguel") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("San Miguel") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("32");
                        i = 32 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    }
                    else {
                        distance.setText("0");
                        gas_price.setText("0.0");
                        cost.setText("0.0");
                    }
                }

                else if(fuel.getText().toString().equals("Unleaded")){
                    gas_price.setText("47.10");
                    if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Meycauayan")  || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Meycauayan")){
                        distance.setText("9");
                        i = 9 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Marilao") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Marilao")){
                        distance.setText("13");
                        i = 12 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("San Fernando")){
                        distance.setText("34");
                        i = 34 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Mexico")){
                        distance.setText("59");
                        i = 59 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Angeles")){
                        distance.setText("71");
                        i = 71 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Dau")){
                        distance.setText("74");
                        i = 74 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Clark South")){
                        distance.setText("78");
                        i = 78 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("85");
                        i = 85 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("116");
                        i = 116 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Marilao") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Marilao")){
                        distance.setText("9");
                        i = 9 * 47.10/ 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("San Fernando")){
                        distance.setText("11");
                        i = 11 * 47.10 / 16.520;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Mexico")){
                        distance.setText("12");
                        i = 12 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Angeles")){
                        distance.setText("60");
                        i = 60 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Dau")){
                        distance.setText("62");
                        i = 62 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Clark South")){
                        distance.setText("72");
                        i = 72 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("75");
                        i = 75 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("120");
                        i = 120 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("San Fernando")){
                        distance.setText("47");
                        i = 47 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Mexico")){
                        distance.setText("59");
                        i = 59 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Angeles")){
                        distance.setText("62");
                        i = 62 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Dau")){
                        distance.setText("67");
                        i = 67 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Clark South")){
                        distance.setText("69");
                        i = 69 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("81");
                        i = 81 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("103");
                        i = 103 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Mexico")){
                        distance.setText("6");
                        i = 6 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Angeles")){
                        distance.setText("17");
                        i = 17 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Dau")){
                        distance.setText("20");
                        i = 20 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Clark South")){
                        distance.setText("23");
                        i = 23 * 47.10 / 16.520;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("43");
                        i = 43 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("62");
                        i = 62 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Angeles")){
                        distance.setText("12");
                        i = 12 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Dau")){
                        distance.setText("15");
                        i = 15 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Clark South")){
                        distance.setText("23");
                        i = 23 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("45");
                        i = 45 * 47.10 / 16.520;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("60");
                        i = 60 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Dau")){
                        distance.setText("26");
                        i = 26 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Clark South")){
                        distance.setText("33");
                        i = 33 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("56");
                        i = 56 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("70");
                        i = 170 * 47.10 / 16.520;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("Clark South")){
                        distance.setText("32");
                        i = 32 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("42");
                        i = 42 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("51");
                        i = 51 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Clark South") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Clark South") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("80");
                        i = 80 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Clark South") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Clark South") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("103");
                        i = 103 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Miguel") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("San Miguel") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("32");
                        i = 32 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else {
                        distance.setText("0");
                        gas_price.setText("0.0");
                        cost.setText("0.0");
                    }
                }

                else if(fuel.getText().toString().equals("Premium")){
                    gas_price.setText("49.80");
                    if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Meycauayan")  || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Meycauayan")){
                        distance.setText("9");
                        i = 9 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Marilao") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Marilao")){
                        distance.setText("13");
                        i = 12 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("San Fernando")){
                        distance.setText("34");
                        i = 34 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Mexico")){
                        distance.setText("59");
                        i = 59 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Angeles")){
                        distance.setText("71");
                        i = 71 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Dau")){
                        distance.setText("74");
                        i = 74 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Clark South")){
                        distance.setText("78");
                        i = 78 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("85");
                        i = 85 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Balintawak") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Balintawak") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("116");
                        i = 116 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Marilao") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Marilao")){
                        distance.setText("9");
                        i = 9 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("San Fernando")){
                        distance.setText("11");
                        i = 11 * 49.80 / 16.520;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Mexico")){
                        distance.setText("12");
                        i = 12 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Angeles")){
                        distance.setText("60");
                        i = 60 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Dau")){
                        distance.setText("62");
                        i = 62 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Clark South")){
                        distance.setText("72");
                        i = 72 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("75");
                        i = 75 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Meycauayan") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Meycauayan") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("120");
                        i = 120 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("San Fernando") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("San Fernando")){
                        distance.setText("47");
                        i = 47 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Mexico")){
                        distance.setText("59");
                        i = 59 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Angeles")){
                        distance.setText("62");
                        i = 62 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Dau")){
                        distance.setText("67");
                        i = 67 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Clark South")){
                        distance.setText("69");
                        i = 69 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("81");
                        i = 81 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Marilao") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Marilao") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("103");
                        i = 103 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Mexico") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Mexico")){
                        distance.setText("6");
                        i = 6 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Angeles")){
                        distance.setText("17");
                        i = 17 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Dau")){
                        distance.setText("20");
                        i = 20 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Clark South")){
                        distance.setText("23");
                        i = 23 * 49.80 / 16.520;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("43");
                        i = 43 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Fernando") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("San Fernando") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("62");
                        i = 62 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Angeles") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Angeles")){
                        distance.setText("12");
                        i = 12 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Dau")){
                        distance.setText("15");
                        i = 15 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Clark South")){
                        distance.setText("23");
                        i = 23 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("45");
                        i = 45 * 49.80 / 16.520;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Mexico") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Mexico") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("60");
                        i = 60 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Dau") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Dau")){
                        distance.setText("26");
                        i = 26 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Clark South")){
                        distance.setText("33");
                        i = 33 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("56");
                        i = 56 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Angeles") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Angeles") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("70");
                        i = 170 * 49.80 / 16.520;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("Clark South") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("Clark South")){
                        distance.setText("32");
                        i = 32 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("42");
                        i = 42 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Dau") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Dau") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("51");
                        i = 51 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Clark South") && exit.getText().toString().equals("San Miguel") || exit.getText().toString().equals("Clark South") && entry.getText().toString().equals("San Miguel")){
                        distance.setText("80");
                        i = 80 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("Clark South") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("Clark South") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("103");
                        i = 103 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else if(entry.getText().toString().equals("San Miguel") && exit.getText().toString().equals("Tarlac") || exit.getText().toString().equals("San Miguel") && entry.getText().toString().equals("Tarlac")){
                        distance.setText("32");
                        i = 32 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    }
                    else {
                        distance.setText("0");
                        gas_price.setText("0.0");
                        cost.setText("0.0");
                    }
                }
                else {
                    distance.setText("0");
                    gas_price.setText("0.0");
                    cost.setText("0.0");
                }


            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(gas_nlex.this, gas_con.class));
            }
        });
    }
}
