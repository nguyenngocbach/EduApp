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

import com.example.eduapp.R;
import com.example.eduapp.adapter.ProgramAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProgramsFragment extends Fragment {
    private RecyclerView recyclerView;
    private List<Data> data;
    private ProgramAdapter adapter;

    public void setData(List<Data> mData){
        data.clear();
        data= new ArrayList<>();
        data.addAll(mData);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.program_fragment,container,false);
        recyclerView= view.findViewById(R.id.recycler_programs);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        data= new ArrayList<>();
        addData();
        adapter=new ProgramAdapter(getContext(),data);
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void addData() {
        data.add(new Data(123,"Hello"));
        data.add(new Data(123,"Hello"));
        data.add(new Data(123,"Hello"));
        data.add(new Data(123,"Hello"));
    }

    public class Data{
        private int id;
        private String name;

        public Data(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
