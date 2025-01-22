package com.example.estetify;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.estetify.utils.Navigation;

public class ConfirmacaoPagamento extends AppCompatActivity {

    private ImageView voltar;
    private Button btn_avançar;
    private Navigation navigation;

    private void initViews() {
        voltar = findViewById(R.id.voltar);
        btn_avançar = findViewById(R.id.btn_continuar_pagamento);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_confirmacao_pagamento);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        voltar.setOnClickListener(v -> {
            navigation.navigationToBackScreen(this);
        });

        btn_avançar.setOnClickListener(v -> {
            Intent intent = new Intent(ConfirmacaoPagamento.this, CompraEfetuada.class);
            startActivity(intent);
            finish();
        });


    }
}