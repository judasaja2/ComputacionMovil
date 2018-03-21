package com.example.jdavidsanchez.practica2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by johanc.suarez on 21/03/18.
 */

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(Context context) {
        super(context, StatusContract.DB_NAME, null, StatusContract.DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = String
                .format("create table %s (%s int primary key, %s text, %s text, %s int)",
                        StatusContract.TABLE, StatusContract.Column.ID,
                        StatusContract.Column.USER,
                        StatusContract.Column.MESSAGE,
                        StatusContract.Column.CREATED_AT);
        //Sentencia para crear tabla
        //Log.d(TAG, "onCreate with SQL: " + sql);
        db.execSQL(sql); //Ejecución de la sentencia


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists " + StatusContract.TABLE); //Borrar tabla
        onCreate(db);//Crear tabla de nuevo

    }
}
