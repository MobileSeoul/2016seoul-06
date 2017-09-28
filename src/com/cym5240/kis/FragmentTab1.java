package com.cym5240.kis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import me.angeldevil.autoscrollviewpager.AutoScrollViewPager;


import com.actionbarsherlock.app.SherlockFragment;
import com.cym5240.kis.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.viewpagerindicator.CirclePageIndicator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;

public class FragmentTab1 extends Fragment {
	
	

	
    //private String[] imgs = {"http://cafeptthumb4.phinf.naver.net/MjAxNjEwMDRfMjc2/MDAxNDc1NTA3MDAyOTYz.OcpG3DsB223yNFQSZvb8kieopFYCySbS3viewxtQJAMg.meeosooVRHAtNJi6Y2bV82jX9INkskYfo_pmDE9hmsMg.PNG.yil8853/chsa.png?type=w740",
			// "http://cafeptthumb2.phinf.naver.net/MjAxNjEwMDRfMjgg/MDAxNDc1NTA3MDAzMjUw.Yo_TCk8XY156NTvsdZmuAu5EXlcAY1p3gC0qb2roEEsg.7A14-9PoH10A3UgbHrgDov3vR8Rm8qI9N3K7-Pp64EUg.PNG.yil8853/chgon.png?type=w740",
			// "http://cafeptthumb3.phinf.naver.net/MjAxNjEwMDRfMTMw/MDAxNDc1NTA3MDAzNTI0.18ebo-lQBT5pe76sQ0-XIlWCd1GW0iX_wVw20w5sxEcg.Wy0Havby_rqlRLKxkytewze1SYB1wrxNUwzbyoxVV6Eg.PNG.yil8853/teji.png?type=w740"};


    private DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
            .cacheOnDisk(true).imageScaleType(ImageScaleType.IN_SAMPLE_INT).build();

    private Toast toast;
    
    public static final String TAG = "MYTAG";
	public ImageView ibtn = null;
	public ImageView ibtn2 = null;
	public ImageView ibtn3 = null;
	public ImageView ibtn4 = null;
	public ImageView ibtn5 = null;
	public ImageView ibtn6 = null;
	public ImageView ibtn7 = null;
	public ImageView ibtn8 = null;
	public ImageView ibtn9 = null;
	public ImageView ibtn10 = null;
	public ImageView ibtn11 = null;
	public ImageView ibtn12 = null;
	public ImageView ibtn13 = null;
	public ImageView ibtn14 = null;
	public ImageView ibtn15 = null;
	public ImageView ibtn16 = null;
	public ImageView ibtn17 = null;
	public ImageView ibtn18 = null;
	public ImageView ibtn19 = null;
	public ImageView ibtn20 = null;
	public ImageView ibtn21 = null;
	public ImageView ibtn22 = null;
	public ImageView ibtn23 = null;
	public ImageView ibtn24 = null;
	public ImageView mainimg = null;
	public ImageView iconimg = null;
	ImageView arrow_back2;
	
	//random
	String temp;
	String temp2;
	String temp3;
	String temp4;
	String temp5;
	String temp6;
	String temp7;
	String temp8;
	String temp9;
	String temp10;
	String temp11;
	String temp12;
	String temp13;
	String temp14;
	String temp15;
	String temp16;
	String temp17;
	String temp18;
	String temp19;
	String temp20;
	String temp21;
	String temp22;
	String temp23;
	String temp24;

	//random text

	TextView texttitle;
	TextView textyear;
	TextView editText1; //내용
	TextView from;
	TextView textname;
	
	
	
	 
	
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmenttab1, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        
      //random
    	
    	String tempo2;
    	String tempo3;
    	String tempo4;
    	String tempo5;
    	String tempo6;
    	String tempo7;
    	String tempo8;
    	
    	//random
    	
        String strs1[] = { "1", "2", "3", "4", "5", "6", "7", "8"};
    	List<String> list1 = Arrays.asList(strs1);
    	Collections.shuffle(list1);
    	
