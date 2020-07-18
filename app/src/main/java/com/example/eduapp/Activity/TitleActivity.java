package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eduapp.Class.ChildrenAdapter;
import com.example.eduapp.Model.ChildListener;
import com.example.eduapp.Model.Children;
import com.example.eduapp.R;

import java.util.List;

public class TitleActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView txtToolbar,txtPickChildrens, txtPickTitles;
    private Button btnBack, btnPickChildrens, btnPickTitle, btnSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
        init();
        listener();
    }

    private void listener() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
                finish();
            }
        });
        btnPickTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo somgthing
                startActivity(new Intent(TitleActivity.this,TypeTitleActivity.class));
            }
        });
        btnPickChildrens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
                startActivity(new Intent(TitleActivity.this,PickChildrenActivity.class));
            }
        });
    }

    private void init() {
        toolbar= findViewById(R.id.toolbar_TitleActivity);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Danh Hiệu");
        btnBack = findViewById(R.id.btn_Toolbar);
        txtPickChildrens= findViewById(R.id.txt_pick_children);
        txtPickTitles= findViewById(R.id.txt_pick_title);
        btnPickChildrens= findViewById(R.id.btn_pick_childrens);
        btnPickTitle= findViewById(R.id.btn_pick_title);
        btnSend= findViewById(R.id.btn_confirm);
    }

}