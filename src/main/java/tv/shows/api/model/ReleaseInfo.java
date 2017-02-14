package tv.shows.api.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ReleaseInfo {

	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	@ManyToMany(targetEntity = ProductionCompany.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_COMPANY")
	private Collection<ProductionCompany> companies;
	@ManyToOne(targetEntity = Country.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn
	private Country country;
	@ManyToOne(targetEntity = Langage.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn
	private Langage originLangage;

	public ReleaseInfo() {
		super();
	}

	public ReleaseInfo(Date creationDate) {
		super();
		this.creationDate = creationDate;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Collection<ProductionCompany> getCompanies() {
		return companies;
	}

	public void setCompanies(Collection<ProductionCompany> companies) {
		this.companies = companies;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Langage getOriginLangage() {
		return originLangage;
	}

	public void setOriginLangage(Langage originLangage) {
		this.originLangage = originLangage;
	}

}
