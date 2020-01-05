package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Cockroach extends Insect{
	public Cockroach (String name, int legs, int wingsNumber,double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.name=name;
		this.numberOfLegs=legs;
		
	}
	public Cockroach(double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.numberOfLegs=6;
		this.name="Warrior";
		this.canFly=false;
		this.isDangerous=false;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " .Poate zbura ? " + this.isCanFly() + " . Is dangerous?  " + 
				this.isDangerous(); 
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Insects.Cockroach);
	}
}
