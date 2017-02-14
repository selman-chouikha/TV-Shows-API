package tv.shows.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Langage {
	
	@Id
	@GeneratedValue
	private Long id;
	private String langage;
	public Langage() {
		super();
	}
	public Langage(String langage) {
		super();
		this.langage = langage;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLangage() {
		return langage;
	}
	public void setLangage(String langage) {
		this.langage = langage;
	}
	

}
