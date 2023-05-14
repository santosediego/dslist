package com.santosediego.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santosediego.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
