package com.example.watsana.prospec.ALL_land_and_building;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.watsana.prospec.FormLandActivity;
import com.example.watsana.prospec.R;

public class LandsActivity extends AppCompatActivity {

    // Explicit
    private Button button1, button6, button7, button8, button9, button10, button11, button12, button13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lands);


            //Bind Wiget
            button1 = (Button) findViewById(R.id.button1);
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
                   Intent intent = new Intent(LandsActivity.this, FormLandActivity.class);
            intent.putExtra("Index",0);
            startActivity(intent);

                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LandsActivity.this, LandTab2Activity.class));
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LandsActivity.this, LandTab3Activity.class));
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LandsActivity.this, LandTab4Activity.class));
                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LandsActivity.this, LandTab5Activity.class));
                }
            });

            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LandsActivity.this, LandTab6Activity.class));
                }
            });

            button11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LandsActivity.this, LandTab7Activity.class));
                }
            });

            button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LandsActivity.this, LandTab8Activity.class));
                }
            });

            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LandsActivity.this, LandTab9Activity.class));
                }
            });
        } // Main Method
    } //Main Class