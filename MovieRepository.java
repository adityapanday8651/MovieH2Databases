package com.movie.repository;

import org.springframework.data.repository.CrudRepository;

import com.movie.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer>{

}
