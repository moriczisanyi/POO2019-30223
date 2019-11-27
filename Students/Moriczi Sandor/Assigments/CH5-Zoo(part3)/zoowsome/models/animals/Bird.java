package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
public class Bird extends Animal{
	
	public Bird(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	public boolean migrates;
	public Integer avgFlightAltitude;
	
	public void setBirdToMigrate()
	{
		migrates=true;
	}
	public void setBirdToNonMigrate()
	{
		migrates=false;
	}
	public void ifMigrates()
	{
		if(migrates==true)
			System.out.println("migrates");
		else
			System.out.println("doesn't migrates");
	}
	public boolean getMigrate()
	{
		return migrates;
	}
	public int getFlightAltitude()
	{
		return avgFlightAltitude;
	}
	public void setFlightAltitude(Integer altitude)
	{
		avgFlightAltitude=altitude;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(getMigrate()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getFlightAltitude()));
		}
	public void decodeFromXml( Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
		}
}
