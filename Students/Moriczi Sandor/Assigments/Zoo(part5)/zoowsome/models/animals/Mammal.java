package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
public class Mammal extends Animal {

	public Mammal(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}
	public float normalBodyTemp=36;
	public float percBodyHair=90;
	
	public float getBodyTemp()
	{
		return normalBodyTemp;
	}
	public void setBodyTemp(float temp)
	{
		normalBodyTemp=temp;
	}
	public float getBodyHair()
	{
		return percBodyHair;
	}
	public void setBodyHairPerc(float perc)
	{
		percBodyHair=perc;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(this.normalBodyTemp));
		createNode(eventWriter, "percBodyHair", String.valueOf(this.percBodyHair));
		}
	public void decodeFromXml( Element element) {
		setBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setBodyHairPerc(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
		}
}
