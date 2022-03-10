package com.martinsrvinicius.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martinsrvinicius.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
