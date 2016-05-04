package com.lambda.trendalista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
 
public class SignUp extends Activity
{
	EditText user_name,email_id,password_one,con_password ; 
	Button b;
	CheckBox cb;
 
	LoginDataBaseAdapter ldb;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up);
 
		// get Instance  of Database Adapter
		ldb=new LoginDataBaseAdapter(this);
		ldb=ldb.open();
 
		user_name=(EditText)findViewById(R.id.username);
		email_id=(EditText)findViewById(R.id.email);
		password_one=(EditText)findViewById(R.id.pass);
		con_password=(EditText)findViewById(R.id.conpass);
		cb = (CheckBox)findViewById(R.id.checkBox1);
		
 
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(new View.OnClickListener() {
 
		public void onClick(View v) {
			// TODO Auto-generated method stub
 
			String userName=user_name.getText().toString();
			String password1=password_one.getText().toString();
			String confirmPassword=con_password.getText().toString();
 
			if(userName.equals("")||password1.equals("")||confirmPassword.equals(""))
			{
					Toast.makeText(getApplicationContext(), "Field Vaccant", Toast.LENGTH_LONG).show();
					return;
			}
			// check if both password matches
			if(!password1.equals(confirmPassword))
			{
				Toast.makeText(getApplicationContext(), "Password does not match", Toast.LENGTH_LONG).show();
				return;
			}
			if(!cb.isChecked())
			{
				 Toast.makeText(getApplicationContext(), "This app requires your personal details..Please check the checkbox", Toast.LENGTH_LONG).show();
			}
			else
			{
			    // Save the Data in Database
			    ldb.insertEntry(userName, password1);
			    Toast.makeText(getApplicationContext(), "Account Successfully Created ", Toast.LENGTH_LONG).show();
			    Intent i = new Intent(SignUp.this,Details.class);
			    startActivity(i);
			}
		}
	});
}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
 
		ldb.close();
	}
}
		
			
				