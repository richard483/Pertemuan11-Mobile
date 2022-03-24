package com.example.pertemuan11_fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Fragment1 extends Fragment {

    Button toActivity2_bt;

    View.OnClickListener tofragment2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getParentFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new Fragment2())
                    .addToBackStack(null).commit();
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        toActivity2_bt = getActivity().findViewById(R.id.toActivity2_bt);
//        toActivity2_bt.setOnClickListener(tofragment2);

    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getContext(), "ON START", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getContext(), "ON RESUME", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getContext(), "ON PAUSE", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getContext(), "ON STOP", Toast.LENGTH_SHORT).show();
    }

    //    @Override
//    public void onResume() {
//        super.onResume();
//        Toast.makeText(getContext(), "ON RESUME", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void onPause() {
//        super.onPause();
//        Toast.makeText(getContext(), "ON PAUSE", Toast.LENGTH_SHORT).show();
//    }
}