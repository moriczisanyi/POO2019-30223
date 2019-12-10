package javasmmr.zoowsome.repositories;

import java.io.File;


import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

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

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
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

public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
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
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();

				switch (discriminant) {
				case Constants.Animals.Insects.Butterfly:
					Animal butterfly = new Butterfly(2.0, 0.01);
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;
				case Constants.Animals.Insects.Cockroach:
					Animal cockroach = new Cockroach(3.0, 0.01);
					cockroach.decodeFromXml(element);
					animals.add(cockroach);
					break;
				case Constants.Animals.Insects.Spider:
					Animal spider = new Spider(2.5, 0.4);
					spider.decodeFromXml(element);
					animals.add(spider);
					break;
				case Constants.Animals.Aquatics.Fish:
					Animal fish = new Fish(1.0, 0.05);
					fish.decodeFromXml(element);
					animals.add(fish);
					break;
				case Constants.Animals.Aquatics.Octopus:
					Animal octopus = new Octopus(4.0, 0.1);
					octopus.decodeFromXml(element);
					animals.add(octopus);
					break;
				case Constants.Animals.Aquatics.Shark:
					Animal shark = new Shark(7.0, 0.9);
					shark.decodeFromXml(element);
					animals.add(shark);
					break;
				case Constants.Animals.Birds.Owl:
					Animal owl = new Owl(3.0, 0.2);
					owl.decodeFromXml(element);
					animals.add(owl);
					break;
				case Constants.Animals.Birds.Parrot:
					Animal parrot = new Parrot(3.2, 0.15);
					parrot.decodeFromXml(element);
					animals.add(parrot);
					break;
				case Constants.Animals.Birds.Penguin:
					Animal penguin = new Penguin(5.0, 0.05);
					penguin.decodeFromXml(element);
					animals.add(penguin);
					break;
				case Constants.Animals.Mammals.Cow:
					Animal cow = new Cow(6.0, 0.3);
					cow.decodeFromXml(element);
					animals.add(cow);
					break;
				case Constants.Animals.Mammals.Monkey:
					Animal monkey = new Monkey(4.2, 0.32);
					monkey.decodeFromXml(element);
					animals.add(monkey);
					break;
				case Constants.Animals.Mammals.Tiger:
					Animal tiger = new Tiger(7.0, 0.6);
					tiger.decodeFromXml(element);
					animals.add(tiger);
					break;
				case Constants.Animals.Reptiles.Lizzard:
					Animal lizard = new Lizard(4.0, 0.2);
					lizard.decodeFromXml(element);
					animals.add(lizard);
					break;
				case Constants.Animals.Reptiles.Snake:
					Animal snake = new Snake(5.0, 0.5);
					snake.decodeFromXml(element);
					animals.add(snake);
					break;
				case Constants.Animals.Reptiles.Toad:
					Animal toad = new Toad(3.6, 0.2);
					toad.decodeFromXml(element);
					animals.add(toad);
					break;
				default:
					break;
				}
			}
		}
		return animals;
	}

	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = ((Document) element).getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
				.getTextContent();
		switch (discriminant) {
		case Constants.Animals.Insects.Butterfly:
			Animal butterfly = new Butterfly(2.0, 0.01);
			butterfly.decodeFromXml(element);

		case Constants.Animals.Insects.Cockroach:
			Animal cockroach = new Cockroach(3.0, 0.01);
			cockroach.decodeFromXml(element);

		case Constants.Animals.Insects.Spider:
			Animal spider = new Spider(2.5, 0.4);
			spider.decodeFromXml(element);

		case Constants.Animals.Aquatics.Fish:
			Animal fish = new Fish(1.0, 0.05);
			fish.decodeFromXml(element);

		case Constants.Animals.Aquatics.Octopus:
			Animal octopus = new Octopus(4.0, 0.1);
			octopus.decodeFromXml(element);

		case Constants.Animals.Aquatics.Shark:
			Animal shark = new Shark(7.0, 0.9);
			shark.decodeFromXml(element);

		case Constants.Animals.Birds.Owl:
			Animal owl = new Owl(3.0, 0.2);
			owl.decodeFromXml(element);

		case Constants.Animals.Birds.Parrot:
			Animal parrot = new Parrot(3.2, 0.15);
			parrot.decodeFromXml(element);

		case Constants.Animals.Birds.Penguin:
			Animal penguin = new Penguin(5.0, 0.05);
			penguin.decodeFromXml(element);

		case Constants.Animals.Mammals.Cow:
			Animal cow = new Cow(6.0, 0.3);
			cow.decodeFromXml(element);

		case Constants.Animals.Mammals.Monkey:
			Animal monkey = new Monkey(4.2, 0.32);
			monkey.decodeFromXml(element);

		case Constants.Animals.Mammals.Tiger:
			Animal tiger = new Tiger(7.0, 0.6);
			tiger.decodeFromXml(element);

		case Constants.Animals.Reptiles.Lizzard:
			Animal lizard = new Lizard(4.0, 0.2);
			lizard.decodeFromXml(element);

		case Constants.Animals.Reptiles.Snake:
			Animal snake = new Snake(5.0, 0.5);
			snake.decodeFromXml(element);

		case Constants.Animals.Reptiles.Toad:
			Animal toad = new Toad(3.6, 0.2);
			toad.decodeFromXml(element);

		default:
			break;
		}
		return null;
	}

}
