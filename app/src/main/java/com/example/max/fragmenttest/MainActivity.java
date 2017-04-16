package com.example.max.fragmenttest;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private static final int menu_setting = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main );
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        PrefFragment prefFragment = new PrefFragment();
        transaction.add(R.id.activity_main, prefFragment);
        transaction.commit();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,menu_setting,1,"setting");
       return  super.onCreateOptionsMenu(menu);
    }
//     @Override
//     public boolean onOptionsItemSelected(MenuItem item)
//     {
//         super.onOptionsItemSelected(item);
//         Intent intent=new Intent(this,PrefFragment.class);
//         startActivity(intent);
//         return false;
//     }
}
