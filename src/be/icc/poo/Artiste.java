package be.icc.poo;

import java.time.LocalDate;

public class Artiste {
	private String nomArtiste;
	private LocalDate dateCreation;
	private boolean isVIP;
	
	public Artiste(String nomArtiste, boolean isVIP) {
		super();
		this.nomArtiste = nomArtiste;
		this.dateCreation = LocalDate.now();
		this.isVIP = isVIP;
	}
	public String getNomArtiste() {
		return nomArtiste;
	}
	public void setNomArtiste(String nomArtiste) {
		this.nomArtiste = nomArtiste;
	}
	public LocalDate getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}
	public boolean isVIP() {
		return isVIP;
	}
	public void setVIP(boolean isVIP) {
		this.isVIP = isVIP;
	}
	
}
