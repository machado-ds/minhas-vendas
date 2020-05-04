package br.com.caranovabrecho.minhasvendas.database;

import androidx.room.Database;
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
    public abstract RoomVendaDAO getRoomVendaDAO();
}
