package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic{
	public Octopus (String name, int legs, Integer swimDepth)
	{
		this.name=name;
		this.numberOfLegs=legs;
		this.avgSwimDepth=swimDepth;
		
	}
	public Octopus()
	{
		this.numberOfLegs=8;
		this.name="Kraken";
		this.water=WaterType.Saltwater;
		this.avgSwimDepth=15;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " watertype?: " + this.water + " .Swim depth: " + this.avgSwimDepth; 
	}
}
