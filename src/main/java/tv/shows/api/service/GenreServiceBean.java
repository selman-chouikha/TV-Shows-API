package tv.shows.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.shows.api.model.Genre;
import tv.shows.api.repository.GenreRepository;

@Service
public class GenreServiceBean implements GenreService {

	@Autowired
	private GenreRepository genreRepository;
	@Override
	public Genre saveGenre(Genre genre) {
		Genre genreTest = genreRepository.findByGenreName(genre.getGenreName());
		if(genreTest != null){
			return genreTest;
			
		}
		return genreRepository.save(genre);
	}

	@Override
	public List<Genre> listGenres() {
		// TODO Auto-generated method stub
		return null;
	}

}
