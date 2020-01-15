import java.util.HashMap;
import java.util.Map;

public class Farmacie {

	private Map<Medicament,Integer> stock;
	private Map<Angajat,Integer> reteteAngajat;
	private String nume;
	private String adresa;
	private String nrTelefon;
	private String website;
	
	
	public Farmacie( String nume, String adresa,
			String nrTelefon, String website) {
		this.stock = new HashMap<Medicament,Integer>();
		this.reteteAngajat = new HashMap<Angajat,Integer>();
		this.nume = nume;
		this.adresa = adresa;
		this.nrTelefon = nrTelefon;
		this.website = website;
	}
	public Map<Medicament, Integer> getStock() {
		return stock;
	}
	public void setStock(Map<Medicament, Integer> stock) {
		this.stock = stock;
	}
	public Map<Angajat, Integer> getReteteAngajat() {
		return reteteAngajat;
	}
	public void setReteteAngajat(Map<Angajat, Integer> reteteAngajat) {
		this.reteteAngajat = reteteAngajat;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getNrTelefon() {
		return nrTelefon;
	}
	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
}
