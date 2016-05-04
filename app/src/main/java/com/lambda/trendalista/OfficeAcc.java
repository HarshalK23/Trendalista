package com.lambda.trendalista;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class OfficeAcc extends Activity {

    ViewPager v;
    PagerAdapter adapter;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_office_acc);


        flag = new int[] {R.drawable.off_j1,R.drawable.off_j2,R.drawable.off_j3,R.drawable.off_j4,R.drawable.off_j6,R.drawable.off_j7,R.drawable.off_j8,R.drawable.off_j9,R.drawable.off_j10,R.drawable.off_j11};

        v = (ViewPager) findViewById(R.id.pager);

        adapter = new ViewPagerAdapter(OfficeAcc.this, flag);

        v.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getTitle().equals("Settings"))
        {   Intent in = new Intent(OfficeAcc.this, EditInfo.class);
            startActivity(in);}

        if(item.getTitle().equals("Privacy Policy"))
        {   Intent in = new Intent(OfficeAcc.this, Tips.class);
            startActivity(in);}

        if(item.getTitle().equals("Rate the App"))
        {   Intent in = new Intent(OfficeAcc.this, RateApp.class);
            startActivity(in);}
        return true;
    }
}