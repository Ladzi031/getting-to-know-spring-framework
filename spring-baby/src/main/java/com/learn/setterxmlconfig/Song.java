package com.learn.setterxmlconfig;

public class Song {
	private String title;
	private Integer plays;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getPlays() {
		return plays;
	}
	public void setPlays(Integer plays) {
		this.plays = plays;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", plays=" + plays + "]";
	}
}
