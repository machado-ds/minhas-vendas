package br.com.caranovabrecho.minhasvendas.ui.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.caranovabrecho.minhasvendas.R;
import br.com.caranovabrecho.minhasvendas.model.Venda;

public class ListaVendasAdapter extends RecyclerView.Adapter {

    private final List<Venda> vendas;
    private Context context;

    public ListaVendasAdapter(Context context, List<Venda> vendas) {
        this.context = context;
        this.vendas = vendas;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewCriada = LayoutInflater.from(context)
                .inflate(R.layout.item_venda, parent, false);
        return new VendaViewHolder(viewCriada);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Venda venda = vendas.get(position);
        configuraCardDeVenda(holder, venda);
    }

    private void configuraCardDeVenda(@NonNull RecyclerView.ViewHolder holder, Venda venda) {
        TextView tipoItem = holder.itemView.findViewById(R.id.item_venda_tipo);
        tipoItem.setText(venda.getTipoItem());
        TextView quantidadeItem = holder.itemView.findViewById(R.id.item_venda_quantidade);
        quantidadeItem.setText(String.valueOf(venda.getQuantidade()));
        TextView valorItem = holder.itemView.findViewById(R.id.item_venda_valor);
        //Para incluir o cifrão antes do valor, preciso criar um String resource utilizando placeholder
        valorItem.setText(String.valueOf(venda.getValor()));
    }

    @Override
    public int getItemCount() {
        return vendas.size();
    }

    class VendaViewHolder extends RecyclerView.ViewHolder {

        public VendaViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
