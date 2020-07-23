package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eduapp.R;

public class TypeInforActivity extends AppCompatActivity {

    public static final String TYPE_INFOR="type_infor";
    private Toolbar toolbar;
    private TextView txtToolbar;
    private Button btnToolbar,btnDone;
    private Button btnAttend,btnEmotional,btnConsciousness,btnSkills,btnConcurSkill,btnLearn,btnLanguage,btnSocial,btnNumber,btnBehavior;

    private String title="Chưa có loại thông báo được chọn";

    View.OnClickListener listener= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnAttend:
                    // demo
                    title= btnAttend.getText().toString();
                    break;
                case R.id.btnEmotional:
                    title= btnEmotional.getText().toString();
                    break;
                case R.id.btnConsciousness:
                    title= btnConsciousness.getText().toString();
                    break;
                case R.id.btnSkills:
                    title= btnSkills.getText().toString();
                    break;
                case R.id.btnConcurSkill:
                    title= btnConcurSkill.getText().toString();
                    break;
                case R.id.btnLearn:
                    title= btnLearn.getText().toString();
                    break;
                case R.id.btnLanguage:
                    title= btnLanguage.getText().toString();
                    break;
                case R.id.btnSocial:
                    title= btnSocial.getText().toString();
                    break;
                case R.id.btnNumber:
                    title= btnNumber.getText().toString();
                    break;
                case R.id.btnBehavior:
                    title= btnBehavior.getText().toString();
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_infor);
        init();
        listener();
    }

    private void listener() {
        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(Activity.RESULT_CANCELED);
                finish();
            }
        });
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.putExtra(TYPE_INFOR,title);
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });

        //btnAttend,btnEmotional,btnConsciousness,btnSkills,btnConcurSkill,btnLearn,btnLanguage,btnSocial,btnNumber,btnBehavior;
        btnAttend.setOnClickListener(listener);
        btnEmotional.setOnClickListener(listener);
        btnConsciousness.setOnClickListener(listener);
        btnSkills.setOnClickListener(listener);
        btnConcurSkill.setOnClickListener(listener);
        btnLearn.setOnClickListener(listener);
        btnLanguage.setOnClickListener(listener);
        btnSocial.setOnClickListener(listener);
        btnNumber.setOnClickListener(listener);
        btnBehavior.setOnClickListener(listener);

    }

    private void init() {
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Chọn Loại Thông Báo");
        btnToolbar=findViewById(R.id.btn_Toolbar);
        btnDone= findViewById(R.id.btn_done);

        btnAttend= findViewById(R.id.btnAttend);
        btnEmotional= findViewById(R.id.btnEmotional);
        btnConsciousness= findViewById(R.id.btnConsciousness);
        btnSkills= findViewById(R.id.btnSkills);
        btnConcurSkill= findViewById(R.id.btnConcurSkill);
        btnLearn= findViewById(R.id.btnLearn);
        btnLanguage= findViewById(R.id.btnLanguage);
        btnSocial= findViewById(R.id.btnSocial);
        btnNumber= findViewById(R.id.btnNumber);
        btnBehavior= findViewById(R.id.btnBehavior);
    }
}