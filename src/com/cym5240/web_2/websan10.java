package com.cym5240.web_2;


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

public class websan10 extends SherlockActivity {  
  
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
        mWebView.loadUrl("http://blog.daum.net/seawolf507/16866966");  
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