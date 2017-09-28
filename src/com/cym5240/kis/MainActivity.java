package com.cym5240.kis;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.kakao.kakaolink.KakaoLink;
import com.kakao.kakaolink.KakaoTalkLinkMessageBuilder;
import com.kakao.util.KakaoParameterException;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class MainActivity extends SherlockFragmentActivity {

	// Declare Variable
	DrawerLayout mDrawerLayout;
	ListView mDrawerList;
	ActionBarDrawerToggle mDrawerToggle;
	MenuListAdapter mMenuAdapter;
	String[] title;
	String[] subtitle;
	int[] icon;
	Fragment fragment1 = new Fragment1();
	Fragment fragment2 = new Fragment2();
	public static final String TAG = "MYTAG";

	private KakaoLink kakaoLink;
	private KakaoTalkLinkMessageBuilder kakaoTalkLinkMessageBuilder;
	private final String imgSrcLink = "http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjNfMTI1/MDAxNDc3MjMyMTEwNzM4.9YyC4n3pEEApSvDMgdADYlwZ0Db0BzERAB5WqQiEWUYg.unRipO2al2Mewf5T_xnhobxSL7wLiDyhEiwIHLZhoK8g.PNG.yil8853/%EC%84%9C%EC%9A%B83.png?type=w740";

	private BackPressCloseHandler backPressCloseHandler;

	public boolean onCreateOptionsMenu(Menu menu) {
		// Used to put dark icons on light action bar

		getActionBar().setTitle("ī�װ�");
		getActionBar().setDisplayShowHomeEnabled(false);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		boolean isLight = SampleList.THEME == R.style.Theme_Favorite;

		super.onCreateOptionsMenu(menu);
		getSupportMenuInflater().inflate(R.menu.menu3, menu);

		/*
		 * menu.add("Refresh") .setIcon(isLight ? R.drawable.social_share :
		 * R.drawable.social_share)
		 * .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		 */

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
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(this).build();
        ImageLoader.getInstance().init(configuration);
		setContentView(R.layout.drawer_main);

		/*
		 * FadingActionBarHelper helper = new FadingActionBarHelper()
		 * .actionBarBackground(R.drawable.ab_background)
		 * .headerLayout(R.layout.profile) .contentLayout(R.layout.drawer_main);
		 * setContentView(helper.createView(this)); helper.initActionBar(this);
		 */

		backPressCloseHandler = new BackPressCloseHandler(this);

		// Generate title
		title = new String[] { "��������", "������ƮȮ��", "��������", "����",
				"������ ��","������ ��","�� �վȿ� ���� ", "����� ��������", "��������", "���¼ҽ�" };

		// Generate subtitle
		subtitle = new String[] { "", "", "",
				"http://kidins.tistory.com/guestbook", "���� ���������� ���� DB ���� ��ȭ&��� 28��", "��ΰ� 100���� ������ ���� ���� 36��","���� ���� �̵�� ����(����)", "���̹� ������Ȳ ���м��� ���",
				"���� : Beta_1.0.0" + "\n" + "���� ������Ʈ�� : 2016.10.27",
				"���� : Beta_1.0.0" + "\n" + "http://kidins.tistory.com/2" };

		// Generate icon
		icon = new int[] { R.drawable.gong2, R.drawable.up, R.drawable.nal2,
				R.drawable.moon, R.drawable.calendar_dark, R.drawable.ic_place_grey, R.drawable.ic_map_grey,
				R.drawable.ic_map_grey, R.drawable.version, R.drawable.open };

		// Locate DrawerLayout in drawer_main.xml
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

		// Locate ListView in drawer_main.xml
		mDrawerList = (ListView) findViewById(R.id.left_drawer);

		// Set a custom shadow that overlays the main content when the drawer
		// opens
		/*
		 * mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
		 * GravityCompat.START);
		 */

		// Pass results to MenuListAdapter Class
		mMenuAdapter = new MenuListAdapter(this, title, subtitle, icon);

		// Set the MenuListAdapter to the ListView
		mDrawerList.setAdapter(mMenuAdapter);

		// Capture button clicks on side menu
		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

		// Enable ActionBar app icon to behave as action to toggle nav drawer
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		// ActionBarDrawerToggle ties together the the proper interactions
		// between the sliding drawer and the action bar app icon
		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
				R.drawable.ic_drawer, R.string.drawer_open,
				R.string.drawer_close) {

			public void onDrawerClosed(View view) {
				// TODO Auto-generated method stub
				super.onDrawerClosed(view);
			}

			public void onDrawerOpened(View drawerView) {
				// TODO Auto-generated method stub
				super.onDrawerOpened(drawerView);
			}
		};

		mDrawerLayout.setDrawerListener(mDrawerToggle);

		if (savedInstanceState == null) {
			selectItem(0);
		}
	}

	/*
	 * @Override public boolean onCreateOptionsMenu(Menu menu) {
	 * getSupportMenuInflater().inflate(R.menu.activity_main, menu); return
	 * true; }
	 */
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		if (item.getItemId() == android.R.id.home) {

			if (mDrawerLayout.isDrawerOpen(mDrawerList)) {
				mDrawerLayout.closeDrawer(mDrawerList);
			} else {
				mDrawerLayout.openDrawer(mDrawerList);
			}
		}

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

		if (item.getItemId() == R.id.shuffle) {

			Intent intent7 = new Intent(MainActivity.this, random.class);
			startActivity(intent7);

		}
		
		if (item.getItemId() == R.id.shuffle2) {

			Intent intent7 = new Intent(MainActivity.this, MiniWebActivity7.class);
			startActivity(intent7);

		}

		return super.onOptionsItemSelected(item);

	}

	// The click listener for ListView in the navigation drawer
	private class DrawerItemClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			selectItem(position);
			switch (position) {
			case 0:
				Intent intent2 = new Intent(MainActivity.this,
						MiniWebActivity.class);
				startActivity(intent2);
				break;

			case 1:
				Intent intent3 = new Intent(MainActivity.this,
						MiniWebActivity5.class);
				startActivity(intent3);
				break;

			case 2:

				Intent intent4 = new Intent(MainActivity.this,
						MiniWebActivity2.class);
				startActivity(intent4);
				break;

			case 3:

				Intent intent5 = new Intent(MainActivity.this,
						MiniWebActivity3.class);
				startActivity(intent5);
				break;

			
			case 4:

				Intent intent7 = new Intent(MainActivity.this, mountload.class);
				startActivity(intent7);
				break;
				
			case 5:

				Intent intent8 = new Intent(MainActivity.this, matload.class);
				startActivity(intent8);
				break;
				
			case 6:

				Intent intent9 = new Intent(MainActivity.this,
						MiniWebActivity6.class);
				startActivity(intent9);
				break;
				
			case 7:

				Intent intent10 = new Intent(MainActivity.this,
						MiniWebActivity4.class);
				startActivity(intent10);
				break;

			case 8:

				Intent intent11 = new Intent(MainActivity.this,
						MiniWebActivity5.class);
				startActivity(intent11);
				break;
				
			case 9:

				Intent intent6 = new Intent(MainActivity.this, opensource.class);
				startActivity(intent6);
				break;


			}
		}
	}

	private void selectItem(int position) {

		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		// Locate Position
		switch (position) {
		case 0:
			ft.replace(R.id.content_frame, fragment1);
			break;
		/*
		 * case 1: ft.replace(R.id.content_frame, fragment2); break;
		 */
		}
		ft.commit();
		mDrawerList.setItemChecked(position, true);
		// Close drawer
		mDrawerLayout.closeDrawer(mDrawerList);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Pass any configuration change to the drawer toggles
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	@Override
	public void onBackPressed() {
		// super.onBackPressed();
		backPressCloseHandler.onBackPressed();
	}

}
