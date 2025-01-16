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

public class TelaPrincipal extends BaseActivity {
    private TextView kauan;
    private Button geral, produtos, servicos;
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

        geral = findViewById(R.id.geral);
        produtos = findViewById(R.id.produtos);
        servicos = findViewById(R.id.servicos);
        kauan = findViewById(R.id.kauan);

        setupBottomNavigation();
        updateBottomNavigationSelection(R.id.home);

        Drawable transparenteborda = getResources().getDrawable(R.drawable.button_transparente_borda);
        Drawable coralterada = getResources().getDrawable(R.drawable.cor_alterada);
        geral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (corDiferente) {
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
                if (corDiferente) {
                    produtos.setBackground(transparenteborda);
                } else {
                    produtos.setBackground(coralterada);
                }
                corDiferente = !corDiferente;
            }
        });
        servicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (corDiferente) {
                    servicos.setBackground(transparenteborda);
                } else {
                    servicos.setBackground(coralterada);
                }
                corDiferente = !corDiferente;
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

    public void Geral(View view) {
    }

    public void Produtos(View view) {
    }

    public void Servicos(View view) {
    }


}