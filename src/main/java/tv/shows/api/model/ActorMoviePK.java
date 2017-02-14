package tv.shows.api.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ActorMoviePK implements Serializable {

	private static final long serialVersionUID = 100L;
	
	@ManyToOne(targetEntity = Actor.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn
	private Actor actor;
	@ManyToOne(targetEntity = Movie.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn
	private Movie movie;
	public ActorMoviePK() {
		super();
	}
	public ActorMoviePK(Actor actor, Movie movie) {
		super();
		this.actor = actor;
		this.movie = movie;
	}
	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actor == null) ? 0 : actor.hashCode());
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActorMoviePK other = (ActorMoviePK) obj;
		if (actor == null) {
			if (other.actor != null)
				return false;
		} else if (!actor.equals(other.actor))
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		return true;
	}


}
