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

public class FragmentA extends Fragment {
    TextView txta;
    EditText eda;
    Button btna;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_a,container,false);
        txta=view.findViewById(R.id.txtA);
        eda=view.findViewById(R.id.edA);
        btna=view.findViewById(R.id.btnA);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txtb=(TextView) getActivity().findViewById(R.id.txtB);
                txtb.setText(eda.getText().toString());
            }
        });
        return view;
    }
}
