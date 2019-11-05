package javasmmr.zoowsome.models.animals;

public class Reptile extends Animal{
	
	public boolean laysEggs=false;
	
	public void setToLayEggs()
	{
		laysEggs=true;
	}
	public void setToNotLayEggs()
	{
		laysEggs=false;
	}
	public void ifLaysEggs()
	{
		if(laysEggs==true)
			System.out.println("it lays eggs");
		else
			System.out.println("it doesn't lays eggs");
	}
	
}
