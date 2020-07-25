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

import com.example.eduapp.Class.Children;
import com.example.eduapp.R;

import java.util.List;

public class TitleActivity extends AppCompatActivity {

    public static final int TYPE_TITLE = 121;
    public static final int CODE_PICK_CHILDRENS =100 ;
    private Toolbar toolbar;
    private TextView txtToolbar,txtPickChildrens, txtPickTitles;
    private Button btnBack, btnPickChildrens, btnPickTitle, btnSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
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
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
                finish();
            }
        });
        btnPickTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo somgthing
                Intent intent=new Intent(TitleActivity.this,TypeTitleActivity.class);
                startActivityForResult(intent,TYPE_TITLE);
            }
        });
        btnPickChildrens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
                Intent intent=new Intent(TitleActivity.this,PickChildrenActivity.class);
                startActivityForResult(intent,CODE_PICK_CHILDRENS);
            }
        });
    }

    private void init() {
        toolbar= findViewById(R.id.toolbar_TitleActivity);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Danh Hiệu");
        btnBack = findViewById(R.id.btn_Toolbar);
        txtPickChildrens= findViewById(R.id.txt_pick_children);
        txtPickTitles= findViewById(R.id.txt_pick_title);
        btnPickChildrens= findViewById(R.id.btn_pick_childrens);
        btnPickTitle= findViewById(R.id.btn_pick_title);
        btnSend= findViewById(R.id.btn_confirm);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==TYPE_TITLE&& resultCode==RESULT_OK){
            String title= data.getStringExtra(TypeTitleActivity.TYPETILEACTIVITY);
            Log.d("bachdz",title+"");
            txtPickTitles.setText(title);
        }
        if (requestCode==CODE_PICK_CHILDRENS&& resultCode==RESULT_OK){
            List<Children> children= (List<Children>) data.getSerializableExtra(PickChildrenActivity.EXTRA_CHILDREN);
            Log.d("bachdz",children.size()+"");
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}