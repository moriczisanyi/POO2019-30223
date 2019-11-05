package javasmmr.zoowsome.models.animals;

public class Penguin extends Bird{
	public boolean canSwim;
	public Penguin (String name, int legs,Integer altitude, String color)
	{
		this.name=name;
		this.numberOfLegs=legs;
		this.avgFlightAltitude=altitude;
		
	}
	public Penguin()
	{
		this.numberOfLegs=2;
		this.name="King";
		this.avgFlightAltitude=100;
		this.migrates=false;
		this.canSwim=true;
	}
	public void setToSwim()
	{
		this.canSwim=true;
	}
	public void setToNonSwim()
	{
		this.canSwim=false;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " altitudinea de zbor: " + this.avgFlightAltitude + " Migreaza?: " + 
				this.migrates;
	}
}
