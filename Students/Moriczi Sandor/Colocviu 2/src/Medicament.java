
public class Medicament {

	private String name;
	private String producator;
	private int pret;
	private int gramaj;
	
	
	public Medicament(String name, String producator, int pret, int gramaj) {
		super();
		this.name = name;
		this.producator = producator;
		this.pret = pret;
		this.gramaj = gramaj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProducator() {
		return producator;
	}
	public void setProducator(String producator) {
		this.producator = producator;
	}
	public int getPret() {
		return pret;
	}
	public void setPret(int pret) {
		this.pret = pret;
	}
	public int getGramaj() {
		return gramaj;
	}
	public void setGramaj(int gramaj) {
		this.gramaj = gramaj;
	}
	@Override
	public String toString() {
		return "Medicament [name=" + name + ", producator=" + producator + ", pret=" + pret + ", gramaj=" + gramaj
				+ "]";
	}
	
	
}
