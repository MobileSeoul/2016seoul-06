package com.cym5240.kis;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cym5240.kis.R;
import com.cym5240.url2.websan;
import com.cym5240.url2.websan2;
import com.cym5240.url2.websan3;
import com.cym5240.url2.websan4;
import com.cym5240.url2.websan5;
import com.cym5240.url2.websan6;
import com.cym5240.url2.websan7;
import com.cym5240.url2.websan8;
import com.cym5240.url2.websan9;
import com.cym5240.url2.websan10;
import com.cym5240.url2.websan11;
import com.cym5240.url2.websan12;
import com.cym5240.url2.websan13;
import com.cym5240.url2.websan14;
import com.cym5240.url2.websan15;
import com.cym5240.url2.websan16;
import com.cym5240.url2.websan17;
import com.cym5240.url2.websan18;
import com.cym5240.url2.websan19;
import com.cym5240.url2.websan20;
import com.cym5240.url2.websan21;

public class ListViewAdapter extends BaseAdapter {

	// Declare Variables
	Context mContext;
	LayoutInflater inflater;
	private List<WorldPopulation> worldpopulationlist = null;
	private ArrayList<WorldPopulation> arraylist;

	public ListViewAdapter(Context context,
			List<WorldPopulation> worldpopulationlist) {
		mContext = context;
		this.worldpopulationlist = worldpopulationlist;
		inflater = LayoutInflater.from(mContext);
		this.arraylist = new ArrayList<WorldPopulation>();
		this.arraylist.addAll(worldpopulationlist);

	}

	public class ViewHolder {
		TextView rank;
		TextView country;
		TextView population;
	}

	@Override
	public int getCount() {
		return worldpopulationlist.size();
	}

	@Override
	public WorldPopulation getItem(int position) {
		return worldpopulationlist.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public View getView(final int position, View view, ViewGroup parent) {
		final ViewHolder holder;
		if (view == null) {
			holder = new ViewHolder();
			view = inflater.inflate(R.layout.listview_item, null);
			// Locate the TextViews in listview_item.xml
			holder.rank = (TextView) view.findViewById(R.id.rank);
			holder.country = (TextView) view.findViewById(R.id.country);
			holder.population = (TextView) view.findViewById(R.id.population);

			holder.rank.setTextColor(Color.parseColor("#0099FF"));
			holder.country.setTextColor(Color.parseColor("#669900"));
			holder.population.setTextColor(Color.parseColor("#6666FF"));
			holder.rank.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16);
			holder.country.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
			holder.population.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);

			view.setTag(holder);
		} else {
			holder = (ViewHolder) view.getTag();
		}
		// Set the results into TextViews
		holder.rank.setText(worldpopulationlist.get(position).getRank());
		holder.country.setText(worldpopulationlist.get(position).getCountry());
		holder.population.setText(worldpopulationlist.get(position)
				.getpopulation());

		// Listen for ListView Item Click
		view.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ���ϱ� ����� 173")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan.class);
					// Pass all data rank
					// intent.putExtra("rank",(worldpopulationlist.get(position).getRank()));
					// Pass all data country
					// intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
					// Pass all data population

					// Pass all data flag
					// Start SingleItemView Class
					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ���۱� ���Ǵ���20�� 33")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan2.class);
					// Pass all data rank
					// intent.putExtra("rank",(worldpopulationlist.get(position).getRank()));
					// Pass all data country
					// intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
					// Pass all data population

					// Pass all data flag
					// Start SingleItemView Class
					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ������ ��ϵ�")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan3.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ������ �ϴð����� 108-1")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan4.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ������ �ϴð����� 95")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan5.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ���ʱ� ������")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan6.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ������ �Ҽ��� 273")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan7.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ���ı� ��ǵ�")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan8.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ���ı� �ø��ȷ� 424")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan9.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ��õ�� �ſ��� ��68-3")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan10.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� �������� ������ 343")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan11.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� �������� ���ǰ����� 68")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan12.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� �������� ���ǵ��� 330")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan13.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ��걸 ��굿6�� 68-87")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan14.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ��걸 ȿâ��")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan15.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ���α� ����� 41")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan16.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ���α� ���з�8�� 1")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan17.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ���α� â�ŵ�")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan18.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� ���α� ���� 99")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan19.class);
					// Pass all data rank

					mContext.startActivity(intent);
				} else if (worldpopulationlist.get(position).getCountry()
						.equals("����Ư���� �߱� �Ŵ絿")) {
					// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan20.class);
					// Pass all data rank
					// /intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
					// Pass all data country
					// /intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
					// Pass all data population

					// Pass all data flag
					// Start SingleItemView Class
					mContext.startActivity(intent);
				} 

			}

		});

		return view;
	}

	// Filter Class
	public void filter(String charText) {
		charText = charText.toLowerCase(Locale.getDefault());
		worldpopulationlist.clear();
		if (charText.length() == 0) {
			worldpopulationlist.addAll(arraylist);
		} else {
			for (WorldPopulation wp : arraylist) {
				if (wp.getRank().toLowerCase(Locale.getDefault())
						.contains(charText)) {
					worldpopulationlist.add(wp);
				} else if (wp.getCountry().toLowerCase(Locale.getDefault())
						.contains(charText)) {
					worldpopulationlist.add(wp);
				} else if (wp.getpopulation().toLowerCase(Locale.getDefault())
						.contains(charText)) {
					worldpopulationlist.add(wp);
				}
			}
			notifyDataSetChanged();
		}

	}
}
