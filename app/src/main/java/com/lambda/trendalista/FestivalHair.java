package com.lambda.trendalista;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class FestivalHair extends Activity {


    ViewPager v;
    PagerAdapter adapter;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_festival_hair);


        flag = new int[] {R.drawable.fest_hair,R.drawable.fest_hair3,R.drawable.fest_hair4,R.drawable.fest_hair5,R.drawable.fest_hair7,R.drawable.fest_hair8,R.drawable.fest_hair10};

        v = (ViewPager) findViewById(R.id.pager);

        adapter = new ViewPagerAdapter(FestivalHair.this, flag);

        v.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getTitle().equals("Settings"))
        {   Intent in = new Intent(FestivalHair.this, EditInfo.class);
            startActivity(in);}

        if(item.getTitle().equals("Privacy Policy"))
        {   Intent in = new Intent(FestivalHair.this, Tips.class);
            startActivity(in);}

        if(item.getTitle().equals("Rate the App"))
        {   Intent in = new Intent(FestivalHair.this, RateApp.class);
            startActivity(in);}
        return true;
    }
}