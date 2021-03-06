package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.eduapp.R;

public class ForgotPasswordActivity extends AppCompatActivity {
    androidx.appcompat.widget.Toolbar toolbar;
    DrawerLayout drawerLayout;
    Button btn_back, btn_Accept, btn_Dialog_Accept;
    TextView tvNotify, tvContentLog1, tvContentLog2;
    EditText edt_Content;
    int Type = 1;       // 1 la nhap email          2 la nhap ma xac thuc
    Dialog dlFailedAccept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        Anhxa();
        Listener();
    }

    private void Listener() {
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Type == 1)
                {
                    finish();
                }
                else
                {
                    Type = 1;
                    edt_Content.setHint("Nhâp Email...");
                }

            }
        });
        btn_Accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Type == 1)
                {
                    edt_Content.setHint("Nhập mã xác thực...");
                    Type = 2;
                }
                else
                {
                    tvContentLog1.setText("Mã xác thực không chính xác");
                    tvContentLog2.setText("Lưu ý: mã xác thực chỉ tồn tại trong 5 phút");
                    dlFailedAccept.show();
                }
            }
        });
        btn_Dialog_Accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlFailedAccept.cancel();
                Intent intent = new Intent(ForgotPasswordActivity.this, ChangPasswordActivity.class);
                startActivity(intent);
            }
        });
    }

    private void Anhxa() {
        drawerLayout = findViewById(R.id.drw_Forgot_Login);
        toolbar =  findViewById(R.id.tb_Forgot_Login);
        setSupportActionBar(toolbar);
        btn_back = findViewById(R.id.btn_Toolbar);
        tvNotify = findViewById(R.id.tvNotify);
        btn_Accept = findViewById(R.id.btn_Forgot_Accept);
        edt_Content = findViewById(R.id.edt_Forgot_Content);
        dlFailedAccept = new Dialog(ForgotPasswordActivity.this);
        dlFailedAccept.setContentView(R.layout.custom_dialog_notify);
        dlFailedAccept.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        tvContentLog1 = dlFailedAccept.findViewById(R.id.tv_content_log1);
        tvContentLog2 = dlFailedAccept.findViewById(R.id.tv_content_log2);
        btn_Dialog_Accept = dlFailedAccept.findViewById(R.id.btn_Dialog_Accept);
    }

}