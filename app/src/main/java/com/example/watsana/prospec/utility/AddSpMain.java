package com.example.watsana.prospec.utility;

import android.content.Context;
import android.os.AsyncTask;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.RequestBody;

public class AddSpMain extends AsyncTask<String, Void, String>{

    private Context context;

    public AddSpMain(Context context){
        this.context = context;
    }

    @Override
    protected String doInBackground(String... strings) {

        try {

            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody requestBody = new FormEncodingBuilder()
                    .add("isAdd", "true")
                    .add("number", strings[0])
                    .add("t_deed", strings[1])
                    .add("", strings[2])
                    .add("", strings[3])
                    .add("", strings[4])
                    .add("", strings[5])
                    .add("", strings[6])
                    .add("", strings[7])
                    .add("", strings[8])
                    .add("", strings[9])
                    .add("", strings[10])
                    .add("", strings[11])
                    .build();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
