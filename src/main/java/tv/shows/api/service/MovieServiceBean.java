package tv.shows.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.shows.api.model.Genre;
import tv.shows.api.model.Movie;
import tv.shows.api.repository.GenreRepository;
import tv.shows.api.repository.MovieRepository;

@Service
public class MovieServiceBean implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	@Autowired
	private GenreRepository genreRepository;

	@Override
	public Movie saveMovie(Movie m) {
		List<Genre> genres = new ArrayList<>();
		Movie movie = new Movie(m.getName());
		movie.setImages(m.getImages());
		movie.setReleaseInfo(m.getReleaseInfo());
		movie.setTrailer(m.getTrailer());
		for(Genre genre:m.getGenres()){
		
				genres.add(genre);
			
		}
		movie.setGenres(genres);
		return movieRepository.save(m);
	}

	@Override
	public List<Movie> listMovies() {

		return movieRepository.findAll();
	}

}
