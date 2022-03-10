package com.martinsrvinicius.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martinsrvinicius.dsmovie.entities.Score;
import com.martinsrvinicius.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
