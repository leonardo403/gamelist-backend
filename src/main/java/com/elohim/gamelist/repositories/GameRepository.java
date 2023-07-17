package com.elohim.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elohim.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
