package com.example.eduapp.fragments;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eduapp.R;

public class RangeDateFragment extends Fragment {
    private TextView fromDate, toDate;

    private Button btnExit, btnSave;
    private Dialog dialog;
    private EditText edt11, edt21,edt12,edt22,edtAm,edt13,edt23,edtPm;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.range_date_fragment,container,false);
        fromDate= view.findViewById(R.id.fromDateCome);
        toDate= view.findViewById(R.id.fromDateTo);

        dialog= new Dialog(getContext());
        dialog.setContentView(R.layout.dialog_time_sleep);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        btnExit= dialog.findViewById(R.id.btn_exit);
        btnSave= dialog.findViewById(R.id.btn_confirm);

        edt11= dialog.findViewById(R.id.edt_one_line1);
        edt12= dialog.findViewById(R.id.edt_two_line1);
        edt21= dialog.findViewById(R.id.edt_one_line2);
        edt22= dialog.findViewById(R.id.edt_two_line2);
        edt13= dialog.findViewById(R.id.edt_one_line3);
        edt23= dialog.findViewById(R.id.edt_two_line3);
        edtAm= dialog.findViewById(R.id.edt_am);
        edtPm= dialog.findViewById(R.id.edt_pm);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo somgthing
                dialog.cancel();
            }
        });

        fromDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });
        fromDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });
        return view;
    }
}
