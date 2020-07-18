package com.example.eduapp.Activity;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.eduapp.R;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    androidx.appcompat.widget.Toolbar toolbar;
    Button btnToolbarBell;
    Dialog dialogpicture;
    LinearLayout lv_DiemDanh;
    ImageView imageView_Ava;
    TextView tvBack_Dialog_Picture;
    LinearLayout actionChildrens, actionStaff, actionSchool, activeTitle,actionSleeping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Anhxa();
        Listener();
    }


    private void Listener() {
        imageView_Ava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogpicture.show();
            }
        });
        btnToolbarBell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, NotificationActivity.class);
                startActivity(intent);
            }
        });
        lv_DiemDanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AttendanceActivity.class);
                startActivity(intent);
            }
        });
        tvBack_Dialog_Picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogpicture.cancel();
            }
        });

        actionChildrens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,ChildrenActivity.class));
            }
        });
        actionStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,StaffActivity.class));
            }
        });
        actionSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,SchoolActivity.class));
            }
        });

        activeTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,TitleActivity.class));
            }
        });
        actionSleeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,SleepActivity.class));
            }
        });
    }

    private void Anhxa() {
        Dialog_Map();
        toolbar =  findViewById(R.id.tb_Home);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawerLayoutMain);
        navigationView = findViewById(R.id.nv_profile);
        navigationView.bringToFront();
        View v = navigationView.getHeaderView(0);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(HomeActivity.this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        btnToolbarBell = findViewById(R.id.btnToolBarBell);
        lv_DiemDanh = findViewById(R.id.lv_DiemDanh);
        imageView_Ava = v.findViewById(R.id.imageViewAvata);
        //
        actionChildrens= findViewById(R.id.children_group);
        actionStaff= findViewById(R.id.staff_group);
        actionSchool= findViewById(R.id.btn_school);
        activeTitle= findViewById(R.id.title_activity);
        actionSleeping= findViewById(R.id.sleeping);
    }

    private void Dialog_Map() {
        dialogpicture = new Dialog(HomeActivity.this);
        dialogpicture.setContentView(R.layout.custom_dialog_picture);
        dialogpicture.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        tvBack_Dialog_Picture = dialogpicture.findViewById(R.id.tv_Back_Dialog_Picture);
    }

}