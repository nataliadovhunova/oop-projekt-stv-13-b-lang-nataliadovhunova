package priebeh;

import záujemci.ObyčajnýČlovek;
import priebeh.Prihláška;

public class Literatúra extends Prihláška {

	/*Agregácia */
	ObyčajnýČlovek pocetZaujemcov;
	Prihláška prvá;
	int počet;

	public void spristupni() {

		prvá = new Prihláška();
		prvá.vytvorpr(meno, cislo);
		System.out.println("Gratulujem! Dostali ste sa do prvej časti nášho e-learningu! ");
		počet++;
	}
	
	public void zvys() {
		if(počet>0)
		{
			ObyčajnýČlovek novy=new ObyčajnýČlovek("Natalia","Dovhunova",20,60);
			novy.zmenpočet();
			System.out.println("Počet nových záujemcov je: " +počet);
		}
	}

}
