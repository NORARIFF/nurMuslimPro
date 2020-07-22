package com.example.nurmuslim;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.security.acl.Group;
import java.util.ArrayList;

public class AdapterClass2 extends RecyclerView.Adapter<AdapterClass2.MyViewHolder> {

    ArrayList<Product2> list;
    public AdapterClass2(ArrayList<Product2> list)
    {
        this.list = list;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_holder2,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.desc2.setText(list.get(position).getNameCompany());
        holder.factory2.setText(list.get(position).getAddress());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView desc2,factory2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            desc2 = itemView.findViewById(R.id.nameCompany);
            factory2 = itemView.findViewById(R.id.address);

        }
    }
}
