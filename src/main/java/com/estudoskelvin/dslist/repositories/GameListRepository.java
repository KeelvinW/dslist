package com.estudoskelvin.dslist.repositories;


import com.estudoskelvin.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
