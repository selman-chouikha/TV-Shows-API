package tv.shows.api.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.shows.api.model.Movie;
import tv.shows.api.service.MovieService;

@RestController
public class MovieRestController {
	
	@Autowired
	private MovieService movieService;
	@CrossOrigin
	@RequestMapping(value="/movies", method = RequestMethod.POST)
	public Movie saveMovie(@RequestBody Movie m) {
		return movieService.saveMovie(m);
	}
	@CrossOrigin
	@RequestMapping(value="/movies", method = RequestMethod.GET)
	public List<Movie> listMovies() {
		return movieService.listMovies();
	}

}
