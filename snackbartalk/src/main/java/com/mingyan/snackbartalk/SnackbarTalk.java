package com.mingyan.snackbartalk;

import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class SnackbarTalk {

    public static void vShort(View view, String str){
        Snackbar.make(view, str, Snackbar.LENGTH_SHORT).show();
    }

    public static void vLong(View view, String str){
        Snackbar.make(view, str, Snackbar.LENGTH_LONG).show();
    }

    public static void vIndefinite(View view, String str){
        Snackbar.make(view, str, Snackbar.LENGTH_INDEFINITE).show();
    }

}
