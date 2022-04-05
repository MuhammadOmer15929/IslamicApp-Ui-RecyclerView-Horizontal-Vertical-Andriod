package com.example.islamicapp;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentOwn#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentOwn extends Fragment {
  Activity table;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentOwn() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentOwn.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentOwn newInstance(String param1, String param2) {
        FragmentOwn fragment = new FragmentOwn();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        table=getActivity();

    }

    @Override
    public void onStart() {
        super.onStart();
        TextView txt1;
        TextView txt2;
        TextView txt3;
        TextView txt4;
        TextView txt5;
        TextView txt6;
        TextView txt7;
        TextView txt8;
        TextView txt9;
        TextView txt10;
        TextView txt11;
        TextView txt12;


        final int[] index = {0};
        String[] dua1;


        txt1=(TextView)table.findViewById(R.id.txt01);
        txt2=(TextView)table.findViewById(R.id.txt02);
        txt3=(TextView)table.findViewById(R.id.txt03);
        txt4=(TextView)table.findViewById(R.id.txt04);
        txt5=(TextView)table.findViewById(R.id.txt05);
        txt6=(TextView)table.findViewById(R.id.txt06);
        txt7=(TextView)table.findViewById(R.id.txt07);
        txt8=(TextView)table.findViewById(R.id.txt08);
        txt9=(TextView)table.findViewById(R.id.txt09);
        txt10=(TextView)table.findViewById(R.id.txt10);
        txt11=(TextView)table.findViewById(R.id.txt11);
        txt12=(TextView)table.findViewById(R.id.txt12);


        dua1=getResources().getStringArray(R.array.MasnonDua);
        txt1.setText("أسْتَغْفِرُ اللهَ العَظِيمَ الَّذِي....");
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(dua1[index[0] =0]);
            }
        });
        txt2.setText("اللَّهُمَّ أَنْتَ رَبِّي، لَا.... ");
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("أسْتَغْفِرُ اللهَ العَظِيمَ الَّذِي....");
                txt2.setText(dua1[index[0] =1]);
            }
        });
        txt3.setText("اللَّهُ لَا إِلَهَ إِلَّا هُو....");
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setText("اللَّهُمَّ أَنْتَ رَبِّي، لَا....");
                txt3.setText(dua1[index[0] =2]);
            }
        });
        txt4.setText("اللَّهُمَّ أَنْتَ رَبِّي لا....");
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt3.setText("اللَّهُ لَا إِلَهَ إِلَّا هُو....");
                txt4.setText(dua1[index[0] =3]);
            }
        });
        txt5.setText("بسم اللہ الرحمن الرحیم....");
        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt4.setText("اللَّهُمَّ أَنْتَ رَبِّي لا....");
                txt5.setText(dua1[index[0] =4]);
            }
        });
        txt6.setText("رَضيـتُ بِاللهِ رَبَّـاً وَبِالإسْلامِ....");
        txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt5.setText("بسم اللہ الرحمن الرحیم....");
                txt6.setText(dua1[index[0] =5]);
            }
        });
        txt7.setText("اللہم اجرنی من النار....");
        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt6.setText("رَضيـتُ بِاللهِ رَبَّـاً وَبِالإسْلامِ....");
                txt7.setText(dua1[index[0] =6]);
            }
        });
        txt8.setText("اللّهُـمَّ إِنِّـي أسْـأَلُـكَ العَـفْو....");
        txt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt7.setText("اللہم اجرنی من النار....");
                txt8.setText(dua1[index[0] =7]);
            }
        });
        txt9.setText("يَاحَيُّ يَا قيُّومُ بِرَحْمَتِكَ.... ");
        txt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt8.setText("اللّهُـمَّ إِنِّـي أسْـأَلُـكَ العَـفْو....");
                txt9.setText(dua1[index[0] =8]);
            }
        });
        txt10.setText("سبحان اللہ العظیم و....");
        txt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt9.setText("يَاحَيُّ يَا قيُّومُ بِرَحْمَتِكَ.... ");
                txt10.setText(dua1[index[0] =9]);
            }
        });
        txt11.setText("اللّهُـمَّ ما أَصْبَـَحَ بي....");
        txt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt10.setText("سبحان اللہ العظیم و....");
                txt11.setText(dua1[index[0] =10]);
            }
        });
        txt12.setText("اللّهُـمَّ إِنِّـي أَصْبَـحْتُ أُشْـهِدُك....");
        txt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt11.setText("اللّهُـمَّ ما أَصْبَـَحَ بي....");
                txt12.setText(dua1[index[0] =11]);
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_own, container, false);
    }
}