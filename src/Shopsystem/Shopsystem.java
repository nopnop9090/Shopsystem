package Shopsystem;

public class Shopsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Objekte ereugen kundeNadresse, kreditkarte
		Adresse kundenAdresse = new Adresse("Mustergasse 7", "75213", "Entenhausen");
		Kreditkarte karte1 = new Kreditkarte("Max Müller", "47110815");
		Kunde kunde1 = new Kunde("Max Müller", kundenAdresse, "01712546987", "06817548", "max@muster.de", karte1);

		System.out.println(kunde1.getAdresse().toString());
		// Artikel anlegen
		// Lieferanten mit Adresse anlegen
		// ....
	}

}
