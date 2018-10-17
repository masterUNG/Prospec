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

import com.example.watsana.prospec.FormLandActivity;
import com.example.watsana.prospec.R;

public class LandTab1Fragment extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Crete Toolbar
        creteToolbar();


    }//Main Method

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.itemUpload) {


            return true;
        }

        return super.onOptionsItemSelected(item);
    }

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
