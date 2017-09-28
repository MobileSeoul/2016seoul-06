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

		getActionBar().setTitle("서울의 멋");
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
		rank = new String[] {"강남페스티벌","약령시장","서울억새축제","북악스카이웨이","석촌호수","올림픽공원 나홀로나무","서울불꽃축제","경리단길","세계음식거리","우사단길","이슬람사원","경복궁","창경궁","창덕궁 달빛기행","한양도성","청계천","정독도서관","광화문광장","서울빛초롱축제","낙산공원","대림미술관","박노수미술관","N서울타워 남산공원","덕수궁","동대문디자인플라자","남대문시장","문화가 흐르는 서울광장","하이서울페스티벌"};

		country = new String[] {"강남구","동대문구","마포구","성북구","송파구","송파구","영등포구","용산구","용산구","용산구","용산구","종로구","종로구","종로구","종로구","종로구","종로구","종로구","종로구","종로구","종로구","종로구","중구","중구","중구","중구","중구","중구"};

		population = new String[] {"서울특별시 강남구 영동대로 513","서울특별시 동대문구 약령중앙로 10","서울특별시 마포구 하늘공원로 95","서울특별시 성북구 정릉동","서울특별시 송파구 잠실동","서울특별시 송파구 방이동","서울특별시 영등포구 63로 50","서울특별시 용산구 이태원동","서울특별시 용산구 이태원동 2","서울특별시 용산구 우사단로10길","서울특별시 용산구 우사단로10길 39","서울특별시 종로구 사직로 161 경복궁","서울특별시 종로구 창경궁로 185 창경궁","서울특별시 종로구 율곡로 99 창덕궁 일대","서울특별시 종로구 명륜3가","서울특별시 종로구 창신동","서울특별시 종로구 북촌로5길 48 정독도서관","서울특별시 종로구 세종대로 172","서울특별시 종로구 서린동 14","서울특별시 종로구 낙산길 41","서울특별시 종로구 자하문로4길 21 대림미술관","서울특별시 종로구 옥인1길 34","서울특별시 중구 삼일대로 231","서울특별시 중구 세종대로 99 덕수궁","서울특별시 중구 을지로 281","서울특별시 중구 남대문시장4길 21","서울특별시 중구 세종대로 110 서울특별시청","서울특별시 중구 세종대로 110"};

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
