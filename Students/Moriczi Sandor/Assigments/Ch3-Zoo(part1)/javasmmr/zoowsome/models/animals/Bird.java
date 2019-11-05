package javasmmr.zoowsome.models.animals;

public class Bird extends Animal{
	
	public boolean migrates;
	public Integer avgFlightAltitude;
	
	public void setBirdToMigrate()
	{
		migrates=true;
	}
	public void setBirdToNonMigrate()
	{
		migrates=false;
	}
	public void ifMigrates()
	{
		if(migrates==true)
			System.out.println("migrates");
		else
			System.out.println("doesn't migrates");
	}
	
	public int getFlightAltitude()
	{
		return avgFlightAltitude;
	}
	public void setFlightAltitude(Integer altitude)
	{
		avgFlightAltitude=altitude;
	}
}
