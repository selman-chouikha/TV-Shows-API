package tv.shows.api.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	@Column(name = "movie_id", unique = true, nullable = false)
	private Long id;
	private String name;
	@ManyToMany(targetEntity = Genre.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn
	private Collection<Genre> genres;
	@ManyToMany(targetEntity = Image.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn
	private Collection<Image> images;
	@OneToOne(targetEntity = Trailer.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn
	private Trailer trailer;
	@OneToOne(targetEntity = ReleaseInfo.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn
	private ReleaseInfo releaseInfo;

	@OneToMany(mappedBy = "pk.actor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Collection<ActorMovie> actor;

	public Movie() {
		super();
	}

	public Movie(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Genre> getGenres() {
		return genres;
	}

	public void setGenres(Collection<Genre> genres) {
		this.genres = genres;
	}

	public Collection<Image> getImages() {
		return images;
	}

	public void setImages(Collection<Image> images) {
		this.images = images;
	}

	public Trailer getTrailer() {
		return trailer;
	}

	public void setTrailer(Trailer trailer) {
		this.trailer = trailer;
	}

	public ReleaseInfo getReleaseInfo() {
		return releaseInfo;
	}

	public void setReleaseInfo(ReleaseInfo releaseInfo) {
		this.releaseInfo = releaseInfo;
	}

	public Collection<ActorMovie> getActor() {
		return actor;
	}

	public void setActor(Collection<ActorMovie> actor) {
		this.actor = actor;
	}

}
