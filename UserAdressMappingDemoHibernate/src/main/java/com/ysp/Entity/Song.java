package com.ysp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_song")
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="song_id")
	private int id;
	private String title;
	private String artist;
	private float duration;
	
	//we are creating F.k in Song table so 
	//keep object of Parent.i.e. Album in Song
	//so Object of Address in Song table
	@ManyToOne
	@JoinColumn(name="album_id")
	private Album album;
	
	
	public Song() {
		super();
	}
	

	public Song(int id, String title, String artist, float duration, Album album) {
		super();
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.duration = duration;
		this.album = album;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	

}
