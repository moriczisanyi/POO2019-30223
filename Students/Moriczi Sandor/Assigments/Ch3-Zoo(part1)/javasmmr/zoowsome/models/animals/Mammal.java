package javasmmr.zoowsome.models.animals;

public class Mammal extends Animal {

	public float normalBodyTemp=36;
	public float percBodyHair=90;
	
	public float getBodyTemp()
	{
		return normalBodyTemp;
	}
	public void setBodyTemp(float temp)
	{
		normalBodyTemp=temp;
	}
	public float getBodyHair()
	{
		return percBodyHair;
	}
	public void setBodyHairPerc(float perc)
	{
		percBodyHair=perc;
	}
}
