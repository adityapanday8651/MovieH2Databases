package com.movie.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Movie {
	@Id
	private int id;
	private String name;
	private String genre;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGenre() {
		return genre;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}	
}
