package com.example.soceerlistview;

/**
 * Created by Ray on 2015/5/7.
 */
public class Soccer {
    int number;
    int imgID;
    String name;

    public Soccer(int number, int imgID, String name) {
        this.number = number;
        this.imgID = imgID;
        this.name = name;

    }

    public int getNumber() {
        return number;
    }

    public int getImgID() {
        return imgID;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
