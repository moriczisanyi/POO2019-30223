package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Parrot extends Bird{
	public String color;
	public Parrot (String name, int legs,Integer altitude, String color,double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.name=name;
		this.numberOfLegs=legs;
		this.avgFlightAltitude=altitude;
		this.color=color;
		
	}
	public Parrot(double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.numberOfLegs=2;
		this.name="Stive";
		this.avgFlightAltitude=100;
		this.migrates=false;
		this.color="BLUE";
	}
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String col)
	{
		this.color=col;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " altitudinea de zbor: " + this.avgFlightAltitude + " Migreaza?: " + 
				this.migrates + " culoarea: " + color; 
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.Parrot);
	}
}
