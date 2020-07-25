package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eduapp.adapter.ChildrenAdapter;
import com.example.eduapp.Model.ChildListener;
import com.example.eduapp.Class.Children;
import com.example.eduapp.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PickChildrenActivity extends AppCompatActivity implements ChildListener {

    public static final String EXTRA_CHILDREN = "DATA_CHILDRENS";
    public static String ACTIVITY="PICKCHILDRENACTIVITY";

    private Toolbar toolbar;
    private TextView txtToolbar;
    private Button btnBack, btnPickOne,btnPickAll,btnDone;
    private RecyclerView recyclerView;
    private List<Children> mChildren;
    private ChildrenAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_children);
        init();

    }

    private void init() {
        toolbar= findViewById(R.id.toolar_pick);
        setSupportActionBar(toolbar);
        btnBack= findViewById(R.id.btn_Toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Chọn Học Sinh");
        btnPickOne= findViewById(R.id.btn_pickOne);
        btnPickAll= findViewById(R.id.btn_pickAll);
        btnDone= findViewById(R.id.btn_confirm);
        recyclerView= findViewById(R.id.list_title);
        addData();
        adapter= new ChildrenAdapter(this,mChildren,this);
        recyclerView.setAdapter(adapter);
        listenner();
    }

    private void listenner() {
        btnPickOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<mChildren.size();i++){
                    mChildren.get(i).setCheck(false);
                }
                btnPickAll.setBackgroundResource(R.color.xam);
                btnPickOne.setBackgroundResource(R.color.colorblue);
                adapter.notifyDataSetChanged();
                //todo something;
            }
        });
        btnPickAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<mChildren.size();i++){
                    mChildren.get(i).setCheck(true);
                }
                btnPickAll.setBackgroundResource(R.color.colorblue);
                btnPickOne.setBackgroundResource(R.color.xam);
                adapter.notifyDataSetChanged();
                //todo something
            }
        });
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo somgthing
                Intent intent= new Intent();
                List<Children> children= new ArrayList<>();
                for (int i=0;i<mChildren.size();i++){
                    if (mChildren.get(i).isCheck()){
                        children.add(mChildren.get(i));
                    }
                }
                intent.putExtra(EXTRA_CHILDREN, (Serializable) children);
                setResult(Activity.RESULT_OK,intent);
                finish();

            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                setResult(Activity.RESULT_CANCELED);
            }
        });
    }

    private void addData() {
        mChildren= new ArrayList<>();
        mChildren.add(new Children(122,"Anh","",false));
        mChildren.add(new Children(123,"ABABBA","",false));
        mChildren.add(new Children(124,"EHHEHE","",false));
        mChildren.add(new Children(125,"LALLALA","",false));
        mChildren.add(new Children(126,"HAHHAH","",false));
        mChildren.add(new Children(127,"AHAHHA","",false));
        mChildren.add(new Children(128,"ABBA","",false));
        mChildren.add(new Children(129,"ALLA","",false));
        mChildren.add(new Children(130,"YAYYA","",false));
    }

    @Override
    public void getChilden(Children tre) {
        for (int i=0;i<mChildren.size();i++){
            if (mChildren.get(i).getId()==tre.getId()){
                if (mChildren.get(i).isCheck()==true)
                    mChildren.get(i).setCheck(false);
                else mChildren.get(i).setCheck(true);
            }
        }

        // todo soemthing
        adapter.notifyDataSetChanged();
    }
}