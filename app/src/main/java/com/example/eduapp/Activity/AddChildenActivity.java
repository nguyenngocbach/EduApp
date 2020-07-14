package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eduapp.R;

public class AddChildenActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView txtToolbar, txtProgram,txtParents;
    private Button btnBack, btnProgram, btnParents, btnSave;
    private ImageView avatar;
    private EditText edtLastName, edtFisrtName, edtBirthDay, 
            edtSex, edtBloodGroup,edtDateStart,edtCode, edtPlace,edtAllergies,edtNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_childen);
        init();
        listener();
    }

    private void init() {
        toolbar= findViewById(R.id.addChildren_toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        btnBack= findViewById(R.id.btn_Toolbar);
        txtToolbar.setText("Thêm  Trẻ");
        btnParents= findViewById(R.id.btn_parent);
        btnProgram= findViewById(R.id.btn_select_program);
        btnSave= findViewById(R.id.btn_save);
        avatar = findViewById(R.id.img_tre);

        edtLastName= findViewById(R.id.edt_lastName);
        edtFisrtName= findViewById(R.id.edt_fisrtName);
        edtBirthDay= findViewById(R.id.birth_day);
        edtSex= findViewById(R.id.edt_sex);
        edtDateStart= findViewById(R.id.date_start);
        edtCode= findViewById(R.id.edt_code);
        edtPlace= findViewById(R.id.edt_place);
        edtBloodGroup= findViewById(R.id.edt_blood_group);
        edtNote= findViewById(R.id.edt_note);
    }
    private void listener() {

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
                finish();
            }
        });

        btnParents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
            }
        });

        btnProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
            }
        });
    }

    
}