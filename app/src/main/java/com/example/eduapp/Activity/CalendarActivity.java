package com.example.eduapp.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eduapp.R;

public class CalendarActivity extends AppCompatActivity {

    private static final int CODE_CALENDER =101 ;
    private Toolbar toolbar;
    private TextView txtToolbar,txtNull;
    private Button btnToolbar;
    private ImageView imgAdd;
    private RecyclerView recyclerEvents;
    private Button btnAll,btnBirthDay, btnEvent, btnAllllll;
    private int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        init();
        listener();
    }

    private void listener() {
        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBackGroud(0);
                btnAll.setBackgroundResource(R.drawable.custom_btn_indoor);
            }
        });
        btnBirthDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnBirthDay.setBackgroundResource(R.drawable.custom_btn_indoor);
                setBackGroud(1);
            }
        });
        btnEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnEvent.setBackgroundResource(R.drawable.custom_btn_indoor);
                setBackGroud(2);
            }
        });
        btnAllllll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnAllllll.setBackgroundResource(R.drawable.custom_btn_indoor);
                setBackGroud(3);
            }
        });
        imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(CalendarActivity.this,NewEventActivity.class);
                startActivityForResult(intent,CODE_CALENDER);
            }
        });
    }

    private void setBackGroud(int i) {
        if (i==index) return;
        switch (index){
            case 0:
                btnAll.setBackgroundResource(R.drawable.custom_btn_outdoor);
                break;
            case 1:
                btnBirthDay.setBackgroundResource(R.drawable.custom_btn_outdoor);
                break;
            case 2:
                btnEvent.setBackgroundResource(R.drawable.custom_btn_outdoor);
                break;
            case 3:
                btnAllllll.setBackgroundResource(R.drawable.custom_btn_outdoor);
                break;
        }
        index=i;
    }

    private void init() {
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Lịch");
        btnToolbar= findViewById(R.id.btn_Toolbar);
        btnAll= findViewById(R.id.btnAll);
        btnBirthDay= findViewById(R.id.btnBirthDay);
        btnEvent= findViewById(R.id.btnEvent);
        btnAllllll= findViewById(R.id.btnAllllll);
        imgAdd= findViewById(R.id.btn_add);
        txtNull= findViewById(R.id.txt_text_null);
        recyclerEvents= findViewById(R.id.recycler_calender);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}