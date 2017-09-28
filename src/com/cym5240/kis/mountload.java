package com.cym5240.kis;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.TextExtractor;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockActivity;

import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.cym5240.kis.R;
import com.cym5240.kis.fadingactionbar.extras.actionbarsherlock.FadingActionBarHelper;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.kakao.kakaolink.KakaoLink;
import com.kakao.kakaolink.KakaoTalkLinkMessageBuilder;
import com.kakao.util.KakaoParameterException;

public class mountload extends SherlockActivity {

	private KakaoLink kakaoLink;
	private KakaoTalkLinkMessageBuilder kakaoTalkLinkMessageBuilder;
	private final String imgSrcLink = "http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjNfMTI1/MDAxNDc3MjMyMTEwNzM4.9YyC4n3pEEApSvDMgdADYlwZ0Db0BzERAB5WqQiEWUYg.unRipO2al2Mewf5T_xnhobxSL7wLiDyhEiwIHLZhoK8g.PNG.yil8853/%EC%84%9C%EC%9A%B83.png?type=w740";

	ListView list;
	ListViewAdapter2 adapter;
	EditText editsearch;
	String[] rank;
	String[] country;
	String[] population;
	ArrayList<WorldPopulation2> arraylist = new ArrayList<WorldPopulation2>();

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Used to put dark icons on light action bar

		getActionBar().setTitle("������ ��");
		getActionBar().setDisplayShowHomeEnabled(false);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		boolean isLight = SampleList.THEME == R.style.Theme_Favorite;

		super.onCreateOptionsMenu(menu);
		getSupportMenuInflater().inflate(R.menu.menu2, menu);

		try {
			kakaoLink = KakaoLink.getKakaoLink(getApplicationContext());
			kakaoTalkLinkMessageBuilder = kakaoLink
					.createKakaoTalkLinkMessageBuilder();
		} catch (KakaoParameterException e) {
			e.getMessage();
		}

		return true;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// setTheme(SampleList.THEME); //Used for theme switching in samples
		super.onCreate(savedInstanceState);

		setContentView(R.layout.listview_main_2);

		arraylist.clear();

		// Generate sample data
		rank = new String[] {"�����佺Ƽ��","��ɽ���","����������","�Ͼǽ�ī�̿���","����ȣ��","�ø��Ȱ��� ��Ȧ�γ���","����Ҳ�����","�渮�ܱ�","�������İŸ�","���ܱ�","�̽������","�溹��","â���","â���� �޺�����","�Ѿ絵��","û��õ","����������","��ȭ������","������ʷ�����","�������","�븲�̼���","�ڳ���̼���","N����Ÿ�� �������","������","���빮�������ö���","���빮����","��ȭ�� �帣�� ���ﱤ��","���̼����佺Ƽ��"};

		country = new String[] {"������","���빮��","������","���ϱ�","���ı�","���ı�","��������","��걸","��걸","��걸","��걸","���α�","���α�","���α�","���α�","���α�","���α�","���α�","���α�","���α�","���α�","���α�","�߱�","�߱�","�߱�","�߱�","�߱�","�߱�"};

		population = new String[] {"����Ư���� ������ ������� 513","����Ư���� ���빮�� ����߾ӷ� 10","����Ư���� ������ �ϴð����� 95","����Ư���� ���ϱ� ������","����Ư���� ���ı� ��ǵ�","����Ư���� ���ı� ���̵�","����Ư���� �������� 63�� 50","����Ư���� ��걸 ���¿���","����Ư���� ��걸 ���¿��� 2","����Ư���� ��걸 ���ܷ�10��","����Ư���� ��걸 ���ܷ�10�� 39","����Ư���� ���α� ������ 161 �溹��","����Ư���� ���α� â��÷� 185 â���","����Ư���� ���α� ����� 99 â���� �ϴ�","����Ư���� ���α� ���3��","����Ư���� ���α� â�ŵ�","����Ư���� ���α� ���̷�5�� 48 ����������","����Ư���� ���α� ������� 172","����Ư���� ���α� ������ 14","����Ư���� ���α� ����� 41","����Ư���� ���α� ���Ϲ���4�� 21 �븲�̼���","����Ư���� ���α� ����1�� 34","����Ư���� �߱� ���ϴ�� 231","����Ư���� �߱� ������� 99 ������","����Ư���� �߱� ������ 281","����Ư���� �߱� ���빮����4�� 21","����Ư���� �߱� ������� 110 ����Ư����û","����Ư���� �߱� ������� 110"};

		// Locate the ListView in listview_main.xml
		list = (ListView) findViewById(R.id.listview);

		for (int i = 0; i < rank.length; i++) {
			WorldPopulation2 wp = new WorldPopulation2(rank[i], country[i],
					population[i]);
			// Binds all strings into an array
			arraylist.add(wp);

		}

		// Pass results to ListViewAdapter2 Class
		adapter = new ListViewAdapter2(mountload.this, arraylist);

		// Binds the Adapter to the ListView
		list.setAdapter(adapter);

		// Locate the EditText in listview_main.xml
		editsearch = (EditText) findViewById(R.id.search);
		editsearch.setTextColor(Color.parseColor("#000000"));
		// Capture Text in EditText
		editsearch.addTextChangedListener(new TextWatcher() {

			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				String text = editsearch.getText().toString()
						.toLowerCase(Locale.getDefault());
				adapter.filter(text);
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
			}
		});

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		if (item.getItemId() == R.id.social) {

			/*
			 * Toast.makeText(MainActivity.this, "Got click: " + item,
			 * Toast.LENGTH_SHORT).show();
			 */

			try {

				kakaoLink = KakaoLink.getKakaoLink(getApplicationContext());
				kakaoTalkLinkMessageBuilder = kakaoLink
						.createKakaoTalkLinkMessageBuilder();
				kakaoTalkLinkMessageBuilder.addText(
						"I.SEOUL.U!" + "\n" + "���̿� ����� �Բ�, ���� ��ũ�� ��!" + "\n" +"���ش� ���(īī����ũ)�� ���� ��ħ�� ���ķ�Ī ���� ����Ǵ� ����Դϴ�. �����մϴ�."  );

				int width = 269;
				int height = 81;

				kakaoTalkLinkMessageBuilder.addImage(imgSrcLink, width, height);
				kakaoTalkLinkMessageBuilder.addAppButton("������ �̵�");
				// kakaoTalkLinkMessageBuilder.addWebButton("������ �̵�");
				kakaoLink
						.sendMessage(kakaoTalkLinkMessageBuilder.build(), this);

			} catch (KakaoParameterException e) {
				e.getMessage();

			}

		}

		return super.onOptionsItemSelected(item);

	}

}
