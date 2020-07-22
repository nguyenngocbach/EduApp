package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.eduapp.R;

public class WatchHealthActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView txtToolbar, titleAll;
    private Button btnToolbar, btnDone,btnSick,btMedicine,btnGrow,btnDeformation,btnBloodGroup;
    private EditText edtLastName,edtFirstName,edtBirthDay, edtID, edtSex,edtDateStart,edtall;

    //
    private  int index=0;

    private String titleSick="Ghi chú đau ốm *";
    private String textSick="không ốm đau";
    private String titleMedicine="Thuốc thang";
    private String textMedicine="không thuốc thang";
    private String titleDeformation="Ghi chú biến dạng";
    private String textDeformation="không biến dạng";
    private String titleBloodGroup="Ghi chú nhóm máu";
    private String textBloodGroup="B";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_health);
        init();
        listenner();
    }

    private void listenner() {
        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo somgthing
                finish();

            }
        });
        btnSick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
                if (index==0) return;
                setBackGround();
                index=0;
                setTitleChildren();
            }
        });
        btMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index==1) return;
                setBackGround();
                index=1;
                setTitleChildren();
            }
        });
        btnGrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo somgthing
                // switch to other activity.

            }
        });
        btnDeformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index==2) return;
                setBackGround();
                index=2;
                setTitleChildren();
            }
        });
        btnBloodGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index==3) return;
                setBackGround();
                index=3;
                setTitleChildren();
            }
        });
    }


    private void init() {
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Xem Sức Khỏe");
        btnToolbar= findViewById(R.id.btn_Toolbar);
        titleAll= findViewById(R.id.textView19);

        btnDone= findViewById(R.id.btn_done);
        btnSick= findViewById(R.id.btnSick);
        btMedicine= findViewById(R.id.btnMedicine);
        btnGrow= findViewById(R.id.btnGrow);
        btnDeformation= findViewById(R.id.btnDeformation);
        btnBloodGroup= findViewById(R.id.btnBloodGroup);

        edtLastName= findViewById(R.id.edt_lastname);
        edtFirstName= findViewById(R.id.edt_firstName);
        edtBirthDay= findViewById(R.id.edt_birthday);
        edtID= findViewById(R.id.edt_id_children);
        edtSex= findViewById(R.id.edt_sexxx);
        edtDateStart= findViewById(R.id.edt_date_start);
        edtall= findViewById(R.id.edt_sick);
        setTitleChildren();

    }

    private void setTitleChildren() {
        switch (index){
            case 0:
                titleAll.setText(titleSick);
                edtall.setText(textSick);
                btnSick.setBackgroundResource(R.drawable.custom_btn_indoor);
                break;
            case 1:
                titleAll.setText(titleMedicine);
                edtall.setText(textMedicine);
                btMedicine.setBackgroundResource(R.drawable.custom_btn_indoor);
                 break;
            case 2:
                titleAll.setText(titleDeformation);
                edtall.setText(textDeformation);
                btnDeformation.setBackgroundResource(R.drawable.custom_btn_indoor);
                break;
            case 3:
                titleAll.setText(titleBloodGroup);
                edtall.setText(textBloodGroup);
                btnBloodGroup.setBackgroundResource(R.drawable.custom_btn_indoor);
                break;
            case 4:
                btnGrow.setBackgroundResource(R.drawable.custom_btn_indoor);
                break;
        }
    }
    private void setBackGround() {
        switch (index){
            case 0:
                textSick= edtall.getText().toString().trim();
                btnSick.setBackgroundResource(R.drawable.custom_btn_outdoor);
                break;
            case 1:
                textMedicine= edtall.getText().toString().trim();
                btMedicine.setBackgroundResource(R.drawable.custom_btn_outdoor);
                break;
            case 2:
                textDeformation = edtall.getText().toString().trim();
                btnDeformation.setBackgroundResource(R.drawable.custom_btn_outdoor);
                break;
            case 3:
                textBloodGroup= edtall.getText().toString().trim();
                btnBloodGroup.setBackgroundResource(R.drawable.custom_btn_outdoor);
                break;
            case 4:
                //textBloodGroup= edtall.getText().toString().trim();
                btnGrow.setBackgroundResource(R.drawable.custom_btn_outdoor);
                return;
        }
    }
}