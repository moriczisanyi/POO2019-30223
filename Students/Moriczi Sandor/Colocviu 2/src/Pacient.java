import java.util.ArrayList;

enum afectiune{
	cronica, acuta;
}

public class Pacient {

	private String nume;
	private String prenume;
	private Integer varsta;
	private String sex;
	private afectiune afectie;
	private ArrayList<Medicament> reteta;
	
	
	public Pacient(String nume, String prenume, Integer varsta, String sex) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.sex = sex;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public Integer getVarsta() {
		return varsta;
	}
	public void setVarsta(Integer varsta) {
		this.varsta = varsta;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public afectiune getAfectie() {
		return afectie;
	}
	public void setAfectie(afectiune afectie) {
		this.afectie = afectie;
	}
	public ArrayList<Medicament> getReteta() {
		return reteta;
	}
	public void setReteta(ArrayList<Medicament> reteta) {
		this.reteta = reteta;
	}
	
	
}
