package com.example.islamicapp.ui.slideshow;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicapp.R;

import com.example.islamicapp.ui.gallery.Model;
import com.example.islamicapp.ui.gallery.itemAdapter;

import java.util.ArrayList;
import java.util.List;

public class SlideshowFragment extends Fragment {


    RecyclerView recyclerView;
    List<Model2> itemList00;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);

        recyclerView = view.findViewById(R.id.recycler2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL, false));

//        initData();

        recyclerView.setAdapter(new itemAdapter2(initData2()));
        return view;

    }

    private List<Model2> initData2() {

        itemList00 = new ArrayList<>();

        itemList00.add(new Model2("AR-RAHMAAN", "ُالرَّحْمَنُ", "The Beneficent"));
        itemList00.add(new Model2("AR-RAHEEM", "ُالرَّحِيمُ", "The Merciful"));
        itemList00.add(new Model2("AL-MALIK", "الْمَلِكُ", "The King"));
        itemList00.add(new Model2("AL-QUDDUS", "الْقُدُّوسُ", "The Most Sacred"));
        itemList00.add(new Model2("AS-SALAM", "السَّلاَمُ", "The Source of Peace, The Flawless"));
        itemList00.add(new Model2("AL-MU’MIN", "الْمُؤْمِنُ", "The Infuser of Faith"));

        return itemList00;
    }

}