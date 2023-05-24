package controllers;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import model.Film;

@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "films")
public class FilmList {
	
	@XmlElement(name = "film")
	private List<Film> filmList;
	public FilmList() {}
	 
	public FilmList(List<Film> filmList) {
	this.filmList = filmList;
	}
	
	public List<Film> getFilmList() {
	return filmList;
	}
	
	public void setFilmList(List<Film> filmList) {
	this.filmList = filmList;
	}
}