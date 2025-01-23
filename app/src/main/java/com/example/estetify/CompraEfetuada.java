package com.example.estetify;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;

import com.example.estetify.utils.Navigation;

public class CompraEfetuada extends AppCompatActivity {
    private Button btn_avancar;
    private Navigation navigation;
    private Intent intent;
    private void initViews() {
        btn_avancar = findViewById(R.id.btn_continuar_pagamento);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_compra_efetuada);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        initViews();

        btn_avancar.setOnClickListener(v -> {
            Intent intent = new Intent(CompraEfetuada.this, TelaPrincipal.class);
            startActivity(intent);
            finish();
        });
    }
}