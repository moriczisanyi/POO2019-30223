package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Cow extends Mammal{
	public int DailyMilk;
	public Cow (String name, int legs, float bodyTemp, float bodyHair, int milk,double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.name=name;
		this.numberOfLegs=legs;
		this.normalBodyTemp=bodyTemp;
		this.percBodyHair=bodyHair;
		this.DailyMilk=milk;
		
	}
	public Cow(double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.numberOfLegs=4;
		this.name="Vaca";
		this.normalBodyTemp=40;
		this.percBodyHair=80;
		this.DailyMilk=10;
	}
	public int getDailyMilk()
	{
		return this.DailyMilk;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " temperatura de corp: " + normalBodyTemp + " procentul din corp acoperit cu par: " + 
				percBodyHair + " . Produce: " + DailyMilk + " pe zi"; 
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Cow);
	}
	
}
