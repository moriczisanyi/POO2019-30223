package javasmmr.zoowsome.models.animals;

public class Aquatic extends Animal {
	public enum WaterType
	{
		Saltwater,Freshwater
	};
	public Integer avgSwimDepth=20;
	public WaterType water;
	
	public void setWaterTypeToFresh()
	{
		water=WaterType.Freshwater;
	}
	public void setWaterTypeToSalt()
	{
		water=WaterType.Saltwater;
	}
	public int getSwimDepth()
	{
		return avgSwimDepth;
	}
	public void setSwimDepth(Integer depth)
	{
		avgSwimDepth=depth;
	}
}
