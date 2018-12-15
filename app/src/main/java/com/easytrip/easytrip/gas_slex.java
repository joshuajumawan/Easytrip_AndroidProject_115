package com.easytrip.easytrip;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class gas_slex extends AppCompatActivity {

    Dialog dialog_slex, dialog_fuel;
    Button entry, exit, fuel;
    TextView distance, gas_price, cost;
    double i = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas_slex);

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
                dialog_fuel = new Dialog(gas_slex.this);
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
                dialog_slex = new Dialog(gas_slex.this);
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
                dialog_slex = new Dialog(gas_slex.this);
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

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fuel.getText().toString().equals("Diesel")) {
                    gas_price.setText("38.25");
                    if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Alabang") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Alabang")) {
                        distance.setText("3");
                        i = 3 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Filinvest") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Filinvest")) {
                        distance.setText("5");
                        i = 5 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("San Pedro") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("San Pedro")) {
                        distance.setText("10");
                        i = 10 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Southwoods") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Southwoods")) {
                        distance.setText("14");
                        i = 14 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("16");
                        i = 16 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("20");
                        i = 20 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("28");
                        i = 28 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("29");
                        i = 29 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("30");
                        i = 30 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Filinvest") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Filinvest")) {
                        distance.setText("6");
                        i = 6 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("San Pedro") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("San Pedro")) {
                        distance.setText("9");
                        i = 9 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Southwoods") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Southwoods")) {
                        distance.setText("11");
                        i = 11 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("13");
                        i = 13 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("17");
                        i = 17 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("24");
                        i = 24 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("25");
                        i = 25 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("26");
                        i = 26 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("San Pedro") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("San Pedro")) {
                        distance.setText("7");
                        i = 7 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Southwoods") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Southwoods")) {
                        distance.setText("10");
                        i = 10 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("13");
                        i = 13 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("17");
                        i = 17 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("25");
                        i = 25 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("26");
                        i = 26 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("27");
                        i = 27 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Southwoods") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Southwoods")) {
                        distance.setText("5");
                        i = 5 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("8");
                        i = 8 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("11");
                        i = 11 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("19");
                        i = 19 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("20");
                        i = 20 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("21");
                        i = 21 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("4");
                        i = 4 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("7");
                        i = 7 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("15");
                        i = 15 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("16");
                        i = 16 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("17");
                        i = 17 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("5");
                        i = 5 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("11");
                        i = 11 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("12");
                        i = 12 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("13");
                        i = 13 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("9");
                        i = 9 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("10");
                        i = 10 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("11");
                        i = 11 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Cabuyao") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Cabuyao") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("15");
                        i = 15 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Cabuyao") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Cabuyao") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("16");
                        i = 16 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Silangan") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Silangan") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("18");
                        i = 18 * 38.25 / 20;
                        cost.setText(String.format("%.2f", i));
                    } else {
                        distance.setText("0");
                        gas_price.setText("0.0");
                        cost.setText("0.0");
                    }
                } else if (fuel.getText().toString().equals("Unleaded")) {
                    gas_price.setText("47.10");
                    if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Alabang") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Alabang")) {
                        distance.setText("3");
                        i = 3 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Filinvest") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Filinvest")) {
                        distance.setText("5");
                        i = 5 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("San Pedro") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("San Pedro")) {
                        distance.setText("10");
                        i = 10 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Southwoods") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Southwoods")) {
                        distance.setText("14");
                        i = 14 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("16");
                        i = 16 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("20");
                        i = 20 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("28");
                        i = 28 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("29");
                        i = 29 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("30");
                        i = 30 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Filinvest") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Filinvest")) {
                        distance.setText("6");
                        i = 6 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("San Pedro") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("San Pedro")) {
                        distance.setText("9");
                        i = 9 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Southwoods") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Southwoods")) {
                        distance.setText("11");
                        i = 11 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("13");
                        i = 13 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("17");
                        i = 17 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("24");
                        i = 24 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("25");
                        i = 25 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("26");
                        i = 26 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("San Pedro") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("San Pedro")) {
                        distance.setText("7");
                        i = 7 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Southwoods") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Southwoods")) {
                        distance.setText("10");
                        i = 10 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("13");
                        i = 13 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("17");
                        i = 17 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("25");
                        i = 25 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("26");
                        i = 26 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("27");
                        i = 27 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Southwoods") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Southwoods")) {
                        distance.setText("5");
                        i = 5 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("8");
                        i = 8 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("11");
                        i = 11 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("19");
                        i = 19 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("20");
                        i = 20 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("21");
                        i = 21 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("4");
                        i = 4 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("7");
                        i = 7 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("15");
                        i = 15 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("16");
                        i = 16 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("17");
                        i = 17 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("5");
                        i = 5 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("11");
                        i = 11 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("12");
                        i = 12 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("13");
                        i = 13 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("9");
                        i = 9 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("10");
                        i = 10 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("11");
                        i = 11 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Cabuyao") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Cabuyao") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("15");
                        i = 15 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Cabuyao") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Cabuyao") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("16");
                        i = 16 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Silangan") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Silangan") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("18");
                        i = 18 * 47.10 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else {
                        distance.setText("0");
                        gas_price.setText("0.0");
                        cost.setText("0.0");
                    }
                } else if (fuel.getText().toString().equals("Premium")) {
                    gas_price.setText("49.80");
                    if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Alabang") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Alabang")) {
                        distance.setText("3");
                        i = 3 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Filinvest") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Filinvest")) {
                        distance.setText("5");
                        i = 5 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("San Pedro") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("San Pedro")) {
                        distance.setText("10");
                        i = 10 *49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Southwoods") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Southwoods")) {
                        distance.setText("14");
                        i = 14 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("16");
                        i = 16 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("20");
                        i = 20 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("28");
                        i = 28 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("29");
                        i = 29 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sucat") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Sucat") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("30");
                        i = 30 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Filinvest") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Filinvest")) {
                        distance.setText("6");
                        i = 6 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("San Pedro") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("San Pedro")) {
                        distance.setText("9");
                        i = 9 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Southwoods") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Southwoods")) {
                        distance.setText("11");
                        i = 11 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("13");
                        i = 13 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("17");
                        i = 17 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("24");
                        i = 24 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("25");
                        i = 25 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Alabang") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Alabang") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("26");
                        i = 26 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("San Pedro") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("San Pedro")) {
                        distance.setText("7");
                        i = 7 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Southwoods") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Southwoods")) {
                        distance.setText("10");
                        i = 10 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("13");
                        i = 13 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("17");
                        i = 17 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("25");
                        i = 25 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("26");
                        i = 26 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Filinvest") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Filinvest") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("27");
                        i = 27 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Southwoods") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Southwoods")) {
                        distance.setText("5");
                        i = 5 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("8");
                        i = 8 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("11");
                        i = 11 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("19");
                        i = 19 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("20");
                        i = 20 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("San Pedro") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("San Pedro") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("21");
                        i = 21 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Carmona") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Carmona")) {
                        distance.setText("4");
                        i = 4 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("7");
                        i = 7 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("15");
                        i = 15 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("16");
                        i = 16 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Southwoods") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Southwoods") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("17");
                        i = 17 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Sta. Rosa") || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Sta. Rosa")) {
                        distance.setText("5");
                        i = 5 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("11");
                        i = 11 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("12");
                        i = 12 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Carmona") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Carmona") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("13");
                        i = 13 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Cabuyao") || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Cabuyao")) {
                        distance.setText("9");
                        i = 9 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("10");
                        i = 10 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Sta. Rosa") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Sta. Rosa") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("11");
                        i = 11 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Cabuyao") && exit.getText().toString().equals("Silangan") || exit.getText().toString().equals("Cabuyao") && entry.getText().toString().equals("Silangan")) {
                        distance.setText("15");
                        i = 15 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Cabuyao") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Cabuyao") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("16");
                        i = 16 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else if (entry.getText().toString().equals("Silangan") && exit.getText().toString().equals("Calamba") || exit.getText().toString().equals("Silangan") && entry.getText().toString().equals("Calamba")) {
                        distance.setText("18");
                        i = 18 * 49.80 / 16.5;
                        cost.setText(String.format("%.2f", i));
                    } else {
                        distance.setText("0");
                        gas_price.setText("0.0");
                        cost.setText("0.0");
                    }
                }
                else{
                    distance.setText("0");
                    gas_price.setText("0.0");
                    cost.setText("0.0");
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(gas_slex.this, gas_con.class));
            }
        });


    }
}
