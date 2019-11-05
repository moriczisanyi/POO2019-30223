package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{
	public Spider (String name, int legs, int wingsNumber)
	{
		this.name=name;
		this.numberOfLegs=legs;
		
	}
	public Spider()
	{
		this.numberOfLegs=8;
		this.name="Tarantula";
		this.setCanFly(false);
		this.setDangerous(true);
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " .Poate zbura ? " + this.isCanFly() + " . Is dangerous?  " + 
				this.isDangerous(); 
	}

}
