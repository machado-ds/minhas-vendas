package br.com.caranovabrecho.minhasvendas.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.caranovabrecho.minhasvendas.R;
import br.com.caranovabrecho.minhasvendas.model.Venda;
import br.com.caranovabrecho.minhasvendas.ui.recyclerview.adapter.ListaVendasAdapter;
import br.com.caranovabrecho.minhasvendas.util.DataUtil;

public class ResumoDiaActivity extends AppCompatActivity {

    private TextView dataCorrente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_dia);
        setTitle("Resumo do dia");
        dataCorrente = findViewById(R.id.activity_resumo_dia_data_textview);
        dataCorrente.setText(DataUtil.getDataAtualFormatada());

        //Testando a criação de view holders na lista de vendas
        Venda venda1 = new Venda();
        venda1.setTipoItem("Camiseta");
        venda1.setValor("R$25,00");
        venda1.setQuantidade("225");
        Venda venda2 = new Venda();
        venda2.setTipoItem("Chinelo");
        venda2.setValor("R$10,00");
        venda2.setQuantidade("5");
        ArrayList<Venda> listaVendas = new ArrayList<>();
        listaVendas.add(venda1);
        listaVendas.add(venda2);
        RecyclerView listaVendasView = findViewById(R.id.activity_resumo_dia_lista_vendas_recyclerview);
        listaVendasView.setAdapter(new ListaVendasAdapter(this, listaVendas));
    }
}
