package com.example.eduapp.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eduapp.Model.Children;
import com.example.eduapp.R;

import java.util.List;

public class PlayAndLearnActivity extends AppCompatActivity {

    public static final int TYPE_PLAYANDLEARN=105;
    private static final int TYPEACTIVITY =101 ;

    private Toolbar toolbar;
    private TextView txtToolbar,txtNameActivity;
    private Button btnBack, btnPickChildrens, btnIndoor, btnOutdoor, btnActivity, btnSend;
    private ImageView ingTimeStart, imgTimeEnd, imgFiles;
    private EditText edtTimeStart, edtTimeEnd, edtFiles;

    private Button btnExit, btnSave;
    private Dialog dialog;
    private EditText edt11, edt21,edt12,edt22,edtAm,edt13,edt23,edtPm;



    private static boolean ISINDOOR= true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_and_learn);
        init();
        listenner();
    }

    private void listenner() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnPickChildrens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(PlayAndLearnActivity.this,PickChildrenActivity.class);
                startActivityForResult(intent,TYPE_PLAYANDLEARN);
            }
        });
        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(PlayAndLearnActivity.this,TYpeActivityActivity.class);
               startActivityForResult(intent,TYPEACTIVITY);
            }
        });
        btnIndoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ISINDOOR=true;
                btnIndoor.setBackgroundResource(R.drawable.custom_btn_indoor);
                btnOutdoor.setBackgroundResource(R.drawable.custom_btn_outdoor);
            }
        });
        btnOutdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ISINDOOR=false;
                btnIndoor.setBackgroundResource(R.drawable.custom_btn_outdoor);
                btnOutdoor.setBackgroundResource(R.drawable.custom_btn_indoor);
            }
        });

        imgFiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
            }
        });
        imgTimeEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ISINDOOR) return;
                else {
                    // show dialog
                    dialog.show();
                }
            }
        });
        ingTimeStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ISINDOOR) return;
                else {
                    // show dialog
                    dialog.show();
                }
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
                dialog.cancel();
            }
        });
    }


    private void init() {
        toolbar= findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Chơi Và Học");
        btnBack= findViewById(R.id.btn_Toolbar);
        btnPickChildrens= findViewById(R.id.btn_pick_childrens);
        btnIndoor= findViewById(R.id.btn_indoor);
        btnOutdoor= findViewById(R.id.btn_outDoor);
        btnActivity= findViewById(R.id.btn_pick_activity);
        btnSend= findViewById(R.id.btnSend);
        ingTimeStart= findViewById(R.id.icon_startTime);
        imgTimeEnd= findViewById(R.id.icon_endTime);
        imgFiles= findViewById(R.id.icon_files);
        edtTimeStart= findViewById(R.id.edt_timeStart);
        edtTimeEnd= findViewById(R.id.edt_timeEnd);
        edtFiles= findViewById(R.id.edt_files);
        txtNameActivity= findViewById(R.id.txt_list_activity);

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==TYPE_PLAYANDLEARN&& resultCode==RESULT_OK){
            List<Children> children= (List<Children>) data.getSerializableExtra(PickChildrenActivity.EXTRA_CHILDREN);
            Log.d("bachdz",children.size()+"");
        }
        if (requestCode==TYPEACTIVITY && resultCode==RESULT_OK){
            String title= data.getStringExtra(TYpeActivityActivity.TYPE_ACTIVITY);
            txtNameActivity.setText(title);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}