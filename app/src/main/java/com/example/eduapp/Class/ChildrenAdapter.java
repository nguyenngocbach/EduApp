package com.example.eduapp.Class;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eduapp.Model.ChildListener;
import com.example.eduapp.Model.Children;
import com.example.eduapp.R;

import java.util.List;

public class ChildrenAdapter extends RecyclerView.Adapter<ChildrenAdapter.Holder> {
    private Context mContext;
    private List<Children> mChildrenss;
    private ChildListener mListener;

    public ChildrenAdapter(Context mContext, List<Children> mTres, ChildListener mListener) {
        this.mContext = mContext;
        this.mChildrenss = mTres;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public ChildrenAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.line_tre,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildrenAdapter.Holder holder, final int position) {
        Children tre= mChildrenss.get(position);
        holder.onBind(tre);
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.getChilden(mChildrenss.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mChildrenss.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView imgTre;
        TextView nameTre;
        LinearLayout layout;
        public Holder(@NonNull View itemView) {
            super(itemView);
            imgTre= itemView.findViewById(R.id.img_tre);
            nameTre= itemView.findViewById(R.id.txt_tre);
            layout= itemView.findViewById(R.id.layout_children);

        }

        public void onBind(Children tre) {
            nameTre.setText(tre.getName());

        }
    }
}
