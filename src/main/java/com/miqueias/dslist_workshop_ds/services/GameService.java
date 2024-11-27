package com.miqueias.dslist_workshop_ds.services;

import com.miqueias.dslist_workshop_ds.entities.Game;
import com.miqueias.dslist_workshop_ds.entitiesDTO.GameDTO;
import com.miqueias.dslist_workshop_ds.entitiesDTO.GameMinDTO;
import com.miqueias.dslist_workshop_ds.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;  // Injecao de dependencia para o repository

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true) // Nao precisa bloquear o BD para escrit, deixando mais rápido
    public GameDTO findById(Long id) {
        Game game = gameRepository.findById(id).get();    // Deve ter um tratamento de excecao pois retorna um optional
        return new GameDTO(game);
    }
}
