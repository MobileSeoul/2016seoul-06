package com.cym5240.webmat;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.cym5240.kis.R;
import com.cym5240.kis.SampleList;
import com.cym5240.kis.R.id;
import com.cym5240.kis.R.layout;
import com.cym5240.kis.R.style;

public class websan24 extends SherlockActivity {  
  
    private WebView mWebView;  
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Used to put dark icons on light action bar
    	
    	getActionBar().setTitle("뒤로가기");
    	getActionBar().setDisplayShowHomeEnabled(false);
    	getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    	
    	
        boolean isLight = SampleList.THEME == R.style.Theme_Favorite;
 
        return true;
    }
  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_mini_web);  
  
        mWebView = (WebView)findViewById(R.id.webView);  
        mWebView.getSettings().setJavaScriptEnabled(true);  
        mWebView.loadUrl("https://m.search.naver.com/search.naver?where=m&query=%EB%B6%80%EC%95%94%EB%8F%99+%EC%9E%90%ED%95%98%EC%86%90%EB%A7%8C%EB%91%90&sm=mtb_stc");  
        mWebView.setWebViewClient(new WebViewClientClass());  
       

    }  
  
    private class WebViewClientClass extends WebViewClient {  
        @Override  
        public boolean shouldOverrideUrlLoading(WebView view, String url) {  
            view.loadUrl(url);  
            return true;
        }  
    }  
}  