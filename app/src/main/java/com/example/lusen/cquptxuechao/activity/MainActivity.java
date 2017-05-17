package com.example.lusen.cquptxuechao.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.lusen.cquptxuechao.HomeFragment;
import com.example.lusen.cquptxuechao.R;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView view;
    android.app.FragmentTransaction transaction;
    HomeFragment themeFragment;
    Gson gson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (BottomNavigationView) findViewById(R.id.bottom_menu);
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_explore:
                        startFragment("explore");
                        break;
                    case R.id.action_home:
                        startFragment("home");
                        break;
                    case R.id.action_me:
                        startFragment("me");
                        break;
                }
                return true;
            }
        });



    }

    private void startFragment(String title){
        themeFragment = HomeFragment.getInstance(title);
        transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.pager_fragment,themeFragment);
        transaction.commit();
    }
}
