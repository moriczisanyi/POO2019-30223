package ex35;

import java.awt.Color;

public class TestClass implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException{
		Masina m= new Masina("Audi",Color.black);
		Student s= new Student("Alex","Muresan", m);
		Student s2=null;
		try {
			s2= (Student) s.clone();
			}catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		s2.getMasina().setC(Color.blue);
		//s2.getMasina().setMarca("BMW");
		s2.getMasina().setMarca("BMW");
		s2.setNume("John");
		s2.setPrenume("Alberto");
		System.out.println(s);
		System.out.println(s2);

	}

}
