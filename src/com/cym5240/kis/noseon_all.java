package com.cym5240.kis;

import java.util.ArrayList;
import java.util.Locale;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import com.cym5240.kis.R;

public class noseon_all extends Fragment {

	private static final String ARG_POSITION = "position";
	private int position;
	ListView list;
	ListViewAdapter adapter;
	EditText editsearch;
	String[] rank;
	String[] country;
	String[] population;
	ArrayList<WorldPopulation> arraylist = new ArrayList<WorldPopulation>();
	static View rootView;

	public static noseon_all newInstance(int position) {
		noseon_all f = new noseon_all();
		Bundle b = new Bundle();
		b.putInt(ARG_POSITION, position);
		f.setArguments(b);
		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		position = getArguments().getInt(ARG_POSITION);

		rootView = inflater.inflate(R.layout.listview_main, container, false);

		// Generate sample data
		rank = new String[] { "100��", "������", "��������(������)", "��������(�Ǽ�����)",
				"��������(������)", "��������(����ǳ���)", "�߾��Ÿ�", "�߾��Ÿ�(�λ�����)", "�����ʱ�",
				"��ȣ������", "���굿", "��ī��Ʈ��APT", "���Ǽ�", "����ֹμ���", "����ְ�APT",
				"�ѽ�APT", "���ϰ�", "��ϻ�Ÿ�", "����4��", "��ٸ�4��", "���׵��ֹμ���" };

		country = new String[] { ">>101,110~140 �뼱", ">>�������� ����", ">>����,����",
				"Indonesia", "Brazil", "Pakistan", "Nigeria", "Bangladesh",
				"Russia", "Japan", "", "", "", "", "", "", "", "", "", "", "" };

		// Locate the ListView in listview_main.xml
		list = (ListView) rootView.findViewById(R.id.listview);

		for (int i = 0; i < rank.length; i++) {
			WorldPopulation wp = new WorldPopulation(rank[i], country[i],
					population[i]);
			// Binds all strings into an array
			arraylist.add(wp);

		}

		// Pass results to ListViewAdapter Class
		adapter = new ListViewAdapter(getActivity(), arraylist);

		// Binds the Adapter to the ListView
		list.setAdapter(adapter);

		// Locate the EditText in listview_main.xml
		editsearch = (EditText) rootView.findViewById(R.id.search);
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

		return rootView;
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		if (rootView != null) {
			ViewGroup parent = (ViewGroup) rootView.getParent();
			arraylist.clear();
			if (parent != null) {
				parent.removeView(rootView);
				arraylist.clear();
			}
		}
	}
}