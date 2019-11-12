
public class Caiet extends Rechizite{
	public String getNume()
	{
		return "Caiet ".concat(super.getNume());
	}
	public Caiet(String nume)
	{
		this.setNume(nume);
	}
	public Caiet()
	{
		this.setNume("Info");
	}
}