    	String tempo=list1.get(0);
    	
    	
    	ArrayList<String> arraylist = new ArrayList<String>();
    	ArrayList<String> arraylist2 = new ArrayList<String>();
    	if(tempo.equals("1")){
    	arraylist.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjBfMzYg/MDAxNDc2ODk4NjAyMTc2.PBvdfodgiHZUGi9OcPXc9xzsX8dOvq5dE4qoh0WUKsIg.Y5k1P_mbaUQUremc-dFL8aSY43LsSxTPYCFt_1B1YWIg.PNG.yil8853/chsa.png?type=w740");
    	arraylist.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjBfMTI4/MDAxNDc2ODk4NjAyNDAw.5SOtDKO6PS8Ah_HrwARL5wzmB95RAtslO29umZL1Tk0g.7ZnBgmQZPVQ21Vmvpd3GRlMRhY-zhmocdmHi5aPxn7gg.PNG.yil8853/chgon.png?type=w740");
    	arraylist.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjBfMTgx/MDAxNDc2ODk4NjAyNjAx.O_fEet1rRcnhp0uKJp4ihqBXihzw6Xzna7-5BJJj5TQg.ZdyKHsVuOcJjzZ3KtAfwkkbpBMoKBn0jBzHPaGgpa5wg.PNG.yil8853/teji.png?type=w740");
    
    	arraylist2.add("청와대사랑채");
    	arraylist2.add("충우곤충박물관");
    	arraylist2.add("테지움");
    	
    	}else if(tempo.equals("2")){
        	arraylist.add("http://cafeptthumb1.phinf.naver.net/MjAxNjEwMjBfMTky/MDAxNDc2ODk4NjAyODYy.2J_ccFPMTrujT-2D7rgfvf4j2st-nHsO41l-maDHFsQg.v2Zy0HVMw5CDx0q4VRknSbXdV9SlIR_MWlJ3vtM5yNsg.PNG.yil8853/fishc.png?type=w740");
        	arraylist.add("http://cafeptthumb1.phinf.naver.net/MjAxNjEwMjBfMTMx/MDAxNDc2ODk4NjAzMTU2.BGCVOU_SKwwCp0JSJbZ89JQ8f2DATE852BD8CYzQGBUg.wWt88EBmzGlmrQd96xm6Qyf2SmFO9XdnSN2XuFogv9og.PNG.yil8853/mbg.png?type=w740");
        	arraylist.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjBfMTQg/MDAxNDc2ODk4NjAzNTE5.U2UKCUFeXMSubkqs8NMe4EmFT_xdOt5g20hIpzrTG_Mg.nkFx-rJBvWjizfPESxYqu421URW_4u-YnWWFDEZRFvwg.PNG.yil8853/gjg.png?type=w740");
        	
        	arraylist2.add("아빠붕어낚시카페");
        	arraylist2.add("여의도 물빛광장");
        	arraylist2.add("국립중앙박물관");
    	
    	}else if(tempo.equals("3")){
        	arraylist.add("http://cafeptthumb1.phinf.naver.net/MjAxNjEwMjBfMjQx/MDAxNDc2ODk4NjAzNzQ2.EMA_El0lC_WQW2pPGeRSdiMkryU7n1DhDP-yZ5xbBfAg.HT0hSB5haux4Q6AMFwwHQ665KY_MlunLZjSWv8FpXSog.PNG.yil8853/ssnr.png?type=w740");
        	arraylist.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjBfMTYy/MDAxNDc2ODk4NjAzOTg1.qxmFz0jnjyKwuXCrH_78sTzzj7aUne5DLg8k7JNP90Ag.RaXpODkDDBv8cmq_nOikjvE47GRKXSOk9jZOHJegVx4g.PNG.yil8853/msgy.png?type=w740");
        	arraylist.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjBfMTg2/MDAxNDc2ODk4NjA0MzQ2.ECG2fPkgpaq25RNHPumPGQvs614b0Nh4DtPZi3TVOUkg.HWczcFshBG0837W_cg_KO_ZGiPN9OUIakFRruOoNg0og.PNG.yil8853/aquar.png?type=w740");
        	
        	arraylist2.add("상상나라");
        	arraylist2.add("지구촌 민속 박물관");
        	arraylist2.add("아쿠아플라넷63");
        	
        	}else if(tempo.equals("4")){
            	arraylist.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjBfMjA4/MDAxNDc2ODk4NjA0NTk0.k_chiNfZ7IyW0XQHqAfKY23_ZwO5rcJzI8ZUW8rATrYg.H5acwHWCxDD9zIUWxJCY03HploJR4GKrA1seVo0O-_Ug.PNG.yil8853/dina.png?type=w740");
            	arraylist.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjBfNDkg/MDAxNDc2ODk4NjA0OTAx.mNlM1Lp-Kdwra2h5LbBjt6zjlKAdKoeN4ooLj6kOdbUg.Ux0GA1LAi3OBZxd7VmT7eoHiAiLmpaIe6xkp5kjuLN4g.PNG.yil8853/kisa.png?type=w740");
            	arraylist.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjBfODYg/MDAxNDc2ODk4NjA1Mjcy.NuTyiF2mUYwlpulRCnkv2roz9L5GmGXXgmzbYs-wlacg.00MLK8idUdHcqXJfcSShybJ-jw_65B8kzpOwHwbRUPsg.PNG.yil8853/jasa.png?type=w740");
            	
            	arraylist2.add("다이나믹메이즈");
            	arraylist2.add("키자니아");
            	arraylist2.add("서대문자연사박물관");
            	
        	}else if(tempo.equals("5")){
            	arraylist.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjBfMTk3/MDAxNDc2ODk4NjA1NTU0.zxH68K7RXbYD1jU9ZKSXVc9uPRZ1UupLZ_pR_ulE5FMg.w2XLOSZiO_A7vk0ocBRL0vt1sUJGBDNkHi3VmSIkTI0g.PNG.yil8853/dys.png?type=w740");
            	arraylist.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjBfMTkw/MDAxNDc2ODk4NjA1ODM1.mEI1dofohzK8mzjxp7zueQ9Rxw-n_OrKLJOqeeXUDbMg.Q3fQg7YYn3lVgaS9Q_ABb06-mI8hWMJBqYmk8ji11bQg.PNG.yil8853/ddp.png?type=w740");
            	arraylist.add("http://cafeptthumb4.phinf.naver.net/MjAxNjEwMjBfMTQ1/MDAxNDc2ODk4NjA2MTcx._oZe-pClyC5n0N-XTK1u8op_G1RTkReC4tsFx32boxkg.PgbIE6-8CJj5hZdAhd6IYNOA9iB98xIEvsnpyGH6674g.PNG.yil8853/anime.png?type=w740");
            	
            	arraylist2.add("대한민국역사박물관");
            	arraylist2.add("동대문디자인플라자");
            	arraylist2.add("서울애니메이션센터");
            	
        	}else if(tempo.equals("6")){
            	arraylist.add("http://cafeptthumb1.phinf.naver.net/MjAxNjEwMjBfMjY4/MDAxNDc2ODk4NjA2NDQ1.3oeejkf_eSv6NYDg1CpxCaqMvjpA5qt4DrGRx2ZmOY0g.91t2rdrnGk_-mXCe-yurolTfLNEP-sC-mRqShuJfgo4g.PNG.yil8853/seokid.png?type=w740");
            	arraylist.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjBfMTMg/MDAxNDc2ODk4NjA2NzI1.EXHOLg3GikXYSxx2y4T2zV-6j4ZuK9-E52QHpGBrFGIg.Z0QYChrYdZ7VZgt45WP289yIwdvwk1_i6xo207WXYUUg.PNG.yil8853/pororo.png?type=w740");
            	arraylist.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjBfMjEw/MDAxNDc2ODk4NjA3MDIz.60aeF7yFp_VXjkQ5k4x55GR_QrN2R3WRRjbUB7FxDmIg.sqc6tq_Na3UA1Sk1mIP2N3ErRy57lcbxiK3MG-8m76og.PNG.yil8853/exaq.png?type=w740");
            	
            	arraylist2.add("서울어린이대공원");
            	arraylist2.add("뽀로로파크");
            	arraylist2.add("코엑스 아쿠아리움");
            	
        	}else if(tempo.equals("7")){
            	arraylist.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjBfMTA5/MDAxNDc2ODk4NjA3MzEz.khFHz4T2OIeVv-yqiqmBZNyqyuRnLZ8qywMn57eT5dQg.uATaaOnRb75UR-jonaWW7bHcE6iaespjVF5ApH1X2Lsg.PNG.yil8853/jjg.png?type=w740");
            	arraylist.add("http://cafeptthumb3.phinf.naver.net/MjAxNjEwMjBfMTc0/MDAxNDc2ODk4NjA4NTcz.woE1MZYM-XSOLFXqwPBV0HnO9QRq53WIBHONHbxVfTkg.W0clrRrh1aTGuI6ziQF45H2iPVtXQv0SEkArfxLcMqkg.PNG.yil8853/emg.png?type=w740");
            	arraylist.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjBfMjQz/MDAxNDc2ODk4NjA4ODMz.fgC4IROHKG9hyQAcx-zy_5PhrF4p_6Of45VbWNztfasg.V-GENg6WwVveXVKCSPHOy_4YKjzyjd_SyXPUeVkYcA4g.PNG.yil8853/gss.png?type=w740");
            	
            	arraylist2.add("전쟁기념관");
            	arraylist2.add("국립어린이민속박물관");
            	arraylist2.add("강서 습지생태공원");
            	
        	}else if(tempo.equals("8")){
            	arraylist.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjBfMjk0/MDAxNDc2ODk4NjA5MTE5.nsOMyyCwmFlgaXLmqUmoF0NJaQPbfwl79JoamiPnmR4g.T4kx9tmg89Ju5uDsOjFIPSNWXLEgdgSvS_AwWJWEW6Ig.PNG.yil8853/dmu.png?type=w740");
            	arraylist.add("http://cafeptthumb1.phinf.naver.net/MjAxNjEwMjBfMTQ0/MDAxNDc2ODk4NjEwMzM2.A3Nv3DLLa91_wtHMTBDDPOnLBkWCMDM_YP1Vj9DHLecg.fV99cU58T4M7gP6c-rbaj1oYOjGNFf73IHb3bt44Q-og.PNG.yil8853/sgh.png?type=w740");
            	arraylist.add("http://cafeptthumb2.phinf.naver.net/MjAxNjEwMjBfMjA0/MDAxNDc2ODk4NjEwNTcz.nfYsu33YZk_VjdezXOupyNy3H42-eK44VCyHKWhIoSgg.YG_iFSKNwFxMCtGf17IEyUPyRxHyk9GqYEgXwBhr1FIg.PNG.yil8853/grg.png?type=w740");
            	
            	arraylist2.add("디뮤지엄");
            	arraylist2.add("서울과학전시관");
            	arraylist2.add("국립고궁박물관");
            	
        	}
    	
        
    	
       
        final String titles[] = arraylist2.toArray(new String[arraylist2.size()]);
        final String imgs[] = arraylist.toArray(new String[arraylist.size()]);
    	
      
    
      
    	
