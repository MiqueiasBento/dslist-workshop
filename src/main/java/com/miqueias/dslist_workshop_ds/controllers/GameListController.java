package com.miqueias.dslist_workshop_ds.controllers;

import com.miqueias.dslist_workshop_ds.entities.GameList;
import com.miqueias.dslist_workshop_ds.entitiesDTO.GameDTO;
import com.miqueias.dslist_workshop_ds.entitiesDTO.GameListDTO;
import com.miqueias.dslist_workshop_ds.entitiesDTO.GameMinDTO;
import com.miqueias.dslist_workshop_ds.services.GameListService;
import com.miqueias.dslist_workshop_ds.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
