package br.com.caranovabrecho.minhasvendas.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caranovabrecho.minhasvendas.R;
import br.com.caranovabrecho.minhasvendas.database.MinhasVendasDatabase;
import br.com.caranovabrecho.minhasvendas.database.dao.RoomVendaDAO;
import br.com.caranovabrecho.minhasvendas.model.Venda;
import br.com.caranovabrecho.minhasvendas.ui.recyclerview.adapter.ListaVendasAdapter;
import br.com.caranovabrecho.minhasvendas.util.DataUtil;

public class ResumoDiaActivity extends AppCompatActivity {

    private List<Venda> listaVendas;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_dia);
        setTitle("Resumo do dia");
        configuraData();
        configuraListaDeVendas();
        configuraValorTotalDeVendasDoDia();
    }

    private void configuraValorTotalDeVendasDoDia() {
        TextView valorTotalVendasDoDiaView = findViewById(R.id.activity_resumo_dia_total_valor_textview);
        int valorTotalVendasDoDiaInt = 0;
        for (Venda venda : listaVendas) {
            valorTotalVendasDoDiaInt += venda.getValor();
        }
        BigDecimal valorTotalVendasDoDiaBigInt = new BigDecimal(valorTotalVendasDoDiaInt / 100);
        valorTotalVendasDoDiaView.setText(String.valueOf(valorTotalVendasDoDiaBigInt));
    }

    private void configuraListaDeVendas() {
        RoomVendaDAO roomVendaDAO = MinhasVendasDatabase.getInstance(this).getRoomVendaDAO();
        listaVendas = roomVendaDAO.vendasDoDia();
        RecyclerView listaVendasView = findViewById(R.id.activity_resumo_dia_lista_vendas_recyclerview);
        listaVendasView.setAdapter(new ListaVendasAdapter(this, listaVendas));
    }

    private void configuraData() {
        TextView dataCorrente = findViewById(R.id.activity_resumo_dia_data_textview);
        dataCorrente.setText(DataUtil.getDataAtualFormatada());
    }
}
