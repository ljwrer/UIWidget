package com.example.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ray on 2015/5/6.
 */
public class SoccerAdapter extends ArrayAdapter{
    private int resourceId;
    public SoccerAdapter(Context context, int resource, List<SoccerPlayer> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SoccerPlayer soccerPlayer = (SoccerPlayer)getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView soccerPic=(ImageView)view.findViewById(R.id.soccer_pic);
        TextView soccerName=(TextView)view.findViewById(R.id.soccer_name);
        soccerPic.setImageResource(soccerPlayer.getPicPath());
        soccerName.setText(soccerPlayer.getName());
        return view;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }

}
