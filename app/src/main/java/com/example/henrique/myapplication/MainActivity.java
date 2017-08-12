package com.example.henrique.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "livro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        TextView tLogin = (TextView) findViewById(R.id.tLogin);
        TextView tSenha = (TextView) findViewById(R.id.tSenha);
        String login = tLogin.getText().toString();
        String senha = tSenha.getText().toString();
        if(login.equals("henrique") && senha.equals("123")){
//            Toast.makeText(this, "Bem vindo", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getContext(), BemVindoActivity.class);
            Bundle params = new Bundle();
            params.putString("nome", "Henrique Schorr");
            intent.putExtras(params);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Errrou", Toast.LENGTH_SHORT).show();
        }
    }

    private Context getContext(){
        return this;
    }


}
