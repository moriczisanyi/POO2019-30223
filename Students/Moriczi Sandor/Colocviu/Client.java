
public class Client extends Persoana{
		public int nrProduseCumparate=10;
		public Produs[] produs= new Produs[nrProduseCumparate];
		
		public Client( String nume, int id, int nrProd)
		{
			this.nume=nume;
			this.ID=id;
			this.nrProduseCumparate=nrProd;
			this.produs = new Produs[nrProd];
		}
		public void setNrProduseCump(int produse)
		{
			this.nrProduseCumparate=produse;
		}
		public int getNrProduseCump()
		{
			return this.nrProduseCumparate;
		}
		
		public void addProdus(Produs prod)
		{
			for(int i=0;i<produs.length;i++)
			{
				if(produs[i]==null)
				{
					produs[i]=prod;
					break;
				}
			}
		}
		public String toString()
		{
			return this.nume;
		}
}
