package com.cym5240.kis;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.cym5240.kis.R;

public class MiniWebActivity7 extends SherlockActivity {

	private WebView mWebView;

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Used to put dark icons on light action bar

		getActionBar().setTitle("�ڷΰ���");
		getActionBar().setDisplayShowHomeEnabled(false);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		boolean isLight = SampleList.THEME == R.style.Theme_Favorite;

		return true;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mini_web);

		mWebView = (WebView) findViewById(R.id.webView);
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.loadUrl("http://blog.seoul.go.kr/");
		mWebView.setWebViewClient(new WebViewClientClass());

	}

	private class WebViewClientClass extends WebViewClient {
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
		}
	}
	
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
			mWebView.goBack();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}

