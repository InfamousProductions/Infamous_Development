/*
 * Copyright 2014 Jamison904
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.infamous.site.util;

import android.content.Context;
import android.content.pm.PackageManager;


/**
 * This class miscellaneous convenience methods.
 * They may be random utils you use throughout your app multiple times.
 */
public class Utils
{
	/**
	 * Checks to see if the specified package is installed.<br>
	 * Return true if it is or false if it's not installed.
	 * 
	 * @param packageName
	 * @param context
	 * @return
	 */
	public static boolean isPackageInstalled(String packageName, Context context)
	{
		PackageManager pm = context.getPackageManager();
		
		try {
			pm.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
			return true;
		}
		catch (PackageManager.NameNotFoundException e) {
			return false;
		}
	}
}
