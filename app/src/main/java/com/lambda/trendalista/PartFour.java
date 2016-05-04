package com.lambda.trendalista;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PartFour extends Activity implements View.OnClickListener{


    Button shoes,clothes,acc ,hair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts);
        System.out.println("2");

        clothes=(Button)findViewById(R.id.button);
        shoes=(Button)findViewById(R.id.button5);
        acc=(Button)findViewById(R.id.button6);
        hair=(Button)findViewById(R.id.button7);

        clothes.setOnClickListener(this);
        shoes.setOnClickListener(this);
        acc.setOnClickListener(this);
        hair.setOnClickListener(this);


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        getMenuInflater().inflate(R.menu.choose_occassion, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getTitle().equals("Settings"))
        {   Intent in = new Intent(PartFour.this, EditInfo.class);
            startActivity(in);}

        if(item.getTitle().equals("Privacy Policy"))
        {   Intent in = new Intent(PartFour.this, Tips.class);
            startActivity(in);}

        if(item.getTitle().equals("Rate the App"))
        {   Intent in = new Intent(PartFour.this, RateApp.class);
            startActivity(in);}
        return true;
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.button:
                Intent i= new Intent(PartFour.this,MainOffice.class);
                startActivity(i);
                break;

            case R.id.button5:
                Intent i1 = new Intent(PartFour.this,OfficeShoes.class);
                startActivity(i1);
                break;

            case R.id.button6:
                Intent i2 = new Intent(PartFour.this,OfficeAcc.class);
                startActivity(i2);
                break;

            case R.id.button7:
                Intent i3 = new Intent(PartFour.this,OfficeHair.class);
                startActivity(i3);
                break;
        }

    }
}
