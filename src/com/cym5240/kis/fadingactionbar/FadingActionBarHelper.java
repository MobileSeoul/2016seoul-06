/*//This is source code of favorite. Copyright?��. Tarks. All Rights Reserved.
 * Copyright (C) 2013 Manuel Peinado
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cym5240.kis.fadingactionbar;

import com.cym5240.kis.page.ProfileActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

public class FadingActionBarHelper extends FadingActionBarHelperBase {

    private ActionBar mActionBar;
    private Context mContext = null;
    

    @SuppressLint("NewApi")
    @Override
    public void initActionBar(Activity activity) {
        mActionBar = activity.getActionBar();
        super.initActionBar(activity);
    }
    
    @Override
    public void initContext(Context context) {
    	   this.mContext = context;
    	   super.initContext(context);
       
    
    }
    
    public void getDocList(String number) {
       ((ProfileActivity) mContext).getDocList(number);
       return;
    }
 

    @SuppressLint("NewApi")
    @Override
    protected int getActionBarHeight() {
        return mActionBar.getHeight();
    }

    @Override
    protected boolean isActionBarNull() {
        return mActionBar == null;
    }

    @SuppressLint("NewApi")
    @Override
    protected void setActionBarBackgroundDrawable(Drawable drawable) {
        mActionBar.setBackgroundDrawable(drawable);
    }
}