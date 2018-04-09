package záujemci;

import java.util.Scanner;

public class ObyčajnýČlovek {
	public String meno;
	public String priezvisko;
	public int vek;
	public int vaha;
	int pocetZaujemcov;
	private Scanner cislo2;
	private int kurz2;

	// konštruktor
	public ObyčajnýČlovek(String meno, String priezvisko, int vek, int vaha) {
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.vek = vek;
		this.vaha = vaha;
	}

	public void vyberKurz() {
		System.out.println("Vyber si číslo kurzu spomedzi nami ponúkaných kurzov:  ");
		System.out.println("1. Fitness tréner 1 stupňa ");
		System.out.println("2. Fitness tréner 2 stupňa ");
		System.out.println("3. Kondičný tréner 1 stupňa ");
		System.out.println("4. Kondičný tréner 2 stupňa ");

	}

	public void zadajKurz() {
		System.out.println("Vyberám si číslo kurzu: ( napíš )   ");
		cislo2 = new Scanner(System.in);
		kurz2 = cislo2.nextInt();

		if (kurz2 == 1) {
			System.out.println("Vybrali ste si kurz 1- Fitness tréner 1 stupňa ");
		} else if (kurz2 == 2) {
			System.out.println("Vybrali ste si kurz 2- Fitness tréner 2 stupňa ");
		} else if (kurz2 == 3) {
			System.out.println("Vybrali ste si kurz 3- Kondičný tréner 1 stupňa ");
		} else if (kurz2 == 3) {
			System.out.println("Vybrali ste si kurz 4- Kondičný tréner 1 stupňa ");
		}

	}

	public void zmenpočet() {
		pocetZaujemcov++;
	}

}
