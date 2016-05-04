package com.lambda.trendalista;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class PartyAcc extends Activity {

    ViewPager v;
    PagerAdapter adapter;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_party_acc);


        flag = new int[] {R.drawable.j_party1,R.drawable.j_party2,R.drawable.j_party3,R.drawable.j_party5,R.drawable.j_party6,R.drawable.j_party7,R.drawable.j_party7,R.drawable.j_party8,R.drawable.j_party9,R.drawable.j_party9,R.drawable.j_party10,R.drawable.j_party11,R.drawable.j_party12};

        v = (ViewPager) findViewById(R.id.pager);

        adapter = new ViewPagerAdapter(PartyAcc.this, flag);

        v.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getTitle().equals("Settings"))
        {   Intent in = new Intent(PartyAcc.this, EditInfo.class);
            startActivity(in);}

        if(item.getTitle().equals("Privacy Policy"))
        {   Intent in = new Intent(PartyAcc.this, Tips.class);
            startActivity(in);}

        if(item.getTitle().equals("Rate the App"))
        {   Intent in = new Intent(PartyAcc.this, RateApp.class);
            startActivity(in);}
        return true;
    }
}