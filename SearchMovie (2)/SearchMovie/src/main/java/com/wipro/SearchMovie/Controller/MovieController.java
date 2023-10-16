package com.wipro.SearchMovie.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.SearchMovie.Service.MovieService;
import com.wipro.SearchMovie.entity.MovieEntity;

@Controller
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/")
	public String welcome(Model model) {
		return "index";
	}

	@GetMapping("/movies")
	public String listMovies(Model model) {
		model.addAttribute("movies", movieService.getAllMovies());
		return "movies";
	}
	@GetMapping("/movies/new")
	public String createMoviesForm(Model model) {

		// create student object to hold student form data
		MovieEntity movieEntity = new MovieEntity();
		model.addAttribute("movie", movieEntity);
		return "create_movie";

	}
	
	@GetMapping("/searchById")
	public String searchById() {
		return "searchById";
	}
	
	@PostMapping("/movies/searchById")
	public String searchMoviesById(@RequestParam("movieId") String movieId, Model model) {
		List<MovieEntity> movies = movieService.searchMoviesById(movieId);
        System.out.print(movies);
        model.addAttribute("movies", movies);
        return "searchResults";
	}
	
	@GetMapping("/searchByName")
	public String searchByName() {
		return "searchByName";
	}
	
	@PostMapping("/movies/search")
    public String searchMovies(@RequestParam("movieName") String movieName, Model model) {
		
        List<MovieEntity> movies = movieService.searchMoviesByName(movieName);
        System.out.print(movies);
        model.addAttribute("movies", movies);
        return "searchResults";
    }
	
	@GetMapping("/searchByCollection")
	public String searchByCollection() {
		return "searchByCollection";
	}
	
	@PostMapping("/movies/searchByRange")
    public String searchMoviesByRange(@RequestParam("minRange") Long minRange,
                                      @RequestParam("maxRange") Long maxRange,
                                      Model model) {
        List<MovieEntity> movies = movieService.searchMoviesByRange(minRange, maxRange);
        model.addAttribute("movies", movies);
        return "searchResults";
    }
	
	@PostMapping("/movies")
	public String saveStudent(@ModelAttribute("movie") MovieEntity movieEntity) {
		movieService.saveMovie(movieEntity);
		return "redirect:/movies";
	}

	@GetMapping("/movies/edit/{id}")
	public String editMoviesForm(@PathVariable Long id, Model model) {
		model.addAttribute("movie", movieService.getMovieById(id));
		return "edit_movie";
	}

	@PostMapping("/movies/{id}")
	public String updateMovies(@PathVariable Long id, @ModelAttribute("movie") MovieEntity movieEntity, Model model) {

		// get student from database by id
		MovieEntity existingMovie = movieService.getMovieById(id);
		existingMovie.setSrno(id);
		existingMovie.setMovieId(movieEntity.getMovieId());
		existingMovie.setMovieName(movieEntity.getMovieName());
		existingMovie.setCollectionRange(movieEntity.getCollectionRange());

		// save updated student object
		movieService.updateMovie(existingMovie);
		return "redirect:/movies";
	}
	// handler method to handle delete student request

	@GetMapping("/movies/{id}")
	public String deleteMovies(@PathVariable Long id) {
		movieService.deleteMovieById(id);
		return "redirect:/movies";
	}
}
