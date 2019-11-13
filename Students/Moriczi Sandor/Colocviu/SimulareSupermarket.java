
public class SimulareSupermarket {

	public static void main(String[] args) {
		
		Supermarket sup= new Supermarket();
		Data data= new Data(1999,11,12);
		Angajat a = new Angajat("Alex",10,data,3);
		Angajat a2 = new Angajat("Sanyi",14,data,5);
		Angajat a3 = new Angajat("Paul",54,data,0);
		
		Client c= new Client("Dan",532,3);
		Client c2= new Client("Ioan",132,3);
		Client c3= new Client("Maria",5432,2);
		Produs p1= new Produs("Pere",25,80);
		Produs p2= new Produs("Porotcala",45,30);
		Produs p3= new Produs("Suc",10,5);
		
		ClientFidel cl= new ClientFidel("Radu",43,3,30);
		ClientFidel cl2= new ClientFidel("Sandu",21,5,0);
		ClientFidel cl3= new ClientFidel("Robert",21,5,10);
		sup.addClientFidel(cl);
		sup.addClientFidel(cl2);
		sup.addClientFidel(cl3);
		//sup.addClientFidel((ClientFidel)c);
		//sup.addClientFidel((ClientFidel)c2);
		//sup.addClientFidel((ClientFidel)c3);
		
		sup.addAngajat(a);
		sup.addAngajat(a2);
		sup.addAngajat(a3);
		a.addClinetToAngajat(c);
		a.addClinetToAngajat(cl);
		
		cl.addProdus(p1);
		cl.addProdus(p2);
		cl.addProdus(p3);
		
		cl2.addProdus(p1);
		cl2.addProdus(p2);
		cl2.addProdus(p3);
		
		cl3.addProdus(p1);
		cl3.addProdus(p2);

		
		c.addProdus(p1);
		c.addProdus(p2);
		c.addProdus(p3);
		
		sup.printAngajati();
		sup.printClienti();
		
		sup.sortByNrClient();
		sup.sortBySuma();
		
		sup.printAngajati();		
		sup.printClienti();
		
		

	}

}
