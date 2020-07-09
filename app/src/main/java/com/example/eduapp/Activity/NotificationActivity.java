package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
    ArrayList<Notification> arrDisplay;
    NotificationAdapter adapter;
    TextView txtNoDataSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        Mapping();

        arrNotification = new ArrayList<>();
        arrDisplay = new ArrayList<>();
        arrNotification.add(new Notification("Ghi chú của phụ huynh", "05/03/2020 05:00 PM", "Bạn có một ghi chú mới từ phụ huynh của Đức"));
        arrNotification.add(new Notification("Ghi chú của phụ huynh", "05/03/2020 05:00 PM", "Bạn có một ghi chú mới từ phụ huynh của Đức"));
        arrDisplay.addAll(arrNotification);
        adapter = new NotificationAdapter(this, R.layout.row_notification, arrDisplay);
        lvNotification.setAdapter(adapter);
        txtToolbar.setText("Lịch sử thông báo");

        Listener();

    }

    private void Listener() {
       searchNotification.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
           @Override
           public boolean onQueryTextSubmit(String query) {
               return false;
           }

           @Override
           public boolean onQueryTextChange(String newText) {
               arrDisplay.clear();
               for(int i = 0; i <  arrNotification.size(); i ++)
               {
                   if(arrNotification.get(i).getTitle().toLowerCase().contains(newText.toLowerCase()) == true)
                   {
                       arrDisplay.add(arrNotification.get(i));
                   }
               }
               adapter.notifyDataSetChanged();
               if(arrDisplay.size() == 0)
               {

               }
               return false;
           }
       });
    }

    private void Mapping() {
        searchNotification = (SearchView) findViewById(R.id.searchViewNotification);
        lvNotification = (ListView) findViewById(R.id.listViewNotification);
        txtToolbar = (TextView) findViewById(R.id.txtTiltle_Toobar);
    }
}