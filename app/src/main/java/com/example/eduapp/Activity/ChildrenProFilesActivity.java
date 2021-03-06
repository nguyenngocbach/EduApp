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

public class ChildrenProFilesActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button btnBack;
    private TextView txtToolbar,txtProgram;
    private ImageView avatar , imgParents;
    private EditText edtLastName, edtFisrtName, edtBirthDay,
            edtSex, edtBloodGroup,edtDateStart,edtCode, edtPlace,edtAllergies,edtNote, edtLastNameParents,edFirstNameParents,
            edtReletive, edtPhone, edtAddress;
    private ImageView imgUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children_pro_files);
        init();
        listenner();

    }


    private void init() {
        toolbar= findViewById(R.id.addChildren_toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtProgram= findViewById(R.id.txt_program);
        btnBack= findViewById(R.id.btn_Toolbar);
        txtToolbar.setText("Thông Tin Trẻ");
        avatar = findViewById(R.id.img_tre);
        imgParents= findViewById(R.id.img_parents);
        edtLastName= findViewById(R.id.edt_lastName);
        edtFisrtName= findViewById(R.id.edt_fisrtName);
        edtBirthDay= findViewById(R.id.birth_day);
        edtSex= findViewById(R.id.edt_sex);
        edtDateStart= findViewById(R.id.date_start);
        edtCode= findViewById(R.id.edt_code);
        edtPlace= findViewById(R.id.edt_place);
        edtBloodGroup= findViewById(R.id.edt_blood_group);
        edtNote= findViewById(R.id.edt_note);
        edtLastNameParents =findViewById(R.id.edt_lastNameParents);
        edtLastNameParents =findViewById(R.id.edt_fisrtNameParents);
        edtPhone =findViewById(R.id.edt_sdt);
        edtAddress =findViewById(R.id.edt_email_address);
        imgUpdate= findViewById(R.id.btn_Update);
    }

    private void listenner() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        imgUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ChildrenProFilesActivity.this, UpdateChildrenActivity.class);
                //intent.putExtra();
                startActivity(intent);
            }
        });
    }
}