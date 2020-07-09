package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eduapp.R;

public class ChangPasswordActivity extends AppCompatActivity {
    androidx.appcompat.widget.Toolbar toolbar;
    Button btnAccept, btn_back;
    Dialog dldAccept;
    TextView tvContentLog1, tvContentLog2, tvTiltleToolbar;
    ImageView img;
    Button btn_Dialog_Accept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chang_password);
        Anhxa();
        Listener();
    }

    private void Listener() {
        tvTiltleToolbar.setText("Đổi mật khẩu");
        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvContentLog2.setText("Cập nhật mật khẩu thành công");
                tvContentLog1.setVisibility(View.INVISIBLE);
                img.setImageDrawable(getResources().getDrawable(R.drawable.img_success));
                tvContentLog2.setTextColor(Color.parseColor("#002DFF"));
                btn_Dialog_Accept.setBackgroundColor(Color.parseColor("#002DFF"));
                dldAccept.show();
            }
        });
        btn_Dialog_Accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dldAccept.cancel();
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void Anhxa() {
        toolbar =  findViewById(R.id.tb_Forgot_Login);
        setSupportActionBar(toolbar);
        btnAccept = findViewById(R.id.btn_ChangePassWord_Accept);
        dldAccept = new Dialog(ChangPasswordActivity.this);
        dldAccept.setContentView(R.layout.custom_dialog_notify);
        dldAccept.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        tvContentLog1 = dldAccept.findViewById(R.id.tv_content_log1);
        tvContentLog2 = dldAccept.findViewById(R.id.tv_content_log2);
        btn_back = findViewById(R.id.btn_Toolbar);
        img = dldAccept.findViewById(R.id.img_dialog);
        btn_Dialog_Accept = dldAccept.findViewById(R.id.btn_Dialog_Accept);
        tvTiltleToolbar = findViewById(R.id.txtTiltle_Toobar);
    }
}