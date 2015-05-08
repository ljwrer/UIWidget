package com.example.uibestpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ray on 2015/5/8.
 */
public class TalkBoxAdapter extends ArrayAdapter<TalkBox>{
    int resourceID;
    public TalkBoxAdapter(Context context, int resource, List<TalkBox> objects) {
        super(context, resource, objects);
        resourceID=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TalkBox talkBox=getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView==null)
        {
            view= LayoutInflater.from(getContext()).inflate(resourceID,null);
            viewHolder=new ViewHolder();
            switch (talkBox.getStatus()){
                case TalkBox.SEND_MESSAGE:
                    viewHolder.sendTextView=(TextView)view.findViewById(R.id.send_message);
                    viewHolder.receiveTextView=(TextView)view.findViewById(R.id.receive_message);
                    viewHolder.sendTextView.setText(talkBox.getMessage());
                    viewHolder.receiveTextView.setVisibility(View.GONE);
                    break;
                case TalkBox.RECEIVE_MESSAGE:
                    viewHolder.receiveTextView=(TextView)view.findViewById(R.id.receive_message);
                    viewHolder.sendTextView=(TextView)view.findViewById(R.id.send_message);
                    viewHolder.receiveTextView.setText(talkBox.getMessage());
                    viewHolder.sendTextView.setVisibility(View.GONE);
                    break;
            }
            view.setTag(viewHolder);
        }
        else
        {
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        return view;
    }
    class ViewHolder{
        TextView sendTextView;
        TextView receiveTextView;
    }
}
