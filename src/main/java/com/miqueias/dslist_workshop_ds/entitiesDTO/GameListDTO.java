package com.miqueias.dslist_workshop_ds.entitiesDTO;

import com.miqueias.dslist_workshop_ds.entities.GameList;

public class GameListDTO {
    private Long id;
    private String nome;

    public GameListDTO(GameList list) {
        this.id = list.getId();
        this.nome = list.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
