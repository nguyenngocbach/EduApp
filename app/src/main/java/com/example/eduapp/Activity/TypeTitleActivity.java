package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eduapp.R;

public class TypeTitleActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView txtToolbar;
    private Button btnBack, btnBrave,btnCreative,btnHelpful, btnAssist,btnOnTime, btnLearnQuickly,btnDone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_title);
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

        btnBrave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
            }
        });

        btnCreative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
            }
        });
        btnHelpful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
            }
        });

        btnAssist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
            }
        });

        btnOnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
            }
        });

        btnLearnQuickly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
            }
        });

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
                finish();
            }
        });
    }

    private void init() {
        toolbar= findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        btnBack=findViewById(R.id.btn_Toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Chọn   Loại Danh Hiệu ");
        btnBrave = findViewById(R.id.btnBrave);
        btnCreative = findViewById(R.id.btnCreative);
        btnHelpful = findViewById(R.id.btnhelpful);
        btnAssist = findViewById(R.id.btn_asisten);
        btnOnTime = findViewById(R.id.btn_onTime);
        btnLearnQuickly = findViewById(R.id.btn_learnQuickly);
        btnDone =findViewById(R.id.button3);

    }
}