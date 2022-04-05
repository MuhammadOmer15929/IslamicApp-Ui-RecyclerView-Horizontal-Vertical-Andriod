package com.example.islamicapp.ui.slideshow;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicapp.R;

import java.util.List;

public class itemAdapter2  extends RecyclerView.Adapter<itemAdapter2.ViewHolder>
{

      List<Model2>itemlist9;

    public itemAdapter2(List<Model2> itemlist9) {
        this.itemlist9 = itemlist9;
    }

    @NonNull
    @Override
    public itemAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowitem2,parent,false);
        itemAdapter2.ViewHolder viewHolder=new itemAdapter2.ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull itemAdapter2.ViewHolder holder, int position) {

        holder.English.setText(itemlist9.get(position).getEnglish());
        holder.Arabic.setText(itemlist9.get(position).getArabic());
        holder.Meaning.setText(itemlist9.get(position).getMeaning());

    }

    @Override
    public int getItemCount() {
        return itemlist9.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView English;
        TextView Arabic;
        TextView Meaning;
        public ViewHolder(View view) {
            super(view);
            English=view.findViewById(R.id.textView5);
            Arabic=view.findViewById(R.id.textView7);
            Meaning=view.findViewById(R.id.textView8);


        }
    }
}
