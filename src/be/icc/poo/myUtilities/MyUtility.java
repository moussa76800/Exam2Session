package be.icc.poo.myUtilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import be.icc.poo.*;

public class MyUtility {
	public static XStream xs = new XStream(new DomDriver());
	
	public static void toXMLfile(Concert concert,String fileName) {
		xs.alias("Concert", Concert.class);
		xs.alias("Artiste",Artiste.class);
		xs.aliasAttribute("date", "dateCreation");
		xs.useAttributeFor(Artiste.class,"dateCreation");
		xs.addImplicitCollection(Concert.class, "artistes");
		try {
			xs.toXML(concert,new FileWriter(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Concert fromXmlFile(String fileName) {
		xs.alias("Concert", Concert.class);
		xs.alias("Artiste",Artiste.class);
		xs.aliasAttribute("date", "dateCreation");
		xs.useAttributeFor(Artiste.class,"dateCreation");
		xs.addImplicitCollection(Concert.class, "artistes");
		
		return (Concert) xs.fromXML(new File(fileName));
	}
	
	
}
