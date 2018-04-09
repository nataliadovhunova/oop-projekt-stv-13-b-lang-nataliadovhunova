package priebeh;

public class Lektori {
	public String meno;
	public String priezvisko;
	public int vek;
	public int skusenosti;

	public void vytvorLektora(String meno, String priezvisko, int vek, int skusenosti) {
		this.meno=meno;
		this.priezvisko=priezvisko;
		this.vek=vek;
		this.skusenosti=skusenosti;
		System.out.println("Meno lektora: "+meno+ "  "+ priezvisko+"\nVek: "+vek+"\nPočet rokov praxe: "  +skusenosti);

	}

	// Preťaženie metódy prirad zmenou parametrov
	public void prirad(String lektor, String kurz, int cisloKurzu) {
		

	}

	public void prirad(int cislo, String meno, String kurz) {

	}

}
