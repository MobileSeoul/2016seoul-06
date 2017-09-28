package com.cym5240.kis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import me.angeldevil.autoscrollviewpager.AutoScrollViewPager;

import com.actionbarsherlock.app.SherlockFragment;
import com.cym5240.kis.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.viewpagerindicator.CirclePageIndicator;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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

public class FragmentTab3 extends Fragment {

    //private static final String ARG_POSITION = "position";
   // private int position;
    ListView list;
	ListViewAdapter adapter;
	EditText editsearch;
	String[] rank;
	String[] country;
	String[] population;
	ArrayList<WorldPopulation> arraylist = new ArrayList<WorldPopulation>();
	static View rootView;
	
	private Toast toast;
	
	
	
    private DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
            .cacheOnDisk(true).imageScaleType(ImageScaleType.IN_SAMPLE_INT).build();
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.listview_main, container, false);
    }
	


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        
    	/*position = getArguments().getInt(ARG_POSITION);*/
        
        
        
        String tempo2;
    	String tempo3;
    	String tempo4;
    	String tempo5;
    	String tempo6;
    	String tempo7;
    	String tempo8;
    	
    	//random
    	
        String strs1[] = { "1", "2", "3", "4", "5", "6", "7"};
    	List<String> list1 = Arrays.asList(strs1);
    	Collections.shuffle(list1);
    	
    	String tempo=list1.get(0);
    	
    	
    	ArrayList<String> arraylist3 = new ArrayList<String>();
    	ArrayList<String> arraylist2 = new ArrayList<String>();
    	if(tempo.equals("1")){
    	arraylist3.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjFfMTI3/MDAxNDc3MDQ5NzI5Njg2.c2WsxDYuKMa_NuvjstH_wklbNN_nHzECUJchC5kPB1Eg.2FXBgubMB8CesD6krmVNktViLSQpl4IlA7Dg7yjr8b4g.JPEG.yil8853/1fg.jpg?type=w740");
    	arraylist3.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjFfMjAg/MDAxNDc3MDQ5NzI5ODEz.NNINnVdCgHvbIwT-j5uJeplay4JYIa84XCyT-YXgCoYg.Mp10eIKzV30ZT0UdZVElXLr9K4I_krVsdIaOEZ5Cz_4g.PNG.yil8853/2fg.png?type=w740");
    	arraylist3.add("http://cafeptthumb1.phinf.naver.net/MjAxNjEwMjFfMjMg/MDAxNDc3MDQ5NzMwMDMx.1tZdN87CocKB-v5_NNbsTPrMUx3JoNRgp1-VfYPkkPAg.NdzBEfRhQKO3_xXXN0Ttzjc7R1_PFYP_zWrCzNgF1Gog.PNG.yil8853/3fg.png?type=w740");
    
    	arraylist2.add("북서울 꿈의숲_Photographed by Lestexian");
    	arraylist2.add("보라매공원_Photographed by TintinJ");
    	arraylist2.add("노을공원_Photographed by GohRo");
    	
    	}else if(tempo.equals("2")){
        	arraylist3.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjFfMjgy/MDAxNDc3MDQ5NzMwODU5.s1ziINdWxB4lC7TFIkkYNt90PutAchzuY2BeoB7S09Eg.eoT0Q2nqR7j4VL6A7vo-PKg_8uSSTet43A9CEqfHDOYg.PNG.yil8853/4fg.png?type=w740");
        	arraylist3.add("http://cafeptthumb3.phinf.naver.net/MjAxNjEwMjFfMTk0/MDAxNDc3MDQ5NzMxMDc0.gQCH7oZ6kCb6HSpWflotE83rOfRM38IN48IXrftt-_Eg.VPFChmtldm-MF1OxUdAImWtV8jF0en7D23wKlGFEjSUg.PNG.yil8853/5fg.png?type=w740");
        	arraylist3.add("http://cafeptthumb3.phinf.naver.net/MjAxNjEwMjFfMjUz/MDAxNDc3MDQ5NzMxMzI1.S0zCTwpEj4b0Wv_iAbIMvi6YFg82Vwznhkpy7Iei-5Yg.jwSpFdS2TPK7A-mTY058LLj0QKhp2yhdxjlWaWAV7q4g.PNG.yil8853/6fg.png?type=w740");
        	
        	arraylist2.add("월드컵공원_Photographed by Jirka Matousek");
        	arraylist2.add("하늘공원_Photographed by Republic of Korea");
        	arraylist2.add("몽마르뜨공원_Photographed by 효자소년");
    	
    	}else if(tempo.equals("3")){
        	arraylist3.add("http://cafeptthumb3.phinf.naver.net/MjAxNjEwMjFfMTI0/MDAxNDc3MDQ5NzMyNjYw.kChpL4kiqdDXiwHt5WA-izrOIejvgluSkBdpG0wuRg8g.6Hb-w7MT8-fjM6nKJSyfMcTf0D_dXSMQV6UqkpBa5esg.PNG.yil8853/7fg.png?type=w740");
        	arraylist3.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjFfMjYg/MDAxNDc3MDQ5NzMyODAz.awKqt27IBBkcqGea-ekdNfPCV_uotcVhN_aAKEFQ-igg.pcPbjvcyXi7hD8LbY2Xm-K-aTNxZV-QW36WdEzCwS5wg.PNG.yil8853/8fg.png?type=w740");
        	arraylist3.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjFfODgg/MDAxNDc3MDQ5NzM0Mjcz.cthnnqRluKSbM44NZs-U9kAe7VUGZSabgvpjWENS4Dwg.rXgeD0tYncgE0m7Oc4s_mzQS84RPqsngXend-IGUuUkg.PNG.yil8853/9fg.png?type=w740");
        	
        	arraylist2.add("서울숲공원_Photographed by nakbii");
        	arraylist2.add("석촌호수_Photographed by travel oriented");
        	arraylist2.add("올림픽공원_Photographed by Lee.J.K");
        	
        	}else if(tempo.equals("4")){
            	arraylist3.add("http://cafeptthumb3.phinf.naver.net/MjAxNjEwMjFfMjcg/MDAxNDc3MDQ5NzM0NTQy.vW3kmtM4gOF7AvjZD2zcgpNzQrMw1QyrQaMbyzaLb6kg.e9M-quoi2BV1CuV4CUOGCufCkLw8Mu_RETTdytsk36Mg.PNG.yil8853/10fg.png?type=w740");
            	arraylist3.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjFfMTIy/MDAxNDc3MDQ5NzM0ODM4.NzFfn4HT-jA07Q-upLL_RExghJyjRJJz2U2mko2vF0sg.KOvYuY5ug3LP62nbXB9G8sU5_FUXXtZsrfIO95M3Oj4g.PNG.yil8853/11fg.png?type=w740");
            	arraylist3.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjFfMjY1/MDAxNDc3MDQ5NzM1MTEy.V4lHd3bBks-Azox-6VGCusEbxK8Vbrs2m9n_j-3k69Eg.HFx9d2OC1r2_i-z4ARCGPpv8Ttb8gD_eB_J_11G6aN4g.PNG.yil8853/12fg.png?type=w740");
            	
            	arraylist2.add("서서울호수공원_Photographed by 상석 서");
            	arraylist2.add("선유도 한강공원_Photographed by Republic of Korea");
            	arraylist2.add("여의도공원_Photographed by Gwonie S. Nam");
            	
        	}else if(tempo.equals("5")){
            	arraylist3.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjFfMjE4/MDAxNDc3MDQ5NzM1NDg0.YZwMZorO-DINvGxrlERRA3Hi1fMw_-SoeSNg9H9jgSgg.fwhKLR6JjPEJ8-csSyLyCGBEAbxkqGIIFMl1auhpbksg.PNG.yil8853/13fg.png?type=w740");
            	arraylist3.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjFfOTYg/MDAxNDc3MDQ5NzM1NzUy.RVa8Z0nCYty_YxpaBfmxjfk46DHxe-SgISu8PZ6d4I0g.mXntZ5NT1aDmPkIKempYDxl9mhsmlbqbM9Ax4FlYZj0g.PNG.yil8853/14fg.png?type=w740");
            	arraylist3.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjFfMTY2/MDAxNDc3MDQ5NzM2MDU1.fxcv41niEBeg-RpGEP0elAPH2Rj7ZXSgAmitzRCkikYg.zk2u5r9ukUw_toiyzhJQeYx9RyPH3XUwdq6o12Z7ymsg.PNG.yil8853/15fg.png?type=w740");
            	
            	arraylist2.add("여의도 한강공원_Photographed by Peter Rowlands");
            	arraylist2.add("용산가족공원_Photographed by Republic of Korea");
            	arraylist2.add("효창공원_Photographed by PRObenghancock");
            	
        	}else if(tempo.equals("6")){
            	arraylist3.add("http://cafeptthumb3.phinf.naver.net/MjAxNjEwMjFfMzAg/MDAxNDc3MDQ5NzM2MzEy.f5wsvUB2z-AWRscFxGLDcCpHxV0eZfdhYw3asLH6nacg.Qd8nfe1v2Tf07tw4vPzRIV-4uFzlujqrbpqIJyXYlxcg.PNG.yil8853/16fg.png?type=w740");
            	arraylist3.add("http://cafeptthumb1.phinf.naver.net/MjAxNjEwMjFfMTMw/MDAxNDc3MDQ5NzM2NzYw.t2xj0qCWCPODv5IZ9k19qAz2qhwsy7esGffqrFEu524g.E5brS02U7K5zdruzR4077LAC3rmlqLcc4WP2LC6N0r0g.PNG.yil8853/17fg.png?type=w740");
            	arraylist3.add("http://cafeptthumb1.phinf.naver.net/MjAxNjEwMjFfMjY1/MDAxNDc3MDQ5NzM2OTk1.FZOkvVUF469lM_MN6Lr3ZNdzNZDbHLKWH12QvIFRJl0g.QbeH0pbERQwz_9o8CBF_leMT2KyB8w4IbQEX7ttcTtMg.PNG.yil8853/18fg.png?type=w740");
            	
            	arraylist2.add("낙산공원 _Photographed by EunHo sung");
            	arraylist2.add("마로니에공원_Photographed by Meryl Ko");
            	arraylist2.add("청계천_Photographed by brian kusler");
            	
        	}else if(tempo.equals("7")){
            	arraylist3.add("http://cafeptthumb1.phinf.naver.net/MjAxNjEwMjFfMTIz/MDAxNDc3MDQ5NzM3MjE0.ZW3UszbUYB2P2BRxtrSulZgYpRHhYvlQ1WhsMApqVMUg.bW3SLJ5GX0zt7gB0ccyUrjUo0PKXjpk9JRTx5P2FBP8g.PNG.yil8853/19fg.png?type=w740");
            	arraylist3.add("http://cafeptthumb3.phinf.naver.net/MjAxNjEwMjFfMTQg/MDAxNDc3MDQ5NzM3NDkz.XbBZEWIkVVji3RxcqV28iXFkOD6JdK0zka7Lkse3_yEg.yyHBLfRuxLpijwk7HNdn7sVWvJQnQx_57RbcqwwMdSEg.PNG.yil8853/20fg.png?type=w740");
            	arraylist3.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjFfMTI3/MDAxNDc3MDQ5NzI5Njg2.c2WsxDYuKMa_NuvjstH_wklbNN_nHzECUJchC5kPB1Eg.2FXBgubMB8CesD6krmVNktViLSQpl4IlA7Dg7yjr8b4g.JPEG.yil8853/1fg.jpg?type=w740");
            	
            	arraylist2.add("탑골공원_Photographed by Meryl Ko");
            	arraylist2.add("동대문역사문화공원_Photographed by 서울디자인재단");
            	arraylist2.add("북서울 꿈의숲_Photographed by Lestexian");
            	
        	}
    	
        
    	
       
        final String titles[] = arraylist2.toArray(new String[arraylist2.size()]);
        final String imgs[] = arraylist3.toArray(new String[arraylist3.size()]);
    	
      
    
      
    	
        AutoScrollViewPager pager = (AutoScrollViewPager) getView().findViewById(R.id.scroll_pager);
        final TextView title = (TextView) getView().findViewById(R.id.title);
        CirclePageIndicator indicator = (CirclePageIndicator) getView().findViewById(R.id.indicator);
       
      
        	
        arraylist.clear();
        
     // Generate sample data
     		rank = new String[] {"북서울 꿈의숲","보라매공원","노을공원","월드컵공원","하늘공원","몽마르뜨공원","서울숲공원","석촌호수","올림픽공원","서서울호수공원","선유도 한강공원","여의도공원","여의도 한강공원","용산가족공원","효창공원","낙산공원","마로니에공원","청계천","탑골공원","동대문역사문화공원"};

     		country = new String[] {"서울특별시 강북구 월계로 173","서울특별시 동작구 여의대방로20길 33","서울특별시 마포구 상암동","서울특별시 마포구 하늘공원로 108-1","서울특별시 마포구 하늘공원로 95","서울특별시 서초구 반포동","서울특별시 성동구 뚝섬로 273","서울특별시 송파구 잠실동","서울특별시 송파구 올림픽로 424","서울특별시 양천구 신월동 산68-3","서울특별시 영등포구 선유로 343","서울특별시 영등포구 여의공원로 68","서울특별시 영등포구 여의동로 330","서울특별시 용산구 용산동6가 68-87","서울특별시 용산구 효창동","서울특별시 종로구 낙산길 41","서울특별시 종로구 대학로8길 1","서울특별시 종로구 창신동","서울특별시 종로구 종로 99","서울특별시 중구 신당동"};

     		population = new String[] {"강북구","동작구","마포구","마포구","마포구","서초구","성동구","송파구","송파구","양천구","영등포구","영등포구","영등포구","용산구","용산구","종로구","종로구","종로구","종로구","중구"};

     		// Locate the ListView in listview_main.xml
     		list = (ListView) view.findViewById(R.id.listview);

     		for (int i = 0; i < rank.length; i++) 
     		{
     			WorldPopulation wp = new WorldPopulation(rank[i], country[i], population[i]);
     			// Binds all strings into an array
     			arraylist.add(wp);
     			
     		}

     		// Pass results to ListViewAdapter Class
     		adapter = new ListViewAdapter(getActivity(), arraylist);

     		
     		// Binds the Adapter to the ListView
     		list.setAdapter(adapter);
     		
     		// Locate the EditText in listview_main.xml
     		editsearch = (EditText) view.findViewById(R.id.search);
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
       
     		 indicator.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
             	
                 @Override
                 public void onPageSelected(int i) {
                 	
                     title.setText(titles[i]);
                     
                 }
             });

             pager.setAdapter(new PagerAdapter() {
                 @Override
                 public int getCount() {
                  	
                     return imgs.length;
                 }

                 @Override
                 public boolean isViewFromObject(View view, Object o) {
                     return view == o;
                 }

                 @Override
                 public Object instantiateItem(ViewGroup container, int position) {
            
                 	
                 	
                     ImageView view = new ImageView(container.getContext());
                     view.setScaleType(ImageView.ScaleType.CENTER_CROP);
                     ImageLoader.getInstance().displayImage(imgs[position], view, options);
                     container.addView(view);
                     
                     
                     return view;
                 }

                 @Override
                 public void destroyItem(ViewGroup container, int position, Object object) {
                     container.removeView((View) object);
                 }
             });

             indicator.setViewPager(pager);
             indicator.setSnap(true);

             pager.setScrollFactgor(5);
             pager.setOffscreenPageLimit(4);
             pager.startAutoScroll(3500);
             pager.setOnPageClickListener(new AutoScrollViewPager.OnPageClickListener() {
                 @Override
                 public void onPageClick(AutoScrollViewPager autoScrollPager, int position) {
                	 if (position==0){
                     	if (titles[0].equals("북서울 꿈의숲_Photographed by Lestexian")){
                     		Intent intent2 = new Intent(getActivity(), websan.class);
         					startActivity(intent2);
                         }else if(titles[0].equals("월드컵공원_Photographed by Jirka Matousek")){
                         	Intent intent2 = new Intent(getActivity(), websan4.class);
         					startActivity(intent2);
                         }else if(titles[0].equals("서울숲공원_Photographed by nakbii")){
                         	Intent intent2 = new Intent(getActivity(), websan7.class);
         					startActivity(intent2);
                         }else if(titles[0].equals("서서울호수공원_Photographed by 상석 서")){
                         	Intent intent2 = new Intent(getActivity(), websan10.class);
         					startActivity(intent2);
                         }else if(titles[0].equals("여의도 한강공원_Photographed by Peter Rowlands")){
                         	Intent intent2 = new Intent(getActivity(), websan13.class);
         					startActivity(intent2);
                         }else if(titles[0].equals("낙산공원 _Photographed by EunHo sung")){
                         	Intent intent2 = new Intent(getActivity(), websan16.class);
         					startActivity(intent2);
                         }else if(titles[0].equals("탑골공원_Photographed by Meryl Ko")){
                         	Intent intent2 = new Intent(getActivity(), websan19.class);
         					startActivity(intent2);
                         }
                     }else if (position==1){
                     	if (titles[0].equals("보라매공원_Photographed by TintinJ")){
                     		Intent intent2 = new Intent(getActivity(), websan2.class);
         					startActivity(intent2);
                         }else if(titles[1].equals("하늘공원_Photographed by Republic of Korea")){
                         	Intent intent2 = new Intent(getActivity(), websan5.class);
         					startActivity(intent2);
                         }else if(titles[1].equals("석촌호수_Photographed by travel oriented")){
                         	Intent intent2 = new Intent(getActivity(), websan8.class);
         					startActivity(intent2);
                         }else if(titles[1].equals("선유도 한강공원_Photographed by Republic of Korea")){
                         	Intent intent2 = new Intent(getActivity(), websan11.class);
         					startActivity(intent2);
                         }else if(titles[1].equals("용산가족공원_Photographed by Republic of Korea")){
                         	Intent intent2 = new Intent(getActivity(), websan14.class);
         					startActivity(intent2);
                         }else if(titles[1].equals("마로니에공원_Photographed by Meryl Ko")){
                         	Intent intent2 = new Intent(getActivity(), websan17.class);
         					startActivity(intent2);
                         }else if(titles[1].equals("동대문역사문화공원_Photographed by 서울디자인재단")){
                         	Intent intent2 = new Intent(getActivity(), websan20.class);
         					startActivity(intent2);
                         }
                     }else if (position==2){
                     	if (titles[2].equals("노을공원_Photographed by GohRo")){
                     		Intent intent2 = new Intent(getActivity(), websan3.class);
         					startActivity(intent2);
                         }else if(titles[2].equals("몽마르뜨공원_Photographed by 효자소년")){
                         	Intent intent2 = new Intent(getActivity(), websan6.class);
         					startActivity(intent2);
                         }else if(titles[2].equals("올림픽공원_Photographed by Lee.J.K")){
                         	Intent intent2 = new Intent(getActivity(), websan9.class);
         					startActivity(intent2);
                         }else if(titles[2].equals("여의도공원_Photographed by Gwonie S. Nam")){
                         	Intent intent2 = new Intent(getActivity(), websan12.class);
         					startActivity(intent2);
                         }else if(titles[2].equals("효창공원_Photographed by PRObenghancock")){
                         	Intent intent2 = new Intent(getActivity(), websan15.class);
         					startActivity(intent2);
                         }else if(titles[2].equals("청계천_Photographed by brian kusler")){
                         	Intent intent2 = new Intent(getActivity(), websan18.class);
         					startActivity(intent2);
                         }else if(titles[2].equals("북서울 꿈의숲_Photographed by Lestexian")){
                         	Intent intent2 = new Intent(getActivity(), websan.class);
         					startActivity(intent2);

                         }
                     }
                 }
             });
      
    }
    
    @Override
    public void onDestroyView() {     
    	super.onDestroyView();     
    	if(rootView!=null){         
    		ViewGroup parent = (ViewGroup)rootView.getParent();   
    		arraylist.clear();
    		if(parent!=null){             
    			parent.removeView(rootView);   
    			arraylist.clear();
    			}     
    		} 
    	}
}
