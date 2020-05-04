package br.com.caranovabrecho.minhasvendas.database.converter;

import androidx.room.TypeConverter;

import br.com.caranovabrecho.minhasvendas.model.FormaPagamento;

public class ConversorFormaPagamento {

    @TypeConverter
    public String toString(FormaPagamento formaPagamento) {
        return formaPagamento.name();
    }

    @TypeConverter
    public FormaPagamento toFormaPagamento(String valor) {
        return FormaPagamento.valueOf(valor);
    }
}
