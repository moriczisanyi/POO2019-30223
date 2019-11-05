package javasmmr.zoowsome.models.animals;

public class Toad extends Reptile{
	public int jumpDistance;
	public Toad (String name, int legs, int distance)
	{
		this.name=name;
		this.numberOfLegs=legs;
		this.jumpDistance=distance;
		
	}
	public Toad()
	{
		this.numberOfLegs=4;
		this.name="Broasca";
		this.laysEggs=true;
		this.jumpDistance=2;
	}
	public int getJumpDistance()
	{
		return this.jumpDistance;
	}
	public void setJumpDistance(int dist)
	{
		this.jumpDistance=dist;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " Lays eggs?: " + this.laysEggs + " . Poate sarii: " + this.jumpDistance+ " metrii"; 
	}
}
