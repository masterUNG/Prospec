package com.example.watsana.prospec.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.watsana.prospec.FormLandActivity;
import com.example.watsana.prospec.R;
import com.example.watsana.prospec.utility.MyAlert;
import com.example.watsana.prospec.utility.MyConstant;

public class LandTab1Fragment extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Crete Toolbar
        creteToolbar();

//        Create Spinner
        createSpinner();


    }//Main Method

    private void createSpinner() {
        Spinner spinner = getView().findViewById(R.id.spinner_type_doc);
        MyConstant myConstant = new MyConstant();
        String[] strings = myConstant.getTypeDocStrings();

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);

        spinner.setAdapter(stringArrayAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.itemUpload) {

            checDataAndUpload();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void checDataAndUpload() {

//        Initial View
        EditText editText1 = getView().findViewById(R.id.EditText1);
        EditText editText2 = getView().findViewById(R.id.EditText2);
        EditText editText3 = getView().findViewById(R.id.EditText3);
        EditText editText4 = getView().findViewById(R.id.EditText4);
        EditText editText5 = getView().findViewById(R.id.EditText5);
        EditText editText6 = getView().findViewById(R.id.EditText6);
        EditText editText7 = getView().findViewById(R.id.EditText7);
        EditText editText8 = getView().findViewById(R.id.EditText8);
        EditText editText9 = getView().findViewById(R.id.EditText9);
        EditText editText10 = getView().findViewById(R.id.EditText10);
        EditText editText11 = getView().findViewById(R.id.EditText11);


        String string1 = editText1.getText().toString().trim();
        String string2 = editText2.getText().toString().trim();
        String string3 = editText3.getText().toString().trim();
        String string4 = editText4.getText().toString().trim();
        String string5 = editText5.getText().toString().trim();
        String string6 = editText6.getText().toString().trim();
        String string7 = editText7.getText().toString().trim();
        String string8 = editText8.getText().toString().trim();
        String string9 = editText9.getText().toString().trim();
        String string10 = editText10.getText().toString().trim();
        String string11 = editText11.getText().toString().trim();

        if (string1.isEmpty() || string2.isEmpty() || string3.isEmpty() || string4.isEmpty() ||
                string5.isEmpty() || string6.isEmpty() || string7.isEmpty() || string8.isEmpty() ||
                string9.isEmpty() || string10.isEmpty() || string11.isEmpty()) {

//            Have Space
            MyAlert myAlert = new MyAlert(getActivity());
            myAlert.normalDialog(getString(R.string.title_have_space),
            getString(R.string.massage_have_space));

        }

    }//checkData

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);


        inflater.inflate(R.menu.menu_land_tab,menu);
    }

    private void creteToolbar() {

        Toolbar toolbar = getView().findViewById(R.id.toolbar_land_tab1);
        ((FormLandActivity)getActivity()).setSupportActionBar(toolbar);
        ((FormLandActivity) getActivity()).getSupportActionBar().setTitle(getString(R.string.ekakasit));
        ((FormLandActivity) getActivity()).getSupportActionBar().setSubtitle(getString(R.string.massage_have_space));

        ((FormLandActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((FormLandActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });

        setHasOptionsMenu(true);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_form_land, container, false);
        return view;
    }
}//Main Class
