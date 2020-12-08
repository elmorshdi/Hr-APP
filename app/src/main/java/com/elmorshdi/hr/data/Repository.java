package com.elmorshdi.hr.data;

import android.content.Context;
import android.util.Log;

import com.elmorshdi.hr.data.model.DatatEmployee;
import com.elmorshdi.hr.data.model.Reqest;

import java.util.List;

import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class Repository {

    Database database;
    String tag = "repotag";
    private List<Reqest> reqestList;
    private List<DatatEmployee> employeeList;

    public Repository(Context context) {
        database = Database.getInstance(context);
    }

    public void insertcontact(final DatatEmployee employee) {
        database.dao().insertContact(employee).subscribeOn(Schedulers.io())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.v(tag, "insertSubscribe ");

                    }

                    @Override
                    public void onComplete() {


                    }

                    @Override
                    public void onError(Throwable e) {
                    }
                });
    }

    public void delete(DatatEmployee note) {
        database.dao().delete(note).subscribeOn(Schedulers.computation())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }

    public void insertreqest(final Reqest reqest) {
        database.dao().insertReqest(reqest).subscribeOn(Schedulers.io())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.v(tag, "insertSubscribe ");

                    }

                    @Override
                    public void onComplete() {


                    }

                    @Override
                    public void onError(Throwable e) {
                    }
                });
    }

    public Observable<List<Reqest>> getAllReqest() {

        return database.dao().getAllReqests();
    }

    public Observable<List<DatatEmployee>> getAllEmployee() {

        return database.dao().getAllContacts();
    }
}
