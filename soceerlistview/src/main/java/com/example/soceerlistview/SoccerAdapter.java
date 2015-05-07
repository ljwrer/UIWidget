package com.example.soceerlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ray on 2015/5/7.
 */
public class SoccerAdapter extends ArrayAdapter<Soccer> {
    int resourceID;
    public SoccerAdapter(Context context, int resource, List<Soccer> objects) {
        super(context, resource, objects);
        resourceID=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Soccer soccer=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceID,null);
        TextView number=(TextView)view.findViewById(R.id.soccer_number);
        number.setText("hehe");
//        number.setText(soccer.getNumber());
        return view;
    }
}
