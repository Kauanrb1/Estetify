package com.example.estetify;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KauanRibeiro extends AppCompatActivity {

    private boolean corDiferente = false;
    private Button geral, produtos, serviços;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kauan_ribeiro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        IniciarComponentes();

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
    }
    private void IniciarComponentes() {
    geral = findViewById(R.id.Geral);
    produtos = findViewById(R.id.Produtos);
    serviços = findViewById(R.id.Serviços);
    }
}