package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	
	public int speed;
	public Tiger (String name, int legs, float bodyTemp, float bodyHair, int speed)
	{
		this.name=name;
		this.numberOfLegs=legs;
		this.normalBodyTemp=bodyTemp;
		this.percBodyHair=bodyHair;
		this.speed=speed;
		
	}
	public Tiger()
	{
		this.numberOfLegs=4;
		this.name="Samba";
		this.normalBodyTemp=40;
		this.percBodyHair=80;
		this.speed=50;
	}
	public int getSpeed()
	{
		return this.speed;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " temperatura de corp: " + normalBodyTemp + " procentul din corp acoperit cu par: " + 
				percBodyHair + " viteza: " + speed; 
	}
}
