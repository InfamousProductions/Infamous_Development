package com.infamous.site.fragment;


import java.util.ArrayList;
import java.util.List;

import view.ScrollGridView;
import com.infamous.site.R;
import com.infamous.site.*;
import com.infamous.site.activity.AboutThemeActivity;
import com.infamous.site.activity.ApplyLauncherMain;
import com.infamous.site.activity.RequestActivity;
import com.infamous.site.activity.Wallpaper;
import com.infamous.site.activity.*;
import com.infamous.site.adapter.*;
import com.infamous.site.adapter.ExtrasAdapter;
import com.infamous.site.adapter.ExtrasAdapter.AdapterItem;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.actionbarsherlock.app.SherlockFragment;
import com.infamous.site.activity.*;
import android.net.*;


/** 
 ** Some lines may be off a few numbers
 ** Just be sure you're in the general area
 **/

public class ExtrasFragment extends SherlockFragment{
	
	ScrollGridView gridView;
	final List<AdapterItem> listOfStuff = new ArrayList<AdapterItem>();
	
	public static final int ONE = 0;
	public static final int TWO = 1;
	public static final int THREE = 2;
	public static final int FOUR = 3;
	public static final int FIVE = 4;
	public static final int SIX = 5;

	// This is the background layout that gets inflated behind the list view
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.gridview_behind2, null);
	}
	
	// Starts when the MainFragment is launched
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
	/* 
	 * This part does two things
	 * First - It counts the number of items and displays them
	 * Second - It displays the text in the "" which is a brief description of that item
	 * Removing any of these will remove that item but be sure to edit ALL the cases below or your list
	 * won't line up properly
	 */
		
		/**
		 ** NOTE: in order to have different views on tablet vs phones, I added an if/else statement to this
		 ** section. Be sure to remove BOTH parts to remove it from phones and tablets. Failure to remove both
		 ** parts will result in the app functioning differently on phones and tablets.
		 **/

		/* 
		 * Sets the Title and description text for each GridView item
		 * Check res/values/strings.xml to change text to whatever you want each GridView to say
		 */
		boolean tabletSize = getResources().getBoolean(R.bool.isTablet);
		if (tabletSize) {
			gridView = (ScrollGridView)getView().findViewById(R.id.grid);
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.title_icons), 
					getResources().getString (R.string.desc_icons), 0));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.title_downloads), 
					getResources().getString (R.string.desc_downloads), 1));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.title_pro), 
					getResources().getString (R.string.desc_pro), 2));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.title_five), 
					getResources().getString (R.string.desc_four), 3));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.title_four), 
					getResources().getString (R.string.desc_five), 4));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.title_tools), 
					getResources().getString (R.string.desc_tools), 5));
			
		} else {
			gridView = (ScrollGridView)getView().findViewById(R.id.grid);
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.title_icons), 
					getResources().getString (R.string.desc_icons), 0));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.title_downloads), 
					getResources().getString (R.string.desc_downloads), 1));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.title_pro), 
					getResources().getString (R.string.desc_pro), 2));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.title_store), 
					getResources().getString (R.string.desc_store), 3));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.title_donate), 
					getResources().getString (R.string.desc_donate), 4));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.title_tools), 
					getResources().getString (R.string.desc_tools), 5)); 
			
		}

		/**
		 ** NOTE: in order to have different views on tablet vs phones, I added an if/else statement to this
		 ** section. Be sure to remove both parts to remove it from phones and tablets. Failure to remove both
		 ** parts will result in the app functioning differently on phones and tablets.
		 **/
			ExtrasAdapter adapter = new ExtrasAdapter(getActivity(), listOfStuff);
	
			gridView.setAdapter(adapter);
			gridView.setExpanded(true);
			gridView.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
					
					@SuppressWarnings("unused")
					MainFragment gridContentT = null;
					
					boolean tabletSize = getResources().getBoolean(R.bool.isTablet);
					if (tabletSize) { // For TABLETS
						
						switch (position) {
							case ONE:
								Intent launcher2 = new Intent(getSherlockActivity(), ApplyLauncherMain.class);
								startActivity(launcher2);
								break;
							case TWO:
								Intent two = new Intent(Intent.ACTION_VIEW).setData(Uri.parse
								("http://infamousdevelopment.com/Downloads/"));
								startActivity(two);
								break;
							case THREE:
								Intent three = new Intent(Intent.ACTION_VIEW).setData(Uri.parse
								("http://infamousgit.com/"));
								startActivity(three);
								break;
							case FOUR:
								Intent four = new Intent(Intent.ACTION_VIEW).setData(Uri.parse
								("http://goo.gl/zsjREb"));
								startActivity(four);
								break;
							case FIVE:
								Intent five = new Intent(Intent.ACTION_VIEW).setData(Uri.parse
								("http://goo.gl/Gw2Lf9"));
								startActivity(five);
								break;
							case SIX:
								Intent six = new Intent(getSherlockActivity(), ToolsActivity.class);
								startActivity(six);
								break;
						}	
				} else {	// For PHONES
					switch (position) {
						case ONE:
							Intent launcher2 = new Intent(getSherlockActivity(), ApplyLauncherMain.class);
							startActivity(launcher2);
							break;
						case TWO:
							Intent two = new Intent(Intent.ACTION_VIEW).setData(Uri.parse
							("http://infamousdevelopment.com/Downloads/"));
							startActivity(two);
							break;
						case THREE:
							Intent three = new Intent(Intent.ACTION_VIEW).setData(Uri.parse
							("http://infamousgit.com"));
							startActivity(three);
							break;
						case FOUR:
							Intent four = new Intent(Intent.ACTION_VIEW).setData(Uri.parse
							("http://goo.gl/zsjREb"));
							startActivity(four);
							break;
						case FIVE:
							Intent five = new Intent(Intent.ACTION_VIEW).setData(Uri.parse
							("http://goo.gl/Gw2Lf9"));
							startActivity(five);
							break;
						case SIX:
							Intent six = new Intent(getSherlockActivity(), ToolsActivity.class);
							startActivity(six);
							break;
		        		
					}
				}
				}	
			});
			
	}
}
