package com.cym5240.kis;

import java.lang.reflect.Field;

import com.actionbarsherlock.app.SherlockFragment;
import com.cym5240.kis.R;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabWidget;
import android.widget.TextView;

public class Fragment1 extends SherlockFragment {
	// Declare Variable
	private FragmentTabHost mTabHost;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Create FragmentTabHost
		mTabHost = new FragmentTabHost(getSherlockActivity());
		mTabHost.setup(getSherlockActivity(), getChildFragmentManager(), R.layout.fragment1);
		
		
		// Create Tab 1
		mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("I.SEOUL.U"), FragmentTab1.class, null);
		// Create Tab 2
		mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator("위치기반"), FragmentTab2.class, null);	
		// Create Tab 3
		mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator("키즈in공원"), FragmentTab3.class, null);
		// Create Tab 4
		mTabHost.addTab(mTabHost.newTabSpec("tab4").setIndicator("커뮤니티"), FragmentTab4.class, null);
		
		mTabHost.getTabWidget().getChildAt(0).setBackgroundResource(R.drawable.tab_indicator_ab_favorite);
		mTabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.tab_indicator_ab_favorite);
		mTabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.tab_indicator_ab_favorite);
		mTabHost.getTabWidget().getChildAt(3).setBackgroundResource(R.drawable.tab_indicator_ab_favorite);
		
		
	
		mTabHost.setOnTabChangedListener(new OnTabChangeListener() {

		    @Override
		    public void onTabChanged(String tabId) {

		        for (int i = 0; i < mTabHost.getTabWidget().getChildCount(); i++) {
		        	
		            TextView tv = (TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title); //Unselected Tabs
		            tv.setTextColor(Color.parseColor("#696969"));
		        }

		        
		        TextView tv = (TextView) mTabHost.getCurrentTabView().findViewById(android.R.id.title); //for Selected Tab
		        tv.setTextColor(Color.parseColor("#000000"));

		    }
		});

		
		final TabWidget tw = (TabWidget)mTabHost.findViewById(android.R.id.tabs);
	    for (int i = 0; i < tw.getChildCount(); ++i)
	    {
	        final View tabView = tw.getChildTabViewAt(i);
	        final TextView tv = (TextView)tabView.findViewById(android.R.id.title);
	        
	        tv.setTextColor(Color.parseColor("#696969"));

	    }
	 
	    final View tabView = tw.getChildTabViewAt(0);
        final TextView tv = (TextView)tabView.findViewById(android.R.id.title);
       
        tv.setTextColor(Color.parseColor("#000000"));




		
		/*for(int i=0;i<mTabHost.getTabWidget().getChildCount();i++) 
	    {
	        TextView tv = (TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
	        tv.setTextColor(Color.parseColor("#FFFFFF"));
	    } */
		
		
		return mTabHost;
	}
	
	// Detach FragmentTabHost
	@Override
	public void onDetach() {
		super.onDetach();

		try {
			Field childFragmentManager = Fragment.class
					.getDeclaredField("mChildFragmentManager");
			childFragmentManager.setAccessible(true);
			childFragmentManager.set(this, null);

		} catch (NoSuchFieldException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	// Remove FragmentTabHost 
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		mTabHost = null;
	}

}
