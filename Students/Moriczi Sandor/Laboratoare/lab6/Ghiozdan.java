
public class Ghiozdan {
	private int nrRechizite;
	private Rechizite[] rec;
	//Rechizite[] rec= null;
	public Ghiozdan(int nrRechizite)
	{
		this.nrRechizite=nrRechizite;
		rec=new Rechizite[nrRechizite];
	}
	public void addCaiet(Caiet c)
	{
		for(int i=0;i<this.rec.length;i++)
		{
			if(rec[i]==null)
			{
				this.rec[i]=c;
				break;
			}
		}
	}
	public Rechizite getRec(int i)
	{
		return this.rec[i];
	}
	public void addManual(Manual m)
	{
		for(int i=0;i<this.rec.length;i++)
		{
			if(this.rec[i]==null)
			{
				this.rec[i]=m;
				break;
			}
		}
	}
	public void listItems()
	{
		for(int i=0;i<this.rec.length;i++)
			if(rec[i] instanceof Manual)
				System.out.println(rec[i].getNume());
			else
				if(rec[i] instanceof Caiet)
					System.out.println(rec[i].getNume());
	}
	public void listManual()
	{
		for(int i=0;i<rec.length;i++)
			if(rec[i] instanceof Manual)
				System.out.println(rec[i].getNume());
	}
	public void listCaiet()
	{
		for(int i=0;i<rec.length;i++)
			if(rec[i] instanceof Caiet)
				System.out.println(rec[i].getNume());
	}
	public int getNrRechizite()
	{
		int c=0;
		for(int i=0;i<rec.length;i++)
		{
			if(rec[i]!=null)
				c++;
			else
				break;
		}
		return c;
	}
	public int getNrManuale()
	{
		int c=0;
		for(int i=0;i<rec.length;i++)
		{
			if(rec[i]!=null && rec[i] instanceof Manual)
				c++;
		}
		return c;
	}
	public int getNrCaiete()
	{
		int c=0;
		for(int i=0;i<rec.length;i++)
		{
			if(rec[i]!=null && rec[i] instanceof Caiet)
				c++;
		}
		return c;
	}
}
