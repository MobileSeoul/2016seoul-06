package com.cym5240.kis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.actionbarsherlock.app.SherlockActivity;


public class introactivity extends SherlockActivity {

	/* ���÷��� �̹��� ��� */
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.splash2);
	
	/*���� ������� �Բ� ���θ޴� ǥ�� */
	
	new Handler().postDelayed(new Thread(){
		@Override
		public void run(){
			Intent Mainmenu = new Intent(introactivity.this,MainActivity.class);
			introactivity.this.startActivity(Mainmenu);
			introactivity.this.finish();
			
			
			
		}
	}, 3000);
	
	
	
	}
	 public void onBackPressed()
	    {
	     finish(); 
	     }
}

