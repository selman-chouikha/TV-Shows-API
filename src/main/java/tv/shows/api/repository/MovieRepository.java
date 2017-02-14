package tv.shows.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tv.shows.api.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
