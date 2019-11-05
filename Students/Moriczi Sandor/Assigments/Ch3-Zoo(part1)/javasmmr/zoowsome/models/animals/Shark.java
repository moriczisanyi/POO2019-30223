package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic{
	public int weight;
	public Shark (String name, int legs, Integer swimDepth, int weight)
	{
		this.name=name;
		this.numberOfLegs=legs;
		this.avgSwimDepth=swimDepth;
		this.weight=weight;
		
	}
	public Shark()
	{
		this.numberOfLegs=0;
		this.name="Killer";
		this.water=WaterType.Saltwater;
		this.avgSwimDepth=100;
		this.weight=500;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " watertype?: " + this.water + " .Swim depth: " + this.avgSwimDepth+
				"it has a weight of: "+ this.weight+ "kg"; 
	}
}
