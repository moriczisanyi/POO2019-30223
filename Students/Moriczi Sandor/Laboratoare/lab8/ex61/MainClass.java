package ex61;

public class MainClass {

	public static void main(String[] args) throws Exception {
		Lucrator l= new Lucrator();
		l.setNume("Alex");
		CalendarLucru calLuc= new CalendarLucru();
		l.setZileLucratoare(calLuc);
		try {
		l.lucreaza("Luni");
		l.lucreaza("Duminica");
		l.lucreaza("Marti");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
