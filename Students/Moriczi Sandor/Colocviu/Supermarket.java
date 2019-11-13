
public class Supermarket {
		private int produsIndex=0;
		private int angajatIndex=0;
		private int clientFidelIndex=0;
		private int clientIndex=0;
		public ClientFidel[] clientfidel= new ClientFidel[5];
		public Angajat[] angajat = new Angajat[5];
		public Produs[] produse= new Produs[20];
		public Client[] client =new Client[5];
		
		public void addAngajat(Angajat ang)
		{
			if(this.angajatIndex < angajat.length)
			{
				angajat[this.angajatIndex]=ang;
				this.angajatIndex++;
			}
		}
		
		public void addProdus(Produs prod)
		{
			if(this.produsIndex < this.produse.length)
			{
				this.produse[this.produsIndex]=prod;
				this.produsIndex++;
			}
		}
		
		public void addClientFidel(ClientFidel clfidel)
		{
			if(this.clientFidelIndex<this.clientfidel.length)
			{
				this.clientfidel[this.clientFidelIndex]=clfidel;
				this.clientFidelIndex++;
			}
		}
		public void addClient(Client cl)
		{
			if(this.clientIndex<this.client.length)
			{
				this.client[this.clientIndex]=cl;
				this.clientIndex++;
			}
		}
		
		public void sortByNrClient()
		{
			for(int i=0;i<this.angajatIndex-1;i++)
			{
				for(int j=i+1;j<this.angajatIndex;j++)
				{
					if(angajat[i].nrClinetiServiti>angajat[j].nrClinetiServiti)
					{
						Angajat temp;
						temp=angajat[i];
						angajat[i]=angajat[j];
						angajat[j]=temp;
					}
				}
			}
		}
		
		public void sortBySuma()
		{
			for(int i=0;i<this.clientFidelIndex-1;i++)
			{
				for(int j=i+1;j<this.clientFidelIndex;j++)
				{
					if(angajat[0].scanProdus(this.clientfidel[i])> angajat[0].scanProdus(this.clientfidel[j]))
					{
						ClientFidel temp;
						temp=clientfidel[i];
						clientfidel[i]=clientfidel[j];
						clientfidel[j]=temp;
					}
				}
			}
		}
		public void printAngajati()
		{
			for(int i=0;i<this.angajatIndex;i++)
				System.out.println(angajat[i]);
			System.out.println();
		}
		
		public void printClienti()
		{
			for(int i=0;i<this.clientFidelIndex;i++)
				System.out.println(clientfidel[i] + " a avut de platit " + angajat[0].scanProdus(clientfidel[i]));
			System.out.println();
		}
		
}
