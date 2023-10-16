package com.wipro.SearchMovie.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.SearchMovie.entity.MovieEntity;
@Service
public interface MovieService {
	
	List<MovieEntity> getAllMovies();

	MovieEntity saveMovie(MovieEntity movieEntity);

	MovieEntity getMovieById(Long id);

	MovieEntity updateMovie(MovieEntity movieEntity);

	void deleteMovieById(Long id);

	List<MovieEntity> searchMoviesByName(String movieName);
	
	List<MovieEntity> searchMoviesById(String movieId);
	
	List<MovieEntity> searchMoviesByRange(Long min, Long max);
	
}
