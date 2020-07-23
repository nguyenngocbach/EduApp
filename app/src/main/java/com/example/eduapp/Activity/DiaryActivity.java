package com.example.eduapp.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eduapp.Model.Children;
import com.example.eduapp.R;

import java.util.List;

public class DiaryActivity extends AppCompatActivity {

    public static final int TYPE_EVENTS=12345;
    public static final int TYPE_PICK_CHILDRENS =54321 ;


    private Toolbar toolbar;
    private TextView txtToolbar,txtEvent;
    private Button btnToolbar,btnPickChildren, btnPickEvent,btnDone;


    //private

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);
        init();
        listener();
    }

    private void listener() {
        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnPickChildren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(DiaryActivity.this,PickChildrenActivity.class);
                startActivityForResult(intent,TYPE_PICK_CHILDRENS);
            }
        });
        btnPickEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(DiaryActivity.this,TypeCommunicationActivity.class);
                startActivityForResult(intent,TYPE_EVENTS);
            }
        });
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo somgthing
                finish();
            }
        });
    }

    private void init() {
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Nhật Ký");
        btnToolbar= findViewById(R.id.btn_Toolbar);
        btnPickChildren= findViewById(R.id.btn_pick_childrens);
        btnPickEvent= findViewById(R.id.btn_pick_event);
        btnDone= findViewById(R.id.btn_done);
        txtEvent= findViewById(R.id.txt_events);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==TYPE_EVENTS && resultCode==RESULT_OK){
            String typeEvent= data.getStringExtra(TypeCommunicationActivity.EXTRA_DATA_TYPECOMUMICATION);
            txtEvent.setText(typeEvent);
        }
        if (requestCode==TYPE_PICK_CHILDRENS&& resultCode==RESULT_OK){
            List<Children> children= (List<Children>) data.getSerializableExtra(PickChildrenActivity.EXTRA_CHILDREN);
            Log.d("bachdz",children.size()+"");
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}