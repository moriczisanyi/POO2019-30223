package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird{
	public String color;
	public Parrot (String name, int legs,Integer altitude, String color)
	{
		this.name=name;
		this.numberOfLegs=legs;
		this.avgFlightAltitude=altitude;
		this.color=color;
		
	}
	public Parrot()
	{
		this.numberOfLegs=2;
		this.name="Stive";
		this.avgFlightAltitude=100;
		this.migrates=false;
		this.color="BLUE";
	}
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String col)
	{
		this.color=col;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " altitudinea de zbor: " + this.avgFlightAltitude + " Migreaza?: " + 
				this.migrates + " culoarea: " + color; 
	}
}
