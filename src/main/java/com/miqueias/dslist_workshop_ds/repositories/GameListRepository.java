package com.miqueias.dslist_workshop_ds.repositories;

import com.miqueias.dslist_workshop_ds.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
