package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.eduapp.Class.Notification;
import com.example.eduapp.Class.NotificationAdapter;
import com.example.eduapp.R;

import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {

    TextView txtToolbar,txtNoDataSearch;
    Button btnBackToolbar;
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

        Listener();

    }

    private void Listener() {
        btnBackToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //TODO: search == null
//        if(arrNotification.size() == 2){
//            txtNoDataSearch.setVisibility(View.VISIBLE);
//        }
    }

    private void Mapping() {
        searchNotification = (SearchView) findViewById(R.id.searchViewNotification);
        lvNotification = (ListView) findViewById(R.id.listViewNotification);
        txtToolbar = (TextView) findViewById(R.id.txtTiltle_Toobar);
        btnBackToolbar = (Button) findViewById(R.id.btn_Toolbar);
        txtNoDataSearch = (TextView) findViewById(R.id.textViewNoDataNotification);
    }
}