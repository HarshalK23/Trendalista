package com.lambda.trendalista;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class CollegeHair extends Activity {

    ViewPager v;
    PagerAdapter adapter;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_college_hair);


        flag = new int[] {R.drawable.clg_hair1,R.drawable.clg_hair2,R.drawable.clg_hair3,R.drawable.clg_hair4,R.drawable.clg_hair5,R.drawable.clg_hair6,R.drawable.clg_hair7,R.drawable.clg_hair8,R.drawable.clg_hair9,R.drawable.clg_hair10,R.drawable.clg_hair11,R.drawable.clg_hair13};

        v = (ViewPager) findViewById(R.id.pager);

        adapter = new ViewPagerAdapter(CollegeHair.this, flag);

        v.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getTitle().equals("Settings"))
        {   Intent in = new Intent(CollegeHair.this, EditInfo.class);
            startActivity(in);}

        if(item.getTitle().equals("Privacy Policy"))
        {   Intent in = new Intent(CollegeHair.this, Tips.class);
            startActivity(in);}

        if(item.getTitle().equals("Rate the App"))
        {   Intent in = new Intent(CollegeHair.this, RateApp.class);
            startActivity(in);}
        return true;
    }
}