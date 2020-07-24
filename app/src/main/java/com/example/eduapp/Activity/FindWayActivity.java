package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eduapp.R;

public class FindWayActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView txtToolbar;
    private Button btnToolbar;
    private ImageView imgDriver, imgAdd;
    private EditText edtName, edtPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_way);
        inti();
        listener();
    }

    private void listener() {
        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FindWayActivity.this,StaffActivity.class);
                startActivity(intent);
            }
        });
    }

    private void inti() {
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Tìm Đường");
        btnToolbar= findViewById(R.id.btn_Toolbar);
        imgDriver= findViewById(R.id.iconDriver);
        imgAdd= findViewById(R.id.btn_add);
        edtName= findViewById(R.id.edtName);
        edtName= findViewById(R.id.edtPhoneNumbar);
    }
}