package tv.shows.api.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Genre {

	@Id
	@GeneratedValue
	private Long id;
	private String genreName;

	@ManyToMany(targetEntity = Movie.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn
	private Collection<Movie> movies;

	public Genre() {
		super();
	}

	public Genre(String genreName) {
		super();
		this.genreName = genreName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGenreName() {
		return genreName;
	}

	@Transient
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	@JsonIgnore
	public Collection<Movie> getMovies() {
		return movies;
	}

	@JsonSetter
	public void setMovies(Collection<Movie> movies) {
		this.movies = movies;
	}

}
