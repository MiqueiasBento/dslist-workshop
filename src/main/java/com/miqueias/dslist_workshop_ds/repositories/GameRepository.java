package com.miqueias.dslist_workshop_ds.repositories;

import com.miqueias.dslist_workshop_ds.entities.Game;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// Para conectar e colicitar os dados do banco de dados
public interface GameRepository extends JpaRepository<Game, Long> {
}
