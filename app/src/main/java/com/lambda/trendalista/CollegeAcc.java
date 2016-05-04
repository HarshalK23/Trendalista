package com.lambda.trendalista;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class CollegeAcc extends Activity {

    ViewPager v;
    PagerAdapter adapter;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_college_acc);


        flag = new int[] {R.drawable.clg_acc1,R.drawable.clg_acc2,R.drawable.clg_acc3,R.drawable.clg_acc4,R.drawable.clg_acc6,R.drawable.clg_acc7,R.drawable.clg_acc8,R.drawable.clg_acc9,R.drawable.clg_acc10,R.drawable.clg_acc11,R.drawable.clg_acc13,R.drawable.clg_acc14,R.drawable.clg_acc15,R.drawable.clg_acc16,R.drawable.clg_acc17};

        v = (ViewPager) findViewById(R.id.pager);

        adapter = new ViewPagerAdapter(CollegeAcc.this, flag);

        v.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getTitle().equals("Settings"))
        {   Intent in = new Intent(CollegeAcc.this, EditInfo.class);
            startActivity(in);}

        if(item.getTitle().equals("Privacy Policy"))
        {   Intent in = new Intent(CollegeAcc.this, Tips.class);
            startActivity(in);}

        if(item.getTitle().equals("Rate the App"))
        {   Intent in = new Intent(CollegeAcc.this, RateApp.class);
            startActivity(in);}
        return true;
    }
}