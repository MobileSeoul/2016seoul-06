/*******************************************************************************
 * Copyright 2011, 2012 Chris Banes.
//This is source code of favorite. Copyright?��. Tarks. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.cym5240.kis.pulltorefresh.library.internal;

import android.view.View;

/**
 * Interface that allows PullToRefreshBase to hijack the call to
 * AdapterView.setEmptyView()
 * 
 * @author chris
 */
public interface EmptyViewMethodAccessor {

	/**
	 * Calls upto AdapterView.setEmptyView()
	 * 
	 * @param emptyView - to set as Empty View
	 */
	public void setEmptyViewInternal(View emptyView);

	/**
	 * Should call PullToRefreshBase.setEmptyView() which will then
	 * automatically call through to setEmptyViewInternal()
	 * 
	 * @param emptyView - to set as Empty View
	 */
	public void setEmptyView(View emptyView);

}