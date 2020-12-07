package com.elmorshdi.hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ContactsFragment extends Fragment implements View.OnClickListener {
    DatatEmployee employee;
    ArrayList<DatatEmployee> mydata;
    private RecyclerView recyclerView;
    private MyCustomAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_contact, container, false);


        recyclerView = view.findViewById(R.id.data);
        adapter = new MyCustomAdapter(mydata, getActivity().getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mydata = new ArrayList<DatatEmployee>();
        mydata.add(new DatatEmployee("Employee 1", "Cairo", "01123425119", R.drawable.person));
        mydata.add(new DatatEmployee("Employee 2", "Cairo", "01293854561", R.drawable.person));
        mydata.add(new DatatEmployee("Employee 3", "Cairo", "01061355644", R.drawable.person));
        mydata.add(new DatatEmployee("Employee 5", "Cairo", "01167820913", R.drawable.person));

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.card:
                Intent intent = new Intent(getActivity(), ProfileActivity.class);
                startActivity(intent);
                break;
        }
    }
}
