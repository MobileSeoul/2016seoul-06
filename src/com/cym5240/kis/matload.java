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

public class matload extends SherlockActivity {

	private KakaoLink kakaoLink;
	private KakaoTalkLinkMessageBuilder kakaoTalkLinkMessageBuilder;
	private final String imgSrcLink = "http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjNfMTI1/MDAxNDc3MjMyMTEwNzM4.9YyC4n3pEEApSvDMgdADYlwZ0Db0BzERAB5WqQiEWUYg.unRipO2al2Mewf5T_xnhobxSL7wLiDyhEiwIHLZhoK8g.PNG.yil8853/%EC%84%9C%EC%9A%B83.png?type=w740";

	ListView list;
	ListViewAdapter3 adapter;
	EditText editsearch;
	String[] rank;
	String[] country;
	String[] population;
	ArrayList<WorldPopulation3> arraylist = new ArrayList<WorldPopulation3>();

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
		rank = new String[] {"����","û�㵷��","������","�����","�����غ��帲","�������","��ī�ٺ���","��������Ÿ��","���д�","ȫ���޲ٹ�","�ʸ�","�����й�","�ٹ��ε��","Ȱȭ�� �������� Į����","���������̳�","û�ֳ���","��ο͹���","��ϴ��ø�","���佺","���̽��÷� ���¿���","��������","��������","��ȭ���������","���ϼո���","��������ȭ������","��û��������","�̹�������","����� �����","û����","��ȸ�ڸ���","�����μ��� ����","������","���� ��������","�ʵ����","�췡��","��Ʋ���̰�"};

		country = new String[] {"���","������ⱸ��","�ϽĴ�","����ī��","��Ż��������","����,���丮","�Ϻ��Ķ��","�±�����","�ø�","�ֲٹ̿丮","�߽Ĵ�","�Թڽ�����ũ","�ε�����","�����丮","��Ż��������","������","����,���丮","����","�߽���,��������","��Ż��������","����","����,����","���պн�","����","����","�ѽ�","����,������","���,�����","���屹","�Ұ�ⱸ��","�κο丮","����,Į����","����,����","�ø�","�ø�","��Ʈ������"};

		population = new String[] {"���� ������ �Ｚ�� 434","���� ������ ������ 758","���� ������ �б�����80�� 37","���� ������ �������27�� 18","���� ������ �������5�� 7","���� ���Ǳ� �Ÿ���67�� 5","���� ������ ������19�� 43","���� ������ ���̻�� 161-8","���� ������ ������ 24","���� ������ ��︶��� 146","���� ������ �Ϳ��� 72","���� ������ �Ϳ��α� 15","���� ���ʱ� ������� 359","���� ���ʱ� �������24�� 95","���� ���ʱ� ���ʴ��73�� 9","���� ��õ�� ����� 138","���� �������� ��������42�� 21-9","���� ��걸 ������9�� 5","���� ��걸 ���¿���15�� 1","���� ��걸 ���¿���49�� 13","���� ��걸 ���¿���55���� 28","���� ��걸 û�ķ�67�� 4-7","���� ���α� ���з� 129-8","���� ���α� �鼮���� 12","���� ���α� ���̷� 42-4","���� ���α� ��û�� 101-1","���� ���α� �������� 38-13","���� ���α� ���Ϲ���5�� 5","���� ���α� ���� 19","���� ���α� ���� 200-4","���� ���α� ����� 469","���� �߱� ��10�� 29 ","���� �߱� ���ҹ��� 134-7","���� �߱� ���ַ� 26","���� �߱� â��÷� 62-29","���� �߱� ���� 77"};

		// Locate the ListView in listview_main.xml
		list = (ListView) findViewById(R.id.listview);

		for (int i = 0; i < rank.length; i++) {
			WorldPopulation3 wp = new WorldPopulation3(rank[i], country[i],
					population[i]);
			// Binds all strings into an array
			arraylist.add(wp);

		}

		// Pass results to ListViewAdapter3 Class
		adapter = new ListViewAdapter3(matload.this, arraylist);

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
