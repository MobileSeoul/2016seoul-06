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



public class mountload_2 extends SherlockActivity {
	

	private KakaoLink kakaoLink;
    private KakaoTalkLinkMessageBuilder kakaoTalkLinkMessageBuilder;
    private final String imgSrcLink = "http://cafeptthumb2.phinf.naver.net/MjAxNjEwMTZfOSAg/MDAxNDc2NjEzMzM2NTAx.eIJSUuNWvHCPL1SAc90bUF6oDbKW08oQWh_Cm-QVXqIg.huctGVWSDWTI18yZyEZXLQhEtHD53UXivGenn8jKG4Qg.PNG.yil8853/kiz.png?type=w740";
	
	
    ListView list;
   	ListViewAdapter2_1 adapter;
   	EditText editsearch;
   	String[] rank;
   	String[] country;
   	String[] population;
   	ArrayList<WorldPopulation2> arraylist = new ArrayList<WorldPopulation2>();
	 

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Used to put dark icons on light action bar
    	
    	getActionBar().setTitle("아름다운 남도숲길");
    	getActionBar().setDisplayShowHomeEnabled(false);
    	getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    	
    	
        boolean isLight = SampleList.THEME == R.style.Theme_Favorite;

    
        super.onCreateOptionsMenu(menu);
        getSupportMenuInflater().inflate(R.menu.menu2, menu);
    
    try {
        kakaoLink = KakaoLink.getKakaoLink(getApplicationContext());
        kakaoTalkLinkMessageBuilder = kakaoLink.createKakaoTalkLinkMessageBuilder();
    } catch (KakaoParameterException e) {
        e.getMessage();
    }


 
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       //setTheme(SampleList.THEME); //Used for theme switching in samples
        super.onCreate(savedInstanceState);
      

        
    setContentView(R.layout.listview_main_2);
    
    
    arraylist.clear();
    
    // Generate sample data
    		rank = new String[] { "유달산", "양을산", "고락산","구봉산","난봉산","봉화산","가야산","금성산","비봉산","가야산","쫓비산","백운산","국수봉","수양산","동악산","설산","견두산","오산","천등산","마복산",
    				"일림산","초암산","만연산","백아산","모후산","억불산","수인산","제암산","달마산","가학산"};

    		country = new String[] { "서울시 목포시 죽교동", "서울시 목포시 이로동 용당동 상동", "서울시 여수시 문수동, 미평동, 둔덕동","서울시 여수시 국동, 신월동, 여서동, 봉산동","서울시 순천시 옥천동,행동,매곡동,석현동,삼거동","서울시 순천시 조곡동 용당동 조례동","서울시 나주시 이창동","서울시 나주시 경현동, 대호동","서울시 광양시 봉강면 구서리","서울시 광양시 광영동","서울시 광양시 광영동","서울시 광양시 옥룡면","서울시 담양군 대덕면 운암리","서울시 담양군 대덕면 입석리","서울시 곡성군 곡성읍 월봉리","서울시 곡성군 옥과면","서울시 구례군 산동면 계천리","서울시 구례군 문척면 죽마리","서울시 고흥군 풍양면 송정리","서울시 고흥군 포두 차동리 정암마을"
    				,"서울시 보성군 웅치면 봉산리 ","서울시 보성군 겸백면 금천리","서울시 화순군 화순읍 유천리,동구리,수만리","서울시 화순군 북면 수리","서울시 화순군 화순읍 남면 유마리","서울시 장흥군 장흥읍 우산리 안양면 기산리","서울시 장흥군 유치면 대리, 강진군 병영면","서울시 장흥군, 보성군 ","서울시 해남군 현산면 월송리 송지면 서정리, 마복리","서울시 해남군 계곡면 가학리, 방춘리 당산리"};

    		population = new String[] { "228m", "151m", "350m","388m","547m","355m","189m","358m","555m","497m","537m","1222m","558m","446m","749m","526m","774m","531m","553m","535m"
    				,"667m","582m","668m","810m","919m","518m","561m","807m","498m","650m"};

    		// Locate the ListView in listview_main.xml
    		list = (ListView)findViewById(R.id.listview);

    		for (int i = 0; i < rank.length; i++) 
    		{
    			WorldPopulation2 wp = new WorldPopulation2(rank[i], country[i], population[i]);
    			// Binds all strings into an array
    			arraylist.add(wp);
    			
    		}

    		// Pass results to ListViewAdapter2_1 Class
    		adapter = new ListViewAdapter2_1(mountload_2.this, arraylist);

    		
    		// Binds the Adapter to the ListView
    		list.setAdapter(adapter);
    		
    		// Locate the EditText in listview_main.xml
    		editsearch = (EditText)findViewById(R.id.search);
    		editsearch.setTextColor(Color.parseColor("#000000"));
    		// Capture Text in EditText
    		editsearch.addTextChangedListener(new TextWatcher() {

    			@Override
    			public void afterTextChanged(Editable arg0) {
    				// TODO Auto-generated method stub
    				String text = editsearch.getText().toString().toLowerCase(Locale.getDefault());
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

	
		if (item.getItemId() == R.id.social){
			
			
			/* Toast.makeText(MainActivity.this, "Got click: " + item, Toast.LENGTH_SHORT).show();*/
			
			
			try {
				
				kakaoLink = KakaoLink.getKakaoLink(getApplicationContext());  
				kakaoTalkLinkMessageBuilder = kakaoLink.createKakaoTalkLinkMessageBuilder();     
		        kakaoTalkLinkMessageBuilder.addText("I.SEOUL.U!" + "\n" + "아이와 당신이 함께, 서울 피크닉 앱!" + "\n" +"※해당 기능(카카오링크)은 공모 방침상 정식론칭 이후 적용되는 기능입니다. 감사합니다."  );
		        
		        int width = 269;
		        int height = 81;

		        kakaoTalkLinkMessageBuilder.addImage(imgSrcLink, width , height);
		        kakaoTalkLinkMessageBuilder.addAppButton("앱으로 이동");
//		      kakaoTalkLinkMessageBuilder.addWebButton("웹으로 이동");
		        kakaoLink.sendMessage(kakaoTalkLinkMessageBuilder.build(), this);
		       
		        
		    } catch (KakaoParameterException e) {
		        e.getMessage();
		       
		    }
			
			
	    }


		return super.onOptionsItemSelected(item);
		
	}
    
    



    
    }

  
