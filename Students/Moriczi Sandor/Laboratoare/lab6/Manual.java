
public class Manual extends Rechizite{
	public String getNume()
	{
		return "Manual ".concat(super.getNume());
	}
	public Manual(String nume)
	{
		this.setNume(nume);
	}
	public Manual()
	{
		this.setNume("Info");
	}
}
