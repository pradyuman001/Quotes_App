package com.example.quotesapp.Screen.Home_Screen.Model;

public class Home_Screen_ModelData {

    String quotes;
    int img;

    public Home_Screen_ModelData(String quotes, int img) {
        this.quotes = quotes;
        this.img = img;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }


    public String quotes() {

        return  quotes;

    }

    public int img() {

        return  img;

    }
}
