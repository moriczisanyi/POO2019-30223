package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Toad extends Reptile{
	public int jumpDistance;
	public Toad (String name, int legs, int distance,double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.name=name;
		this.numberOfLegs=legs;
		this.jumpDistance=distance;
		
	}
	public Toad(double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.numberOfLegs=4;
		this.name="Broasca";
		this.laysEggs=true;
		this.jumpDistance=2;
	}
	public int getJumpDistance()
	{
		return this.jumpDistance;
	}
	public void setJumpDistance(int dist)
	{
		this.jumpDistance=dist;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " Lays eggs?: " + this.laysEggs + " . Poate sarii: " + this.jumpDistance+ " metrii"; 
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.Toad);
	}
}
