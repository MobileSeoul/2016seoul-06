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
    	
    	getActionBar().setTitle("�Ƹ��ٿ� ��������");
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
    		rank = new String[] { "���޻�", "������", "�����","������","������","��ȭ��","���߻�","�ݼ���","�����","���߻�","�Ѻ��","����","������","�����","���ǻ�","����","�ߵλ�","����","õ���","������",
    				"�ϸ���","�ʾϻ�","������","��ƻ�","���Ļ�","��һ�","���λ�","���ϻ�","�޸���","���л�"};

    		country = new String[] { "����� ������ �ױ���", "����� ������ �̷ε� ��絿 ��", "����� ������ ������, ����, �д���","����� ������ ����, �ſ���, ������, ���굿","����� ��õ�� ��õ��,�ൿ,�Ű,������,��ŵ�","����� ��õ�� ��� ��絿 ���ʵ�","����� ���ֽ� ��â��","����� ���ֽ� ������, ��ȣ��","����� ����� ������ ������","����� ����� ������","����� ����� ������","����� ����� �����","����� ��籺 ����� ��ϸ�","����� ��籺 ����� �Լ���","����� ��� ��� ������","����� ��� ������","����� ���ʱ� �굿�� ��õ��","����� ���ʱ� ��ô�� �׸���","����� ���ﱺ ǳ��� ������","����� ���ﱺ ���� ������ ���ϸ���"
    				,"����� ������ ��ġ�� ���긮 ","����� ������ ���� ��õ��","����� ȭ���� ȭ���� ��õ��,������,������","����� ȭ���� �ϸ� ����","����� ȭ���� ȭ���� ���� ������","����� ���ﱺ ������ ��긮 �Ⱦ�� ��긮","����� ���ﱺ ��ġ�� �븮, ������ ������","����� ���ﱺ, ������ ","����� �س��� ����� ���۸� ������ ������, ������","����� �س��� ���� ���и�, ���Ḯ ��긮"};

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
		        kakaoTalkLinkMessageBuilder.addText("I.SEOUL.U!" + "\n" + "���̿� ����� �Բ�, ���� ��ũ�� ��!" + "\n" +"���ش� ���(īī����ũ)�� ���� ��ħ�� ���ķ�Ī ���� ����Ǵ� ����Դϴ�. �����մϴ�."  );
		        
		        int width = 269;
		        int height = 81;

		        kakaoTalkLinkMessageBuilder.addImage(imgSrcLink, width , height);
		        kakaoTalkLinkMessageBuilder.addAppButton("������ �̵�");
//		      kakaoTalkLinkMessageBuilder.addWebButton("������ �̵�");
		        kakaoLink.sendMessage(kakaoTalkLinkMessageBuilder.build(), this);
		       
		        
		    } catch (KakaoParameterException e) {
		        e.getMessage();
		       
		    }
			
			
	    }


		return super.onOptionsItemSelected(item);
		
	}
    
    



    
    }

  
