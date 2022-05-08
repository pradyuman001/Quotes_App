package com.example.quotesapp.Screen.Quotes_Screen.Model;

import android.widget.ImageView;

public class Quotes_Screen_ModelData {

    String s;
    int i;

    public Quotes_Screen_ModelData(String s, int image) {

        this.s = s;
        i = image;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
