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

public class TypeTitleActivity extends AppCompatActivity {

    public static final String TYPETILEACTIVITY="type_result";

    private Toolbar toolbar;
    private TextView txtToolbar;
    private Button btnBack, btnBrave,btnCreative,btnHelpful, btnAssist,btnOnTime, btnLearnQuickly,btnDone;

    private String title="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_title);
        init();
        listener();
    }

    private void listener() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(Activity.RESULT_CANCELED);
                finish();
            }
        });

        btnBrave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
                title= btnBrave.getText().toString();
            }
        });

        btnCreative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
                title= btnCreative.getText().toString();
            }
        });
        btnHelpful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
                title= btnHelpful.getText().toString();
            }
        });

        btnAssist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
                title= btnAssist.getText().toString();
            }
        });

        btnOnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
                title= btnOnTime.getText().toString();
            }
        });

        btnLearnQuickly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
                title= btnLearnQuickly.getText().toString();
            }
        });

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
                Intent data= new Intent();
                data.putExtra(TYPETILEACTIVITY,title);
                Log.d("bachdz",title+"1");
                setResult(Activity.RESULT_OK,data);
                finish();
            }
        });
    }

    private void init() {
        toolbar= findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        btnBack=findViewById(R.id.btn_Toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Chọn   Loại Danh Hiệu ");
        btnBrave = findViewById(R.id.btnBrave);
        btnCreative = findViewById(R.id.btnCreative);
        btnHelpful = findViewById(R.id.btnhelpful);
        btnAssist = findViewById(R.id.btn_asisten);
        btnOnTime = findViewById(R.id.btn_onTime);
        btnLearnQuickly = findViewById(R.id.btn_learnQuickly);
        btnDone =findViewById(R.id.button3);

    }
}