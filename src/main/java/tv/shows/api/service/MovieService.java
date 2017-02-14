package tv.shows.api.service;

import java.util.List;

import tv.shows.api.model.Movie;

public interface MovieService {
	public Movie saveMovie(Movie m);

	public List<Movie> listMovies();

}
