package com.example.alu.p_44_tabs_final;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {

    private static final String ARG_NUM_TAB = "numTab";
    private String mNumTab;

    public BlankFragment2() {
    }
    public static BlankFragment2 newInstance(String param1) {
        BlankFragment2 fragment2 = new BlankFragment2();
        Bundle args = new Bundle();
        args.putString(ARG_NUM_TAB, param1);
        fragment2.setArguments(args);
        return fragment2;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mNumTab = getArguments().getString(ARG_NUM_TAB);
        }
    }
    @SuppressLint("StringFormatInvalid")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        ImageView imagenView=view.findViewById(R.id.imageView);
        if(mNumTab.equalsIgnoreCase("zaragoza")){
            imagenView.setImageDrawable(getResources().getDrawable(R.drawable.zaragoza));
        }else{
            imagenView.setImageDrawable(getResources().getDrawable(R.drawable.teruel));
        }
        return view;
    }

}
