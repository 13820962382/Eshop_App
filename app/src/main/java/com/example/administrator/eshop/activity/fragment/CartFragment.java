package com.example.administrator.eshop.activity.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.eshop.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CartFragment extends Fragment {

/*
    public static CartFragment getInstance(String text) {
        CartFragment testFragment = new CartFragment();
        Bundle bundle = new Bundle();
        bundle.putString("fragment_text", text);
        testFragment.setArguments(bundle);
        return testFragment;
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test,container,false);
        //TextView textView = (TextView) view.findViewById(R.id.text);
        //textView.setText(getArgumentText());
        return view;
    }

/*    public String getArgumentText(){
        //return getArguments().getString("fragment_text");
        return null;
    }*/

}
