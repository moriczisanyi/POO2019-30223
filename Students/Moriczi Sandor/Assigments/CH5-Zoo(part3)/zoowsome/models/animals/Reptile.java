package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
public class Reptile extends Animal{
	
	public Reptile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	public boolean laysEggs=false;
	
	public void setToLayEggs()
	{
		laysEggs=true;
	}
	public void setToNotLayEggs()
	{
		laysEggs=false;
	}
	public void ifLaysEggs()
	{
		if(laysEggs==true)
			System.out.println("it lays eggs");
		else
			System.out.println("it doesn't lays eggs");
	}
	public boolean getLaysEggs()
	{
		return laysEggs;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(getLaysEggs()));
		}
	public void decodeFromXml( Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
		}
	
}
