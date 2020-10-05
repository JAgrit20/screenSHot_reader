package com.example.screenreader_firebase2;

import android.graphics.Bitmap;
import android.view.View;

public class ScreenShot {
    public static Bitmap takeScreenShot (View v)
    {
    v.setDrawingCacheEnabled(true);
    v.buildDrawingCache(true);
    Bitmap b = Bitmap.createBitmap(v.getDrawingCache());
    v.setDrawingCacheEnabled(false);
    return b;
    }
    public static  Bitmap takeScreenShotRootView (View v) {
        return  takeScreenShot(v.getRootView());
    }
}
