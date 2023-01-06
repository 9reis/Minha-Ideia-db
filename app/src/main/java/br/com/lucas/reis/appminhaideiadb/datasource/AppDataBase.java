package br.com.lucas.reis.appminhaideiadb.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import br.com.lucas.reis.appminhaideiadb.api.AppUtil;

public class AppDataBase extends SQLiteOpenHelper{

    public static final String DB_NAME = "AppMinhaIdeia-sqlite";
    public static final int DB_VERSION = 1;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        Log.d(AppUtil.TAG, "AppDataBase: CRIANDO BANCO DE DADOS ");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
