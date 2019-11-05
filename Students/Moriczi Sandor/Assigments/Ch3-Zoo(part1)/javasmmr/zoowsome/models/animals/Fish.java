package javasmmr.zoowsome.models.animals;

public class Fish extends Aquatic{
	public Fish (String name, int legs, Integer swimDepth)
	{
		this.name=name;
		this.numberOfLegs=legs;
		this.avgSwimDepth=swimDepth;
		
	}
	public Fish()
	{
		this.numberOfLegs=0;
		this.name="peste";
		this.water=WaterType.Saltwater;
		this.avgSwimDepth=10;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " watertype?: " + this.water + " .Swim depth: " + this.avgSwimDepth; 
	}
}
