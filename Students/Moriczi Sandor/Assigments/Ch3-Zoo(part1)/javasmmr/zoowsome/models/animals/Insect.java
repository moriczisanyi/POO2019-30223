package javasmmr.zoowsome.models.animals;

public class Insect extends Animal{

	public boolean canFly;
	public boolean isDangerous;
	public void setToFly()
	{
		setCanFly(true);
	}
	public void setToNoFly()
	{
		setCanFly(false);
	}
	public void ifCanFly()
	{
		if(isCanFly()==true)
			System.out.println("it can fly");
		else
			System.out.println("it can't fly");
	}
	public void setToDangerous()
	{
		setDangerous(true);
	}
	public void setToNonDangerous()
	{
		setDangerous(false);
	}
	public void isItDangerous() {
		if(isDangerous()==true)
			System.out.println("it is dangerous");
		else
			System.out.println("it is safe");
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public boolean isDangerous() {
		return isDangerous;
	}
	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
}
