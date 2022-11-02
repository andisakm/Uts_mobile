package com.example.activity_main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment implements View.OnClickListener{

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnFragment = view.findViewById(R.id.btn_fragment);
        btnFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_fragment) {
            TampilanFragment mTampilanFragment = new TampilanFragment();
            FragmentManager mFragmentManager = getParentFragmentManager();
            mFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, mTampilanFragment, TampilanFragment.class.getSimpleName())
                    .addToBackStack(null)
                    .commit();
        }
    }
}