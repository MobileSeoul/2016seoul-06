package com.cym5240.kis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;

public class random extends SherlockActivity {

	private WebView mWebView;

	public ImageView ibtn = null;
	public ImageView ibtn2 = null;
	public ImageView ibtn3 = null;
	public ImageView ibtn4 = null;
	public ImageView ibtn5 = null;
	public ImageView ibtn6 = null;
	public ImageView ibtn7 = null;
	public ImageView ibtn8 = null;
	public ImageView ibtn9 = null;
	public ImageView ibtn10 = null;
	public ImageView ibtn11 = null;
	public ImageView ibtn12 = null;
	public ImageView ibtn13 = null;
	public ImageView ibtn14 = null;
	public ImageView ibtn15 = null;
	public ImageView ibtn16 = null;
	public ImageView ibtn17 = null;
	public ImageView ibtn18 = null;
	public ImageView ibtn19 = null;
	public ImageView ibtn20 = null;
	public ImageView ibtn21 = null;
	public ImageView ibtn22 = null;
	public ImageView ibtn23 = null;
	public ImageView ibtn24 = null;

	String temp;
	String temp2;
	String temp3;
	String temp4;
	String temp5;
	String temp6;
	String temp7;
	String temp8;
	String temp9;
	String temp10;
	String temp11;
	String temp12;
	String temp13;
	String temp14;
	String temp15;
	String temp16;
	String temp17;
	String temp18;
	String temp19;
	String temp20;
	String temp21;
	String temp22;
	String temp23;
	String temp24;

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Used to put sulakrk icons on light action bar

		getActionBar().setTitle("  ¹«ÀÛÀ§ ¼¯±â");
		getActionBar().setDisplayShowHomeEnabled(false);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		boolean isLight = SampleList.THEME == R.style.Theme_Favorite;

