package be.icc.poo;

import java.util.ArrayList;

public class Concert extends Evenement implements Manageable{
	private String designation;
	private ArrayList<Artiste> artistes = new ArrayList<Artiste>();
	
	
	public Concert(String designation, ArrayList<Artiste> artistes) {
		super();
		this.designation = designation;
		this.artistes = artistes;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public ArrayList<Artiste> getArtistes() {
		return artistes;
	}

	public void setArtistes(ArrayList<Artiste> artistes) {
		this.artistes = artistes;
	}
	
	public ArrayList<Artiste> getVIPs(){
		ArrayList<Artiste> artisteVIP = new ArrayList<Artiste>();
		for (Artiste artiste : artistes) {
			if(artiste.isVIP()==true) {
				artisteVIP.add(artiste);
			}
		}
		return artisteVIP;
	}

	@Override
	public boolean dropArtist(Artiste a) {
		boolean result = false;
		if(artistes.contains(a)) {
			artistes.remove(a);
			result = true;
		}
		return result;
	}

	@Override
	public boolean hadArtist(Artiste a) {
		boolean result = false;
		if(artistes.contains(a)) {
			throw new DuplicateArtistException("L'artiste est déjà présent.");
		}else {
			artistes.add(a);
			result = true;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "Concert [designation=" + designation + ", artistes=" + artistes + "]";
	}
}
