package br.com.lucas.reis.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.com.lucas.reis.appminhaideiadb.datamodel.ClienteDataModel;
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
        dadoDoObj = new ContentValues();
        //dadoDoObj.put(ProdutoDataModel.ID,obj.getId());
        dadoDoObj.put(ProdutoDataModel.NOME,obj.getNome());
        dadoDoObj.put(ProdutoDataModel.FORNECEDOR,obj.getFornecedor());
        return insert(ProdutoDataModel.TABELA, dadoDoObj);
    }

    @Override
    public boolean alterar(Produto obj) {

        dadoDoObj = new ContentValues();
        dadoDoObj.put(ProdutoDataModel.ID,obj.getId());
        dadoDoObj.put(ProdutoDataModel.NOME,obj.getNome());
        dadoDoObj.put(ProdutoDataModel.FORNECEDOR,obj.getFornecedor());

        return true;

    }

    @Override
    public boolean deletar(int id) {
        return deleteById(ProdutoDataModel.TABELA,id);
    }

    @Override
    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();

        return lista;
    }
}
