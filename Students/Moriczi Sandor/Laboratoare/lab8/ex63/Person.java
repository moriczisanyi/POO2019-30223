package ex63;

public class Person {
	private String nume;
	private int age;
	
	
	public Person(String nume, int age) {
		this.nume = nume;
		this.age = age;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [nume=" + nume + ", age=" + age + "]";
	}
	
}
