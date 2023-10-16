package com.wipro.SearchMovie.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.SearchMovie.Service.MovieService;
import com.wipro.SearchMovie.entity.MovieEntity;
import com.wipro.SearchMovie.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<MovieEntity> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public MovieEntity saveMovie(MovieEntity movieEntity) {
		return movieRepository.save(movieEntity);
	}

	@Override
	public MovieEntity getMovieById(Long id) {
		return movieRepository.findById(id).get();
	}

	@Override
	public MovieEntity updateMovie(MovieEntity movieEntity) {
		return movieRepository.save(movieEntity);
	}

	@Override
	public void deleteMovieById(Long id) {
		movieRepository.deleteById(id);
	}
	
	public List<MovieEntity> searchMoviesByName(String movieName) {
        return movieRepository.findByMovieNameContainingIgnoreCase(movieName);
    }

	@Override
	public List<MovieEntity> searchMoviesById(String movieId) {
		return movieRepository.findByMovieIdContainingIgnoreCase(movieId);
	}
	public List<MovieEntity> searchMoviesByRange(Long min, Long max) {
        return movieRepository.findByCollectionRangeBetween(min, max);
    }
	

}
