package br.com.lollocabanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    Button Cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Cadastrar = findViewById(R.id.Cadastrar);

        Cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Cadastro Realizado com Sucesso", Toast.LENGTH_SHORT).show();
                        Intent Cadastrar = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(Cadastrar);
            }
        });
    }
}