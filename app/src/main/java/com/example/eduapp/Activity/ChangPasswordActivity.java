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
    Button btnAccept;
    Dialog dldAccept;
    TextView tvContentLog1, tvContentLog2;
    ImageView img;
    Button btn_Login_Accept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chang_password);
        Anhxa();
        Listener();
    }

    private void Listener() {
        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvContentLog2.setText("Cập nhật mật khẩu thành công");
                tvContentLog1.setVisibility(View.INVISIBLE);
                img.setImageDrawable(getResources().getDrawable(R.drawable.img_success));
                tvContentLog2.setTextColor(Color.parseColor("#002DFF"));
                btn_Login_Accept.setBackgroundColor(Color.parseColor("#002DFF"));
                dldAccept.show();
            }
        });
        btn_Login_Accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dldAccept.cancel();
            }
        });
    }

    private void Anhxa() {
        btnAccept = findViewById(R.id.btn_ChangePassWord_Accept);
        dldAccept = new Dialog(ChangPasswordActivity.this);
        dldAccept.setContentView(R.layout.custom_dialog);
        dldAccept.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        tvContentLog1 = dldAccept.findViewById(R.id.tv_content_log1);
        tvContentLog2 = dldAccept.findViewById(R.id.tv_content_log2);
        img = dldAccept.findViewById(R.id.img_dialog);
        btn_Login_Accept = dldAccept.findViewById(R.id.btn_Dialog_Accept);
    }
}