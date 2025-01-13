package com.example.estetify;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Localizacao extends AppCompatActivity {

    private ImageView perfil, pesquisa, localizacao, home, notificacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_localizacao);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        IniciarComponentes();
        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Localizacao.this, Perfil.class);
                startActivity(intent);
            }
        });
        pesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Localizacao.this, Pesquisa.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Localizacao.this, TelaPrincipal.class);
                startActivity(intent);
            }
        });
        notificacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Localizacao.this, Notificacao.class);
                startActivity(intent);
            }
        });
        localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Localizacao.this, Localizacao.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void IniciarComponentes(){
        perfil = findViewById(R.id.Perfil);
        pesquisa = findViewById(R.id.pesquisa);
        localizacao = findViewById(R.id.localizacao);
        home = findViewById(R.id.home);
        notificacoes = findViewById(R.id.notificacoes);

    }
}