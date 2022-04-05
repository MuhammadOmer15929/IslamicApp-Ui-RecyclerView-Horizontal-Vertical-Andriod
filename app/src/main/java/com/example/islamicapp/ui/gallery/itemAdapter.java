package com.example.islamicapp.ui.gallery;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicapp.R;

import java.util.List;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.ViewHolder> {

    List<Model> itemList3;

    public itemAdapter(List<Model>itemList) {

        this.itemList3=itemList;
    }

    @NonNull
    @Override
    public itemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowitem,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull itemAdapter.ViewHolder holder, int position) {

        holder.Ramadan.setText(itemList3.get(position).getRamadan());
        holder.Suhoor.setText(itemList3.get(position).getSuhoor());
        holder.Iftar.setText(itemList3.get(position).getIftar());


    }

    @Override
    public int getItemCount() {
        return itemList3.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Ramadan;
        TextView Suhoor;
        TextView Iftar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Ramadan=itemView.findViewById(R.id.textView2);
            Suhoor=itemView.findViewById(R.id.textView3);
            Iftar=itemView.findViewById(R.id.textView4);
        }
    }
}
