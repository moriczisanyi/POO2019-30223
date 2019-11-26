package ex64;

public class MainClass {

	public static void main(String[] args) {
		Person p=null;
		
		try {
			p.setNume("Alex");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("a fost o exceptie");
		}

	}

}
