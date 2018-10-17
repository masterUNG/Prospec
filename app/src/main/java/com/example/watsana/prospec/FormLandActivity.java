
package com.example.watsana.prospec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FormLandActivity extends AppCompatActivity {

//    Explicit
private int indexAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_land);

        indexAnInt = getIntent().getIntExtra("Index",0);

    }//Main method
}//Main Class
