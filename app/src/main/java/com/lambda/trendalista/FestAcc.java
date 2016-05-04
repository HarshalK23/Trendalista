package com.lambda.trendalista;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class FestAcc extends Activity {

    ViewPager v;
    PagerAdapter adapter;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_fest_acc);


        flag = new int[] {R.drawable.fest1_j,R.drawable.fest2_j,R.drawable.fest3_j,R.drawable.fest4_j,R.drawable.fest5_j,R.drawable.fest6_j,R.drawable.fest7_j,R.drawable.fest9_j,R.drawable.fest10_j,R.drawable.fest11_j,R.drawable.fest12_j,R.drawable.fest14_j,R.drawable.fest14_j};

        v = (ViewPager) findViewById(R.id.pager);

        adapter = new ViewPagerAdapter(FestAcc.this, flag);

        v.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getTitle().equals("Settings"))
        {   Intent in = new Intent(FestAcc.this, EditInfo.class);
            startActivity(in);}

        if(item.getTitle().equals("Privacy Policy"))
        {   Intent in = new Intent(FestAcc.this, Tips.class);
            startActivity(in);}

        if(item.getTitle().equals("Rate the App"))
        {   Intent in = new Intent(FestAcc.this, RateApp.class);
            startActivity(in);}
        return true;
    }
}