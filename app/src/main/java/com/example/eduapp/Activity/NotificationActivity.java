package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.eduapp.Class.Notification;
import com.example.eduapp.Class.NotificationAdapter;
import com.example.eduapp.R;

import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {

    TextView txtToolbar;
    SearchView searchNotification;
    ListView lvNotification;
    ArrayList<Notification> arrNotification;
    NotificationAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        Mapping();

        arrNotification = new ArrayList<>();
        arrNotification.add(new Notification("Ghi chú của phụ huynh","05/03/2020 05:00 PM","Bạn có một ghi chú mới từ phụ huynh của Đức"));
        arrNotification.add(new Notification("Ghi chú của phụ huynh","05/03/2020 05:00 PM","Bạn có một ghi chú mới từ phụ huynh của Đức"));
        adapter = new NotificationAdapter(this,R.layout.row_notification,arrNotification);
        lvNotification.setAdapter(adapter);
        txtToolbar.setText("Lịch sử thông báo");

    }

    private void Mapping() {
        searchNotification = (SearchView) findViewById(R.id.searchViewNotification);
        lvNotification = (ListView) findViewById(R.id.listViewNotification);
        txtToolbar = (TextView) findViewById(R.id.txtTiltle_Toobar);
    }
}