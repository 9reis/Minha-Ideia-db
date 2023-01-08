package br.com.lucas.reis.appminhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import br.com.lucas.reis.appminhaideiadb.R;
import br.com.lucas.reis.appminhaideiadb.api.AppUtil;
import br.com.lucas.reis.appminhaideiadb.controller.ClienteController;
import br.com.lucas.reis.appminhaideiadb.model.Cliente;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;

    Cliente objCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: APP MINHA IDEIA DATABASE");

        clienteController = new ClienteController(getApplicationContext());

        objCliente = new Cliente();
        objCliente.setNome("Pedro Oliveira");
        objCliente.setEmail("Pedro@teste.com");
        objCliente.setId(3);
//
//        if(clienteController.incluir(objCliente)){
//            Toast.makeText(MainActivity.this, "Cliente "+objCliente.getNome()+" foi incluido com sucesso!",
//                    Toast.LENGTH_SHORT).show();
//            Log.i(AppUtil.TAG, "Cliente "+objCliente.getNome()+" foi incluido com sucesso!");
//        }else{
//            Toast.makeText(MainActivity.this, "Cliente "+objCliente.getNome()+" não foi incluido!",
//                    Toast.LENGTH_SHORT).show();
//            Log.e(AppUtil.TAG, "Cliente "+objCliente.getNome()+" não foi incluido!");
//        }

//        if(clienteController.deletar(objCliente.getId())){
//            Toast.makeText(MainActivity.this, "Cliente "+objCliente.getNome()+" foi ixcluido com sucesso!",
//                    Toast.LENGTH_SHORT).show();
//            Log.i(AppUtil.TAG, "Cliente "+objCliente.getNome()+" foi excluido com sucesso!");
//        }else{
//            Toast.makeText(MainActivity.this, "Cliente "+objCliente.getNome()+" não foi excluido!",
//                    Toast.LENGTH_SHORT).show();
//            Log.e(AppUtil.TAG, "Cliente "+objCliente.getNome()+" não foi excluido!");
//        }

        if(clienteController.alterar(objCliente)){
            Toast.makeText(MainActivity.this, "Cliente "+objCliente.getNome()+" foi alterado com sucesso!",
                    Toast.LENGTH_SHORT).show();
            Log.i(AppUtil.TAG, "Cliente "+objCliente.getNome()+" foi alterado com sucesso!");
        }else{
            Toast.makeText(MainActivity.this, "Cliente "+objCliente.getNome()+" não foi alterado!",
                    Toast.LENGTH_SHORT).show();
            Log.e(AppUtil.TAG, "Cliente "+objCliente.getNome()+" não foi alterado!");
        }

        for (Cliente obj: clienteController.listar()){
            Log.i(AppUtil.TAG, "CLiente: "+obj.getId()+" "+obj.getNome() +" "+obj.getEmail());
        }
    }
}