        AutoScrollViewPager pager = (AutoScrollViewPager) getView().findViewById(R.id.scroll_pager);
        final TextView title = (TextView) getView().findViewById(R.id.title);
        CirclePageIndicator indicator = (CirclePageIndicator) getView().findViewById(R.id.indicator);

        String a;
        //random
        mainimg = (ImageView) getView().findViewById(R.id.mainimg);
        arrow_back2 = (ImageView) getView().findViewById(R.id.backicon);
        iconimg = (ImageView) getView().findViewById(R.id.iconimg);
        
        
        String strs[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
    			"11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
    			"21", "22", "23", "24" };
    	List<String> list = Arrays.asList(strs);
    	Collections.shuffle(list);
    	
    	
		temp = list.get(0);
		temp2 = list.get(1);
		temp3 = list.get(2);
		temp4 = list.get(3);
		temp5 = list.get(4);
		temp6 = list.get(5);
		temp7 = list.get(6);
		temp8 = list.get(7);
		temp9 = list.get(8);
		temp10 = list.get(9);
		temp11 = list.get(10);
		temp12 = list.get(11);
		temp13 = list.get(12);
		temp14 = list.get(13);
		temp15 = list.get(14);
		temp16 = list.get(15);
		temp17 = list.get(16);
		temp18 = list.get(17);
		temp19 = list.get(18);
		temp20 = list.get(19);
		temp21 = list.get(20);
		temp22 = list.get(21);
		temp23 = list.get(22);
		temp24 = list.get(23);
    	
		
		//random text
		
