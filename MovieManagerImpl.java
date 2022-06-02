package com.movie.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.manager.MovieManager;
import com.movie.model.Movie;
import com.movie.repository.MovieRepository;

@Service("MovieManager")
public class MovieManagerImpl implements MovieManager{
	
	@Autowired MovieRepository movieRepository;
	
	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return (List<Movie>) movieRepository.findAll();
	}

	@Override
	public void saveMovie(Movie movie) {
		// TODO Auto-generated method stub
		movieRepository.save(movie);
	}

}
