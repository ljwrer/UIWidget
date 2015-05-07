package com.example.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Ray on 2015/5/5.
 */
public class TitleLayout extends LinearLayout{
    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, null);
        Button buttonBack=(Button)findViewById(R.id.button_1);
        Button buttonEdit=(Button)findViewById(R.id.button_2);
        buttonBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        buttonEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText((Activity)getContext(),"you clicked edit button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
