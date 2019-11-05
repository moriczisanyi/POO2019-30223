package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	public int DailyMilk;
	public Cow (String name, int legs, float bodyTemp, float bodyHair, int milk)
	{
		this.name=name;
		this.numberOfLegs=legs;
		this.normalBodyTemp=bodyTemp;
		this.percBodyHair=bodyHair;
		this.DailyMilk=milk;
		
	}
	public Cow()
	{
		this.numberOfLegs=4;
		this.name="Vaca";
		this.normalBodyTemp=40;
		this.percBodyHair=80;
		this.DailyMilk=10;
	}
	public int getDailyMilk()
	{
		return this.DailyMilk;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " temperatura de corp: " + normalBodyTemp + " procentul din corp acoperit cu par: " + 
				percBodyHair + " . Produce: " + DailyMilk + " pe zi"; 
	}
	
}
