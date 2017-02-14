package tv.shows.api.model;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Actor {
	@Id
	@GeneratedValue
	@Column(name = "actor_id", unique = true, nullable = false)
	private Long id;
	private String firsName;
	private String lastName;
	@OneToMany(mappedBy = "pk.movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Collection<ActorMovie> movie;
	public Actor() {
		super();
	}
	public Actor(String firsName, String lastName) {
		super();
		this.firsName = firsName;
		this.lastName = lastName;
	}
	public Long getId() {
		return id;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Collection<ActorMovie> getMovies() {
		return movie;
	}
	public void setMovies(Collection<ActorMovie> movies) {
		this.movie = movies;
	}

}
