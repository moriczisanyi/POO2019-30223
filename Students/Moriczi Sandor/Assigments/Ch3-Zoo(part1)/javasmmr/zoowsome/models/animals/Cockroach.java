package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{
	public Cockroach (String name, int legs, int wingsNumber)
	{
		this.name=name;
		this.numberOfLegs=legs;
		
	}
	public Cockroach()
	{
		this.numberOfLegs=6;
		this.name="Warrior";
		this.canFly=false;
		this.isDangerous=false;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " .Poate zbura ? " + this.isCanFly() + " . Is dangerous?  " + 
				this.isDangerous(); 
	}
}
