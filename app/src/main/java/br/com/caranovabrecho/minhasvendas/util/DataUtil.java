package br.com.caranovabrecho.minhasvendas.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {

    public static String getDataAtualFormatada() {
        Calendar dataAtual = Calendar.getInstance();
        SimpleDateFormat formatador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
        return formatador.format(dataAtual.getTime());
    }
}
