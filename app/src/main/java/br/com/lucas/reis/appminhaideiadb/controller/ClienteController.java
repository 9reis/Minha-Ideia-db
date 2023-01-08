package br.com.lucas.reis.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.com.lucas.reis.appminhaideiadb.api.AppUtil;
import br.com.lucas.reis.appminhaideiadb.datamodel.ClienteDataModel;
import br.com.lucas.reis.appminhaideiadb.datasource.AppDataBase;
import br.com.lucas.reis.appminhaideiadb.model.Cliente;

public class ClienteController extends AppDataBase implements ICrud<Cliente> {

    ContentValues dadoDoObj;

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: CONECTADO AO BANCO");
    }

    @Override
    public boolean incluir(Cliente obj) {
        // INSERT INTO TABLE(... ... ... ) VALUES ( XXX XXX XXX )

        dadoDoObj = new ContentValues();//Key, value

        // dadoDoObj.put(ClienteDataModel.ID, obj.getNome());
        dadoDoObj.put(ClienteDataModel.NOME, obj.getNome());
        dadoDoObj.put(ClienteDataModel.EMAIL, obj.getEmail());

        //ENVIAR OS DADOS (dadoDoObj) PARA A CLASSE AppDatabase
        // Utilizando um metodo capaz de add o OBJ no banco
        // tabela Cliente

        return insert(ClienteDataModel.TABELA, dadoDoObj);
    }

    @Override
    public boolean alterar(Cliente obj) {

        dadoDoObj = new ContentValues();//Key, value

        dadoDoObj.put(ClienteDataModel.ID, obj.getNome());
        dadoDoObj.put(ClienteDataModel.NOME, obj.getNome());
        dadoDoObj.put(ClienteDataModel.EMAIL, obj.getEmail());

        return true;

    }

    @Override
    public boolean deletar(int id) {
        return deleteById(ClienteDataModel.TABELA,id);
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<>();

        return lista;
    }
}
