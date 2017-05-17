package com.example.lusen.cquptxuechao;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lusen on 2017/4/10.
 */

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        TextView textView;
        view = inflater.inflate(R.layout.fragment_home,null);
        textView = (TextView) view.findViewById(R.id.text_home);
        textView.setText(getArguments().getString("title"));
        return view;
    }

    public static HomeFragment getInstance(String title){
        HomeFragment home  = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title",title);
        home.setArguments(bundle);
        return home;
    }
}
