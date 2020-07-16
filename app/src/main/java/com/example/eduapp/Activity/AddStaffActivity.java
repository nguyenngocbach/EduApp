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

import org.w3c.dom.Text;

public class AddStaffActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView txtTitle,txtProgram, txtListProgram, txtPermission, txtListPermisson;
    private Button btnback, btnSave;
    private ImageView imgStaff;
    private EditText edtLastName, edtFirstName,edtBrithDay, edtSex,
            edtBloon,edtStart,edtCode, edtplace,edtAllergy,edtNote;
    private boolean check=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_staff);
        init();
        listener();
    }

    private void init() {
        toolbar= findViewById(R.id.toolbar_add_staff);
        setSupportActionBar(toolbar);
        txtTitle= findViewById(R.id.txtTiltle_Toobar);
        txtTitle.setText("Thêm Nhân Viên");
        txtProgram= findViewById(R.id.txt_program);
        txtListProgram= findViewById(R.id.edt_listProgram);
        txtPermission= findViewById(R.id.txtpermission);
        txtListPermisson= findViewById(R.id.txt_listPermission);

        btnback= findViewById(R.id.btn_Toolbar);
        btnSave= findViewById(R.id.btn_save);
        imgStaff= findViewById(R.id.img_staff);
        edtLastName = findViewById(R.id.edt_lastName);
        edtFirstName = findViewById(R.id.edt_fisrtName);
        edtBrithDay = findViewById(R.id.brith_of_day);
        edtSex = findViewById(R.id.edt_sex);
        edtBloon = findViewById(R.id.edt_bloob);
        edtStart = findViewById(R.id.date_start);
        edtCode = findViewById(R.id.edt_code);
        edtplace = findViewById(R.id.edt_homeplace);
        edtAllergy= findViewById(R.id.edtDiUng);
        edtNote= findViewById(R.id.edt_note);

    }

    private void listener() {
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
                finish();
            }
        });
    }

    private boolean getData() {

        String LastName =edtLastName.getText().toString();
        String FirstName =edtFirstName.getText().toString();
        String sex =edtSex.getText().toString();
        String bloodGroup =edtBloon.getText().toString();
        String dateDate =edtStart.getText().toString();
        String code =edtCode.getText().toString();
        String place =edtplace.getText().toString();
        return false;
    }

}