package com.example.watsana.prospec.bank_ghb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.watsana.prospec.R;


public class BankGHB03Activity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_ghb03);

//        Province Spinner
        provinceSpinner();


    }

    private void provinceSpinner() {
        Spinner spinner = findViewById(R.id.spinnerProvince);
        String[] strings = new String[]{"Please Choose One", "ก", "ข", "ค", "ง"};
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(BankGHB03Activity.this,
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                createSpinnerAmper(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void createSpinnerAmper(int position) {

        Spinner spinner = findViewById(R.id.spinnerAmper);
        String[] mainAmperStrings = new String[5];
        mainAmperStrings[0] = "0,0,0";
        mainAmperStrings[1] = "2,4,6";
        mainAmperStrings[2] = "1,0,6";
        mainAmperStrings[3] = "4,4,5";
        mainAmperStrings[4] = "0,0,1";

        String[] rowStrings = mainAmperStrings[position].split(",");

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(BankGHB03Activity.this,
                android.R.layout.simple_list_item_1, rowStrings);
        spinner.setAdapter(stringArrayAdapter);

    }
}
