package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
public class Aquatic extends Animal {
	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
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
	public WaterType getWaterType()
	{
		return water;
	}
	public int getSwimDepth()
	{
		return avgSwimDepth;
	}
	public void setSwimDepth(Integer depth)
	{
		avgSwimDepth=depth;
	}
	public void decodeFromXml( Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("water").item(0).getTextContent()));
		}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(this.avgSwimDepth));
		createNode(eventWriter, "water", String.valueOf(this.water));
		}

		
}
