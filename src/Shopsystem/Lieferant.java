package Shopsystem;

public class Lieferant {
	// Attribute
	private String firma;
	private String ansprechpartner;
	private Adresse adresse;
	private String telefonnummer;
	private String faxnummer;
	private String email;
	private int mindestLagerbestand;
	private int aktuellerBestand;
	
	// Konstruktor
	public Lieferant(String firma, String ansprechpartner, Adresse adresse, String telefonnummer, String faxnummer,
			String email, int mindestLagerbestand, int aktuellerBestand) {
		super();
		this.firma = firma;
		this.ansprechpartner = ansprechpartner;
		this.adresse = adresse;
		this.telefonnummer = telefonnummer;
		this.faxnummer = faxnummer;
		this.email = email;
		this.mindestLagerbestand = mindestLagerbestand;
		this.aktuellerBestand = aktuellerBestand;
	}
	
	// getter/ (setter)
	// weitere momentan nicht benötigt
	public int getMindestLagerbestand() {
		return mindestLagerbestand;
	}
	public int getAktuellerBestand() {
		return aktuellerBestand;
	}
	
	
}
