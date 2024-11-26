package com.miqueias.dslist_workshop_ds.services;

import com.miqueias.dslist_workshop_ds.entities.Game;
import com.miqueias.dslist_workshop_ds.entitiesDTO.GameMinDTO;
import com.miqueias.dslist_workshop_ds.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;  // Injecao de dependencia para o repository

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
