package tv.shows.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Country {

	@Id
	@GeneratedValue
	private Long id;
	private String countryName;

	public Country() {
		super();
	}

	public Country(String countryName) {
		super();
		this.countryName = countryName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
