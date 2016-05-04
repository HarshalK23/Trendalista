package com.lambda.trendalista;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class FestShoes extends Activity {

    ViewPager v;
    PagerAdapter adapter;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_fest_shoes);


        flag = new int[] {R.drawable.f_shoe1,R.drawable.f_shoe2,R.drawable.f_shoe3,R.drawable.f_shoe4,R.drawable.f_shoe5,R.drawable.f_shoe7,R.drawable.f_shoe8,R.drawable.f_shoe11};

        v = (ViewPager) findViewById(R.id.pager);

        adapter = new ViewPagerAdapter(FestShoes.this, flag);

        v.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getTitle().equals("Settings"))
        {   Intent in = new Intent(FestShoes.this, EditInfo.class);
            startActivity(in);}

        if(item.getTitle().equals("Privacy Policy"))
        {   Intent in = new Intent(FestShoes.this, Tips.class);
            startActivity(in);}

        if(item.getTitle().equals("Rate the App"))
        {   Intent in = new Intent(FestShoes.this, RateApp.class);
            startActivity(in);}
        return true;
    }
}