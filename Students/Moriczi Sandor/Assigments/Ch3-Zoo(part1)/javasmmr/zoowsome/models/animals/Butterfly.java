package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{
	public int wingsNumber;
	public Butterfly (String name, int legs, int wingsNumber)
	{
		this.name=name;
		this.numberOfLegs=legs;
		this.wingsNumber=wingsNumber;
		
	}
	public Butterfly()
	{
		this.numberOfLegs=6;
		this.name="fluture";
		this.wingsNumber=2;
		this.canFly=true;
		this.isDangerous=false;
	}
	public int getWingNr()
	{
		return this.wingsNumber;
	}
	void  setWingNr(int wings)
	{
		this.wingsNumber=wings;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs + " .Are : " + wingsNumber + " aripi";
	}
}
