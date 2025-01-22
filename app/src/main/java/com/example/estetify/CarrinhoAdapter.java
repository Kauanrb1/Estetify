package com.example.estetify;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarrinhoAdapter extends RecyclerView.Adapter<CarrinhoAdapter.ViewHolder> {

    private List<Produto> produtos;

    public CarrinhoAdapter(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_produto, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Produto produto = produtos.get(position);

        holder.produtoNome.setText(produto.getNome());
        holder.produtoPreco.setText("R$ " + produto.getPreco());
        holder.produtoQuantidade.setText(String.valueOf(produto.getQuantidade()));
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView produtoNome, produtoPreco;
        EditText produtoQuantidade;
        ImageView produtoImagem;
        Button excluirProduto;

        public ViewHolder(View itemView) {
            super(itemView);
            produtoNome = itemView.findViewById(R.id.produtoNome);
            produtoPreco = itemView.findViewById(R.id.produtoPreco);
            produtoQuantidade = itemView.findViewById(R.id.produtoQuantidade);
            produtoImagem = itemView.findViewById(R.id.produtoImagem);
            excluirProduto = itemView.findViewById(R.id.excluirProduto);
        }
    }
}
