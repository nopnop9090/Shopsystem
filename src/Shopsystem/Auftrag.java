package Shopsystem;

import java.util.ArrayList;
import java.util.List;

public class Auftrag {
	// Attribute
	private List<Artikel> artikelListe;
	
	// Konstruktor
	public Auftrag() {
		artikelListe = new ArrayList<>();
		
	}
	
	// Methode zum Hinzufügen der Artikel
	public void artikelHinzufuegen(Artikel artikel) {
		artikelListe.add(artikel);
	}
	
	// getter / (setter)
	public List<Artikel> getArtikelListe() {
		return artikelListe;
	}

}
