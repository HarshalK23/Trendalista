package com.lambda.trendalista;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class CollegeShoes extends Activity {
    ViewPager v;
    PagerAdapter adapter;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_college_shoes);


        flag = new int[] {R.drawable.clg_shoe1,R.drawable.clg_shoe2,R.drawable.clg_shoe3,R.drawable.clg_shoe4,R.drawable.clg_shoe5,R.drawable.clg_shoe6,R.drawable.clg_shoe7,R.drawable.clg_shoe8,R.drawable.clg_shoe10,R.drawable.clg_shoe12,R.drawable.clg_shoe14};

        v = (ViewPager) findViewById(R.id.pager);

        adapter = new ViewPagerAdapter(CollegeShoes.this, flag);

        v.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getTitle().equals("Settings"))
        {   Intent in = new Intent(CollegeShoes.this, EditInfo.class);
            startActivity(in);}

        if(item.getTitle().equals("Privacy Policy"))
        {   Intent in = new Intent(CollegeShoes.this, Tips.class);
            startActivity(in);}

        if(item.getTitle().equals("Rate the App"))
        {   Intent in = new Intent(CollegeShoes.this, RateApp.class);
            startActivity(in);}
        return true;
    }
}