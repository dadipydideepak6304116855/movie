package com.wipro.SearchMovie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class MovieEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long srno;
	
	private String movieId;
	
	private String movieName;
	
	private Long collectionRange;
	
	public Long getSrno() {
		return srno;
	}
	public void setSrno(Long srno) {
		this.srno = srno;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Long getCollectionRange() {
		return collectionRange;
	}
	public void setCollectionRange(Long collectionRange) {
		this.collectionRange = collectionRange;
	}
	public MovieEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieEntity(Long srno, String movieId, String movieName, Long collectionRange) {
		super();
		this.srno = srno;
		this.movieId = movieId;
		this.movieName = movieName;
		this.collectionRange = collectionRange;
	}
	@Override
	public String toString() {
		return "MovieEntity [srno=" + srno + ", movieId=" + movieId + ", movieName=" + movieName + ", collectionRange="
				+ collectionRange + "]";
	}
	
	
	
	
}
