package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Shark extends Aquatic{
	public int weight;
	public Shark (String name, int legs, Integer swimDepth, int weight,double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.name=name;
		this.numberOfLegs=legs;
		this.avgSwimDepth=swimDepth;
		this.weight=weight;
		
	}
	public Shark(double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.numberOfLegs=0;
		this.name="Killer";
		this.water=WaterType.Saltwater;
		this.avgSwimDepth=100;
		this.weight=500;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " watertype?: " + this.water + " .Swim depth: " + this.avgSwimDepth+
				"it has a weight of: "+ this.weight+ "kg"; 
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Aquatics.Shark);
	}
}
