package com.elmorshdi.hr.data;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.elmorshdi.hr.data.model.DatatEmployee;
import com.elmorshdi.hr.data.model.Reqest;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;

@androidx.room.Dao
interface Dao {
    @Insert
    Completable insertContact(DatatEmployee employee);

    @Insert
    Completable insertReqest(Reqest reqest);

    @Delete
    Completable delete(DatatEmployee employee);

    @Query("SELECT * FROM DatatEmployee")
    Observable<List<DatatEmployee>> getAllContacts();

    @Query("SELECT * FROM Reqest")
    Observable<List<Reqest>> getAllReqests();
}
