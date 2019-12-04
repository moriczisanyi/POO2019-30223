package ex4;

public class TestFacebook {

	public static void main(String[] args) {
		FacebookAccount fb= new FacebookAccount("Alex",12,"BN",5);
		FacebookAccount fb2= new FacebookAccount("Bob",14,"AB",5);
		FacebookAccount fb3= new FacebookAccount("Greg",13,"B",5);
		FacebookAccount fb4= new FacebookAccount("Trufin",20,"Radauti",5);
		fb.getPrieteni().add(fb2);
		fb.getPrieteni().add(fb3);
		fb.printPrieteni();
		fb.printPrieteniAfterLocation("Radauti");
		fb.getPrieteni().add(fb4);
		fb.printPrieteniAfterLocation("Radauti");
		fb.printPrieteni();
		try {
		fb.getPrieteni().remove(2);
		}
		catch (Exception e)
		{
			System.out.println("nu exista element la indexul respectiv");
		}
		fb.printPrieteni();
	}

}
