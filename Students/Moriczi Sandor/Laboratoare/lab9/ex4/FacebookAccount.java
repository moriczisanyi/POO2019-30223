package ex4;

import java.util.ArrayList;
import java.util.List;

public class FacebookAccount {
	private String nume;
	private int varsta;
	private String location;
	private int nrPrieteni;
	private List<FacebookAccount> prieteni;
	
	public FacebookAccount(String nume, int varsta, String loc, int nrPrieteni)
	{
		this.nume=nume;
		this.varsta=varsta;
		this.location=loc;
		this.nrPrieteni=nrPrieteni;
		this.prieteni= new ArrayList<FacebookAccount>();
	}


	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNrPrieteni() {
		return nrPrieteni;
	}

	public void setNrPrieteni(int nrPrieteni) {
		this.nrPrieteni = nrPrieteni;
	}

	public List<FacebookAccount> getPrieteni() {
		return prieteni;
	}

	public void setPrieteni(List<FacebookAccount> prieteni) {
		this.prieteni = prieteni;
	}
	
	public void printPrieteni()
	{
		for(FacebookAccount a: this.prieteni)
			System.out.println(a);
	}
	public void printPrieteniAfterLocation(String location)
	{
		int k=0;
		for(FacebookAccount a: this.prieteni)
			if(a.location.contentEquals(location))
					{
						k++;
						System.out.println(a);
					}
			if(k==0)
				System.out.println(this.nume + " nu are prieteni din "+ location);
	}
	
	public String toString() {
		return  "prieten: "+ "nume=" + nume + ", varsta=" + varsta + ", location=" + location + ", nrPrieteni="
				+ nrPrieteni;
	}
	
}

