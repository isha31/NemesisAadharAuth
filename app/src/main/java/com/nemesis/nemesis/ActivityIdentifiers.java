package com.nemesis.nemesis;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class ActivityIdentifiers {

    private static final String CURRENT_SCREEN="CURRENT_SCREEN";
    public static final int INVIGILATOR_AUTH=446;
    public static final int CANDIDATE_AUTH=447;
    public static final int BARCODE_READER_CODE=1;
    public static final String UID="AADHAR_NUMBER";
    public static final int FINGERPRINT_ERROR=45;
    public static final String AUTH_RESULT="AUTH_RESULT";


    public static final int INVIGILATOR_LOGIN_SCREEN=1;
    public static final int CANDIDATE_LOGIN_SCREEN=2;
    public static final int CANDIDATE_AUTH_SCREEN=3;
    public static final int CANDIDATE_KYC_SCREEN=4;
    public static final int BIO_SUCCESS=123;
    public static final int BIO_FAILURE=124;
    public static final int FINGERPRINT_SCAN_CODE=23;

    public static final int CANDIDATE_LIST_SCREEN=5;

    public static final void setCurrentScreen(Context context,int screen){

        SharedPreferences.Editor editor= PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putInt(CURRENT_SCREEN,screen);
        editor.apply();
    }
    public static final int getCurrentScreen(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(CURRENT_SCREEN,0);
    }

}
