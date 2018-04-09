package záujemci;

//dedenie od triedy Obyčajný človek
public class Študent extends ObyčajnýČlovek {
	public String škola;
	public String id;

	// konštruktor
	public Študent(String meno, String priezvisko, int vek, int vaha, String škola, String id) {
		super(meno, priezvisko, vek, vaha);
		this.škola = škola;
		this.id = id;
	}

	/*
	 * Prekonanie metódy nadtypu, teda metóda vyberKurz v triede Obyčajný človek je
	 * prekonaná metódou vyberKurz v triede Študent
	 */

	public void vyberKurz() {
		System.out.println("Vyber si číslo kurzu spomedzi nami ponúkaných kurzov:  ");
		System.out.println("1. Fitness tréner 1 stupňa ");
		System.out.println("2. Fitness tréner 2 stupňa ");

	}
}
