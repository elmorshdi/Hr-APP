package com.elmorshdi.hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class LeaveReqFragment extends Fragment {

    EditText mangered, reasoned, startdayed, numberOfDayed;
    String manger, reason, startday, numberOfDay;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_leavereq, container, false);
        mangered = view.findViewById(R.id.manger);
        startdayed = view.findViewById(R.id.start_date);
        reasoned = view.findViewById(R.id.reason);
        numberOfDayed = view.findViewById(R.id.number_of_day);
        button = view.findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reqest reqest = new Reqest(manger, reason, startday, numberOfDay);

            }
        });
        return view;
    }
}
