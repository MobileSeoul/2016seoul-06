//This is source code of favorite. Copyright?뱬. Tarks. All Rights Reserved.
package com.cym5240.kis;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.cym5240.kis.R;
import com.cym5240.kis.global.Global;
import com.cym5240.kis.page.ProfileActivity;

public class main2 extends SherlockActivity {

	// ListView
	ListView listView;
	// List
	ArrayList<List> m_orders = new ArrayList<List>();
	// Define ListAdapter
	ListAdapter m_adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview);

		// Set Your Page(Community) list
		// 17,18,19,20 are page number
		setList(getString(R.string.community9), "자유로운 주제로 대화를 나눠보세요.", 18937);
		setList(getString(R.string.community2), "아이들의 사진을 'I.SEOUL.U'에 등록해보세요!",
				18936);
		setList(getString(R.string.community3), "서울인의 소모임", 18935);
		setList(getString(R.string.community4), "유머센스를 보여주세요!", 18934);
		setList(getString(R.string.community5), "서울 맛집 공유", 18933);
		setList(getString(R.string.community7), "고민상담 게시판", 18932);
		setList(getString(R.string.community6), "서울인의 벼룩시장.", 18931);
		setListAdapter();
	}

	public void setList(String title, String des, int Tag) {
		List p1 = new List(title, des, Tag);
		m_orders.add(p1);

	}

	public void setListAdapter() {
		listView = (ListView) findViewById(R.id.listView1);

		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub

				ListAdapter ca = (ListAdapter) arg0.getAdapter();
				List ls = (List) ca.getItem(arg2);

				Intent intent = new Intent(main2.this, ProfileActivity.class);
				intent.putExtra("member_srl", String.valueOf(ls.getTag()));
				startActivity(intent);

			}
		});

		// listView.setOnScrollListener(this);
		m_adapter = new ListAdapter(this, R.layout.list2_n, m_orders);

		listView.setAdapter(m_adapter);

	}

	private class ListAdapter extends ArrayAdapter<List> {

		private ArrayList<List> items;

		public ListAdapter(Context context, int textViewResourceId,
				ArrayList<List> items) {
			super(context, textViewResourceId, items);
			this.items = items;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View v = convertView;
			final List p = items.get(position);
			if (v == null) {
				LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				v = vi.inflate(R.layout.list2_n, null);

			}

			if (p != null) {

				// LinearLayout layout = (LinearLayout)
				// v.findViewById(R.id.layoutback);
				TextView tt = (TextView) v.findViewById(R.id.title);
				TextView bt = (TextView) v.findViewById(R.id.description);
				ImageView image = (ImageView) v.findViewById(R.id.img);

				if (tt != null) {
					tt.setText(p.getTitle());
				}
				if (bt != null) {
					bt.setText(Global.getValue(p.getDes()));
				}

			}
			return v;
		}
	}

	class List {

		private String Title;
		private String Description;
		private int Tag;

		public List(String _Title, String _Description, int _Tag) {

			this.Title = _Title;
			this.Description = _Description;
			this.Tag = _Tag;
		}

		public String getTitle() {
			return Title;
		}

		public String getDes() {
			return Description;
		}

		public int getTag() {
			return Tag;
		}

	}

	/**
	 * ?엫?쓽?쓽 諛⑸쾿?쑝濡? ?뜑誘? ?븘?씠?뀥?쓣 異붽??빀?땲?떎.
	 * 
	 * @param size
	 */

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		// this.optionsMenu = menu;
		MenuItem item;

		menu.add(0, 0, 0, getString(R.string.app_info)).setShowAsAction(
				MenuItem.SHOW_AS_ACTION_NEVER);

		return true;
	}

	// 鍮쎈갚?궎 ?긽?떒?븸?뀡諛?
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case 0:
			// Alert
			Intent intent1 = new Intent(main2.this, info.class);
			startActivity(intent1);

			return true;
		default:
			return super.onOptionsItemSelected(item);
		}

	}

}