		texttitle = (TextView) getView().findViewById(R.id.texttitle);
		textyear = (TextView) getView().findViewById(R.id.textyear);
		editText1 = (TextView) getView().findViewById(R.id.editText1);
		from = (TextView) getView().findViewById(R.id.from);
		textname = (TextView) getView().findViewById(R.id.textname);
    	
		
    	//random
    	
    	if (temp.equals("1")) {
    		texttitle.setText("청와대사랑채"); 
    		textyear.setText("2014.10.18"); 
    		editText1.setText("관람시간 : 09:00~18:00(1월 1일 휴관)..."); 
    		from.setText("주소 : 서울특별시 종로구 효자로13길 45"); 
    		textname.setText("Photographed by Republic of Korea"); 
    		
			mainimg.setImageResource(R.drawable.chsa);
			iconimg.setImageResource(R.drawable.pk);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar.class);
					startActivity(intent2);

				}
			});
			
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar.class);
					startActivity(intent2);

				}
			});
			
		} else if (temp.equals("2")) {
    		texttitle.setText("충우곤충박물관"); 
    		textyear.setText("2016.08.10"); 
    		editText1.setText("이용시간 : 09:30~18:30(평일)..."); 
    		from.setText("서울특별시 강서구 강서로 139"); 
    		textname.setText("Photographed by 농촌진흥원"); 
			mainimg.setImageResource(R.drawable.chgon);
			iconimg.setImageResource(R.drawable.ncg);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar2.class);
					startActivity(intent2);

				}
			});
			
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar2.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("3")) {
    		texttitle.setText("테지움"); 
    		textyear.setText("2012.05.27"); 
    		editText1.setText("평일 : 08:30~19:30(티켓마감 18시 30분)..."); 
    		from.setText("주소 : 서울특별시 종로구 지봉로 19"); 
    		textname.setText("Photographed by 편집장"); 
			mainimg.setImageResource(R.drawable.teji);
			iconimg.setImageResource(R.drawable.pyj);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar3.class);
					startActivity(intent2);

				}
			});
			
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar3.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("4")) {
    		texttitle.setText("아빠붕어낚시카페"); 
    		textyear.setText("2016.07.26"); 
    		editText1.setText("다양한 이벤트 진행, 장비 및 음료 무료 제공..."); 
    		from.setText("주소 : 서울특별시 종로구 대학로8가길 52"); 
    		textname.setText("Photographed by waterlily1007"); 
			mainimg.setImageResource(R.drawable.fishc);
			iconimg.setImageResource(R.drawable.chacha);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar4.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar4.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("5")) {
    		texttitle.setText("여의도 물빛광장"); 
    		textyear.setText("2010.04.16"); 
    		editText1.setText("일정에 따른 다양한 이벤트 진행..."); 
    		from.setText("주소 : 서울특별시 영등포구 여의동로 330"); 
    		textname.setText("Photographed by Elizabeth"); 
			mainimg.setImageResource(R.drawable.mbg);
			iconimg.setImageResource(R.drawable.pcb);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar5.class);
					startActivity(intent2);

				}
			});
			
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar5.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("6")) {
			texttitle.setText("국립중앙박물관"); 
    		textyear.setText("2014.08.09"); 
    		editText1.setText("어린이 박물관과 동시 운영..."); 
    		from.setText("주소 : 서울특별시 용산구 서빙고로 137 국립중앙박물관"); 
    		textname.setText("Photographed by Jinho Jung"); 
			mainimg.setImageResource(R.drawable.gjg);
			iconimg.setImageResource(R.drawable.jj);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar6.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar6.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("7")) {
			texttitle.setText("상상나라"); 
    		textyear.setText("2016.03.11"); 
    		editText1.setText("관람시간 : 10:00 ~ 18:00..."); 
    		from.setText("주소 : 서울특별시 광진구 능동로 216 서울시민안전체험관"); 
    		textname.setText("Photographed by flyingchichi"); 
			mainimg.setImageResource(R.drawable.ssnr);
			iconimg.setImageResource(R.drawable.stla);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar7.class);
					startActivity(intent2);

				}
			});
			
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar7.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("8")) {
			texttitle.setText("지구촌 민속 박물관"); 
    		textyear.setText("2016.01.17"); 
    		editText1.setText("관람시간 : 10:00 ~ 17:00(월요일,명절 휴무)..."); 
    		from.setText("주소 : 서울특별시 중구 소파로 46 서울특별시교육연구정보원"); 
    		textname.setText("Photographed by mika1211"); 
			mainimg.setImageResource(R.drawable.msgy);
			iconimg.setImageResource(R.drawable.mksr);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar8.class);
					startActivity(intent2);

				}
			});
			
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar8.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("9")) {
			texttitle.setText("아쿠아플라넷63"); 
    		textyear.setText("2014.07.28"); 
    		editText1.setText("관람시간 : 10:00~22:00(21:30까지 입장가능)..."); 
    		from.setText("주소 : 서울특별시 영등포구 63로 50"); 
    		textname.setText("Photographed by happynimo"); 
			mainimg.setImageResource(R.drawable.aquar);
			iconimg.setImageResource(R.drawable.nimo);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar9.class);
					startActivity(intent2);

				}
			});
			
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar9.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("10")) {
			texttitle.setText("다이나믹메이즈"); 
    		textyear.setText("2015.08.30"); 
    		editText1.setText("매일 09:00~20:30 운영..."); 
    		from.setText("주소 : 서울특별시 종로구 인사동길 12 대일빌딩 지하1층"); 
    		textname.setText("Photographed by cruiserlaw"); 
			mainimg.setImageResource(R.drawable.dina);
			iconimg.setImageResource(R.drawable.jindor);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar10.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar10.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("11")) {
			texttitle.setText("키자니아"); 
    		textyear.setText("2016.09.12"); 
    		editText1.setText("평일 : 10:00 ~ 20:30 운영..."); 
    		from.setText("주소 : 서울특별시 송파구 올림픽로 240 롯데월드"); 
    		textname.setText("Photographed by Ji Sun Lee"); 
			mainimg.setImageResource(R.drawable.kisa);
			iconimg.setImageResource(R.drawable.pcb);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar11.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar11.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("12")) {
			texttitle.setText("서대문자연사박물관"); 
    		textyear.setText("2016.09.26"); 
    		editText1.setText("매일 : 09:00 ~ 18:00(월요일 휴무) 운영..."); 
    		from.setText("주소 : 서울특별시 서대문구 연희로32길 51"); 
    		textname.setText("Photographed by happyhahamom"); 
			mainimg.setImageResource(R.drawable.jasa);
			iconimg.setImageResource(R.drawable.hapymom);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar12.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar12.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("13")) {
			texttitle.setText("대한민국역사박물관"); 
    		textyear.setText("2014.03.09"); 
    		editText1.setText("매일 : 09:00 ~ 18:00(1월 1일 휴관) 운영..."); 
    		from.setText("주소 : 서울특별시 종로구 세종대로 198"); 
    		textname.setText("Photographed by kiki park"); 
			mainimg.setImageResource(R.drawable.dys);
			iconimg.setImageResource(R.drawable.kikip);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar13.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar13.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("14")) {
			texttitle.setText("동대문디자인플라자"); 
    		textyear.setText("2014.10.25"); 
    		editText1.setText("다양한 전시,공연,교육 컬처라이프 제공..."); 
    		from.setText("주소 : 서울특별시 중구 을지로 281"); 
    		textname.setText("Photographed by H.B. Kang"); 
			mainimg.setImageResource(R.drawable.ddp);
			iconimg.setImageResource(R.drawable.pcb);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar14.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar14.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("15")) {
			texttitle.setText("서울애니메이션센터"); 
    		textyear.setText("2014.07.22"); 
    		editText1.setText("평일 : 09:00 ~ 18:00(월요일, 공휴일 휴관)..."); 
    		from.setText("서울특별시 중구 소파로 126 서울애니매이션센타"); 
    		textname.setText("Photographed by Republic of Korea"); 
			mainimg.setImageResource(R.drawable.anime);
			iconimg.setImageResource(R.drawable.pk);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar15.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar15.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("16")) {
			texttitle.setText("서울어린이대공원"); 
    		textyear.setText("2016.10.06"); 
    		editText1.setText("매일 : 5:00 ~ 22:00 운영..."); 
    		from.setText("주소 : 서울특별시 광진구 능동로 216 어린이대공원"); 
    		textname.setText("Photographed by concon36"); 
			mainimg.setImageResource(R.drawable.seokid);
			iconimg.setImageResource(R.drawable.concon);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar16.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar16.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("17")) {
			texttitle.setText("뽀로로파크"); 
    		textyear.setText("2015.05.04"); 
    		editText1.setText("매일 10:00 ~ 21:00 운영..."); 
    		from.setText("주소 : 서울특별시 송파구 올림픽로 240 롯데월드"); 
    		textname.setText("Photographed by lotteworld happy"); 
			mainimg.setImageResource(R.drawable.pororo);
			iconimg.setImageResource(R.drawable.lotte);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar17.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar17.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("18")) {
			texttitle.setText("코엑스 아쿠아리움"); 
    		textyear.setText("2012.02.15"); 
    		editText1.setText("매일 : 10:00 ~ 20:00(연중무휴)..."); 
    		from.setText("주소 : 서울특별시 강남구 영동대로 513 코엑스몰 B1"); 
    		textname.setText("Photographed by MPD01605"); 
			mainimg.setImageResource(R.drawable.exaq);
			iconimg.setImageResource(R.drawable.pcb);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar18.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar18.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("19")) {
			texttitle.setText("전쟁기념관"); 
    		textyear.setText("2009.05.01"); 
    		editText1.setText("매일 : 09:00 ~ 18:00(월요일 휴관)..."); 
    		from.setText("주소 : 서울특별시 용산구 이태원로 29 전쟁기념관"); 
    		textname.setText("Photographed by imcomkorea"); 
			mainimg.setImageResource(R.drawable.jjg);
			iconimg.setImageResource(R.drawable.pcb);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar19.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar19.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("20")) {
			texttitle.setText("국립어린이민속박물관"); 
    		textyear.setText("2015.12.21"); 
    		editText1.setText("매일 : 09:00 ~ 18:00(화요일 휴무)..."); 
    		from.setText("주소 : 서울특별시 종로구 삼청로 37 국립민속박물관"); 
    		textname.setText("Photographed by dreamer"); 
			mainimg.setImageResource(R.drawable.emg);
			iconimg.setImageResource(R.drawable.dreamer);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar20.class);
					startActivity(intent2);

				}
			});
			
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar20.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("21")) {
			texttitle.setText("강서 습지생태공원"); 
    		textyear.setText("2010.10.10"); 
    		editText1.setText("운영시간 : 일출 후 ~ 일몰 전..."); 
    		from.setText("주소 : 서울특별시 강서구 개화동"); 
    		textname.setText("Photographed by Jung-nam Nam"); 
			mainimg.setImageResource(R.drawable.gss);
			iconimg.setImageResource(R.drawable.njn);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar21.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar21.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("22")) {
			texttitle.setText("디뮤지엄"); 
    		textyear.setText("2016.03.21"); 
    		editText1.setText("평일 : 10:00 ~ 18:00 운영..."); 
    		from.setText("주소 : 서울특별시 용산구 독서당로29길 5-6 Replace한남 F동"); 
    		textname.setText("Photographed by wkqkddlek"); 
			mainimg.setImageResource(R.drawable.dmu);
			iconimg.setImageResource(R.drawable.wkqkd);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar22.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar22.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("23")) {
			texttitle.setText("서울과학전시관"); 
    		textyear.setText("2014.10.07"); 
    		editText1.setText("매일 : 10:00 ~ 17:00 운영...."); 
    		from.setText("주소 : 서울특별시 관악구 낙성대로 101"); 
    		textname.setText("Photographed by 박하향"); 
			mainimg.setImageResource(R.drawable.sgh);
			iconimg.setImageResource(R.drawable.baca);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar23.class);
					startActivity(intent2);

				}
			});
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar23.class);
					startActivity(intent2);

				}
			});
		} else if (temp.equals("24")) {
			texttitle.setText("국립고궁박물관"); 
    		textyear.setText("2014.02.22"); 
    		editText1.setText("평일 : 09:00 ~ 18:00(입장 17:00까지)..."); 
    		from.setText("주소 : 서울특별시 종로구 효자로 12 국립고궁박물관"); 
    		textname.setText("Photographed by Jinho Jung"); 
			mainimg.setImageResource(R.drawable.grg);
			iconimg.setImageResource(R.drawable.jj);
			mainimg.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar24.class);
					startActivity(intent2);

				}
			});
			
			arrow_back2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					Intent intent2 = new Intent(getActivity(), actionbar24.class);
					startActivity(intent2);

				}
			});
		}
    	
    	//random end
    	
    	
        ibtn = (ImageView) getView().findViewById(R.id.imageView1);
		ibtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar.class);
				startActivity(intent2);

			}
		});

		ibtn2 = (ImageView) getView().findViewById(R.id.imageView2);
		ibtn2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar2.class);
				startActivity(intent2);
				
			}
		});

		ibtn3 = (ImageView) getView().findViewById(R.id.imageView3);
		ibtn3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar3.class);
				startActivity(intent2);

			}
		});

		ibtn4 = (ImageView) getView().findViewById(R.id.imageView4);
		ibtn4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar4.class);
				startActivity(intent2);

			}

		});

		ibtn5 = (ImageView) getView().findViewById(R.id.imageView5);
		ibtn5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar5.class);
				startActivity(intent2);

			}

		});

		ibtn6 = (ImageView) getView().findViewById(R.id.imageView6);
		ibtn6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar6.class);
				startActivity(intent2);

			}

		});

		ibtn7 = (ImageView) getView().findViewById(R.id.imageView7);
		ibtn7.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar7.class);
				startActivity(intent2);

			}

		});

		ibtn8 = (ImageView) getView().findViewById(R.id.imageView8);
		ibtn8.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar8.class);
				startActivity(intent2);

			}

		});

		ibtn9 = (ImageView) getView().findViewById(R.id.imageView9);
		ibtn9.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar9.class);
				startActivity(intent2);

			}

		});

		ibtn10 = (ImageView) getView().findViewById(R.id.imageView10);
		ibtn10.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar10.class);
				startActivity(intent2);

			}

		});

		ibtn11 = (ImageView) getView().findViewById(R.id.imageView11);
		ibtn11.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar11.class);
				startActivity(intent2);

			}

		});

		ibtn12 = (ImageView) getView().findViewById(R.id.imageView12);
		ibtn12.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar12.class);
				startActivity(intent2);

			}

		});

		ibtn13 = (ImageView) getView().findViewById(R.id.imageView13);
		ibtn13.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar13.class);
				startActivity(intent2);

			}

		});

		ibtn14 = (ImageView) getView().findViewById(R.id.imageView14);
		ibtn14.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar14.class);
				startActivity(intent2);

			}

		});

		ibtn15 = (ImageView) getView().findViewById(R.id.imageView15);
		ibtn15.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar15.class);
				startActivity(intent2);

			}

		});

		ibtn16 = (ImageView) getView().findViewById(R.id.imageView16);
		ibtn16.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar16.class);
				startActivity(intent2);

			}

		});

		ibtn17 = (ImageView) getView().findViewById(R.id.imageView17);
		ibtn17.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar17.class);
				startActivity(intent2);

			}

		});

		ibtn18 = (ImageView) getView().findViewById(R.id.imageView18);
		ibtn18.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar18.class);
				startActivity(intent2);

			}

		});

		ibtn19 = (ImageView) getView().findViewById(R.id.imageView19);
		ibtn19.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar19.class);
				startActivity(intent2);

			}

		});

		ibtn20 = (ImageView) getView().findViewById(R.id.imageView20);
		ibtn20.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar20.class);
				startActivity(intent2);

			}

		});

		ibtn21 = (ImageView) getView().findViewById(R.id.imageView21);
		ibtn21.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar21.class);
				startActivity(intent2);

			}

		});

		ibtn22 = (ImageView) getView().findViewById(R.id.imageView22);
		ibtn22.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar22.class);
				startActivity(intent2);

			}

		});

		ibtn23 = (ImageView) getView().findViewById(R.id.imageView23);
		ibtn23.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar23.class);
				startActivity(intent2);

			}

		});

		ibtn24 = (ImageView) getView().findViewById(R.id.imageView24);
		ibtn24.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent2 = new Intent(getActivity(), actionbar24.class);
				startActivity(intent2);

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
                	if (titles[0].equals("청와대사랑채")){
                		Intent intent2 = new Intent(getActivity(), actionbar.class);
    					startActivity(intent2);
                    }else if(titles[0].equals("아빠붕어낚시카페")){
                    	Intent intent2 = new Intent(getActivity(), actionbar4.class);
    					startActivity(intent2);
                    }else if(titles[0].equals("상상나라")){
                    	Intent intent2 = new Intent(getActivity(), actionbar7.class);
    					startActivity(intent2);
                    }else if(titles[0].equals("다이나믹메이즈")){
                    	Intent intent2 = new Intent(getActivity(), actionbar10.class);
    					startActivity(intent2);
                    }else if(titles[0].equals("대한민국역사박물관")){
                    	Intent intent2 = new Intent(getActivity(), actionbar13.class);
    					startActivity(intent2);
                    }else if(titles[0].equals("서울어린이대공원")){
                    	Intent intent2 = new Intent(getActivity(), actionbar16.class);
    					startActivity(intent2);
                    }else if(titles[0].equals("전쟁기념관")){
                    	Intent intent2 = new Intent(getActivity(), actionbar19.class);
    					startActivity(intent2);
                    }else if(titles[0].equals("디뮤지엄")){
                    	Intent intent2 = new Intent(getActivity(), actionbar22.class);
    					startActivity(intent2);
                    }
                }else if (position==1){
                	if (titles[1].equals("충우곤충박물관")){
                		Intent intent2 = new Intent(getActivity(), actionbar2.class);
    					startActivity(intent2);
                    }else if(titles[1].equals("여의도 물빛광장")){
                    	Intent intent2 = new Intent(getActivity(), actionbar5.class);
    					startActivity(intent2);
                    }else if(titles[1].equals("지구촌 민속 박물관")){
                    	Intent intent2 = new Intent(getActivity(), actionbar8.class);
    					startActivity(intent2);
                    }else if(titles[1].equals("키자니아")){
                    	Intent intent2 = new Intent(getActivity(), actionbar11.class);
    					startActivity(intent2);
                    }else if(titles[1].equals("동대문디자인플라자")){
                    	Intent intent2 = new Intent(getActivity(), actionbar14.class);
    					startActivity(intent2);
                    }else if(titles[1].equals("뽀로로파크")){
                    	Intent intent2 = new Intent(getActivity(), actionbar17.class);
    					startActivity(intent2);
                    }else if(titles[1].equals("국립어린이민속박물관")){
                    	Intent intent2 = new Intent(getActivity(), actionbar20.class);
    					startActivity(intent2);
                    }else if(titles[1].equals("서울과학전시관")){
                    	Intent intent2 = new Intent(getActivity(), actionbar23.class);
    					startActivity(intent2);
                    }
                }else if (position==2){
                	if (titles[2].equals("테지움")){
                		Intent intent2 = new Intent(getActivity(), actionbar3.class);
    					startActivity(intent2);
                    }else if(titles[2].equals("국립중앙박물관")){
                    	Intent intent2 = new Intent(getActivity(), actionbar6.class);
    					startActivity(intent2);
                    }else if(titles[2].equals("아쿠아플라넷63")){
                    	Intent intent2 = new Intent(getActivity(), actionbar9.class);
    					startActivity(intent2);
                    }else if(titles[2].equals("서대문자연사박물관")){
                    	Intent intent2 = new Intent(getActivity(), actionbar12.class);
    					startActivity(intent2);
                    }else if(titles[2].equals("서울애니메이션센터")){
                    	Intent intent2 = new Intent(getActivity(), actionbar15.class);
    					startActivity(intent2);
                    }else if(titles[2].equals("코엑스 아쿠아리움")){
                    	Intent intent2 = new Intent(getActivity(), actionbar18.class);
    					startActivity(intent2);
                    }else if(titles[2].equals("강서 습지생태공원")){
                    	Intent intent2 = new Intent(getActivity(), actionbar21.class);
    					startActivity(intent2);
                    }else if(titles[2].equals("국립고궁박물관")){
                    	Intent intent2 = new Intent(getActivity(), actionbar24.class);
    					startActivity(intent2);
                    }
                }
            }
        });
    }
}



