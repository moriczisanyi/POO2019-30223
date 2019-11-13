
public class Produs {
		private String nume;
		private int pret;
		private int nrExemplare;
		
		public Produs(String nume, int pret, int nrEx)
		{
			this.nume=nume;
			this.pret=pret;
			this.nrExemplare=nrEx;
		}
		public Produs()
		{
			this.nume="Mere";
			this.pret=10;
			this.nrExemplare=400;
		}
		public void setNume(String nume)
		{
			this.nume=nume;
		}
		public String getNume()
		{
			return this.nume;
		}
		public void setPret(int p)
		{
			this.pret=p;
		}
		public int getPret()
		{
			return this.pret;
		}
		public void setNrExemplare(int exemplare)
		{
			this.nrExemplare=exemplare;
		}
		public int getNrExemplare()
		{
			return this.nrExemplare;
		}
		
		public boolean esteInStoc()
		{
			if(this.nrExemplare==0)
				return false;
			else
				return true;
		}
}
