package com.example.estetify;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DescricaoProduto extends AppCompatActivity {


    private Button comprar;

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
        IniciarComponentes();

        ImageView productImage = findViewById(R.id.productImage);
        TextView productName = findViewById(R.id.productName);
        TextView productPrice = findViewById(R.id.productPrice);
        TextView productDescription = findViewById(R.id.productDescription);
        RatingBar ratingBarProduto = findViewById(R.id.ratingBarProduto);

        // Receber os dados passados pela Intent
        Intent intent = getIntent();
        int imageResId = intent.getIntExtra("imageResId", 0);
        String name = intent.getStringExtra("name");
        String price = intent.getStringExtra("price");
        String description = intent.getStringExtra("description");
        float avaliacao = intent.getFloatExtra("ratingBarProduto", 0.0f);

        // Configurar os dados na tela
        productImage.setImageResource(imageResId);
        productName.setText(name);
        productPrice.setText(price);
        productDescription.setText(description);
        ratingBarProduto.setRating(avaliacao);

//        comprar.setOnClickListener(v -> {
//            Intent i = new Intent(DescricaoProduto.this, Carrinho.class);
//
//            // Passe os dados do produto como extras no Intent
//            KauanRibeiro.Produto produto = null;
//            intent.putExtra("nomeProduto", produto.getNome());
//            intent.putExtra("precoProduto", produto.getPreco());
//            intent.putExtra("quantidadeProduto", 1); // Quantidade padrão (se necessário)
//            intent.putExtra("imagemProduto", produto.getImagemUrl()); // Exemplo se o produto tiver imagem
//
//            startActivity(i);
//        });

    }
    public void IniciarComponentes() {
        comprar = findViewById(R.id.comprar);

    }
}