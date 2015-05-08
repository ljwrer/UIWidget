package com.example.soceerlistview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
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
        Log.d("ddd",position+" "+soccer);
        View view;
        ViewHolder viewHolder;
        if(convertView==null)
        {
            view= LayoutInflater.from(getContext()).inflate(resourceID, null);
            viewHolder=new ViewHolder();
            viewHolder.number=(TextView)view.findViewById(R.id.soccer_number);
            viewHolder.name=(TextView)view.findViewById(R.id.soccer_name);
            viewHolder.img=(ImageView)view.findViewById(R.id.soccer_img);
            view.setTag(viewHolder);
        }
        else
        {
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.number.setText(soccer.getNumber()+"");
        viewHolder.name.setText(soccer.getName());
        viewHolder.img.setImageResource(soccer.getImgID());
        return view;
    }
    class ViewHolder{
        TextView number;
        TextView name;
        ImageView img;
    }
}
