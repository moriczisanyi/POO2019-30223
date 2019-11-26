package ex64;

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
	public void setNume(String nume) throws NullPointerException {
		{
			if(this.nume!=null)
			this.nume = nume;
			else
			throw new NullPointerException("nu ai initializat");
		}
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