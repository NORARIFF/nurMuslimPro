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

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {

    ArrayList<Product> list;
    public AdapterClass(ArrayList<Product> list)
    {
        this.list = list;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_holder,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.desc.setText(list.get(position).getName());
        holder.factory.setText(list.get(position).getFactory_location());
        holder.selling.setText(list.get(position).getSelling_place());
        holder.descrip.setText(list.get(position).getDescription());
        Picasso.get().load(list.get(position).getProfilePic()).into(holder.profile);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView desc,factory,selling,descrip;
        ImageView profile;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            desc = itemView.findViewById(R.id.name);
            factory = itemView.findViewById(R.id.factory_location);
            selling = itemView.findViewById(R.id.selling_place);
            descrip = itemView.findViewById(R.id.description);
            profile = itemView.findViewById(R.id.profilePic);

        }
    }
}
