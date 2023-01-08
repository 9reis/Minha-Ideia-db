package br.com.lucas.reis.appminhaideiadb.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import br.com.lucas.reis.appminhaideiadb.api.AppUtil;
import br.com.lucas.reis.appminhaideiadb.datamodel.ClienteDataModel;
import br.com.lucas.reis.appminhaideiadb.datamodel.ProdutoDataModel;

public class AppDataBase extends SQLiteOpenHelper{

    public static final String DB_NAME = "AppMinhaIdeia-sqlite";
    public static final int DB_VERSION = 1;

    SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        Log.d(AppUtil.TAG, "AppDataBase: CRIANDO BANCO DE DADOS ");

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ClienteDataModel.criarTabela());
        Log.d(AppUtil.TAG, "onCreate: Tabela Cliente"+ClienteDataModel.criarTabela());

        db.execSQL(ProdutoDataModel.criarTabela());
        Log.d(AppUtil.TAG, "onCreate: Tabela Produto"+ProdutoDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {}

    public boolean insert(String tabela, ContentValues dados ){

        db = getWritableDatabase();

        boolean retorno = false;

        try{
            retorno = db.insert(tabela, null, dados) > 0;
        }catch (Exception e){
            Log.d(AppUtil.TAG, "insert: "+ e.getMessage());
        }

        return retorno;
    }

    public boolean update(String tabela, ContentValues dados ){

        db = getWritableDatabase();

        boolean retorno = false;

        try{
            retorno = db.update(tabela,dados,"id = ?",
                    new String[] {String.valueOf(dados.get("id"))} ) > 0;
        }catch (Exception e){
            Log.d(AppUtil.TAG, "insert: "+ e.getMessage());
        }

        return retorno;
    }

    public boolean deleteById (String tabela, int id ){

        db = getWritableDatabase();

        boolean retorno = false;

        try{
            retorno = db.delete(tabela, "id = ?",
                    new String[] {String.valueOf(id)}) > 0;
        }catch (Exception e){
            Log.d(AppUtil.TAG, "delete: "+ e.getMessage());
        }

        return retorno;
    }


}
