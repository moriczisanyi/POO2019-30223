package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Butterfly extends Insect{
	public int wingsNumber;
	public Butterfly (String name, int legs, int wingsNumber,double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.name=name;
		this.numberOfLegs=legs;
		this.wingsNumber=wingsNumber;
		
	}
	public Butterfly(double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.numberOfLegs=6;
		this.name="fluture";
		this.wingsNumber=2;
		this.canFly=true;
		this.isDangerous=false;
	}
	public int getWingNr()
	{
		return this.wingsNumber;
	}
	void  setWingNr(int wings)
	{
		this.wingsNumber=wings;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs + " .Are : " + wingsNumber + " aripi";
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Insects.Butterfly);
	}

}
