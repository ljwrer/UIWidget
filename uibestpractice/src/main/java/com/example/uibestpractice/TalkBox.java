package com.example.uibestpractice;

/**
 * Created by Ray on 2015/5/8.
 */
public class TalkBox {
    public static final  int SEND_MESSAGE=0;
    public static final  int RECEIVE_MESSAGE=1;
    String message;
    int status;

    public TalkBox(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
