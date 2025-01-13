package com.example.estetify;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TelaPrincipal extends AppCompatActivity {
    private TextView kauan;
    private ImageView perfil, pesquisa, home, localizacao, notificacoes;
    private Button geral, produtos, serviços;
    private boolean corDiferente = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
            });

            IniciarComponentes();

            perfil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(TelaPrincipal.this, Perfil.class);
                    startActivity(intent);
                }
            });
        Drawable transparenteborda = getResources().getDrawable(R.drawable.button_transparente_borda);
        Drawable coralterada = getResources().getDrawable(R.drawable.cor_alterada);
        geral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(corDiferente){
                    geral.setBackground(transparenteborda);
                } else {
                    geral.setBackground(coralterada);
                }
                corDiferente = !corDiferente;
            }
        });

        produtos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(corDiferente){
                    produtos.setBackground(transparenteborda);
                } else {
                    produtos.setBackground(coralterada);
                }
                corDiferente = !corDiferente;
            }
        });
        serviços.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(corDiferente){
                    serviços.setBackground(transparenteborda);
                } else {
                    serviços.setBackground(coralterada);
                }
                corDiferente = !corDiferente;
            }
        });
        pesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPrincipal.this, Pesquisa.class);
                startActivity(intent);
            }
        });

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, Perfil.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, TelaPrincipal.class);
                startActivity(intent);
                finish();
            }
        });
        notificacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, Notificacao.class);
                startActivity(intent);
                finish();
            }
        });
        localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, Localizacao.class);
                startActivity(intent);
                finish();
            }
        });
        kauan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, KauanRibeiro.class);
                startActivity(intent);
            }
        });

    }
private void IniciarComponentes() {
        perfil = findViewById(R.id.Perfil);
        geral = findViewById(R.id.Geral);
        produtos = findViewById(R.id.Produtos);
        serviços = findViewById(R.id.Serviços);
        pesquisa = findViewById(R.id.pesquisa);
        home = findViewById(R.id.home);
        localizacao = findViewById(R.id.localizacao);
        notificacoes = findViewById(R.id.notificacoes);
        kauan = findViewById(R.id.kauan);

}
    public void Geral(View view) {
    }

    public void Produtos(View view) {
    }

    public void Serviços(View view) {
    }

    public void Perfil(View view) {
    }
}