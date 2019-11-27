package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Owl extends Bird{
	public int headRotationDegree;
	public Owl (String name, int legs,Integer altitude, int degree,double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.name=name;
		this.numberOfLegs=legs;
		this.avgFlightAltitude=altitude;
		this.headRotationDegree=degree;
		
	}
	public Owl(double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.numberOfLegs=2;
		this.name="Owl";
		this.avgFlightAltitude=50;
		this.migrates=false;
		this.headRotationDegree=270;
	}
	public int getDegree()
	{
		return this.headRotationDegree;
	}
	public void setDegree(int deg)
	{
		this.headRotationDegree=deg;
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
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.Owl);
	}
}
