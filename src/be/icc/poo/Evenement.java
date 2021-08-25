package be.icc.poo;

import java.time.LocalDate;

public class Evenement {
	private String texte;
	private LocalDate dateEvent;
	
	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public LocalDate getDateEvent() {
		return dateEvent;
	}

	public void setDateEvent(LocalDate dateEvent) {
		this.dateEvent = dateEvent;
	}

	@Override
	public String toString() {
		return "Evenement [texte=" + texte + ", dateEvent=" + dateEvent + "]";
	}
	
}
