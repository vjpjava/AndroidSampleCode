package com.clone.demo.shyp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class AppPreferences {
	private static final String APP_SHARED_PREFS = "com.android.prefs";
	private SharedPreferences appSharedPrefs;
	private Editor prefsEditor;

	public AppPreferences(Context context) {

		this.appSharedPrefs = context.getSharedPreferences(APP_SHARED_PREFS, Activity.MODE_PRIVATE);
		this.prefsEditor = appSharedPrefs.edit();
	}

	/**
	 * get and set the user preference value
	 * */

	// Set App Preference for Appointment date to show calendar
	public void setUserDefaults(String key,String value){
		prefsEditor.putString(key, value);
		prefsEditor.commit();
	}

    // Set App Preference for Appointment date to show calendar
    public void setUserDefaults(String key,Long value){
        prefsEditor.putLong(key, value);
        prefsEditor.commit();
    }

	public String getUserDefaults(String key){
		return appSharedPrefs.getString(key, "");
	}

    public long getUserDefaultsLong(String key){
        return appSharedPrefs.getLong(key, 0);
    }


}// end main
