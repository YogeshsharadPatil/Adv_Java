package com.ysp.Entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_album")
public class Album {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "album_id")
	private int id;
	private String name;
	@Column(name = "release_date")
	private LocalDate releaseDate;
	private String copyright;
	// All songs belong to Album
	@OneToMany(mappedBy = "album")//we are telling hibernate that dont create this song table in Album table
	//we are making bidrectional
	private List<Song> song;

	public Album() {
		super();
	}

	public Album(int id, String name, LocalDate releaseDate, String copyright, List<Song> song) {
		super();
		this.id = id;
		this.name = name;
		this.releaseDate = releaseDate;
		this.copyright = copyright;
		this.song = song;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public List<Song> getSong() {
		return song;
	}

	public void setSong(List<Song> song) {
		this.song = song;
	}

}
