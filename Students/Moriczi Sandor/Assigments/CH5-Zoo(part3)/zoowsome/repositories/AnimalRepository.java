package javasmmr.zoowsome.repositories;
import java.io.File;



import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.lang.model.element.Element;
import javax.xml.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.XMLEventFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Fish;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Octopus;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Penguin;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Toad;
import javasmmr.zoowsome.services.factories.Constants;


public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository() {
		}
		public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
			XMLOutputFactory outputFactory = XMLOutputFactory.newInstance() ;
			// Create X MLEvent Writer
			XMLEventWriter eventWriter = outputFactory.createXMLEventWriter (new FileOutputStream(XML_FILENAME));
			// Create a EventF actory
			XMLEventFactory eventFactory = XMLEventFactory.newInstance();
			XMLEvent end = eventFactory.createDTD("\n ");
			// Create a nd writ e Start Tag
			StartDocument startDocument = eventFactory.createStartDocument( );
			eventWriter.add(startDocument);
			// Create c ontent open tag
			StartElement configStartElement = eventFactory.createStartElement("", "", "content");
			eventWriter.add(configStartElement);
			eventWriter.add(end);
			for (Animal animal : animals) {
			StartElement sElement = eventFactory.createStartElement ("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);
			animal.encodeToXml (eventWriter);
			EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
			}
			eventWriter.add(eventFactory.createEndElement("", "", " content"));
			eventWriter.add(eventFactory.createEndDocument() );
			eventWriter.close( );
			}
		public static void createNode(XMLEventWriter eventWriter, String name, String value) throws
			XMLStreamException {
			XMLEventFactory eventFactory = XMLEventFactory.newInstance();
			XMLEvent end = eventFactory.createDTD("\n");
			XMLEvent tab = eventFactory.createDTD("\t");
			// Create Start node
			StartElement sElement = eventFactory.createStartElement("", "", name);
			eventWriter.add(tab);
			eventWriter.add(sElement);
			// Create Content
			Characters characters = eventFactory.createCharacters(value);
			eventWriter.add(characters);
			// Create End node
			EndElement eElement = eventFactory.createEndElement("", "", name);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}

		public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {
			ArrayList<Animal> animals = new ArrayList<Animal>();
			File fXmlFile = new File(XML_FILENAME);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			NodeList nodeList =doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					String discriminant =((Document) element).getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
					switch (discriminant) {
			case Constants.Animals.Insects.Butterfly:
				Animal butterfly = new Butterfly(2.0,0.01);
				butterfly.decodeFromXml(element);
				animals.add(butterfly);
				
			case Constants.Animals.Insects.Cockroach:
				Animal cockroach = new Cockroach(3.0,0.01);
				cockroach.decodeFromXml(element);
				animals.add(cockroach);
				
			case Constants.Animals.Insects.Spider:
				Animal spider = new Spider(2.5,0.4);
				spider.decodeFromXml(element);
				animals.add(spider);
				
			case Constants.Animals.Aquatics.Fish:
				Animal fish = new Fish(1.0,0.05);
				fish.decodeFromXml(element);
				animals.add(fish);
				
			case Constants.Animals.Aquatics.Octopus:
				Animal octopus = new Octopus(4.0,0.1);
				octopus.decodeFromXml(element);
				animals.add(octopus);
				
			case Constants.Animals.Aquatics.Shark:
				Animal shark = new Shark(7.0,0.9);
				shark.decodeFromXml(element);
				animals.add(shark);
				
			case Constants.Animals.Birds.Owl:
				Animal owl = new Owl(3.0,0.2);
				owl.decodeFromXml(element);
				animals.add(owl);
				
			case Constants.Animals.Birds.Parrot:
				Animal parrot = new Parrot(3.2,0.15);
				parrot.decodeFromXml(element);
				animals.add(parrot);
				
			case Constants.Animals.Birds.Penguin:
				Animal penguin = new Penguin(5.0,0.05);
				penguin.decodeFromXml(element);
				animals.add(penguin);
				
			case Constants.Animals.Mammals.Cow:
				Animal cow = new Cow(6.0,0.3);
				cow.decodeFromXml(element);
				animals.add(cow);
				
			case Constants.Animals.Mammals.Monkey:
				Animal monkey = new Monkey(4.2,0.32);
				monkey.decodeFromXml(element);
				animals.add(monkey);
				
			case Constants.Animals.Mammals.Tiger:
				Animal tiger = new Tiger(7.0,0.6);
				tiger.decodeFromXml(element);
				animals.add(tiger);
				
			case Constants.Animals.Reptiles.Lizzard:
				Animal lizard = new Lizard(4.0,0.2);
				lizard.decodeFromXml(element);
				animals.add(lizard);
				
			case Constants.Animals.Reptiles.Snake:
				Animal snake = new Snake(5.0,0.5);
				snake.decodeFromXml(element);
				animals.add(snake);
				
			case Constants.Animals.Reptiles.Toad:
				Animal toad = new Toad(3.6,0.2);
				toad.decodeFromXml(element);
				animals.add(toad);
			
			default:
			break;
			}
			}
			}
			return animals;
			}

}

