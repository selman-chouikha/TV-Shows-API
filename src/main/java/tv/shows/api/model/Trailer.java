package tv.shows.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trailer {

	@Id
	@GeneratedValue
	private Long id;
	private String path;

	public Trailer() {
		super();
	}

	public Trailer(String path) {
		super();
		this.path = path;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
