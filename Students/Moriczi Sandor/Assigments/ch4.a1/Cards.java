
public class Cards implements Comparable{
	public String name;
	public int nr= Integer.parseInt(name);
	
	public Cards()
	{
		this.name="2";
	}
	public void setName(String s)
	{
		this.name=s;
	}
	public String getName()
	{
		return this.name;
	}

	public int compareTo(Cards c) {
		{
			if( nr> c.nr)
				return 1;
			if(nr == c.nr)
				return 0;
			if( nr< c.nr)
				return -1;
		}
		return nr;
	}
}
