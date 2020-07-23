package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eduapp.R;

public class TypeCommunicationActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_DATA_TYPECOMUMICATION="type_comumication";

    private Toolbar toolbar;
    private TextView txtToolbar;
    private Button  btnToolbar, btnDone,btnTypeCommunication,
            btnBirthDay,btnHoliday,btnHomeWork,btnplan,btnRemind;

    private String typeEvent="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_communication);
        init();
        listener();
    }

    private void listener() {
        btnToolbar.setOnClickListener(this);
        btnDone.setOnClickListener(this);
        btnTypeCommunication.setOnClickListener(this);
        btnBirthDay.setOnClickListener(this);
        btnHomeWork.setOnClickListener(this);
        btnplan.setOnClickListener(this);
        btnRemind.setOnClickListener(this);
        btnHoliday.setOnClickListener(this);
    }

    private void init() {
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        btnToolbar= findViewById(R.id.btn_Toolbar);
        btnDone= findViewById(R.id.btnSend);
        btnTypeCommunication= findViewById(R.id.btnTypeCommunication);
        btnBirthDay= findViewById(R.id.btnBirthDay);
        btnHoliday= findViewById(R.id.btnHoliday);
        btnHomeWork= findViewById(R.id.btnHomeWork);
        btnplan= findViewById(R.id.btnplan);
        btnRemind= findViewById(R.id.btnRemind);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_Toolbar:
                setResult(Activity.RESULT_CANCELED);
                finish();
                break;
            case R.id.btnSend:
                //todo someting
                Intent data= new Intent();
                data.putExtra(EXTRA_DATA_TYPECOMUMICATION,typeEvent);
                setResult(Activity.RESULT_OK,data);
                finish();
                break;
            case R.id.btnTypeCommunication:
                typeEvent=btnTypeCommunication.getText().toString();
                Log.d("bachdz",typeEvent);
                //todo someting
                break;
            case R.id.btnBirthDay:
                typeEvent=btnBirthDay.getText().toString();
                //todo someting
                break;
            case R.id.btnHoliday:
                typeEvent=btnHoliday.getText().toString();
                //todo someting
                break;
            case R.id.btnHomeWork:
                typeEvent=btnHomeWork.getText().toString();
                //todo someting
                break;
            case R.id.btnplan:
                typeEvent=btnplan.getText().toString();
                //todo someting
                break;
            case R.id.btnRemind:
                typeEvent=btnRemind.getText().toString();
                //todo someting
                break;
        }
    }

    @Override
    public void onBackPressed() {
        setResult(Activity.RESULT_CANCELED);
        super.onBackPressed();
    }
}