package br.com.caranovabrecho.minhasvendas.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import br.com.caranovabrecho.minhasvendas.database.converter.ConversorCalendar;
import br.com.caranovabrecho.minhasvendas.database.converter.ConversorFormaPagamento;
import br.com.caranovabrecho.minhasvendas.database.dao.RoomVendaDAO;
import br.com.caranovabrecho.minhasvendas.model.Cliente;
import br.com.caranovabrecho.minhasvendas.model.Venda;

@Database(entities = {Venda.class, Cliente.class}, version = 1, exportSchema = false)
@TypeConverters({ConversorCalendar.class, ConversorFormaPagamento.class})
public abstract class MinhasVendasDatabase extends RoomDatabase {

    private static final String NOME_BANCO_DE_DADOS = "minhasvendas.db";

    public abstract RoomVendaDAO getRoomVendaDAO();

    public static MinhasVendasDatabase getInstance(Context context) {
        return Room
                .databaseBuilder(context, MinhasVendasDatabase.class, NOME_BANCO_DE_DADOS)
                .build();
    }
}
