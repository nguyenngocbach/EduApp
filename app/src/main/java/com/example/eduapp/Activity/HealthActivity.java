package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eduapp.adapter.HealthChildrensAdapter;
import com.example.eduapp.Class.Children;
import com.example.eduapp.Model.HealthListenner;
import com.example.eduapp.R;

import java.util.ArrayList;
import java.util.List;

public class HealthActivity extends AppCompatActivity implements HealthListenner {

    private Toolbar toolbar;
    private TextView txtToolbar;
    private Button btnToolbar;
    private RecyclerView recyclerView;
    private HealthChildrensAdapter adapter;
    private List<Children> mChildren;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
        init();
        listenner();
    }

    private void listenner() {
        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void init() {
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        btnToolbar= findViewById(R.id.btn_Toolbar);
        recyclerView= findViewById(R.id.recycler_childrens);
        addData();
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter= new HealthChildrensAdapter(this,mChildren,this);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        mChildren= new ArrayList<>();
        mChildren.add(new Children(111,"Ngyên Van A","",false));
        mChildren.add(new Children(112,"Ngyên Van B","",false));
        mChildren.add(new Children(113,"Ngyên Van C","",false));
        mChildren.add(new Children(114,"Ngyên Van D","",false));
        mChildren.add(new Children(115,"Ngyên Van E","",false));
    }

    @Override
    public void reviewHealthChildren(Children children) {
        // todo something
        Intent intent= new Intent(HealthActivity.this,WatchHealthActivity.class);
        // transfer into intent
        //
        startActivity(intent);
    }

    @Override
    public void updateHealthChildren(Children children) {
        // todo something
    }

    @Override
    public void deleteChildren(Children children) {
        // todo something
    }
}