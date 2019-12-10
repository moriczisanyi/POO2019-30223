package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Fish extends Aquatic{
	public Fish (String name, int legs, Integer swimDepth,double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.name=name;
		this.numberOfLegs=legs;
		this.avgSwimDepth=swimDepth;
		
	}
	public Fish(double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.numberOfLegs=0;
		this.name="peste";
		this.water=WaterType.Saltwater;
		this.avgSwimDepth=10;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " watertype?: " + this.water + " .Swim depth: " + this.avgSwimDepth; 
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Aquatics.Fish);
	}
}
