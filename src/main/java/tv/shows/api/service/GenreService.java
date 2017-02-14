package tv.shows.api.service;

import java.util.List;

import tv.shows.api.model.Genre;

public interface GenreService {

	public Genre saveGenre(Genre genre);

	public List<Genre> listGenres();
}
