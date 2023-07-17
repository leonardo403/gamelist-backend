package com.elohim.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elohim.gamelist.dto.GameMinDTO;
import com.elohim.gamelist.entities.Game;
import com.elohim.gamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();		
	}

}
