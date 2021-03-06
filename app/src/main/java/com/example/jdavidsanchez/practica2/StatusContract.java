package com.example.jdavidsanchez.practica2;

import android.provider.BaseColumns;

/**
 * Created by johanc.suarez on 21/03/18.
 */

public class StatusContract {

    public static final String DB_NAME = "timeline.db"; //Nombre de la DB
    public static final int DB_VERSION = 1; //Versión de la DB
    public static final String TABLE = "status"; //Nombre de la tabla

    public class Column { //Columnas de la tabla
        public static final String ID = BaseColumns._ID; //El ID se suele definir así por convención
        public static final String USER = "user";
        public static final String MESSAGE = "message";
        public static final String CREATED_AT = "created_at";
    }
    }
