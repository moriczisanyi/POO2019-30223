
public class ClientFidel extends Client{
		public int nrPuncte;
		public int discount;
		
		
		public ClientFidel(String nume, int id, int nrProd, int nrPuncte) {
			super(nume, id, nrProd);
			this.nrPuncte=nrPuncte;
			this.discount=this.calcDiscount();
		}
		public void setNrPuncte(int puncte)
		{
			this.nrPuncte=puncte;
		}
		public int getNrPuncte()
		{
			return this.nrPuncte;
		}
		public int calcDiscount()
		{
			if(nrPuncte> 10)
				this.discount=20;
			return discount;
		}
		public int getDiscount()
		{
			return this.discount;
		}
		public void setDiscount(int discount)
		{
			this.discount=discount;
		}
		public String toString()
		{
			return this.nume;
		}
}
