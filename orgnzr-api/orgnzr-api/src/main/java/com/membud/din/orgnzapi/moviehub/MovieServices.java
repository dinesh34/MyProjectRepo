package com.membud.din.orgnzapi.moviehub;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServices {
	
	@Autowired
	private MovieRepository movieRepo;
	
	public List<Movie> getAllMovies(){
		List<Movie> movies  = new ArrayList<>();
		movieRepo.findAll().forEach(movies::add);
		return movies;
	}
	
	public Optional<Movie> getMovie(String movId){
		return movieRepo.findById(movId);
	}
	
	public void addMovie(Movie movie) {
		 movieRepo.save(movie);
	}
	
	public void updateMovie(Movie movie) {
		 movieRepo.save(movie);
	}
	
	public void deleteMovie(Movie movie) {
		movieRepo.delete(movie);
	}
	
	public List<Movie> findByMovName(String movName) {
		List<Movie> movies = new ArrayList<>();
		movieRepo.findByMovname(movName).forEach(movies::add);
		return movies;
		
	}
	
	public List<Movie> findByDirector(String director){
		List<Movie> movies = new ArrayList<>();
		movieRepo.findByDirector(director).forEach(movies::add);
		return movies;
	}
	
	
	
}
