package be.icc.poo;

import java.util.ArrayList;

import be.icc.poo.myUtilities.MyUtility;

public class Main {

	public static void main(String[] args) {
		ArrayList<Artiste> list = new ArrayList<Artiste>();
		
		Artiste un = new Artiste("Ninho",true);
		Artiste deux = new Artiste("Rimk",true);
		Artiste trois = new Artiste("Jul",true);
		Artiste quatre = new Artiste("SCH",true);
		Artiste cinq = new Artiste("Naps",true);
		
		list.add(un);
		list.add(deux);
		list.add(trois);
		list.add(quatre);
		list.add(cinq);
		
		Concert concert = new Concert("Brussels Summer Festival", list);
		
		MyUtility.toXMLfile(concert, "data//ConcertFile.xml");
		
	}

}
