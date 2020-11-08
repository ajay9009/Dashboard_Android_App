package com.example.dashboard.HelperClasses;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class CategoriesHelperClass {
    int image;
    String title, desc;

    public CategoriesHelperClass(GradientDrawable gradient1, int image, String title, String desc) {
        this.image = image;
        this.title = title;
        this.desc  = desc;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
    public Drawable getGradient() {
        return null;
    }
}
