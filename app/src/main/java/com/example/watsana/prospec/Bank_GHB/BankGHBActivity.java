package com.example.watsana.prospec.Bank_GHB;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.watsana.prospec.ALL_land_and_building.LandTab3Activity;
import com.example.watsana.prospec.ALL_land_and_building.LandTab4Activity;
import com.example.watsana.prospec.ALL_land_and_building.LandTab5Activity;
import com.example.watsana.prospec.ALL_land_and_building.LandTab6Activity;
import com.example.watsana.prospec.ALL_land_and_building.LandTab7Activity;
import com.example.watsana.prospec.ALL_land_and_building.LandTab8Activity;
import com.example.watsana.prospec.ALL_land_and_building.LandTab9Activity;
import com.example.watsana.prospec.R;

public class BankGHBActivity extends AppCompatActivity {

    // Explicit
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
    button10, button11, button12, button13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_ghb);


            //Bind Wiget
            button1 = (Button) findViewById(R.id.button1);
            button2 = (Button) findViewById(R.id.button2);
            button3 = (Button) findViewById(R.id.button3);
            button4 = (Button) findViewById(R.id.button4);
            button5 = (Button) findViewById(R.id.button5);
            button6 = (Button) findViewById(R.id.button6);
            button7 = (Button) findViewById(R.id.button7);
            button8 = (Button) findViewById(R.id.button8);
            button9 = (Button) findViewById(R.id.button9);
            button10 = (Button) findViewById(R.id.button10);
            button11 = (Button) findViewById(R.id.button11);
            button12 = (Button) findViewById(R.id.button12);
            button13 = (Button) findViewById(R.id.button13);

            //Get Event From Click land
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BankGHBActivity.this, BankGHB01Activity.class));

                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BankGHBActivity.this, BankGHB02Activity.class));
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BankGHBActivity.this, BankGHB03Activity.class));
                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BankGHBActivity.this, BankGHB04Activity.class));
                }
            });

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BankGHBActivity.this, BankGHB05Activity.class));
                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BankGHBActivity.this, BankGHB06Activity.class));
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BankGHBActivity.this, BankGHB07Activity.class));
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BankGHBActivity.this, BankGHB08Activity.class));
                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BankGHBActivity.this, BankGHB09Activity.class));
                }
            });

            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(BankGHBActivity.this, BankGHB10Activity.class));
                 }
             });

        } // Main Method
    } //Main Class