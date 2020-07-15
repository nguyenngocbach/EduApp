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

public class StaffInformationActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView txtTitle,txtProgram, txtListProgram, txtPermission, txtListPermisson;
    private Button btnBack;
    private ImageView imgStaff,btnUpdate;
    private EditText edtLastName, edtFirstName,edtBrithDay, edtSex,
            edtBloon,edtStart,edtCode, edtplace,edtAllergy,edtNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_information);
        init();
        listener();
    }


    private void init() {
        toolbar= findViewById(R.id.toolbar_staff_inforamtion);
        setSupportActionBar(toolbar);
        txtTitle= findViewById(R.id.txtTiltle_Toobar);
        txtTitle.setText("Thông Tin Nhân Viên");
        btnBack= findViewById(R.id.btn_Toolbar);

        imgStaff= findViewById(R.id.img_staff);
        edtLastName = findViewById(R.id.edt_lastName);
        edtFirstName = findViewById(R.id.edt_fisrtName);
        edtBrithDay = findViewById(R.id.birthday);
        edtSex = findViewById(R.id.edt_sex);
        edtBloon = findViewById(R.id.edt_bloolGroup);
        edtStart = findViewById(R.id.edt_dateStart);
        edtCode = findViewById(R.id.edt_code);
        edtplace = findViewById(R.id.edt_place);
        edtAllergy= findViewById(R.id.editTextTextPersonName7);
        edtNote= findViewById(R.id.edt_note);

        txtProgram= findViewById(R.id.txt_program);
        txtListProgram= findViewById(R.id.txt_program);
        txtPermission= findViewById(R.id.permisson);
        txtListPermisson= findViewById(R.id.txt_listPermission);

        btnUpdate= findViewById(R.id.btn_update);

    }

    private void listener() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
            }
        });
    }

}