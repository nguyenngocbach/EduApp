package com.example.eduapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.eduapp.Class.Notification;
import com.example.eduapp.R;

import java.util.ArrayList;

public class NotificationAdapter extends BaseAdapter {

    private Activity context;
    private int layout;
    private ArrayList<Notification> arrayListNoti;

    public NotificationAdapter(Activity context, int layout, ArrayList<Notification> arrayListNoti) {
        this.context = context;
        this.layout = layout;
        this.arrayListNoti = arrayListNoti;
    }

    @Override
    public int getCount() {
        return arrayListNoti.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        TextView txtTitle,txtDateTime,txtContent;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.txtTitle = convertView.findViewById(R.id.textViewTitleNotification);
            holder.txtDateTime = convertView.findViewById(R.id.textViewDateTimeNotification);
            holder.txtContent = convertView.findViewById(R.id.textViewContentNotification);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }

        //Gán dữ liệu
        Notification noti = arrayListNoti.get(position);
        holder.txtTitle.setText(noti.getTitle());
        holder.txtDateTime.setText(noti.getDateTime());
        holder.txtContent.setText(noti.getContent());

        return convertView;
    }
}
