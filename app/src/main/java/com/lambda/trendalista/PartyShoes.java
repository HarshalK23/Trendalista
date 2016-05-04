package com.lambda.trendalista;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

public class PartyShoes extends Activity {


    ViewPager v;
    PagerAdapter adapter;
    int[] flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from viewpager_main.xml
        setContentView(R.layout.activity_party_shoes);


        flag = new int[] {R.drawable.p_shoe1,R.drawable.p_shoe2,R.drawable.p_shoe3,R.drawable.p_shoe4,R.drawable.p_shoe5,R.drawable.p_shoe7,R.drawable.p_shoe8,R.drawable.p_shoe9,R.drawable.p_shoe10,R.drawable.p_shoe11,R.drawable.p_shoe12,R.drawable.p_shoe12,R.drawable.p_shoe13};

        v = (ViewPager) findViewById(R.id.pager);

        adapter = new ViewPagerAdapter(PartyShoes.this, flag);

        v.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getTitle().equals("Settings"))
        {   Intent in = new Intent(PartyShoes.this, EditInfo.class);
            startActivity(in);}

        if(item.getTitle().equals("Privacy Policy"))
        {   Intent in = new Intent(PartyShoes.this, Tips.class);
            startActivity(in);}

        if(item.getTitle().equals("Rate the App"))
        {   Intent in = new Intent(PartyShoes.this, RateApp.class);
            startActivity(in);}
        return true;
    }
}