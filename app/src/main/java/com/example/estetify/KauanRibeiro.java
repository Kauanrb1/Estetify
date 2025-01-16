package com.example.estetify;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.Serializable;

public class KauanRibeiro extends AppCompatActivity {

    private boolean corDiferente = false;
    private Button geral, produtos, servicos;
    private ImageView postImage, postImage1, postImage2;

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
        servicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(corDiferente){
                    servicos.setBackground(transparenteborda);
                } else {
                    servicos.setBackground(coralterada);
                }
                corDiferente = !corDiferente;
            }
        });
        postImage.setOnClickListener(v -> openProductDetail(
                R.drawable.pomada, "Pomada", "R$ 15,00", "Pomada de alta qualidade para modelar cabelos."
        ));

        postImage1.setOnClickListener(v -> openProductDetail(
                R.drawable.pomadadapper, "Creme", "R$ 12,00", "Creme hidratante para todos os tipos de pele."
        ));

        postImage2.setOnClickListener(v -> openProductDetail(
                R.drawable.oleobarba, "Óleo", "R$ 18,00", "Óleo para barba com fragrância natural."
        ));
    }
    private void IniciarComponentes() {
    geral = findViewById(R.id.Geral);
    produtos = findViewById(R.id.Produtos);
    servicos = findViewById(R.id.Servicos);
    postImage = findViewById(R.id.postImage);
    postImage1 = findViewById(R.id.postImage1);
    postImage2 = findViewById(R.id.postImage2);
    }
    private void openProductDetail(int imageResId, String name, String price, String description) {
        Intent intent = new Intent(this, DescricaoProduto.class);
        intent.putExtra("imageResId", imageResId);
        intent.putExtra("name", name);
        intent.putExtra("price", price);
        intent.putExtra("description", description);
        startActivity(intent);
    }

    public class Produto implements Serializable {
        private String nome, valor, descricao;
        private int imagem;

        public Produto(String nome, String valor, String descricao, int imagem) {
            this.nome = nome;
            this.valor = valor;
            this.imagem = imagem;
            this.descricao = descricao;
        }

        public Produto(String pomada, String valor, int pomada1) {
        }

        public String getNome() {

            return nome;
        }

        public String getValor() {

            return valor;
        }

        public int getImagem() {
            return imagem;
        }

        public String getDescricao() {

            return descricao;
        }
    }
    private void abrirDetalhesProduto(Produto produto) {
        Intent intent = new Intent(this, DescricaoProduto.class);
        intent.putExtra("Produto", produto);
        startActivity(intent);
    }

}