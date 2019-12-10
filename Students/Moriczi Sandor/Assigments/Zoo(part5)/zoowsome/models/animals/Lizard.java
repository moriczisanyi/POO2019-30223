package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Lizard extends Reptile{
	public int speed;
	public Lizard (String name, int legs, int speed,double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.name=name;
		this.numberOfLegs=legs;
		this.speed=speed;
		
	}
	public Lizard(double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.numberOfLegs=4;
		this.name="Speedy";
		this.laysEggs=true;
		this.speed=20;
	}
	public int getSpeed()
	{
		return this.speed;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " Lays eggs?: " + this.laysEggs + " viteza: " + this.speed+ "km/h"; 
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.Lizzard);
	}
}
