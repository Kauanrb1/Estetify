package com.example.estetify;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CarrinhoAdapter adapter;
    private List<Produto> listaDeProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);

        // Inicializando o RecyclerView
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
    }
}
