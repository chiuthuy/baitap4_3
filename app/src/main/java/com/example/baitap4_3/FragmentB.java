package com.example.baitap4_3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {
    TextView txtb;
    EditText edb;
    Button btnb;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_b,container,false);
        txtb=view.findViewById(R.id.txtB);
        edb=view.findViewById(R.id.edB);
        btnb=view.findViewById(R.id.btnB);
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txta=(TextView) getActivity().findViewById(R.id.txtA);
                txta.setText(edb.getText().toString());
            }
        });
        return view;
    }
}
