package com.elmorshdi.hr.data;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.elmorshdi.hr.data.model.DatatEmployee;
import com.elmorshdi.hr.data.model.Reqest;

@androidx.room.Database(entities = {DatatEmployee.class, Reqest.class}, version = 1, exportSchema = false)

abstract class Database extends RoomDatabase {
    public static Database instance;

    public static synchronized Database getInstance(Context context) {

        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext()
                    , Database.class, "Data").allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();


        }
        return instance;
    }

    public abstract Dao dao();
}
