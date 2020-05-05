package br.com.caranovabrecho.minhasvendas.database.converter;

import androidx.room.TypeConverter;

import java.util.Calendar;

public class ConversorCalendar {

    @TypeConverter
    public String toString(Calendar valor) {
        int year = valor.get(Calendar.YEAR);
        int month = valor.get(Calendar.MONTH);
        int day = valor.get(Calendar.DAY_OF_MONTH);
        return year + "-" + month + "-" + day;
    }

    @TypeConverter
    public Calendar toCalendar(String valor) {
        String[] valoresDeData = valor.split("-");
        int year = Integer.parseInt(valoresDeData[0]);
        int month = Integer.parseInt(valoresDeData[1]);
        int day = Integer.parseInt(valoresDeData[2]);
        Calendar momentoAtual = Calendar.getInstance();
        momentoAtual.set(Calendar.YEAR, year);
        momentoAtual.set(Calendar.MONTH, month);
        momentoAtual.set(Calendar.DAY_OF_MONTH, day);
        return momentoAtual;
    }
}
