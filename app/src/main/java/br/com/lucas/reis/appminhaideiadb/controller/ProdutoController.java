package br.com.lucas.reis.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.com.lucas.reis.appminhaideiadb.datamodel.ProdutoDataModel;
import br.com.lucas.reis.appminhaideiadb.datasource.AppDataBase;
import br.com.lucas.reis.appminhaideiadb.model.Produto;

public class ProdutoController extends AppDataBase implements ICrud<Produto>{

    ContentValues dadoDoObj;

    public ProdutoController(Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Produto obj) {

        return true;
    }

    @Override
    public boolean alterar(Produto obj) {


        return true;

    }

    @Override
    public boolean deletar(Produto obj) {

        return true;

    }

    @Override
    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();

        return lista;
    }
}
