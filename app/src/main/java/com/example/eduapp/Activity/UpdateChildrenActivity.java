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

import com.example.eduapp.Activity.ChildrenProFilesActivity;
import com.example.eduapp.R;

public class UpdateChildrenActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button btnBack, btnUpdate;
    private TextView txtToolbar,txtProgram;
    private ImageView avatar , imgParents;
    private EditText edtLastName, edtFisrtName, edtBirthDay,
            edtSex, edtBloodGroup,edtDateStart,edtCode, edtPlace,edtAllergies,edtNote, edtLastNameParents,edtFirstNameParents,
            edtReletive, edtPhone, edtAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_children);
        init();
        fillData();
        listenner();
    }


    private void init() {
        toolbar= findViewById(R.id.addChildren_toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtProgram= findViewById(R.id.txt_program);
        btnBack= findViewById(R.id.btn_Toolbar);
        btnUpdate= findViewById(R.id.btn_update);
        txtToolbar.setText("Thông Tin Trẻ");
        avatar = findViewById(R.id.img_tre);
        imgParents= findViewById(R.id.img_parents);
        edtLastName= findViewById(R.id.edt_lastName);
        edtFisrtName= findViewById(R.id.edt_fisrtName);
        edtBirthDay= findViewById(R.id.birth_day);
        edtSex= findViewById(R.id.edt_sex);
        edtAllergies= findViewById(R.id.edt_allergies);
        edtDateStart= findViewById(R.id.date_start);
        edtCode= findViewById(R.id.edt_code);
        edtPlace= findViewById(R.id.edt_place);
        edtBloodGroup= findViewById(R.id.edt_blood_group);
        edtNote= findViewById(R.id.edt_note);
        edtLastNameParents =findViewById(R.id.edt_lastNameParents);
        edtFirstNameParents =findViewById(R.id.edt_fisrtNameParents);
        edtReletive = findViewById(R.id.edt_relative);
        edtPhone =findViewById(R.id.edt_sdt);
        edtAddress =findViewById(R.id.edt_email_address);
    }

    private void fillData() {
        Intent intent= getIntent();
        // todo something
        edtLastName.setText(intent.getStringExtra(""));
        edtFisrtName.setText(intent.getStringExtra(""));
        edtBirthDay.setText(intent.getStringExtra(""));
        edtSex.setText(intent.getStringExtra(""));
        edtDateStart.setText(intent.getStringExtra(""));
        edtCode.setText(intent.getStringExtra(""));
        edtPlace.setText(intent.getStringExtra(""));
        edtBloodGroup.setText(intent.getStringExtra(""));
        edtNote.setText(intent.getStringExtra(""));
        edtLastNameParents.setText(intent.getStringExtra(""));
        edtLastNameParents.setText(intent.getStringExtra(""));
        edtReletive.setText(intent.getStringExtra(""));
        edtPhone.setText(intent.getStringExtra(""));
        edtAddress.setText(intent.getStringExtra(""));
    }

    private void listenner() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
                //Intent intent= new Intent(ChildrenProFilesActivity.this, UpdateChildrenActivity.class);
                //intent.putExtra();
                //startActivity(intent);
                finish();
            }
        });
    }
}