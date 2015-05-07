package com.example.listviewtest;

/**
 * Created by Ray on 2015/5/6.
 */
public class SoccerPlayer {
    String name;
    int picPath;

    public String getName() {
        return name;
    }

    public int getPicPath() {
        return picPath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPicPath(int picPath) {
        this.picPath = picPath;
    }

    public SoccerPlayer(String name, int picPath) {
        this.name = name;
        this.picPath = picPath;
    }
}
