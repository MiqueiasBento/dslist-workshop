package com.miqueias.dslist_workshop_ds.services;

import com.miqueias.dslist_workshop_ds.entities.GameList;
import com.miqueias.dslist_workshop_ds.entitiesDTO.GameListDTO;
import com.miqueias.dslist_workshop_ds.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
