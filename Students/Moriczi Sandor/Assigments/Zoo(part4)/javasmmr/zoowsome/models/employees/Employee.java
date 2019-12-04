package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Employee {
	private String name;
	private Long id= (Long)(System.currentTimeMillis() & 0xfffffff);
	private Double salary;
	private boolean isDead;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public boolean isDead() {
		return isDead;
	}
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	public Employee(String name, Double salary, boolean isDead) {
		this.name = name;
		this.salary = salary;
		this.isDead = isDead;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
		}
	
	public void decodeFromXml( javax.lang.model.element.Element element2) {
		setId(Long.valueOf(((Element) element2).getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(((Element) element2).getElementsByTagName("name").item(0).getTextContent()) ;
		setSalary(Double.valueOf(((Element) element2).getElementsByTagName( "salary").item(0).getTextContent()));
		setDead(Boolean.valueOf(((Element) element2).getElementsByTagName("isDead").item(0).getTextContent()));
		}
	
	
	
	
}
