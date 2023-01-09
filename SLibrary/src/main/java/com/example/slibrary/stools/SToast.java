package com.example.slibrary.stools;

import android.content.Context;
import android.widget.Toast;

/**
 * Create by Sws
 * on 2020/7/2 10:47.
 * <p>
 * Desc:
 */
public class SToast {
    public static void showToast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
}
