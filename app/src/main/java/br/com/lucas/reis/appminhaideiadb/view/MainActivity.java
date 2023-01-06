package br.com.lucas.reis.appminhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import br.com.lucas.reis.appminhaideiadb.R;
import br.com.lucas.reis.appminhaideiadb.api.AppUtil;
import br.com.lucas.reis.appminhaideiadb.controller.ClienteController;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: APP MINHA IDEIA DATABASE");

        clienteController = new ClienteController(getApplicationContext());
    }
}