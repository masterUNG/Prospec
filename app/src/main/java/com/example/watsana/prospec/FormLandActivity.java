
package com.example.watsana.prospec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FormLandActivity extends AppCompatActivity {

//    Explicit
private int indexAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_land);

        indexAnInt = getIntent().getIntExtra("Index",0);
        Log.d("170ctV1", "index ==>" + indexAnInt);

    }//Main method
}//Main Class
