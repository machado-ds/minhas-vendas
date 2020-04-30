package br.com.caranovabrecho.minhasvendas.database.converter;

import androidx.room.TypeConverter;

import java.util.Calendar;

public class ConversorCalendar {

    @TypeConverter
    public Long toLong(Calendar valor) {
        return valor.getTimeInMillis();
    }

    @TypeConverter
    public Calendar toCalendar(Long valor) {
        Calendar momentoAtual = Calendar.getInstance();
        momentoAtual.setTimeInMillis(valor);
        return momentoAtual;
    }
}
