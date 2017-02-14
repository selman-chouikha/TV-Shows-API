package tv.shows.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tv.shows.api.model.Genre;
import tv.shows.api.repository.GenreRepository;
@Component
public class DatabaseSeeder implements CommandLineRunner {

	@Autowired
	private GenreRepository genreRepository;
	
	public DatabaseSeeder(GenreRepository genreRepository) {
		super();
		this.genreRepository = genreRepository;
	}

	@Override
	public void run(String... arg0) throws Exception {
		List<Genre> genres = new ArrayList<>();
		
		genres.add(new Genre("Action"));
		genres.add(new Genre("Adventure"));
		genres.add(new Genre("Animation"));
		genres.add(new Genre("Comedy"));
		genres.add(new Genre("Crime"));
		genres.add(new Genre("Disaster"));
		genres.add(new Genre("Documentary"));
		genres.add(new Genre("Drama"));
		genres.add(new Genre("Eastern"));
		genres.add(new Genre("Erotic"));
		genres.add(new Genre("Family"));
		genres.add(new Genre("Fan Film"));
		genres.add(new Genre("Fantasy"));
		genres.add(new Genre("Film Noir"));
		genres.add(new Genre("Foreign"));
		genres.add(new Genre("History"));
		genres.add(new Genre("Holiday"));
		genres.add(new Genre("Horror"));
		genres.add(new Genre("Indie"));
		genres.add(new Genre("Music"));
		genres.add(new Genre("Musical"));
		genres.add(new Genre("Mystery"));
		genres.add(new Genre("Neo-noir"));
		genres.add(new Genre("Road Movie"));
		genres.add(new Genre("Romance"));
		genres.add(new Genre("Science Fiction"));
		genres.add(new Genre("Short"));
		genres.add(new Genre("Sport"));
		genres.add(new Genre("Sporting Event"));
		genres.add(new Genre("Sports Film"));
		genres.add(new Genre("Suspense"));
		genres.add(new Genre("TV movie"));
		genres.add(new Genre("Thriller"));
		genres.add(new Genre("War"));
		genres.add(new Genre("Western"));
		genreRepository.save(genres);

	}

}
