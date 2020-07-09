package com.example.eduapp.Activity;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

<<<<<<< HEAD
import android.content.Intent;
=======
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
>>>>>>> 564da109dc5212259a1be1abcb5674ffedda344c
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Anhxa();
        Listener();
<<<<<<< HEAD
    }
=======
>>>>>>> 564da109dc5212259a1be1abcb5674ffedda344c

    private void Listener() {
        btnToolbarBell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,NotificationActivity.class);
                startActivity(intent);
            }
        });
    }

    private void Listener() {
        imageView_Ava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogpicture.show();
            }
        });
    }

    private void Anhxa() {
        dialogpicture = new Dialog(HomeActivity.this);
        dialogpicture.setContentView(R.layout.custom_dialog_picture);
        dialogpicture.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
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
    }

}