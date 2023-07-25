package com.estudoskelvin.dslist.services;


import com.estudoskelvin.dslist.dto.GameListDTO;


import com.estudoskelvin.dslist.entities.GameList;
import com.estudoskelvin.dslist.repositories.GameListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
         List<GameList> result = gameListRepository.findAll();
         return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
