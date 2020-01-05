package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Penguin extends Bird{
	public boolean canSwim;
	public Penguin (String name, int legs,Integer altitude, String color,double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.name=name;
		this.numberOfLegs=legs;
		this.avgFlightAltitude=altitude;
		
	}
	public Penguin(double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.numberOfLegs=2;
		this.name="King";
		this.avgFlightAltitude=100;
		this.migrates=false;
		this.canSwim=true;
	}
	public void setToSwim()
	{
		this.canSwim=true;
	}
	public void setToNonSwim()
	{
		this.canSwim=false;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " altitudinea de zbor: " + this.avgFlightAltitude + " Migreaza?: " + 
				this.migrates;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.Penguin);
	}
}
