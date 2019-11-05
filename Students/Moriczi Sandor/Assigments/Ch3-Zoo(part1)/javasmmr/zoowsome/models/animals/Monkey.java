package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	public String preferedFood;
	public Monkey (String name, int legs, float bodyTemp, float bodyHair, String food)
	{
		this.name=name;
		this.numberOfLegs=legs;
		this.normalBodyTemp=bodyTemp;
		this.percBodyHair=bodyHair;
		this.preferedFood=food;
		
	}
	public Monkey()
	{
		this.numberOfLegs=2;
		this.name="Monkey King";
		this.normalBodyTemp=40;
		this.percBodyHair=80;
		this.preferedFood="Banana";
	}
	public String getPreferedFood()
	{
		return this.preferedFood;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " temperatura de corp: " + normalBodyTemp + " procentul din corp acoperit cu par: " + 
				percBodyHair + " and loves: " + preferedFood; 
	}
}
