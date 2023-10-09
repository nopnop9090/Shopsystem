package Shopsystem;

public class Artikel {
	// Attribute
	private String name;
	private Double preis;
	private boolean lagerartikel;
	private Lieferant lieferant;
	private int mindestLagerbestand;
	private int aktuellerBestand;
	
	// Konstruktor
	public Artikel(String name, Double preis, boolean lagerartikel, Lieferant lieferant, int mindestLagerbestand,
			int aktuellerBestand) {
		super();
		this.name = name;
		this.preis = preis;
		this.lagerartikel = lagerartikel;
		this.lieferant = lieferant;
		this.mindestLagerbestand = mindestLagerbestand;
		this.aktuellerBestand = aktuellerBestand;
	}

	// getter/setter
	public String getName() {
		return name;
	}

	public Double getPreis() {
		return preis;
	}

	public int getMindestLagerbestand() {
		return mindestLagerbestand;
	}

	public int getAktuellerBestand() {
		return aktuellerBestand;
	}
	
	
	
	
}
