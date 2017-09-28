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

		getActionBar().setTitle("서울의 맛");
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
		rank = new String[] {"오율","청담돈가","마코토","모모코","아이해브어드림","대원갈비","하카다분코","툭툭누들타이","을밀대","홍스쭈꾸미","초마","윤씨밀방","바바인디아","활화산 조개구이 칼국수","미즈컨테이너","청솔나무","어부와백정","쟈니덤플링","바토스","테이스팅룸 이태원점","부자피자","귀족족발","혜화돌쇠아저씨","자하손만두","대장장이화덕피자","삼청동수제비","이문설농탕","토속촌 삼계탕","청진옥","육회자매집","옛날민속집 본점","명동교자","만족 오항족발","필동면옥","우래옥","리틀사이공"};

		country = new String[] {"양식","돼지고기구이","일식당","이자카야","이탈리아음식","육류,고기요리","일본식라면","태국음식","냉면","주꾸미요리","중식당","함박스테이크","인도음식","조개요리","이탈리아음식","한정식","육류,고기요리","만두","멕시코,남미음식","이탈리아음식","피자","족발,보쌈","종합분식","만두","피자","한식","곰탕,설렁탕","백숙,삼계탕","해장국","소고기구이","두부요리","만두,칼국수","족발,보쌈","냉면","냉면","베트남음식"};

		population = new String[] {"서울 강남구 삼성로 434","서울 강남구 선릉로 758","서울 강남구 압구정로80길 37","서울 강남구 테헤란로27길 18","서울 강남구 테헤란로5길 7","서울 관악구 신림로67길 5","서울 마포구 독막로19길 43","서울 마포구 성미산로 161-8","서울 마포구 숭문길 24","서울 마포구 어울마당로 146","서울 마포구 와우산로 72","서울 마포구 와우산로길 15","서울 서초구 강남대로 359","서울 서초구 반포대로24길 95","서울 서초구 서초대로73길 9","서울 양천구 오목로 138","서울 영등포구 영등포로42길 21-9","서울 용산구 보광로9길 5","서울 용산구 이태원로15길 1","서울 용산구 이태원로49길 13","서울 용산구 이태원로55가길 28","서울 용산구 청파로67길 4-7","서울 종로구 대학로 129-8","서울 종로구 백석동길 12","서울 종로구 북촌로 42-4","서울 종로구 삼청로 101-1","서울 종로구 우정국로 38-13","서울 종로구 자하문로5길 5","서울 종로구 종로 19","서울 종로구 종로 200-4","서울 종로구 진흥로 469","서울 중구 명동10길 29 ","서울 중구 서소문로 134-7","서울 중구 서애로 26","서울 중구 창경궁로 62-29","서울 중구 퇴계로 77"};

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
						"I.SEOUL.U!" + "\n" + "아이와 당신이 함께, 서울 피크닉 앱!" + "\n" +"※해당 기능(카카오링크)은 공모 방침상 정식론칭 이후 적용되는 기능입니다. 감사합니다."  );

				int width = 269;
				int height = 81;

				kakaoTalkLinkMessageBuilder.addImage(imgSrcLink, width, height);
				kakaoTalkLinkMessageBuilder.addAppButton("앱으로 이동");
				// kakaoTalkLinkMessageBuilder.addWebButton("웹으로 이동");
				kakaoLink
						.sendMessage(kakaoTalkLinkMessageBuilder.build(), this);

			} catch (KakaoParameterException e) {
				e.getMessage();

			}

		}

		return super.onOptionsItemSelected(item);

	}

}
