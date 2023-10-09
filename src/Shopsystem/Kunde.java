package Shopsystem;

import java.util.ArrayList;
import java.util.List;

 
public class Kunde {
	// Attribute
	private String name;
	private Adresse adresse;
	private String telefonnummer;
	private String faxnummer;
	private String email;

	private Kreditkarte kreditkarte;
	private List<Auftrag> auftragsListe;

	// Konstruktor	
	public Kunde(String name, Adresse adresse, String telefonnummer, String faxnummer, String email,
			Kreditkarte kreditkarte) {

		super();
		this.name = name;
		this.adresse = adresse;
		this.telefonnummer = telefonnummer;
		this.faxnummer = faxnummer;
		this.email = email;
		this.kreditkarte = kreditkarte;

		// AuftragsListe wird "gefüllt" über Methode bestellungAufgeben
		this.auftragsListe = new ArrayList<>();
	}


	// Methoden
	public Auftrag bestellungAufgeben() {
		// erzeugt ein neues Objekt der Klasse Auftrag
		// ruft den Konstruktor der Klasse Auftrag auf
		Auftrag auftrag = new Auftrag();
		// füllt die Auftragsliste unseres Kunden
		auftragsListe.add(auftrag);		
		return auftrag;
	}

	public List<Auftrag> getAuftraege(){		
		/*
		// ####### in schöner umbauen #########
		// müssen wir auslagern -> "Innenleben" gehört eigentlich zu Auftrag
		// Artikel: name, Preis: preis
		// artikel.getName(), artikel.getPreis()
		List<Auftrag> auftraegeMitArtikeln = new ArrayList<>();
		// welche/ weiviele Aufträge hat der Kunde
		// Durchläuft die Liste auftragsListe und wählt jedes Element aus und "zwischenspeichert" es unter dem Namen auftrag

		for(Auftrag auftrag: auftragsListe) {
			// jeden einzelnen Auftrag durchlaufen und auflisten welche Artikel er enthält
			Auftrag auftragMitArtikeln = new Auftrag();
			for(Artikel artikel : auftrag.getArtikelListe()) {
				auftragMitArtikeln.artikelHinzufuegen(artikel);
				System.out.println("Artikel: " + artikel.getName() + ", Preis: " + artikel.getPreis());
			}
			// einzelne Aufträge zu Gesamtliste zufügen
			auftraegeMitArtikeln.add(auftragMitArtikeln);
		}		
		*/

		List<Auftrag> auftraegeMitArtikeln = new ArrayList<>();		

		for (Auftrag auftrag : auftragsListe) {
			if(auftrag.getArtikelListe().size()>0)
				auftraegeMitArtikeln.add(auftrag);			

			for (Artikel artikel : auftrag.getArtikelListe()) {
				// Ausgabe irgendwann auslagern ....
				System.out.println("Artikel: " + artikel.getName() + ", Preis: " + artikel.getPreis());
			}
        }
		return auftraegeMitArtikeln;
	}

	// weitere getter/ setter brauchen wir aktuell nicht
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Kreditkarte getKreditkarte() {
		return kreditkarte;
	}

	public void setKreditkarte(Kreditkarte kreditkarte) {
		this.kreditkarte = kreditkarte;
	}		
	
	public Adresse getAdresse() {
		return adresse;
	}
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}