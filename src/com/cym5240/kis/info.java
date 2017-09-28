//This is source code of favorite. Copyright?ìí. Tarks. All Rights Reserved.
package com.cym5240.kis;

import android.os.Bundle;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.cym5240.kis.R;

public class info extends SherlockActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
      //?ï°?ÖòÎ∞îÎ∞±Î≤ÑÌäºÍ∞??†∏?ò§Í∏?
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); 
       
    }
      //ÎπΩÎ∞±?Ç§ ?ÉÅ?ã®?ï°?ÖòÎ∞?
 	   @Override
 	    public boolean onOptionsItemSelected(MenuItem item) {
 	    switch (item.getItemId()) {
 	        case android.R.id.home:
 	            onBackPressed();
 	            return true;
 	        default:
 	            return super.onOptionsItemSelected(item);
 	    }
 	    
 	    
 	   }
    
}
