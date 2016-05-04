package com.lambda.trendalista;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class OfficeHair extends Activity {


    ViewPager v;
    PagerAdapter adapter;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_office_hair);


        flag = new int[] {R.drawable.off_hair1,R.drawable.off_hair2,R.drawable.off_hair3,R.drawable.off_hair4,R.drawable.off_hair5,R.drawable.off_hair6,R.drawable.off_hair9};

        v = (ViewPager) findViewById(R.id.pager);

        adapter = new ViewPagerAdapter(OfficeHair.this, flag);

        v.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getTitle().equals("Settings"))
        {   Intent in = new Intent(OfficeHair.this, EditInfo.class);
            startActivity(in);}

        if(item.getTitle().equals("Privacy Policy"))
        {   Intent in = new Intent(OfficeHair.this, Tips.class);
            startActivity(in);}

        if(item.getTitle().equals("Rate the App"))
        {   Intent in = new Intent(OfficeHair.this, RateApp.class);
            startActivity(in);}
        return true;
    }
}