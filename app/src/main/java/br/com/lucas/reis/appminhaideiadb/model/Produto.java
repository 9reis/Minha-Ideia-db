package br.com.lucas.reis.appminhaideiadb.model;

import android.util.Log;

import br.com.lucas.reis.appminhaideiadb.api.AppUtil;
import br.com.lucas.reis.appminhaideiadb.controller.ICrud;

public class Produto implements ICrud{

    private static final String TAG = "Crud";
    private String nome;
    private String fornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public void incluir() {

    }

    @Override
    public void alterar() {

    }

    @Override
    public void deletar() {

        Log.i(AppUtil.TAG, "deletar: Produto");

    }

    @Override
    public void listar() {

        Log.i(AppUtil.TAG, "listar: Produtos");

    }
}
