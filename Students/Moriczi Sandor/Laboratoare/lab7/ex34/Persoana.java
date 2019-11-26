package ex34;

public class Persoana implements Comparable<Persoana>{
	private String nume;
	private String prenume;
	private Integer varsta;
	public Persoana(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
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
	public int getVarsta() {
		return varsta;
	}
	public static void printArr(Persoana[] p)
	{
		for(int i=0;i<p.length;i++)
		{
			if(p[i]!=null)
				System.out.println(p[i].getNume());
		}
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	/*public int compareTo(Persoana o) {
		int compint=this.nume.compareTo(o.nume);
		return compint;
	}*/
	public int compareTo(Persoana o) {
	int compint=this.varsta.compareTo(o.varsta);
	return compint;
	}
	
}
