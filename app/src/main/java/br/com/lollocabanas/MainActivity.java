package br.com.lollocabanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Cadastrar;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login = findViewById(R.id.Login);
        Cadastrar = findViewById(R.id.Cadastrar);

        Cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cadastro = new Intent(getApplicationContext(), Cadastro.class);
                startActivity(Cadastro);
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Login Inválido!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}