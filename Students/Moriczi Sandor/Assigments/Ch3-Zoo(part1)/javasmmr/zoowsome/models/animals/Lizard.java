package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{
	public int speed;
	public Lizard (String name, int legs, int speed)
	{
		this.name=name;
		this.numberOfLegs=legs;
		this.speed=speed;
		
	}
	public Lizard()
	{
		this.numberOfLegs=4;
		this.name="Speedy";
		this.laysEggs=true;
		this.speed=20;
	}
	public int getSpeed()
	{
		return this.speed;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " Lays eggs?: " + this.laysEggs + " viteza: " + this.speed+ "km/h"; 
	}
}
