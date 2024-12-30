package com.miqueias.dslist_workshop_ds.repositories;

import com.miqueias.dslist_workshop_ds.entities.Game;
import com.miqueias.dslist_workshop_ds.projections.GameMinProjection;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// Para conectar e colicitar os dados do banco de dados
public interface GameRepository extends JpaRepository<Game, Long> {

    // Faz consulta no banco de dados passando o script da consulta informado
    @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.title, tb_game.game_year AS gameYear, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
    List<GameMinProjection> searchByList(Long listId);      // O resultado da consula e uma interface/projection
}
