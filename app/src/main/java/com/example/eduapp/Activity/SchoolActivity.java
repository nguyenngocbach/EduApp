package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;

import com.example.eduapp.R;

public class SchoolActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private TextView txtTitle;
    private Button btnBack;
    private ImageView imgSchool;
    private EditText edtNameSchool, edtAddress,edtCity,edtPhone,edtEmail,
            edtHomeTown, edtDateWorking, edtHoursWorking,edtPlan, edtNameCompany;

    private ViewAnimator animator;
    private int[] listImage= {R.drawable.xe_em,R.drawable.bo_em,R.drawable.ja_ngoc_trinh,R.drawable.mayback_em};
    private Handler handler=new Handler();
    private int index =0;
    private ImageView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
        init();
        setAnimation();

    }

    private void setAnimation() {
        for (int i=0;i<listImage.length;i++){
            ImageView imageView= new ImageView(this);
            imageView.setImageResource(listImage[i]);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            animator.addView(imageView);
        }

        final Animation in = new AnimationUtils().loadAnimation(this,R.anim.in_right);
        Animation out = new AnimationUtils().loadAnimation(this,R.anim.out_left);
        animator.setInAnimation(in);
        animator.setOutAnimation(out);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                animator.showNext();
                handler.postDelayed(this,2000);
                if (index>3) index=0;
                dotes(index);
                index++;

            }
        },2000);

    }

    private void dotes(int index) {

        if (view==null){
            view= findViewById(R.id.dotes_one);
            view.setImageResource(R.drawable.circle_2);
            return;
        }
        switch (index){
            case 0 :
                view.setImageResource(R.drawable.circle);
                view=findViewById(R.id.dotes_one);
                view.setImageResource(R.drawable.circle_2);
                break;
            case 1:
                view.setImageResource(R.drawable.circle);
                view=findViewById(R.id.dotes_two);
                view.setImageResource(R.drawable.circle_2);
                break;
            case 2:
                view.setImageResource(R.drawable.circle);
                view=findViewById(R.id.dotes_three);
                view.setImageResource(R.drawable.circle_2);
                break;
            case 3:
                view.setImageResource(R.drawable.circle);
                view=findViewById(R.id.dotes_four);
                view.setImageResource(R.drawable.circle_2);
                break;
        }
    }

    private void init() {
        toolbar= findViewById(R.id.toolbar_school);
        setSupportActionBar(toolbar);
        txtTitle= findViewById(R.id.txtTiltle_Toobar);
        txtTitle.setText("Trường Học");
        btnBack= findViewById(R.id.btn_Toolbar);
        animator= findViewById(R.id.img_school);
        edtNameSchool= findViewById(R.id.edt_school);
        edtAddress= findViewById(R.id.edt_address);
        edtCity= findViewById(R.id.edt_city);
        edtPhone= findViewById(R.id.edt_phong);
        edtEmail= findViewById(R.id.edt_mail);
        edtHomeTown= findViewById(R.id.edt_hometown);
        edtDateWorking= findViewById(R.id.edt_dateworking);
        edtHoursWorking= findViewById(R.id.edt_hoursWorking);
        edtPlan= findViewById(R.id.edt_plan);
        edtNameCompany= findViewById(R.id.edt_nameCompany);
    }
}