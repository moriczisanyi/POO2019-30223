package ex5;

public class TestHotel {

	public static void main(String[] args) {
		
		Camera c1= new Camera(503);
		Camera c2= new Camera(501);
		Camera c3= new Camera(502);
		Dog d1= new Dog("Nero",20);
		Dog d2= new Dog("A",25);
		Dog d3= new Dog("B",21);
		Dog d4= new Dog("C",22);
		PetHotel hotel= new PetHotel();
		hotel.getReg().put(c1, d1);
		hotel.getReg().put(c2, d2);
		hotel.getReg().put(c3, d3);
		hotel.print();
		hotel.getReg().put(c3, d4);
		hotel.print();
	}

}
