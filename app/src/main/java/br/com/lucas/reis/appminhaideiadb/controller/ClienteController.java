package br.com.lucas.reis.appminhaideiadb.controller;

import android.content.Context;
import android.util.Log;

import br.com.lucas.reis.appminhaideiadb.api.AppUtil;
import br.com.lucas.reis.appminhaideiadb.datasource.AppDataBase;

public class ClienteController extends AppDataBase{
    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: CONECTADO AO BANCO");
    }
}
