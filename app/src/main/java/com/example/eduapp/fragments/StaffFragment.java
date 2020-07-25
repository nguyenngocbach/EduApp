package com.example.eduapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eduapp.Model.Staff;
import com.example.eduapp.R;
import com.example.eduapp.adapter.StaffFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

public class StaffFragment extends Fragment {
    private RecyclerView recyclerView;
    private List<Staff> mStaff;
    private StaffFragmentAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.line_staff_fragment,container,false);
        recyclerView= view.findViewById(R.id.recycler_staff);
        LinearLayoutManager layoutManager= new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        addData();
        adapter= new StaffFragmentAdapter(getContext(),mStaff);
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void addData() {
        mStaff= new ArrayList<>();
        mStaff.add(new Staff(123,"Nguyễn Văn A","false",false));
        mStaff.add(new Staff(123,"Nguyễn Văn A","false",false));
    }
}
