package br.com.caranovabrecho.minhasvendas.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Cliente {

    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String valorEmCompras;

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValorEmCompras() {
        return valorEmCompras;
    }

    public void setValorEmCompras(String valorEmCompras) {
        this.valorEmCompras = valorEmCompras;
    }
}
