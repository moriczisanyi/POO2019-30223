package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile{
	public String color;
	public Snake (String name, int legs, String color)
	{
		this.name=name;
		this.numberOfLegs=legs;
		this.color=color;
		
	}
	public Snake()
	{
		this.numberOfLegs=0;
		this.name="Mamba";
		this.laysEggs=true;
		this.color="Dark";
	}
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String col)
	{
		this.color=col;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " Lays eggs?: " + this.laysEggs + " culoarea: " + color; 
	}
}
