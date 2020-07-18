package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eduapp.Model.Children;
import com.example.eduapp.R;

import java.util.List;

public class SleepActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView txtToolbar;
    private Button btnToolbar,btnSend,btnSelect;
    private EditText etdLink, edtTimeStart, edtTimeEnd;
    private ImageView iconStart, iconEnd;

    //dialog
    private Button btnExit, btnSave;
    private Dialog dialog;
    private EditText edt11, edt21,edt12,edt22,edtAm,edt13,edt23,edtPm;
    //recyclerView
    private RecyclerView recyclerChildrens;
    private List<Children> mChildren;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        init();
        listenner();
    }

    private void listenner() {
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnToolbar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                });
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SleepActivity.this,PickChildrenActivity.class));
            }
        });
        iconStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });
        iconEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });

        //dialog
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });
    }

    private void init() {
        toolbar= findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        btnToolbar=findViewById(R.id.btn_Toolbar);
        btnSelect= findViewById(R.id.btnSelection);
        btnSend= findViewById(R.id.btnSend);
        edtTimeEnd= findViewById(R.id.edt_timeEnd);
        edtTimeStart= findViewById(R.id.edt_timeStart);
        etdLink= findViewById(R.id.edt_files);
        iconEnd= findViewById(R.id.icon_endTime);
        iconStart= findViewById(R.id.icon_startTime);

        recyclerChildrens= findViewById(R.id.recircle_list_children);
        LinearLayoutManager manager= new LinearLayoutManager(this);
        manager.setOrientation(RecyclerView.VERTICAL);
        recyclerChildrens.setLayoutManager(manager);


        dialog= new Dialog(this);
        dialog.setContentView(R.layout.dialog_time_sleep);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        btnExit= dialog.findViewById(R.id.btn_exit);
        btnSave= dialog.findViewById(R.id.btn_confirm);

        edt11= findViewById(R.id.edt_one_line1);
        edt12= findViewById(R.id.edt_two_line1);
        edt21= findViewById(R.id.edt_one_line2);
        edt22= findViewById(R.id.edt_two_line2);
        edt13= findViewById(R.id.edt_one_line3);
        edt23= findViewById(R.id.edt_two_line3);
        edtAm= findViewById(R.id.edt_am);
        edtPm= findViewById(R.id.edt_pm);


    }
}