package ex35;

public class Student implements Cloneable{
	private String nume;
	private String prenume;
	private Masina masina;
	
	
	public Student(String nume, String prenume, Masina masina) {
		this.nume = nume;
		this.prenume = prenume;
		this.masina = masina;
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
	public Masina getMasina() {
		return masina;
	}
	public void setMasina(Masina masina) {
		this.masina = masina;
	}
	public void shallowcopy()
	{
		
	}
	public Object clone() throws CloneNotSupportedException
	{
		Student cloned=(Student)super.clone();
		cloned.setMasina((Masina)cloned.getMasina().clone());
		return cloned;
	}
	@Override
	public String toString() {
		return "Student [nume=" + nume + ", prenume=" + prenume + ", masina=" + masina + "]";
	}
	
}
