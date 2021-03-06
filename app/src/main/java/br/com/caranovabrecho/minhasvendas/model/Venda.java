package br.com.caranovabrecho.minhasvendas.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Calendar;

import br.com.caranovabrecho.minhasvendas.util.DataUtil;

@Entity
public class Venda {

    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String tipoItem;
    private int valor;
    private int quantidade;
    private FormaPagamento formaPagamento;
    private Calendar data;
    private Long cliente_id;

    public Venda() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Long getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Long cliente_id) {
        this.cliente_id = cliente_id;
    }
    
    public String getDataFormatada() {
        return DataUtil.getDataAtualFormatada();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
