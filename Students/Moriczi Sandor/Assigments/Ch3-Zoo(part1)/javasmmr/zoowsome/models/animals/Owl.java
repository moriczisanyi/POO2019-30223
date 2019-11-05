package javasmmr.zoowsome.models.animals;

public class Owl extends Bird{
	public int headRotationDegree;
	public Owl (String name, int legs,Integer altitude, int degree)
	{
		this.name=name;
		this.numberOfLegs=legs;
		this.avgFlightAltitude=altitude;
		this.headRotationDegree=degree;
		
	}
	public Owl()
	{
		this.numberOfLegs=2;
		this.name="Owl";
		this.avgFlightAltitude=50;
		this.migrates=false;
		this.headRotationDegree=270;
	}
	public int getDegree()
	{
		return this.headRotationDegree;
	}
	public void setDegree(int deg)
	{
		this.headRotationDegree=deg;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " altitudinea de zbor: " + this.avgFlightAltitude + " Migreaza?: " + 
				this.migrates; 
	}
}
