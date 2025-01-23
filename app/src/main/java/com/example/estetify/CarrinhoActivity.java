package com.example.estetify;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoActivity extends BaseActivity {
    private Button btnFinalizarCompra;
    private RecyclerView recyclerView;
    private CarrinhoAdapter adapter;
    private List<Produto> listaDeProdutos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);

        btnFinalizarCompra = findViewById(R.id.Comprar);
        recyclerView = findViewById(R.id.recyclerProdutos);

        // Definindo o layout manager para o RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Inicializando a lista de produtos
        listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(new Produto("Produto 1", 100.00, 1));
        listaDeProdutos.add(new Produto("Produto 2", 200.00, 2));
        listaDeProdutos.add(new Produto("Produto 3", 150.00, 1));

        // Inicializando o adaptador
        adapter = new CarrinhoAdapter(listaDeProdutos);
        recyclerView.setAdapter(adapter);  // Definindo o adaptador no RecyclerView

        btnFinalizarCompra.setOnClickListener(v -> {
            Intent intent = new Intent(CarrinhoActivity.this, FormaPagamento.class);
            startActivity(intent);
            finish();
        });
    }
}
