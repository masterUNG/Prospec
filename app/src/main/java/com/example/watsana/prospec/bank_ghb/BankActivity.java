package com.example.watsana.prospec.bank_ghb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.watsana.prospec.all_land_and_building.HomeActivity;
import com.example.watsana.prospec.R;

public class BankActivity extends AppCompatActivity {
    ImageView imageView, imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        imageView =  findViewById(R.id.imageView);
        imageView1 =  findViewById(R.id.imageView1);

        //Get Event From Click Menu Land and Building
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BankActivity.this, HomeActivity.class));
            }
        });



        //Get Event From Click Bank GHB
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BankActivity.this, BankGHBActivity.class));
            }
        });
    }
}
