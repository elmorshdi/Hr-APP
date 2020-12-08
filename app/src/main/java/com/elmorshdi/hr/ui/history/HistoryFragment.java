package com.elmorshdi.hr.ui.history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.elmorshdi.hr.R;
import com.elmorshdi.hr.data.Repository;
import com.elmorshdi.hr.data.model.Reqest;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class HistoryFragment extends Fragment {

    Reqest reqest;
    List<Reqest> mydata;
    private RecyclerView recyclerView;
    private HistoryAdapter adapter;
    private Repository repository;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);
        repository = new Repository(getContext());
        recyclerView = view.findViewById(R.id.data);
        adapter = new HistoryAdapter(mydata, getActivity().getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);
//get data from database
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        repository = new Repository(getContext());
        mydata = new ArrayList<>();
        repository.getAllReqest()
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Reqest>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<Reqest> reqests) {

                        if (reqests != null) {
                            mydata = reqests;
                            adapter.setData(reqests);
                            adapter.notifyDataSetChanged();
                        }
                    }


                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }


                });


    }


}
