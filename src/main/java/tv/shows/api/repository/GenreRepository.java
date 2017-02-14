package tv.shows.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tv.shows.api.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

	Genre findByGenreName(String genreName);

}
