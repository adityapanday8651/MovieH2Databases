package com.movie.manager;

import java.util.List;

import com.movie.model.Movie;

public interface MovieManager {
	List<Movie> findAll();
	void saveMovie(Movie movie);
}
