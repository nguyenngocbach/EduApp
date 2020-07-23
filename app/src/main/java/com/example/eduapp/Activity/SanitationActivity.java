package com.example.eduapp.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.eduapp.Model.Children;
import com.example.eduapp.R;

import java.util.List;

public class SanitationActivity extends AppCompatActivity {

    public static final int CODE_SANITATION =119;

    private Toolbar toolbar;
    private TextView txtToolbar,txtDem;
    private Button btnToolbar;
    private Button btnPickChildrens, btnTa,btnBo,btnOne,btnTwo,btnThree,btnDone, btnAgree, btnCancel;
    private EditText edtTime,edtNote;
    private LinearLayout layout;
    private AnimatorSet set;

    private Dialog dialog;
    private boolean isTa=true;
    private int index=0;
    private String[] listInfor= {"","","","",""};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanitation);
        init();
        listenner();
        //aninmation();
    }

    private void listenner() {

        btnPickChildrens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent= new Intent(SanitationActivity.this,PickChildrenActivity.class);
               startActivityForResult(intent,CODE_SANITATION);
            }
        });


        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
                btnAgree.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                        finish();
                    }
                });
                btnCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
            }
        });

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnTa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isTa) return;
                btnTa.setBackgroundResource(R.drawable.custom_btn_indoor);
                btnBo.setBackgroundResource(R.drawable.custom_btn_outdoor);
                animationBack();
                setTask(0);
                btnOne.setBackgroundResource(R.drawable.custom_btn_indoor);
                isTa=true;

            }
        });
        btnBo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isTa) return;
                scaleAnimation();
                btnBo.setBackgroundResource(R.drawable.custom_btn_indoor);
                btnTa.setBackgroundResource(R.drawable.custom_btn_outdoor);

                setTask(3);
                btnOne.setBackgroundResource(R.drawable.custom_btn_indoor);
                isTa=false;
            }
        });


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isTa){
                    btnOne.setBackgroundResource(R.drawable.custom_btn_indoor);
                    btnTwo.setBackgroundResource(R.drawable.custom_btn_outdoor);
                    listInfor[4]=edtNote.getText().toString().trim();
                    index=3;
                    edtNote.setText(listInfor[3]);
                }
                else {
                    setTask(0);
                    btnOne.setBackgroundResource(R.drawable.custom_btn_indoor);
                }
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isTa){
                    btnTwo.setBackgroundResource(R.drawable.custom_btn_indoor);
                    btnOne.setBackgroundResource(R.drawable.custom_btn_outdoor);
                    listInfor[3]=edtNote.getText().toString().trim();
                    index=4;
                    edtNote.setText(listInfor[4]);
                }
                else {
                    setTask(1);
                    btnTwo.setBackgroundResource(R.drawable.custom_btn_indoor);
                }
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTask(2);
                index=2;
                btnThree.setBackgroundResource(R.drawable.custom_btn_indoor);
            }
        });

        edtNote.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //Log.d("bach",charSequence+":: "+ i+ " : "+i1+"  :::::"+i2);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //Log.d("ngoc",charSequence+":: "+ i+ " : "+i1+"  :::::"+i2);
                txtDem.setText(i2+"/800");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //Log.d("nguyen",editable+"  calll nhe");
            }
        });

    }

    private void setTask(int i) {
        switch (index){
            case 0:
                listInfor[0]= edtNote.getText().toString().trim();
                btnOne.setBackgroundResource(R.drawable.custom_btn_outdoor);
                edtNote.setText(listInfor[i]);
                break;
            case 1:
                listInfor[1]= edtNote.getText().toString().trim();
                btnTwo.setBackgroundResource(R.drawable.custom_btn_outdoor);
                edtNote.setText(listInfor[i]);
                break;
            case 2:
                listInfor[2]= edtNote.getText().toString().trim();
                btnThree.setBackgroundResource(R.drawable.custom_btn_outdoor);
                edtNote.setText(listInfor[i]);
                break;
            case 3:
                listInfor[3]= edtNote.getText().toString().trim();
                btnTwo.setBackgroundResource(R.drawable.custom_btn_outdoor);
                edtNote.setText(listInfor[0]);
                break;
            case 4:
                listInfor[4]= edtNote.getText().toString().trim();
                btnTwo.setBackgroundResource(R.drawable.custom_btn_outdoor);
                edtNote.setText(listInfor[0]);
                break;
        }
        index=i;
    }


    private void scaleAnimation() {

        AnimatorSet set= new AnimatorSet();
        ObjectAnimator OnescaleX= ObjectAnimator.ofFloat(btnOne,"scaleX",1.0f,0.0f);
        OnescaleX.setDuration(300);
        OnescaleX.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator twoscaleX= ObjectAnimator.ofFloat(btnTwo,"scaleX",1.0f,0.0f);
        twoscaleX.setDuration(300);
        twoscaleX.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator threeScaleX= ObjectAnimator.ofFloat(btnThree,"scaleX",1.0f,0.0f);
        threeScaleX.setDuration(300);
        threeScaleX.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator OnescaleY= ObjectAnimator.ofFloat(btnOne,"scaleY",1.0f,0.0f);
        OnescaleY.setDuration(300);
        OnescaleY.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator twoscaleY= ObjectAnimator.ofFloat(btnTwo,"scaleY",1.0f,0.0f);
        twoscaleY.setDuration(300);
        twoscaleY.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator threeScaleY= ObjectAnimator.ofFloat(btnThree,"scaleY",1.0f,0.0f);
        threeScaleY.setDuration(300);
        threeScaleY.setInterpolator(new AccelerateDecelerateInterpolator());

        set.play(OnescaleX).with(OnescaleY);
        set.play(twoscaleX).with(twoscaleY);
        set.play(threeScaleX).with(threeScaleY);


        OnescaleY.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                btnThree.setVisibility(View.GONE);
                btnOne.setText("Nước Tiểu");
                btnTwo.setText("Khối Lượng Nước");
                btnOne.setBackgroundResource(R.drawable.custom_btn_indoor);
                index=3;
                repeat();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        set.start();

    }

    private void repeat() {
        AnimatorSet set= new AnimatorSet();
        ObjectAnimator OnescaleX= ObjectAnimator.ofFloat(btnOne,"scaleX",0.0f,1.0f);
        OnescaleX.setDuration(300);
        OnescaleX.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator twoscaleX= ObjectAnimator.ofFloat(btnTwo,"scaleX",0.0f,1.0f);
        twoscaleX.setDuration(300);
        twoscaleX.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator OnescaleY= ObjectAnimator.ofFloat(btnOne,"scaleY",0.0f,1.0f);
        OnescaleY.setDuration(300);
        OnescaleY.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator twoscaleY= ObjectAnimator.ofFloat(btnTwo,"scaleY",0.0f,1.0f);
        twoscaleY.setDuration(300);
        twoscaleY.setInterpolator(new AccelerateDecelerateInterpolator());

        twoscaleX.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
//                if (isTa) return;
//                btnThree.setVisibility(View.VISIBLE);
//                btnOne.setText("Ướt");
//                btnTwo.setText("Bẩn");
//                btnThree.setText("Khô");
//                comeBackButton();


            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        set.play(OnescaleX).with(OnescaleY);
        set.play(twoscaleX).with(twoscaleY);
        set.start();
    }

    private void animationBack() {
        AnimatorSet set= new AnimatorSet();
        ObjectAnimator OnescaleX= ObjectAnimator.ofFloat(btnOne,"scaleX",1.0f,0.0f);
        OnescaleX.setDuration(300);
        OnescaleX.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator twoscaleX= ObjectAnimator.ofFloat(btnTwo,"scaleX",1.0f,0.0f);
        twoscaleX.setDuration(300);
        twoscaleX.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator OnescaleY= ObjectAnimator.ofFloat(btnOne,"scaleY",1.0f,0.0f);
        OnescaleY.setDuration(300);
        OnescaleY.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator twoscaleY= ObjectAnimator.ofFloat(btnTwo,"scaleY",1.0f,0.0f);
        twoscaleY.setDuration(300);
        twoscaleY.setInterpolator(new AccelerateDecelerateInterpolator());
        OnescaleX.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                btnThree.setVisibility(View.VISIBLE);
                btnOne.setText("Ướt");
                btnTwo.setText("Bẩn");
                btnThree.setText("Khô");
                btnOne.setBackgroundResource(R.drawable.custom_btn_indoor);
                index=0;
                comeBackButton();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        set.playTogether(OnescaleX,OnescaleY,twoscaleX,twoscaleY);
        set.start();
    }

    private void comeBackButton() {
        AnimatorSet set= new AnimatorSet();
        ObjectAnimator OnescaleX= ObjectAnimator.ofFloat(btnOne,"scaleX",0f,1.0f);
        OnescaleX.setDuration(300);
        OnescaleX.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator twoscaleX= ObjectAnimator.ofFloat(btnTwo,"scaleX",0f,1.0f);
        twoscaleX.setDuration(300);
        twoscaleX.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator threeScaleX= ObjectAnimator.ofFloat(btnThree,"scaleX",0f,1.0f);
        threeScaleX.setDuration(300);
        threeScaleX.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator OnescaleY= ObjectAnimator.ofFloat(btnOne,"scaleY",0f,1.0f);
        OnescaleY.setDuration(300);
        OnescaleY.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator twoscaleY= ObjectAnimator.ofFloat(btnTwo,"scaleY",0f,1.0f);
        twoscaleY.setDuration(300);
        twoscaleY.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator threeScaleY= ObjectAnimator.ofFloat(btnThree,"scaleY",0f,1.0f);
        threeScaleY.setDuration(300);
        threeScaleY.setInterpolator(new AccelerateDecelerateInterpolator());

        set.play(OnescaleX).with(OnescaleY);
        set.play(twoscaleX).with(twoscaleY);
        set.play(threeScaleX).with(threeScaleY);
        set.playTogether(OnescaleX,OnescaleY,twoscaleX,twoscaleY,threeScaleX,threeScaleY);
        set.start();
    }


    // ???????????????????????????????????????????
    // ???????????????????????????????????????????
    private void aninmation() {
        set= new AnimatorSet();
        ObjectAnimator scaleY= ObjectAnimator.ofFloat(layout,"scaleY",1.0f,0f);
        scaleY.setDuration(300);
        scaleY.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator alpha = ObjectAnimator.ofFloat(layout,"Alpha",1.0f,0f);
        alpha.setDuration(300);
        alpha.setInterpolator(new AccelerateDecelerateInterpolator());

        scaleY.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }
            @Override
            public void onAnimationEnd(Animator animator) {

            }
            @Override
            public void onAnimationCancel(Animator animator) {

            }
            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        set.play(scaleY).with(alpha);
        set.start();
    }

    private void init() {
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Vệ Sinh");
        btnToolbar= findViewById(R.id.btn_Toolbar);
        btnPickChildrens= findViewById(R.id.btn_pick_childrens);
        btnTa= findViewById(R.id.btn_ta);
        btnBo= findViewById(R.id.btn_bo);
        btnOne= findViewById(R.id.btn_one);
        btnTwo= findViewById(R.id.btn_two);
        btnThree= findViewById(R.id.btn_three);
        btnDone= findViewById(R.id.btn_done);
        edtTime= findViewById(R.id.edt_time);
        edtNote= findViewById(R.id.edt_note);
        layout= findViewById(R.id.layout_time);

        //dialog
        dialog= new Dialog(this);
        dialog.setContentView(R.layout.custom_exit);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        btnAgree= dialog.findViewById(R.id.btn_agree);
        btnCancel= dialog.findViewById(R.id.btn_cancel);
        txtDem= findViewById(R.id.txt_dem);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==CODE_SANITATION &&  resultCode==RESULT_OK){
            List<Children> children= (List<Children>) data.getSerializableExtra(PickChildrenActivity.EXTRA_CHILDREN);
            Log.d("bachdz",children.size()+":::::");
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onBackPressed() {
        dialog.show();
        btnAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SanitationActivity.super.onBackPressed();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });
    }
}