
public class Angajat extends Persoana{
		public Data data;
		public int nrClinetiServiti=5;
		public Client[] clientiServiti= new Client[this.nrClinetiServiti];
		
		public Angajat( String nume, int id, Data data, int clienti)
		{
			this.nume=nume;
			this.ID=id;
			this.nrClinetiServiti=clienti;
			this.clientiServiti= new Client[clienti];
			this.data=data;
			
		}
		
		public void addClinetToAngajat(Client c)
		{
			for(int i=0;i<this.clientiServiti.length;i++)
			{
				if(this.clientiServiti[i]==null)
					{
					this.clientiServiti[i]=c;
					break;
					}
			}
		}
		public int getNrClineti()
		{
			return this.nrClinetiServiti;
		}
		public void setNrClienti(int numar)
		{
			this.nrClinetiServiti=numar;
		}
		public void printClienti()
		{
			for(int i=0;i<this.nrClinetiServiti;i++)
			{
				if(this.clientiServiti[i]!=null)
					System.out.println(clientiServiti[i]);
			}
		}
		public double scanProdus(Client cl)
		{
			double sumaTotala=0;
			for(int i=0;i<cl.produs.length;i++)
			{
				if(cl.produs[i]!=null)
				{
					sumaTotala=sumaTotala + cl.produs[i].getPret();
				}
			}
			if(cl instanceof ClientFidel)
			{
				double disc=( ( (ClientFidel)cl).discount *sumaTotala)/100.0;
				sumaTotala=sumaTotala-disc;
			}
			return sumaTotala;
		}
		
		public String toString()
		{
			return this.nume + " a avut " + this.nrClinetiServiti + " clienti";
		}
}
