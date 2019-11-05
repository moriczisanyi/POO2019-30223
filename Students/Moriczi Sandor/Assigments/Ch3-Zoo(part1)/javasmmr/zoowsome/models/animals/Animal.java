package javasmmr.zoowsome.models.animals;

abstract public class Animal {
	
	public String name="animal";
	public int numberOfLegs=2;
	
	public int getNrOfLegs()
	{
		return numberOfLegs;
	}
	public void setNrOfLegs(int legs)
	{
		numberOfLegs=legs;
	}
	public String getName()
	{
		return name;
		
	}
	public void setName(String nume)
	{
		name=nume;
	}
	public String toString()
	{
		return "nume:" + name;
	}
}
