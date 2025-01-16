package com.example.estetify;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DescricaoProduto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_descricao_produto);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        KauanRibeiro.Produto produto = (KauanRibeiro.Produto) getIntent().getSerializableExtra("produto");

        if (produto != null) {
            ImageView imagem = findViewById(R.id.imagemProduto);
            TextView nome = findViewById(R.id.nomeProduto);
            TextView valor = findViewById(R.id.valorProduto);

            imagem.setImageResource(produto.getImagem());
            nome.setText(produto.getNome());
            valor.setText(produto.getValor());
        }
    }
}