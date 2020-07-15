package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eduapp.Class.ChildrenAdapter;
import com.example.eduapp.Model.AddChildrenListener;
import com.example.eduapp.Model.ChildListener;
import com.example.eduapp.Model.Children;
import com.example.eduapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ChildrenActivity extends AppCompatActivity implements ChildListener, AddChildrenListener {

    private Toolbar toolbar;
    private TextView txtToolbar;
    private RecyclerView recyclerView;
    private List<Children> mChildren;
    private ChildrenAdapter adapter;
    private Button btnXepLop, btnGiaoBe,btnGiaoLop, btnBack;
    private Button btnDLGiong,btnDLResume, btnDLHealth,btnDLAppreciate;
    private FloatingActionButton btnThem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tre);

        toolbar= findViewById(R.id.toolbar_children);
        setSupportActionBar(toolbar);
        btnBack= findViewById(R.id.btn_Toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Trẻ");
        btnThem= findViewById(R.id.btn_them);
        addData();
        recyclerView= findViewById(R.id.list_treActivity);
        btnXepLop= findViewById(R.id.btnChuaXL);
        btnGiaoBe= findViewById(R.id.btnMauBe);
        btnGiaoLop= findViewById(R.id.btnMauLon);
        adapter= new ChildrenAdapter(this, mChildren,this);
        recyclerView.setAdapter(adapter);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo some thing
                startActivity(new Intent(ChildrenActivity.this,AddChildenActivity.class));
            }
        });

    }

    private void addData() {
        mChildren = new ArrayList<>();
        mChildren.add(new Children(1,"Nguyễn A","dsdsdsds"));
        mChildren.add(new Children(1,"Nguyễn B","dsdsdsds"));
        mChildren.add(new Children(1,"Nguyễn C","dsdsdsds"));
        mChildren.add(new Children(1,"Nguyễn D","dsdsdsds"));
        mChildren.add(new Children(1,"Nguyễn E","dsdsdsds"));
        mChildren.add(new Children(1,"Nguyễn G","dsdsdsds"));
        mChildren.add(new Children(1,"Nguyễn H","dsdsdsds"));
        mChildren.add(new Children(1,"Nguyễn I","dsdsdsds"));
        mChildren.add(new Children(1,"Nguyễn L","dsdsdsds"));
    }

    @Override
    public void getChilden(Children tre) {
        Dialog dialog= new Dialog(this);
        dialog.setContentView(R.layout.dialog_childran_listener);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        btnDLGiong= dialog.findViewById(R.id.going);
        btnDLResume= dialog.findViewById(R.id.btn_resume);
        btnDLHealth= dialog.findViewById(R.id.btn_health);
        btnDLAppreciate= dialog.findViewById(R.id.btn_appreciate);
        dialog.show();
        DialogListener();
    }

    private void DialogListener() {
        btnDLAppreciate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
            }
        });
        btnDLHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
            }
        });

        btnDLResume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
                startActivity(new Intent(ChildrenActivity.this, ChildrenProFilesActivity.class));
            }
        });

        btnDLGiong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
            }
        });
    }
}