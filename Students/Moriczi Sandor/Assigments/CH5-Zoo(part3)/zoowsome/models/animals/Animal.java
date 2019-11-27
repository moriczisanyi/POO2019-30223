package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;



import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

abstract public class Animal implements Killer,XML_Parsable{
	
	public String name="animal";
	public int numberOfLegs=2;
	private boolean takenCareOf=false;
	public double maintenanceCost;
	public double dangerPerc;
	private Element element;
	
	public Animal(double maintenanceCost, double dangerPerc)
	{
		this.dangerPerc=dangerPerc;
		this.maintenanceCost=maintenanceCost;
	}
	public void setTakenCareOf(boolean a)
		{
		this.takenCareOf=a;
		}
	public boolean getTakenCareOf()
	{
		return this.takenCareOf;
	}
	
	public double getMaintenanceCost() {
		return maintenanceCost;
	}
	public void setMaintenanceCost(double val)
	{
		this.maintenanceCost=val;
	}
	public boolean kill()
	{
		Random rand= new Random();
		double nr=rand.nextInt(100)/100.0;
		if(nr<this.dangerPerc)
			return true;
		else
			return false;
	}
	public int getNrOfLegs()
	{
		return numberOfLegs;
	}
	public void setNrOfLegs(int legs)
	{
		numberOfLegs=legs;
	}
	public String getName()
	{
		return name;
		
	}
	
	public double getDangerPerc() {
		return dangerPerc;
	}
	public void setDangerPerc(double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}
	public void setName(String nume)
	{
		name=nume;
	}
	public String toString()
	{
		return "nume:" + name;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "numberOfLegs", String.valueOf(this.numberOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
		}
	public void decodeFromXml( javax.lang.model.element.Element element2) {
		setNrOfLegs (Integer.valueOf(((Element) element2).getElementsByTagName("nrOfL egs").item(0).getTextContent()));
		setName(((Element) element2).getElementsByTagName("name").item(0).getTextContent()) ;
		setMaintenanceCost (Double.valueOf(((Element) element2).getElementsByTagName( "mainte nanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(((Element) element2).getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(((Element) element2).getElementsByTagName("takenCareOf").item(0).getTextContent()));
		}
}
