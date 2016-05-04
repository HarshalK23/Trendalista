package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity
{

		Button login,signup;
		LoginDataBaseAdapter ldb;
		EditText user,pass ;
	 
		@Override
		protected void onCreate(Bundle savedInstanceState) 
		{
		     super.onCreate(savedInstanceState);
		     setContentView(R.layout.activity_login);
	 
		     // create a instance of SQLite Database
		     ldb=new LoginDataBaseAdapter(this);
		     ldb=ldb.open();
	 
		     login=(Button)findViewById(R.id.login);
		     signup=(Button)findViewById(R.id.signup);
		     user=(EditText)findViewById(R.id.usernameo);
		     pass=(EditText)findViewById(R.id.passwordo);
		     
	 
		    signup.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) 
			{
				Intent intentSignUP=new Intent(getApplicationContext(),SignUp.class);
				startActivity(intentSignUP);
				}
	
		    });
		    
		    login.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					String userName=user.getText().toString();
					String password=pass.getText().toString();
					
					String storedPassword=ldb.getSinlgeEntry(userName);
					
					if(password.equals(storedPassword))
					{
						Toast.makeText(LoginActivity.this, "Congrats: Login Successfull", Toast.LENGTH_SHORT).show();
						Intent i = new Intent(LoginActivity.this, Occasion.class);
						startActivity(i);
					}
					else
					{
						Toast.makeText(LoginActivity.this, "User Name or Password does not match", Toast.LENGTH_SHORT).show();
					}
				}
			});
		    
		}
}
			
	