package com.example.islamicapp.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicapp.R;
import com.example.islamicapp.databinding.FragmentGalleryBinding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class GalleryFragment extends Fragment {


    RecyclerView recyclerView;
    List<Model> itemList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

//    initData();

        recyclerView.setAdapter(new itemAdapter(initData()));


        return view;
    }

    private List<Model> initData() {

        itemList = new ArrayList<>();
        itemList.add(new Model(" 1 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model(" 2 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model(" 3 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model(" 4 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model(" 5 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model(" 6 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model(" 7 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model(" 8 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model(" 9 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("10 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("11 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("12 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("13 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("14 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("15 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("16 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("17 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("18 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("19 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("20 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("21 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("22 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("23 Ramadan 1443 AH", "04:28", "6:43"));
        itemList.add(new Model("24 Ramadan 1443 AH", "04:28", "6:43"));


        return itemList;
    }

    @Override
    public void onStart() {
        super.onStart();
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MMMM:yyyy HH:mm:ss a");
        String strDate = sdf.format(c.getTime());
    }

}