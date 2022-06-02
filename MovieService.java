package com.movie.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.manager.MovieManager;
import com.movie.model.Movie;
import com.movie.view.ListResponseView;
import com.movie.view.ResponseView;

@RestController
@RequestMapping(path="/movie")
public class MovieService extends GenericService{
	@Autowired MovieManager movieManager;
	
	@PostMapping(value="/save", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveMovie(@RequestBody Movie movie){
		ResponseView res=new ResponseView();
		movieManager.saveMovie(movie);
		res.setMessage("Movie Saved Successfully");
		res.setStatus(true);
		return toSuccess(res);
	}
	
	@GetMapping(value="/list",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> listMovie(){
		List<Movie> list=movieManager.findAll();
		return toSuccess(new ListResponseView(list.size(), list));	
	}
}
