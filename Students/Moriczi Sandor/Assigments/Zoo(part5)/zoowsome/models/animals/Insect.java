package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public class Insect extends Animal{

	public Insect(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	public boolean canFly;
	public boolean isDangerous;
	public void setToFly()
	{
		setCanFly(true);
	}
	public void setToNoFly()
	{
		setCanFly(false);
	}
	public void ifCanFly()
	{
		if(isCanFly()==true)
			System.out.println("it can fly");
		else
			System.out.println("it can't fly");
	}
	public void setToDangerous()
	{
		setDangerous(true);
	}
	public void setToNonDangerous()
	{
		setDangerous(false);
	}
	public void isItDangerous() {
		if(isDangerous()==true)
			System.out.println("it is dangerous");
		else
			System.out.println("it is safe");
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public boolean isDangerous() {
		return isDangerous;
	}
	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(isCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(isDangerous()));
		}
	
	public void decodeFromXml( Element element) {
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
		}


	
}
