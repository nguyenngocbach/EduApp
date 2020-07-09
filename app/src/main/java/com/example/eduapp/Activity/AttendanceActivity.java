package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.eduapp.R;

public class AttendanceActivity extends AppCompatActivity {
    androidx.appcompat.widget.Toolbar toolbar;
    TextView tvTiltleToolbar;
    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        Mapping();
        Listener();
        Init();
    }

    private void Init() {
        tvTiltleToolbar.setText("Điểm danh");
    }

    private void Listener() {
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void Mapping() {
        toolbar = findViewById(R.id.tb_Forgot_Login);
        setSupportActionBar(toolbar);
        tvTiltleToolbar = findViewById(R.id.txtTiltle_Toobar);
        btn_back = findViewById(R.id.btn_Toolbar);
    }
}