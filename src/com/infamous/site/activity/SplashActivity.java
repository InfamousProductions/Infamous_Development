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

package com.infamous.site.activity; 

import android.app.Activity; 
import android.content.Intent; 
import android.os.Bundle; 
import android.os.Handler; 
import android.view.Window;
import com.infamous.site.R;

public class SplashActivity extends Activity { 
      
     private final int SPLASH_DISPLAY_LENGHT = 4000; 
     private Handler mHandler; 

     /** Called when the activity is first created. */ 
     @Override 
     public void onCreate(Bundle icicle) { 
          super.onCreate(icicle); 
          
          //no title bar
          requestWindowFeature(Window.FEATURE_NO_TITLE);
          //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
          
          setContentView(R.layout.activity_splash); 
          mHandler = new Handler();
     }
     
     public void onStart() {
         super.onStart();
         mHandler.postDelayed(new Runnable() {

            public void run() {
                // TODO Auto-generated method stub
                Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class); 
                SplashActivity.this.startActivity(mainIntent); 
                SplashActivity.this.finish();
                
            }}, SPLASH_DISPLAY_LENGHT);
 
     }
     
}