package ex63;

public class TestClass {

	public static void printPersons(Person[] p) throws ArrayIndexOutOfBoundsException
	{
		for(int i=0;i<5;i++)
			System.out.println(p[i]);
	}
	public static void main(String[] args) {
		Person [] p= new Person[2];
		p[0]=new Person("Alex",18);
		p[1]= new Person("Bogdan",20);
		
		try{
			TestClass.printPersons(p);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.getMessage();
		}
	}

}
