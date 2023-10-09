package Shopsystem;

public class Adresse {
	// Attribute
	private String strasse;
	private String plz;
	private String ort;
	
	// Konstruktor
	public Adresse(String strasse, String plz, String ort) {
		super();
		this.strasse = strasse;
		this.plz = plzl;
		this.ort = ort;
	}

	// formatierte Ausgabe
	@Override
	public String toString() {
		// Musterstr. 7, 12345 Musterhausen
		return strasse + ", " + plz + " " + ort;
	}
	
	
	// getter und setter brauchen wir für diese Klasse momentan nicht
}
