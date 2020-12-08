package com.elmorshdi.hr.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.elmorshdi.hr.R;
import com.elmorshdi.hr.data.Repository;
import com.elmorshdi.hr.data.model.Reqest;

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
//set  data into database
                Repository repository = new Repository(getContext());

                if (mangered.getText().toString().isEmpty()
                        || startdayed.getText().toString().isEmpty()
                        || numberOfDayed.getText().toString().isEmpty()
                        || reasoned.getText().toString().isEmpty()) {

                    Toast.makeText(getContext(), "Empty data", Toast.LENGTH_LONG).show();
                } else {
                    repository.insertreqest(new Reqest(reasoned.getText().toString(),
                            startdayed.getText().toString(),
                            numberOfDayed.getText().toString(),
                            mangered.getText().toString()));
                    Toast.makeText(getContext(), " added", Toast.LENGTH_LONG).show();


                    startdayed.setText("");
                    mangered.setText("");
                    numberOfDayed.setText("");
                    reasoned.setText("");
                }
            }
        });
        return view;
    }
}
