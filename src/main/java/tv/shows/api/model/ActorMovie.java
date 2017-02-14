package tv.shows.api.model;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "actor_movie")
@AssociationOverrides({
	@AssociationOverride(name = "pk.actor",
		joinColumns = @JoinColumn(name = "actor_id")),
	@AssociationOverride(name = "pk.movie",
		joinColumns = @JoinColumn(name = "movie_id")) })
public class ActorMovie {
	@EmbeddedId
	private ActorMoviePK pk= new ActorMoviePK();
	private String role;
	private float note;

	public ActorMovie() {
		super();
	}

	public ActorMoviePK getPk() {
		return pk;
	}

	public void setPk(ActorMoviePK pk) {
		this.pk = pk;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}

}
