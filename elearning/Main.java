package elearning;

import priebeh.Certifikát;
import priebeh.Literatúra;
import priebeh.Lektori;
import záujemci.ObyčajnýČlovek;

public class Main {

	public static void main(String[] args) {
		Literatúra prvá = new Literatúra();
		prvá.spristupni();

		ObyčajnýČlovek prvý = new ObyčajnýČlovek("Natalia", "Dovhunova", 20, 60);
		prvý.vyberKurz();
		prvý.zadajKurz();

		prvá.zvys();

		Certifikát novo = new Certifikát();
		novo.dokončenie();
		
		Lektori nový= new Lektori();
		nový.vytvorLektora("Peter", "Vrchovatý", 32, 5);

	}

}
