package ex61;

public class Zi {
	private String nume;
	private Luc zi;
	
	
	public Zi()
	{
		this.nume="Luni";
		this.zi=Luc.Lucratoare;
	}
	public Zi(String nume, Luc a)
	{
		this.nume=nume;
		this.zi=a;
	}
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setLucratoare()
	{
		this.zi=Luc.Lucratoare;
	}
	public void setNelucratoare()
	{
		this.zi=Luc.Nelucratoare;
	}
	public boolean esteLucratoare()
	{
		if(this.zi==Luc.Lucratoare)
		{
			return true;
		}
		else
			return false;
	}
	public String toString() {
		return nume + " zi=" + zi;
	}
	
}
