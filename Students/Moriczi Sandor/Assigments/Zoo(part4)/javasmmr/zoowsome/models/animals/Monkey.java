package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
public class Monkey extends Mammal{
	public String preferedFood;
	public Monkey (String name, int legs, float bodyTemp, float bodyHair, String food,double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.name=name;
		this.numberOfLegs=legs;
		this.normalBodyTemp=bodyTemp;
		this.percBodyHair=bodyHair;
		this.preferedFood=food;
		
	}
	public Monkey(double maintenanceCost, double dangerPerc)
	{
		super(maintenanceCost, dangerPerc);
		this.numberOfLegs=2;
		this.name="Monkey King";
		this.normalBodyTemp=40;
		this.percBodyHair=80;
		this.preferedFood="Banana";
	}
	public String getPreferedFood()
	{
		return this.preferedFood;
	}
	public String toString()
	{
		return "numele: "+ name + " numarul de picoare: " + numberOfLegs
				+ " temperatura de corp: " + normalBodyTemp + " procentul din corp acoperit cu par: " + 
				percBodyHair + " and loves: " + preferedFood; 
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Monkey);
	}
}
