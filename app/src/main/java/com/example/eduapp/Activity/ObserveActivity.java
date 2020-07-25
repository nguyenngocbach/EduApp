package com.example.eduapp.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.eduapp.Class.Children;
import com.example.eduapp.R;

import java.util.List;

public class ObserveActivity extends AppCompatActivity {

    public static final int CODE_OBSERVE=191;
    public static final int CODE_INFOR=199;

    private Toolbar toolbar;
    private TextView txtToolbar,txtListInfor,txtDem;
    private Button btnToolbar,btnPickChildren, btnPickInfor, btnSend;
    private EditText edtLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observe);
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
                Intent intent= new Intent(ObserveActivity.this,PickChildrenActivity.class);
                startActivityForResult(intent,CODE_OBSERVE);
            }
        });
        btnPickInfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ObserveActivity.this,TypeInforActivity.class);
                startActivityForResult(intent,CODE_INFOR);
            }
        });
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo somgthing
                finish();
            }
        });

        edtLink.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                txtDem.setText(i2+"/800");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void init() {
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Quán Sát");
        btnToolbar= findViewById(R.id.btn_Toolbar);
        btnPickChildren= findViewById(R.id.btn_pick_childrens);
        btnPickInfor= findViewById(R.id.btn_pick_infor);
        btnSend= findViewById(R.id.btn_done);

        txtListInfor= findViewById(R.id.txt_list_infor);
        txtDem= findViewById(R.id.txt_dem);
        edtLink= findViewById(R.id.edt_files);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==CODE_OBSERVE && resultCode==RESULT_OK){
            List<Children> children= (List<Children>) data.getSerializableExtra(PickChildrenActivity.EXTRA_CHILDREN);
            Log.d("bachdz", children.size()+"");
        }
        if (requestCode==CODE_INFOR && resultCode==RESULT_OK){
            String infor= data.getStringExtra(TypeInforActivity.TYPE_INFOR);
            txtListInfor.setText(infor);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}