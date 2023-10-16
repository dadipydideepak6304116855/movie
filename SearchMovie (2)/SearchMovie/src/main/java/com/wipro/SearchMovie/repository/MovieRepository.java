package com.wipro.SearchMovie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.SearchMovie.entity.MovieEntity;
@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
    List<MovieEntity> findByMovieNameContainingIgnoreCase(String name);
    
    List<MovieEntity> findByMovieIdContainingIgnoreCase(String movieId);
    
    List<MovieEntity> findByCollectionRangeBetween(Long min, Long max);

}

