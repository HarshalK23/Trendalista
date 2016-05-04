package com.lambda.trendalista;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class OfficeShoes extends Activity {

    ViewPager v;
    PagerAdapter adapter;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_office_shoes);


        flag = new int[] {R.drawable.off_shoe1,R.drawable.off_shoe2,R.drawable.off_shoe3,R.drawable.off_shoe5,R.drawable.off_shoe6,R.drawable.off_shoe7,R.drawable.off_shoe8,R.drawable.off_shoe10,R.drawable.off_shoe11,R.drawable.off_shoe12,R.drawable.off_shoe13};

        v = (ViewPager) findViewById(R.id.pager);

        adapter = new ViewPagerAdapter(OfficeShoes.this, flag);

        v.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getTitle().equals("Settings"))
        {   Intent in = new Intent(OfficeShoes.this, EditInfo.class);
            startActivity(in);}

        if(item.getTitle().equals("Privacy Policy"))
        {   Intent in = new Intent(OfficeShoes.this, Tips.class);
            startActivity(in);}

        if(item.getTitle().equals("Rate the App"))
        {   Intent in = new Intent(OfficeShoes.this, RateApp.class);
            startActivity(in);}
        return true;
    }
}