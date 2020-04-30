package br.com.caranovabrecho.minhasvendas.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;

import br.com.caranovabrecho.minhasvendas.model.Venda;

@Dao
public interface RoomVendaDAO {

    @Insert
    public void salva(Venda venda);

    @Delete
    public void remove(Venda venda);
}
