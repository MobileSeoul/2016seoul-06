package com.cym5240.kis;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.TextExtractor;

import android.os.Bundle;
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

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.cym5240.url.websan21;
import android.widget.ImageView;

public class actionbar21 extends SherlockActivity {

	/* �Ľ� */
	TextView textView; // ������ ǥ������ �ؽ�Ʈ��

	private static Thread thread = null;
	ImageView link2;
	String parsing_url; // �Ľ��ؿ����� �ϴ� URL

	String get_data; // �Ľ��ؼ� ������ �����͸� ������ ��Ʈ�� ����

	String parsing;

	ArrayList<String> array; // get_data ������ ���� ���������� ������ �迭
	/* �Ľ� */

	GoogleMap googleMap;
	GoogleMap food1;

	/**
	 * 
	 * ��ġ �� new LatLng(����,����);
	 * 
	 * Ư�� ������ ������ ���氪�� �˰� �ʹٸ�, http://maps.google.com/���� ��ġ�� �˻��ѵ�,���ϴ� ��ġ�� ��Ŀ��
	 * Ŭ���Ѵ�
	 * 
	 * �׸��� ���콺 �������� ������ ������ "�̰��� �ñ��Ѱ���?" �� ������ ������ �浵�� ���´�.
	 * 
	 * 
	 * 
	 * �ƴϸ� ��Ŀ�� Ŭ���ѵ� ��ũ�� �����ϸ� �� ��ũ�� ������ ������ ���� ���´�
	 * 
	 * 
	 */

	LatLng location = new LatLng(37.588059, 126.815235);

	/**
	 * 
	 * CameraPosition�� �̿��Ͽ� ���̴� �ʿ��� ���� ȭ���� ������ �Ѵ�.
	 * 
	 * zoom�� 20�� ���� ������ ���°�, 1�� �����������̴�.
	 */

	CameraPosition cp = new CameraPosition.Builder().target(location).zoom(13)
			.build();

	// �޴��ɼ�

	final int MAPMENU_GEO = 1;

	final int MAPMENU_NORMAL = 2;

	final int MAPMENU_HYBRID = 3;

	final int MAPMENU_TERRAIN = 4;

	private KakaoLink kakaoLink;
	private KakaoTalkLinkMessageBuilder kakaoTalkLinkMessageBuilder;
	private final String imgSrcLink = "http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjNfMTI1/MDAxNDc3MjMyMTEwNzM4.9YyC4n3pEEApSvDMgdADYlwZ0Db0BzERAB5WqQiEWUYg.unRipO2al2Mewf5T_xnhobxSL7wLiDyhEiwIHLZhoK8g.PNG.yil8853/%EC%84%9C%EC%9A%B83.png?type=w740";

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Used to put dark icons on light action bar

		getActionBar().setTitle("     ");
		getActionBar().setDisplayShowHomeEnabled(false);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		boolean isLight = SampleList.THEME == R.style.Theme_Favorite;

		super.onCreateOptionsMenu(menu);
		getSupportMenuInflater().inflate(R.menu.menu2, menu);

		return true;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// setTheme(SampleList.THEME); //Used for theme switching in samples
		super.onCreate(savedInstanceState);

		FadingActionBarHelper helper = new FadingActionBarHelper()
				.actionBarBackground(R.drawable.ab_background)
				.headerLayout(R.layout.header2_20)
				.contentLayout(R.layout.actionbar21);
		setContentView(helper.createView(this));
		helper.initActionBar(this);
		link2 = (ImageView) findViewById(R.id.link2);
	    link2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(actionbar21.this, websan21.class);
				startActivity(intent2);
			

			}
		});
		/**
		 * 
		 * xml�� ���ǵ� GoogleMap Fragment�� ���� GoogleMap�� �����´�.
		 */
		googleMap = ((MapFragment) getFragmentManager().findFragmentById(
				R.id.map)).getMap();

		// �̸� ������ CameraPosition �� GoogleMap�� �����Ѵ�.
		googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cp));
		googleMap.getUiSettings().setZoomControlsEnabled(true);
		/**
		 * 
		 * ���� ã�� ��ġ�� ��Ŀ�� ��´�.
		 * 
		 * �׸��� �ش� ��Ŀ�� �������� ��� Ÿ��Ʋ�� �����Ѵ�.
		 */
		googleMap.addMarker(
				new MarkerOptions().position(location).title("���� �������°���")
						.snippet("����Ư���� ������ ��ȭ��")).showInfoWindow();
		/*
		 * googleMap.addMarker(new
		 * MarkerOptions().icon(BitmapDescriptorFactory.fromResource
		 * (R.drawable.snack_bar3)).position(new LatLng(34.719326,
		 * 126.813657)).title("ȫ����-�ѽĴ�").snippet("����� ������ ������ ������ 184"));
		 * googleMap.addMarker(new
		 * MarkerOptions().icon(BitmapDescriptorFactory.fromResource
		 * (R.drawable.snack_bar3)).position(new LatLng(34.715961,
		 * 126.814780)).title("����Ĵ�-�Ĵ�").snippet("����� ������ ������ ������ 140-7"));
		 */

		/* �Ľ� */

		textView = (TextView) findViewById(R.id.textView2);

		parsing_url = "http://www.androidside.com/bbs/board.php?bo_table=B49&wr_id=163022&page=9";

		Runnable task = new Runnable() {

			public void run() {

				getData(parsing_url);

			}

		};

		thread = new Thread(task);

		thread.start(); // �ݵ�� �����带 ������� �� ������ �Ʒ����� ����

		try {

			thread.join(); // ������ �۾� ���������� �ٸ� �۾����� ���

		} catch (Exception e) {

		}

		if (parsing == null) {
			textView.append("���� ���� ����" + "\n"); // ������ �۾� ������ �ؽ�Ʈ�信 ������ �����͸� �Է�
		} else {
			textView.append(parsing + "ȸ" + "\n"); // ������ �۾� ������ �ؽ�Ʈ�信 ������ �����͸�
													// �Է�
		}

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

	// �Ľ� �۾��� �ϴ� �޼���

	public ArrayList<String> getData(String strURL) {

		Source source;

		get_data = "";

		array = new ArrayList();

		try {

			URL url = new URL(strURL);

			source = new Source(url); // �����带 ��� ���ϸ� ���⿡�� ���� �߻��� �� ������ �Ʒ����� ����

			Element element = null;

			List<Element> list = source.getAllElements(HTMLElementName.SPAN); // title
																				// �±���
																				// ������Ʈ
																				// ������

			for (int i = 0; i < list.size(); i++) {

				element = list.get(i);

				String attributevalue = element.getAttributeValue("CLASS"); // title
																			// �±���
																			// �Ӽ�����
																			// type��
																			// ã�´�

				if (attributevalue != null) {

					if (attributevalue.equalsIgnoreCase("mw_basic_view_hit")) { // type��
																				// ����
																				// text
																				// �̸�

						TextExtractor textExtractor = element
								.getTextExtractor(); // �ش� ���ڰ��� �����´�

						get_data = textExtractor.toString(); // ������ ���� ��Ʈ������ ��ȯ��

						array.add(get_data); // ArrayList�� �߰��Ѵ�
						parsing = get_data;
					}

				}

			}

		} catch (Exception e) {

		}

		return array; // �Էµ� �迭���� ����

	}

}