		return true;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.random);

		ibtn24 = (ImageView) findViewById(R.id.imageView1);

		ibtn = (ImageView) findViewById(R.id.imageView1);
		ibtn2 = (ImageView) findViewById(R.id.imageView2);
		ibtn3 = (ImageView) findViewById(R.id.imageView3);
		ibtn4 = (ImageView) findViewById(R.id.imageView4);
		ibtn5 = (ImageView) findViewById(R.id.imageView5);
		ibtn6 = (ImageView) findViewById(R.id.imageView6);
		ibtn7 = (ImageView) findViewById(R.id.imageView7);
		ibtn8 = (ImageView) findViewById(R.id.imageView8);
		ibtn9 = (ImageView) findViewById(R.id.imageView9);
		ibtn10 = (ImageView) findViewById(R.id.imageView10);
		ibtn11 = (ImageView) findViewById(R.id.imageView11);
		ibtn12 = (ImageView) findViewById(R.id.imageView12);
		ibtn13 = (ImageView) findViewById(R.id.imageView13);
		ibtn14 = (ImageView) findViewById(R.id.imageView14);
		ibtn15 = (ImageView) findViewById(R.id.imageView15);
		ibtn16 = (ImageView) findViewById(R.id.imageView16);
		ibtn17 = (ImageView) findViewById(R.id.imageView17);
		ibtn18 = (ImageView) findViewById(R.id.imageView18);
		ibtn19 = (ImageView) findViewById(R.id.imageView19);
		ibtn20 = (ImageView) findViewById(R.id.imageView20);
		ibtn21 = (ImageView) findViewById(R.id.imageView21);
		ibtn22 = (ImageView) findViewById(R.id.imageView22);
		ibtn23 = (ImageView) findViewById(R.id.imageView23);
		ibtn24 = (ImageView) findViewById(R.id.imageView24);

		String strs[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
				"21", "22", "23", "24" };
		List<String> list = Arrays.asList(strs);
		Collections.shuffle(list);

		temp = list.get(0);
		temp2 = list.get(1);
		temp3 = list.get(2);
		temp4 = list.get(3);
		temp5 = list.get(4);
		temp6 = list.get(5);
		temp7 = list.get(6);
		temp8 = list.get(7);
		temp9 = list.get(8);
		temp10 = list.get(9);
		temp11 = list.get(10);
		temp12 = list.get(11);
		temp13 = list.get(12);
		temp14 = list.get(13);
		temp15 = list.get(14);
		temp16 = list.get(15);
		temp17 = list.get(16);
		temp18 = list.get(17);
		temp19 = list.get(18);
		temp20 = list.get(19);
		temp21 = list.get(20);
		temp22 = list.get(21);
		temp23 = list.get(22);
		temp24 = list.get(23);

		if (temp.equals("1")) {
			ibtn.setImageResource(R.drawable.chsa);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("2")) {
			ibtn.setImageResource(R.drawable.chgon);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("3")) {
			ibtn.setImageResource(R.drawable.teji);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("4")) {
			ibtn.setImageResource(R.drawable.fishc);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("5")) {
			ibtn.setImageResource(R.drawable.mbg);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("6")) {
			ibtn.setImageResource(R.drawable.gjg);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("7")) {
			ibtn.setImageResource(R.drawable.ssnr);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("8")) {
			ibtn.setImageResource(R.drawable.msgy);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("9")) {
			ibtn.setImageResource(R.drawable.aquar);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("10")) {
			ibtn.setImageResource(R.drawable.pororo);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("11")) {
			ibtn.setImageResource(R.drawable.kisa);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("12")) {
			ibtn.setImageResource(R.drawable.jasa);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("13")) {
			ibtn.setImageResource(R.drawable.dys);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("14")) {
			ibtn.setImageResource(R.drawable.ddp);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("15")) {
			ibtn.setImageResource(R.drawable.anime);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("16")) {
			ibtn.setImageResource(R.drawable.seokid);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("17")) {
			ibtn.setImageResource(R.drawable.pororo);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("18")) {
			ibtn.setImageResource(R.drawable.exaq);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("19")) {
			ibtn.setImageResource(R.drawable.jjg);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("20")) {
			ibtn.setImageResource(R.drawable.emg);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("21")) {
			ibtn.setImageResource(R.drawable.gss);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("22")) {
			ibtn.setImageResource(R.drawable.dmu);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("23")) {
			ibtn.setImageResource(R.drawable.sgh);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("24")) {
			ibtn.setImageResource(R.drawable.grg);
			ibtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp2.equals("1")) {
			ibtn2.setImageResource(R.drawable.chsa);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("2")) {
			ibtn2.setImageResource(R.drawable.chgon);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("3")) {
			ibtn2.setImageResource(R.drawable.teji);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("4")) {
			ibtn2.setImageResource(R.drawable.fishc);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("5")) {
			ibtn2.setImageResource(R.drawable.mbg);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("6")) {
			ibtn2.setImageResource(R.drawable.gjg);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("7")) {
			ibtn2.setImageResource(R.drawable.ssnr);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("8")) {
			ibtn2.setImageResource(R.drawable.msgy);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("9")) {
			ibtn2.setImageResource(R.drawable.aquar);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("10")) {
			ibtn2.setImageResource(R.drawable.pororo);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("11")) {
			ibtn2.setImageResource(R.drawable.kisa);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("12")) {
			ibtn2.setImageResource(R.drawable.jasa);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("13")) {
			ibtn2.setImageResource(R.drawable.dys);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("14")) {
			ibtn2.setImageResource(R.drawable.ddp);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("15")) {
			ibtn2.setImageResource(R.drawable.anime);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("16")) {
			ibtn2.setImageResource(R.drawable.seokid);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("17")) {
			ibtn2.setImageResource(R.drawable.pororo);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("18")) {
			ibtn2.setImageResource(R.drawable.exaq);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("19")) {
			ibtn2.setImageResource(R.drawable.jjg);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("20")) {
			ibtn2.setImageResource(R.drawable.emg);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("21")) {
			ibtn2.setImageResource(R.drawable.gss);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("22")) {
			ibtn2.setImageResource(R.drawable.dmu);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("23")) {
			ibtn2.setImageResource(R.drawable.sgh);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp2.equals("24")) {
			ibtn2.setImageResource(R.drawable.grg);
			ibtn2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp3.equals("1")) {
			ibtn3.setImageResource(R.drawable.chsa);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("2")) {
			ibtn3.setImageResource(R.drawable.chgon);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("3")) {
			ibtn3.setImageResource(R.drawable.teji);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("4")) {
			ibtn3.setImageResource(R.drawable.fishc);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("5")) {
			ibtn3.setImageResource(R.drawable.mbg);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("6")) {
			ibtn3.setImageResource(R.drawable.gjg);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("7")) {
			ibtn3.setImageResource(R.drawable.ssnr);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("8")) {
			ibtn3.setImageResource(R.drawable.msgy);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("9")) {
			ibtn3.setImageResource(R.drawable.aquar);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("10")) {
			ibtn3.setImageResource(R.drawable.pororo);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("11")) {
			ibtn3.setImageResource(R.drawable.kisa);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("12")) {
			ibtn3.setImageResource(R.drawable.jasa);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("13")) {
			ibtn3.setImageResource(R.drawable.dys);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("14")) {
			ibtn3.setImageResource(R.drawable.ddp);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("15")) {
			ibtn3.setImageResource(R.drawable.anime);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("16")) {
			ibtn3.setImageResource(R.drawable.seokid);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("17")) {
			ibtn3.setImageResource(R.drawable.pororo);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("18")) {
			ibtn3.setImageResource(R.drawable.exaq);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("19")) {
			ibtn3.setImageResource(R.drawable.jjg);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("20")) {
			ibtn3.setImageResource(R.drawable.emg);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("21")) {
			ibtn3.setImageResource(R.drawable.gss);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("22")) {
			ibtn3.setImageResource(R.drawable.dmu);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("23")) {
			ibtn3.setImageResource(R.drawable.sgh);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp3.equals("24")) {
			ibtn3.setImageResource(R.drawable.grg);
			ibtn3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp4.equals("1")) {
			ibtn4.setImageResource(R.drawable.chsa);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("2")) {
			ibtn4.setImageResource(R.drawable.chgon);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("3")) {
			ibtn4.setImageResource(R.drawable.teji);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("4")) {
			ibtn4.setImageResource(R.drawable.fishc);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("5")) {
			ibtn4.setImageResource(R.drawable.mbg);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("6")) {
			ibtn4.setImageResource(R.drawable.gjg);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("7")) {
			ibtn4.setImageResource(R.drawable.ssnr);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("8")) {
			ibtn4.setImageResource(R.drawable.msgy);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("9")) {
			ibtn4.setImageResource(R.drawable.aquar);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("10")) {
			ibtn4.setImageResource(R.drawable.pororo);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("11")) {
			ibtn4.setImageResource(R.drawable.kisa);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("12")) {
			ibtn4.setImageResource(R.drawable.jasa);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("13")) {
			ibtn4.setImageResource(R.drawable.dys);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("14")) {
			ibtn4.setImageResource(R.drawable.ddp);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("15")) {
			ibtn4.setImageResource(R.drawable.anime);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("16")) {
			ibtn4.setImageResource(R.drawable.seokid);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("17")) {
			ibtn4.setImageResource(R.drawable.pororo);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("18")) {
			ibtn4.setImageResource(R.drawable.exaq);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("19")) {
			ibtn4.setImageResource(R.drawable.jjg);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("20")) {
			ibtn4.setImageResource(R.drawable.emg);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("21")) {
			ibtn4.setImageResource(R.drawable.gss);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("22")) {
			ibtn4.setImageResource(R.drawable.dmu);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("23")) {
			ibtn4.setImageResource(R.drawable.sgh);
			ibtn4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp4.equals("24")) {
			ibtn4.setImageResource(R.drawable.grg);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp5.equals("1")) {
			ibtn5.setImageResource(R.drawable.chsa);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("2")) {
			ibtn5.setImageResource(R.drawable.chgon);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("3")) {
			ibtn5.setImageResource(R.drawable.teji);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("4")) {
			ibtn5.setImageResource(R.drawable.fishc);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("5")) {
			ibtn5.setImageResource(R.drawable.mbg);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("6")) {
			ibtn5.setImageResource(R.drawable.gjg);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("7")) {
			ibtn5.setImageResource(R.drawable.ssnr);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("8")) {
			ibtn5.setImageResource(R.drawable.msgy);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("9")) {
			ibtn5.setImageResource(R.drawable.aquar);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("10")) {
			ibtn5.setImageResource(R.drawable.pororo);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("11")) {
			ibtn5.setImageResource(R.drawable.kisa);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("12")) {
			ibtn5.setImageResource(R.drawable.jasa);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("13")) {
			ibtn5.setImageResource(R.drawable.dys);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("14")) {
			ibtn5.setImageResource(R.drawable.ddp);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("15")) {
			ibtn5.setImageResource(R.drawable.anime);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("16")) {
			ibtn5.setImageResource(R.drawable.seokid);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("17")) {
			ibtn5.setImageResource(R.drawable.pororo);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("18")) {
			ibtn5.setImageResource(R.drawable.exaq);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("19")) {
			ibtn5.setImageResource(R.drawable.jjg);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("20")) {
			ibtn5.setImageResource(R.drawable.emg);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("21")) {
			ibtn5.setImageResource(R.drawable.gss);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("22")) {
			ibtn5.setImageResource(R.drawable.dmu);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("23")) {
			ibtn5.setImageResource(R.drawable.sgh);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp5.equals("24")) {
			ibtn5.setImageResource(R.drawable.grg);
			ibtn5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp6.equals("1")) {
			ibtn6.setImageResource(R.drawable.chsa);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("2")) {
			ibtn6.setImageResource(R.drawable.chgon);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("3")) {
			ibtn6.setImageResource(R.drawable.teji);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("4")) {
			ibtn6.setImageResource(R.drawable.fishc);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("5")) {
			ibtn6.setImageResource(R.drawable.mbg);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("6")) {
			ibtn6.setImageResource(R.drawable.gjg);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("7")) {
			ibtn6.setImageResource(R.drawable.ssnr);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("8")) {
			ibtn6.setImageResource(R.drawable.msgy);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("9")) {
			ibtn6.setImageResource(R.drawable.aquar);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("10")) {
			ibtn6.setImageResource(R.drawable.pororo);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("11")) {
			ibtn6.setImageResource(R.drawable.kisa);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("12")) {
			ibtn6.setImageResource(R.drawable.jasa);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("13")) {
			ibtn6.setImageResource(R.drawable.dys);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("14")) {
			ibtn6.setImageResource(R.drawable.ddp);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("15")) {
			ibtn6.setImageResource(R.drawable.anime);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("16")) {
			ibtn6.setImageResource(R.drawable.seokid);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("17")) {
			ibtn6.setImageResource(R.drawable.pororo);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("18")) {
			ibtn6.setImageResource(R.drawable.exaq);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("19")) {
			ibtn6.setImageResource(R.drawable.jjg);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("20")) {
			ibtn6.setImageResource(R.drawable.emg);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("21")) {
			ibtn6.setImageResource(R.drawable.gss);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("22")) {
			ibtn6.setImageResource(R.drawable.dmu);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("23")) {
			ibtn6.setImageResource(R.drawable.sgh);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp6.equals("24")) {
			ibtn6.setImageResource(R.drawable.grg);
			ibtn6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp7.equals("1")) {
			ibtn7.setImageResource(R.drawable.chsa);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("2")) {
			ibtn7.setImageResource(R.drawable.chgon);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("3")) {
			ibtn7.setImageResource(R.drawable.teji);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("4")) {
			ibtn7.setImageResource(R.drawable.fishc);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("5")) {
			ibtn7.setImageResource(R.drawable.mbg);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("6")) {
			ibtn7.setImageResource(R.drawable.gjg);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("7")) {
			ibtn7.setImageResource(R.drawable.ssnr);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("8")) {
			ibtn7.setImageResource(R.drawable.msgy);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("9")) {
			ibtn7.setImageResource(R.drawable.aquar);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("10")) {
			ibtn7.setImageResource(R.drawable.pororo);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("11")) {
			ibtn7.setImageResource(R.drawable.kisa);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("12")) {
			ibtn7.setImageResource(R.drawable.jasa);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("13")) {
			ibtn7.setImageResource(R.drawable.dys);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("14")) {
			ibtn7.setImageResource(R.drawable.ddp);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("15")) {
			ibtn7.setImageResource(R.drawable.anime);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("16")) {
			ibtn7.setImageResource(R.drawable.seokid);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("17")) {
			ibtn7.setImageResource(R.drawable.pororo);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("18")) {
			ibtn7.setImageResource(R.drawable.exaq);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("19")) {
			ibtn7.setImageResource(R.drawable.jjg);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("20")) {
			ibtn7.setImageResource(R.drawable.emg);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("21")) {
			ibtn7.setImageResource(R.drawable.gss);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("22")) {
			ibtn7.setImageResource(R.drawable.dmu);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("23")) {
			ibtn7.setImageResource(R.drawable.sgh);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp7.equals("24")) {
			ibtn7.setImageResource(R.drawable.grg);
			ibtn7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp8.equals("1")) {
			ibtn8.setImageResource(R.drawable.chsa);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("2")) {
			ibtn8.setImageResource(R.drawable.chgon);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("3")) {
			ibtn8.setImageResource(R.drawable.teji);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("4")) {
			ibtn8.setImageResource(R.drawable.fishc);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("5")) {
			ibtn8.setImageResource(R.drawable.mbg);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("6")) {
			ibtn8.setImageResource(R.drawable.gjg);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("7")) {
			ibtn8.setImageResource(R.drawable.ssnr);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("8")) {
			ibtn8.setImageResource(R.drawable.msgy);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("9")) {
			ibtn8.setImageResource(R.drawable.aquar);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("10")) {
			ibtn8.setImageResource(R.drawable.pororo);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("11")) {
			ibtn8.setImageResource(R.drawable.kisa);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("12")) {
			ibtn8.setImageResource(R.drawable.jasa);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("13")) {
			ibtn8.setImageResource(R.drawable.dys);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("14")) {
			ibtn8.setImageResource(R.drawable.ddp);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("15")) {
			ibtn8.setImageResource(R.drawable.anime);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("16")) {
			ibtn8.setImageResource(R.drawable.seokid);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("17")) {
			ibtn8.setImageResource(R.drawable.pororo);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("18")) {
			ibtn8.setImageResource(R.drawable.exaq);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("19")) {
			ibtn8.setImageResource(R.drawable.jjg);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("20")) {
			ibtn8.setImageResource(R.drawable.emg);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("21")) {
			ibtn8.setImageResource(R.drawable.gss);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("22")) {
			ibtn8.setImageResource(R.drawable.dmu);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("23")) {
			ibtn8.setImageResource(R.drawable.sgh);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp8.equals("24")) {
			ibtn8.setImageResource(R.drawable.grg);
			ibtn8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp9.equals("1")) {
			ibtn9.setImageResource(R.drawable.chsa);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("2")) {
			ibtn9.setImageResource(R.drawable.chgon);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("3")) {
			ibtn9.setImageResource(R.drawable.teji);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("4")) {
			ibtn9.setImageResource(R.drawable.fishc);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("5")) {
			ibtn9.setImageResource(R.drawable.mbg);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("6")) {
			ibtn9.setImageResource(R.drawable.gjg);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("7")) {
			ibtn9.setImageResource(R.drawable.ssnr);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("8")) {
			ibtn9.setImageResource(R.drawable.msgy);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("9")) {
			ibtn9.setImageResource(R.drawable.aquar);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("10")) {
			ibtn9.setImageResource(R.drawable.pororo);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("11")) {
			ibtn9.setImageResource(R.drawable.kisa);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("12")) {
			ibtn9.setImageResource(R.drawable.jasa);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("13")) {
			ibtn9.setImageResource(R.drawable.dys);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("14")) {
			ibtn9.setImageResource(R.drawable.ddp);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("15")) {
			ibtn9.setImageResource(R.drawable.anime);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("16")) {
			ibtn9.setImageResource(R.drawable.seokid);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("17")) {
			ibtn9.setImageResource(R.drawable.pororo);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("18")) {
			ibtn9.setImageResource(R.drawable.exaq);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("19")) {
			ibtn9.setImageResource(R.drawable.jjg);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("20")) {
			ibtn9.setImageResource(R.drawable.emg);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("21")) {
			ibtn9.setImageResource(R.drawable.gss);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("22")) {
			ibtn9.setImageResource(R.drawable.dmu);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("23")) {
			ibtn9.setImageResource(R.drawable.sgh);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp9.equals("24")) {
			ibtn9.setImageResource(R.drawable.grg);
			ibtn9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp10.equals("1")) {
			ibtn10.setImageResource(R.drawable.chsa);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("2")) {
			ibtn10.setImageResource(R.drawable.chgon);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("3")) {
			ibtn10.setImageResource(R.drawable.teji);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("4")) {
			ibtn10.setImageResource(R.drawable.fishc);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("5")) {
			ibtn10.setImageResource(R.drawable.mbg);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("6")) {
			ibtn10.setImageResource(R.drawable.gjg);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("7")) {
			ibtn10.setImageResource(R.drawable.ssnr);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("8")) {
			ibtn10.setImageResource(R.drawable.msgy);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("9")) {
			ibtn10.setImageResource(R.drawable.aquar);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("10")) {
			ibtn10.setImageResource(R.drawable.pororo);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("11")) {
			ibtn10.setImageResource(R.drawable.kisa);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("12")) {
			ibtn10.setImageResource(R.drawable.jasa);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("13")) {
			ibtn10.setImageResource(R.drawable.dys);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("14")) {
			ibtn10.setImageResource(R.drawable.ddp);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("15")) {
			ibtn10.setImageResource(R.drawable.anime);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("16")) {
			ibtn10.setImageResource(R.drawable.seokid);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("17")) {
			ibtn10.setImageResource(R.drawable.pororo);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("18")) {
			ibtn10.setImageResource(R.drawable.exaq);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("19")) {
			ibtn10.setImageResource(R.drawable.jjg);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("20")) {
			ibtn10.setImageResource(R.drawable.emg);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("21")) {
			ibtn10.setImageResource(R.drawable.gss);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("22")) {
			ibtn10.setImageResource(R.drawable.dmu);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("23")) {
			ibtn10.setImageResource(R.drawable.sgh);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp10.equals("24")) {
			ibtn10.setImageResource(R.drawable.grg);
			ibtn10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp11.equals("1")) {
			ibtn11.setImageResource(R.drawable.chsa);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("2")) {
			ibtn11.setImageResource(R.drawable.chgon);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("3")) {
			ibtn11.setImageResource(R.drawable.teji);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("4")) {
			ibtn11.setImageResource(R.drawable.fishc);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("5")) {
			ibtn11.setImageResource(R.drawable.mbg);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("6")) {
			ibtn11.setImageResource(R.drawable.gjg);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("7")) {
			ibtn11.setImageResource(R.drawable.ssnr);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("8")) {
			ibtn11.setImageResource(R.drawable.msgy);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("9")) {
			ibtn11.setImageResource(R.drawable.aquar);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("10")) {
			ibtn11.setImageResource(R.drawable.pororo);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("11")) {
			ibtn11.setImageResource(R.drawable.kisa);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("12")) {
			ibtn11.setImageResource(R.drawable.jasa);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("13")) {
			ibtn11.setImageResource(R.drawable.dys);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("14")) {
			ibtn11.setImageResource(R.drawable.ddp);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("15")) {
			ibtn11.setImageResource(R.drawable.anime);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("16")) {
			ibtn11.setImageResource(R.drawable.seokid);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("17")) {
			ibtn11.setImageResource(R.drawable.pororo);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("18")) {
			ibtn11.setImageResource(R.drawable.exaq);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("19")) {
			ibtn11.setImageResource(R.drawable.jjg);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("20")) {
			ibtn11.setImageResource(R.drawable.emg);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("21")) {
			ibtn11.setImageResource(R.drawable.gss);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("22")) {
			ibtn11.setImageResource(R.drawable.dmu);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("23")) {
			ibtn11.setImageResource(R.drawable.sgh);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp11.equals("24")) {
			ibtn11.setImageResource(R.drawable.grg);
			ibtn11.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp12.equals("1")) {
			ibtn12.setImageResource(R.drawable.chsa);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("2")) {
			ibtn12.setImageResource(R.drawable.chgon);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("3")) {
			ibtn12.setImageResource(R.drawable.teji);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("4")) {
			ibtn12.setImageResource(R.drawable.fishc);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("5")) {
			ibtn12.setImageResource(R.drawable.mbg);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("6")) {
			ibtn12.setImageResource(R.drawable.gjg);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("7")) {
			ibtn12.setImageResource(R.drawable.ssnr);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("8")) {
			ibtn12.setImageResource(R.drawable.msgy);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("9")) {
			ibtn12.setImageResource(R.drawable.aquar);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("10")) {
			ibtn12.setImageResource(R.drawable.pororo);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("11")) {
			ibtn12.setImageResource(R.drawable.kisa);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("12")) {
			ibtn12.setImageResource(R.drawable.jasa);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("13")) {
			ibtn12.setImageResource(R.drawable.dys);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("14")) {
			ibtn12.setImageResource(R.drawable.ddp);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("15")) {
			ibtn12.setImageResource(R.drawable.anime);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("16")) {
			ibtn12.setImageResource(R.drawable.seokid);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("17")) {
			ibtn12.setImageResource(R.drawable.pororo);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("18")) {
			ibtn12.setImageResource(R.drawable.exaq);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("19")) {
			ibtn12.setImageResource(R.drawable.jjg);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("20")) {
			ibtn12.setImageResource(R.drawable.emg);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("21")) {
			ibtn12.setImageResource(R.drawable.gss);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("22")) {
			ibtn12.setImageResource(R.drawable.dmu);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("23")) {
			ibtn12.setImageResource(R.drawable.sgh);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp12.equals("24")) {
			ibtn12.setImageResource(R.drawable.grg);
			ibtn12.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp13.equals("1")) {
			ibtn13.setImageResource(R.drawable.chsa);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("2")) {
			ibtn13.setImageResource(R.drawable.chgon);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("3")) {
			ibtn13.setImageResource(R.drawable.teji);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("4")) {
			ibtn13.setImageResource(R.drawable.fishc);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("5")) {
			ibtn13.setImageResource(R.drawable.mbg);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("6")) {
			ibtn13.setImageResource(R.drawable.gjg);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("7")) {
			ibtn13.setImageResource(R.drawable.ssnr);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("8")) {
			ibtn13.setImageResource(R.drawable.msgy);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("9")) {
			ibtn13.setImageResource(R.drawable.aquar);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("10")) {
			ibtn13.setImageResource(R.drawable.pororo);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("11")) {
			ibtn13.setImageResource(R.drawable.kisa);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("12")) {
			ibtn13.setImageResource(R.drawable.jasa);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("13")) {
			ibtn13.setImageResource(R.drawable.dys);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("14")) {
			ibtn13.setImageResource(R.drawable.ddp);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("15")) {
			ibtn13.setImageResource(R.drawable.anime);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("16")) {
			ibtn13.setImageResource(R.drawable.seokid);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("17")) {
			ibtn13.setImageResource(R.drawable.pororo);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("18")) {
			ibtn13.setImageResource(R.drawable.exaq);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("19")) {
			ibtn13.setImageResource(R.drawable.jjg);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("20")) {
			ibtn13.setImageResource(R.drawable.emg);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("21")) {
			ibtn13.setImageResource(R.drawable.gss);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("22")) {
			ibtn13.setImageResource(R.drawable.dmu);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("23")) {
			ibtn13.setImageResource(R.drawable.sgh);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp13.equals("24")) {
			ibtn13.setImageResource(R.drawable.grg);
			ibtn13.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp14.equals("1")) {
			ibtn14.setImageResource(R.drawable.chsa);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("2")) {
			ibtn14.setImageResource(R.drawable.chgon);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("3")) {
			ibtn14.setImageResource(R.drawable.teji);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("4")) {
			ibtn14.setImageResource(R.drawable.fishc);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("5")) {
			ibtn14.setImageResource(R.drawable.mbg);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("6")) {
			ibtn14.setImageResource(R.drawable.gjg);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("7")) {
			ibtn14.setImageResource(R.drawable.ssnr);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("8")) {
			ibtn14.setImageResource(R.drawable.msgy);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("9")) {
			ibtn14.setImageResource(R.drawable.aquar);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("10")) {
			ibtn14.setImageResource(R.drawable.pororo);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("11")) {
			ibtn14.setImageResource(R.drawable.kisa);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("12")) {
			ibtn14.setImageResource(R.drawable.jasa);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("13")) {
			ibtn14.setImageResource(R.drawable.dys);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("14")) {
			ibtn14.setImageResource(R.drawable.ddp);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("15")) {
			ibtn14.setImageResource(R.drawable.anime);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("16")) {
			ibtn14.setImageResource(R.drawable.seokid);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("17")) {
			ibtn14.setImageResource(R.drawable.pororo);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("18")) {
			ibtn14.setImageResource(R.drawable.exaq);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("19")) {
			ibtn14.setImageResource(R.drawable.jjg);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("20")) {
			ibtn14.setImageResource(R.drawable.emg);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("21")) {
			ibtn14.setImageResource(R.drawable.gss);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("22")) {
			ibtn14.setImageResource(R.drawable.dmu);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("23")) {
			ibtn14.setImageResource(R.drawable.sgh);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp14.equals("24")) {
			ibtn14.setImageResource(R.drawable.grg);
			ibtn14.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp15.equals("1")) {
			ibtn15.setImageResource(R.drawable.chsa);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("2")) {
			ibtn15.setImageResource(R.drawable.chgon);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("3")) {
			ibtn15.setImageResource(R.drawable.teji);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("4")) {
			ibtn15.setImageResource(R.drawable.fishc);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("5")) {
			ibtn15.setImageResource(R.drawable.mbg);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("6")) {
			ibtn15.setImageResource(R.drawable.gjg);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("7")) {
			ibtn15.setImageResource(R.drawable.ssnr);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("8")) {
			ibtn15.setImageResource(R.drawable.msgy);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("9")) {
			ibtn15.setImageResource(R.drawable.aquar);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("10")) {
			ibtn15.setImageResource(R.drawable.pororo);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("11")) {
			ibtn15.setImageResource(R.drawable.kisa);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("12")) {
			ibtn15.setImageResource(R.drawable.jasa);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("13")) {
			ibtn15.setImageResource(R.drawable.dys);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("14")) {
			ibtn15.setImageResource(R.drawable.ddp);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("15")) {
			ibtn15.setImageResource(R.drawable.anime);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("16")) {
			ibtn15.setImageResource(R.drawable.seokid);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("17")) {
			ibtn15.setImageResource(R.drawable.pororo);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("18")) {
			ibtn15.setImageResource(R.drawable.exaq);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("19")) {
			ibtn15.setImageResource(R.drawable.jjg);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("20")) {
			ibtn15.setImageResource(R.drawable.emg);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("21")) {
			ibtn15.setImageResource(R.drawable.gss);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("22")) {
			ibtn15.setImageResource(R.drawable.dmu);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("23")) {
			ibtn15.setImageResource(R.drawable.sgh);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp15.equals("24")) {
			ibtn15.setImageResource(R.drawable.grg);
			ibtn15.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp16.equals("1")) {
			ibtn16.setImageResource(R.drawable.chsa);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("2")) {
			ibtn16.setImageResource(R.drawable.chgon);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("3")) {
			ibtn16.setImageResource(R.drawable.teji);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("4")) {
			ibtn16.setImageResource(R.drawable.fishc);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("5")) {
			ibtn16.setImageResource(R.drawable.mbg);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("6")) {
			ibtn16.setImageResource(R.drawable.gjg);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("7")) {
			ibtn16.setImageResource(R.drawable.ssnr);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("8")) {
			ibtn16.setImageResource(R.drawable.msgy);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("9")) {
			ibtn16.setImageResource(R.drawable.aquar);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("10")) {
			ibtn16.setImageResource(R.drawable.pororo);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("11")) {
			ibtn16.setImageResource(R.drawable.kisa);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("12")) {
			ibtn16.setImageResource(R.drawable.jasa);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("13")) {
			ibtn16.setImageResource(R.drawable.dys);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("14")) {
			ibtn16.setImageResource(R.drawable.ddp);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("15")) {
			ibtn16.setImageResource(R.drawable.anime);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("16")) {
			ibtn16.setImageResource(R.drawable.seokid);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("17")) {
			ibtn16.setImageResource(R.drawable.pororo);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("18")) {
			ibtn16.setImageResource(R.drawable.exaq);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("19")) {
			ibtn16.setImageResource(R.drawable.jjg);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("20")) {
			ibtn16.setImageResource(R.drawable.emg);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("21")) {
			ibtn16.setImageResource(R.drawable.gss);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("22")) {
			ibtn16.setImageResource(R.drawable.dmu);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("23")) {
			ibtn16.setImageResource(R.drawable.sgh);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp16.equals("24")) {
			ibtn16.setImageResource(R.drawable.grg);
			ibtn16.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp17.equals("1")) {
			ibtn17.setImageResource(R.drawable.chsa);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("2")) {
			ibtn17.setImageResource(R.drawable.chgon);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("3")) {
			ibtn17.setImageResource(R.drawable.teji);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("4")) {
			ibtn17.setImageResource(R.drawable.fishc);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("5")) {
			ibtn17.setImageResource(R.drawable.mbg);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("6")) {
			ibtn17.setImageResource(R.drawable.gjg);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("7")) {
			ibtn17.setImageResource(R.drawable.ssnr);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("8")) {
			ibtn17.setImageResource(R.drawable.msgy);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("9")) {
			ibtn17.setImageResource(R.drawable.aquar);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("10")) {
			ibtn17.setImageResource(R.drawable.pororo);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("11")) {
			ibtn17.setImageResource(R.drawable.kisa);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("12")) {
			ibtn17.setImageResource(R.drawable.jasa);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("13")) {
			ibtn17.setImageResource(R.drawable.dys);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("14")) {
			ibtn17.setImageResource(R.drawable.ddp);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("15")) {
			ibtn17.setImageResource(R.drawable.anime);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("16")) {
			ibtn17.setImageResource(R.drawable.seokid);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("17")) {
			ibtn17.setImageResource(R.drawable.pororo);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("18")) {
			ibtn17.setImageResource(R.drawable.exaq);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("19")) {
			ibtn17.setImageResource(R.drawable.jjg);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("20")) {
			ibtn17.setImageResource(R.drawable.emg);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("21")) {
			ibtn17.setImageResource(R.drawable.gss);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("22")) {
			ibtn17.setImageResource(R.drawable.dmu);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("23")) {
			ibtn17.setImageResource(R.drawable.sgh);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp17.equals("24")) {
			ibtn17.setImageResource(R.drawable.grg);
			ibtn17.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp18.equals("1")) {
			ibtn18.setImageResource(R.drawable.chsa);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("2")) {
			ibtn18.setImageResource(R.drawable.chgon);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("3")) {
			ibtn18.setImageResource(R.drawable.teji);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("4")) {
			ibtn18.setImageResource(R.drawable.fishc);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("5")) {
			ibtn18.setImageResource(R.drawable.mbg);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("6")) {
			ibtn18.setImageResource(R.drawable.gjg);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("7")) {
			ibtn18.setImageResource(R.drawable.ssnr);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("8")) {
			ibtn18.setImageResource(R.drawable.msgy);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("9")) {
			ibtn18.setImageResource(R.drawable.aquar);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("10")) {
			ibtn18.setImageResource(R.drawable.pororo);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("11")) {
			ibtn18.setImageResource(R.drawable.kisa);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("12")) {
			ibtn18.setImageResource(R.drawable.jasa);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("13")) {
			ibtn18.setImageResource(R.drawable.dys);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("14")) {
			ibtn18.setImageResource(R.drawable.ddp);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("15")) {
			ibtn18.setImageResource(R.drawable.anime);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("16")) {
			ibtn18.setImageResource(R.drawable.seokid);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("17")) {
			ibtn18.setImageResource(R.drawable.pororo);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("18")) {
			ibtn18.setImageResource(R.drawable.exaq);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("19")) {
			ibtn18.setImageResource(R.drawable.jjg);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("20")) {
			ibtn18.setImageResource(R.drawable.emg);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("21")) {
			ibtn18.setImageResource(R.drawable.gss);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("22")) {
			ibtn18.setImageResource(R.drawable.dmu);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("23")) {
			ibtn18.setImageResource(R.drawable.sgh);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp18.equals("24")) {
			ibtn18.setImageResource(R.drawable.grg);
			ibtn18.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp19.equals("1")) {
			ibtn19.setImageResource(R.drawable.chsa);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("2")) {
			ibtn19.setImageResource(R.drawable.chgon);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("3")) {
			ibtn19.setImageResource(R.drawable.teji);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("4")) {
			ibtn19.setImageResource(R.drawable.fishc);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("5")) {
			ibtn19.setImageResource(R.drawable.mbg);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("6")) {
			ibtn19.setImageResource(R.drawable.gjg);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("7")) {
			ibtn19.setImageResource(R.drawable.ssnr);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("8")) {
			ibtn19.setImageResource(R.drawable.msgy);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("9")) {
			ibtn19.setImageResource(R.drawable.aquar);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("10")) {
			ibtn19.setImageResource(R.drawable.pororo);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("11")) {
			ibtn19.setImageResource(R.drawable.kisa);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("12")) {
			ibtn19.setImageResource(R.drawable.jasa);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("13")) {
			ibtn19.setImageResource(R.drawable.dys);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("14")) {
			ibtn19.setImageResource(R.drawable.ddp);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("15")) {
			ibtn19.setImageResource(R.drawable.anime);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("16")) {
			ibtn19.setImageResource(R.drawable.seokid);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("17")) {
			ibtn19.setImageResource(R.drawable.pororo);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("18")) {
			ibtn19.setImageResource(R.drawable.exaq);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("19")) {
			ibtn19.setImageResource(R.drawable.jjg);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("20")) {
			ibtn19.setImageResource(R.drawable.emg);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("21")) {
			ibtn19.setImageResource(R.drawable.gss);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("22")) {
			ibtn19.setImageResource(R.drawable.dmu);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("23")) {
			ibtn19.setImageResource(R.drawable.sgh);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp19.equals("24")) {
			ibtn19.setImageResource(R.drawable.grg);
			ibtn19.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp20.equals("1")) {
			ibtn20.setImageResource(R.drawable.chsa);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("2")) {
			ibtn20.setImageResource(R.drawable.chgon);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("3")) {
			ibtn20.setImageResource(R.drawable.teji);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("4")) {
			ibtn20.setImageResource(R.drawable.fishc);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("5")) {
			ibtn20.setImageResource(R.drawable.mbg);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("6")) {
			ibtn20.setImageResource(R.drawable.gjg);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("7")) {
			ibtn20.setImageResource(R.drawable.ssnr);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("8")) {
			ibtn20.setImageResource(R.drawable.msgy);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("9")) {
			ibtn20.setImageResource(R.drawable.aquar);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("10")) {
			ibtn20.setImageResource(R.drawable.pororo);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("11")) {
			ibtn20.setImageResource(R.drawable.kisa);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("12")) {
			ibtn20.setImageResource(R.drawable.jasa);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("13")) {
			ibtn20.setImageResource(R.drawable.dys);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("14")) {
			ibtn20.setImageResource(R.drawable.ddp);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("15")) {
			ibtn20.setImageResource(R.drawable.anime);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("16")) {
			ibtn20.setImageResource(R.drawable.seokid);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("17")) {
			ibtn20.setImageResource(R.drawable.pororo);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("18")) {
			ibtn20.setImageResource(R.drawable.exaq);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("19")) {
			ibtn20.setImageResource(R.drawable.jjg);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("20")) {
			ibtn20.setImageResource(R.drawable.emg);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("21")) {
			ibtn20.setImageResource(R.drawable.gss);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("22")) {
			ibtn20.setImageResource(R.drawable.dmu);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("23")) {
			ibtn20.setImageResource(R.drawable.sgh);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp20.equals("24")) {
			ibtn20.setImageResource(R.drawable.grg);
			ibtn20.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp21.equals("1")) {
			ibtn21.setImageResource(R.drawable.chsa);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("2")) {
			ibtn21.setImageResource(R.drawable.chgon);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("3")) {
			ibtn21.setImageResource(R.drawable.teji);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("4")) {
			ibtn21.setImageResource(R.drawable.fishc);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("5")) {
			ibtn21.setImageResource(R.drawable.mbg);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("6")) {
			ibtn21.setImageResource(R.drawable.gjg);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("7")) {
			ibtn21.setImageResource(R.drawable.ssnr);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("8")) {
			ibtn21.setImageResource(R.drawable.msgy);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("9")) {
			ibtn21.setImageResource(R.drawable.aquar);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("10")) {
			ibtn21.setImageResource(R.drawable.pororo);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("11")) {
			ibtn21.setImageResource(R.drawable.kisa);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("12")) {
			ibtn21.setImageResource(R.drawable.jasa);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("13")) {
			ibtn21.setImageResource(R.drawable.dys);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("14")) {
			ibtn21.setImageResource(R.drawable.ddp);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("15")) {
			ibtn21.setImageResource(R.drawable.anime);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("16")) {
			ibtn21.setImageResource(R.drawable.seokid);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("17")) {
			ibtn21.setImageResource(R.drawable.pororo);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("18")) {
			ibtn21.setImageResource(R.drawable.exaq);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("19")) {
			ibtn21.setImageResource(R.drawable.jjg);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("20")) {
			ibtn21.setImageResource(R.drawable.emg);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("21")) {
			ibtn21.setImageResource(R.drawable.gss);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("22")) {
			ibtn21.setImageResource(R.drawable.dmu);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("23")) {
			ibtn21.setImageResource(R.drawable.sgh);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp21.equals("24")) {
			ibtn21.setImageResource(R.drawable.grg);
			ibtn21.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp22.equals("1")) {
			ibtn22.setImageResource(R.drawable.chsa);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("2")) {
			ibtn22.setImageResource(R.drawable.chgon);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("3")) {
			ibtn22.setImageResource(R.drawable.teji);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("4")) {
			ibtn22.setImageResource(R.drawable.fishc);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("5")) {
			ibtn22.setImageResource(R.drawable.mbg);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("6")) {
			ibtn22.setImageResource(R.drawable.gjg);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("7")) {
			ibtn22.setImageResource(R.drawable.ssnr);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("8")) {
			ibtn22.setImageResource(R.drawable.msgy);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("9")) {
			ibtn22.setImageResource(R.drawable.aquar);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("10")) {
			ibtn22.setImageResource(R.drawable.pororo);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("11")) {
			ibtn22.setImageResource(R.drawable.kisa);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("12")) {
			ibtn22.setImageResource(R.drawable.jasa);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("13")) {
			ibtn22.setImageResource(R.drawable.dys);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("14")) {
			ibtn22.setImageResource(R.drawable.ddp);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("15")) {
			ibtn22.setImageResource(R.drawable.anime);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("16")) {
			ibtn22.setImageResource(R.drawable.seokid);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("17")) {
			ibtn22.setImageResource(R.drawable.pororo);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("18")) {
			ibtn22.setImageResource(R.drawable.exaq);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("19")) {
			ibtn22.setImageResource(R.drawable.jjg);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("20")) {
			ibtn22.setImageResource(R.drawable.emg);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("21")) {
			ibtn22.setImageResource(R.drawable.gss);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("22")) {
			ibtn22.setImageResource(R.drawable.dmu);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("23")) {
			ibtn22.setImageResource(R.drawable.sgh);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp22.equals("24")) {
			ibtn22.setImageResource(R.drawable.grg);
			ibtn22.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp23.equals("1")) {
			ibtn23.setImageResource(R.drawable.chsa);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("2")) {
			ibtn23.setImageResource(R.drawable.chgon);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("3")) {
			ibtn23.setImageResource(R.drawable.teji);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("4")) {
			ibtn23.setImageResource(R.drawable.fishc);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("5")) {
			ibtn23.setImageResource(R.drawable.mbg);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("6")) {
			ibtn23.setImageResource(R.drawable.gjg);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("7")) {
			ibtn23.setImageResource(R.drawable.ssnr);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("8")) {
			ibtn23.setImageResource(R.drawable.msgy);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("9")) {
			ibtn23.setImageResource(R.drawable.aquar);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("10")) {
			ibtn23.setImageResource(R.drawable.pororo);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("11")) {
			ibtn23.setImageResource(R.drawable.kisa);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("12")) {
			ibtn23.setImageResource(R.drawable.jasa);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("13")) {
			ibtn23.setImageResource(R.drawable.dys);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("14")) {
			ibtn23.setImageResource(R.drawable.ddp);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("15")) {
			ibtn23.setImageResource(R.drawable.anime);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("16")) {
			ibtn23.setImageResource(R.drawable.seokid);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("17")) {
			ibtn23.setImageResource(R.drawable.pororo);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("18")) {
			ibtn23.setImageResource(R.drawable.exaq);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("19")) {
			ibtn23.setImageResource(R.drawable.jjg);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("20")) {
			ibtn23.setImageResource(R.drawable.emg);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("21")) {
			ibtn23.setImageResource(R.drawable.gss);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("22")) {
			ibtn23.setImageResource(R.drawable.dmu);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("23")) {
			ibtn23.setImageResource(R.drawable.sgh);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp23.equals("24")) {
			ibtn23.setImageResource(R.drawable.grg);
			ibtn23.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}

		if (temp24.equals("1")) {
			ibtn24.setImageResource(R.drawable.chsa);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("2")) {
			ibtn24.setImageResource(R.drawable.chgon);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("3")) {
			ibtn24.setImageResource(R.drawable.teji);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("4")) {
			ibtn24.setImageResource(R.drawable.fishc);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("5")) {
			ibtn24.setImageResource(R.drawable.mbg);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("6")) {
			ibtn24.setImageResource(R.drawable.gjg);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("7")) {
			ibtn24.setImageResource(R.drawable.ssnr);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("8")) {
			ibtn24.setImageResource(R.drawable.msgy);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("9")) {
			ibtn24.setImageResource(R.drawable.aquar);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("10")) {
			ibtn24.setImageResource(R.drawable.pororo);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("11")) {
			ibtn24.setImageResource(R.drawable.kisa);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("12")) {
			ibtn24.setImageResource(R.drawable.jasa);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("13")) {
			ibtn24.setImageResource(R.drawable.dys);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("14")) {
			ibtn24.setImageResource(R.drawable.ddp);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("15")) {
			ibtn24.setImageResource(R.drawable.anime);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("16")) {
			ibtn24.setImageResource(R.drawable.seokid);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("17")) {
			ibtn24.setImageResource(R.drawable.pororo);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("18")) {
			ibtn24.setImageResource(R.drawable.exaq);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("19")) {
			ibtn24.setImageResource(R.drawable.jjg);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("20")) {
			ibtn24.setImageResource(R.drawable.emg);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("21")) {
			ibtn24.setImageResource(R.drawable.gss);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("22")) {
			ibtn24.setImageResource(R.drawable.dmu);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("23")) {
			ibtn24.setImageResource(R.drawable.sgh);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp24.equals("24")) {
			ibtn24.setImageResource(R.drawable.grg);
			ibtn24.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(random.this, actionbar24.class);
					startActivity(intent2);

				}
			});
		}
	}

}