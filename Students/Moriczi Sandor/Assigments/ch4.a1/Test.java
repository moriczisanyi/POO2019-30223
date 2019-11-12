
import java.util.*;
public class Test implements Iterator{

	public Cards[] cards= new Cards[13];
	private int pos=0;
	public Test()
	{
		cards= new Cards[13];
		
	}
	public void addCard(String a)
	{
		if(cards[pos]==null)
			{
			cards[pos]= new Cards();
			cards[pos].name=a;
			pos++;
			}
	}
	public int getPos()
	{
		return this.pos;
	}
	public void sort()
	{
		for(int i=0;i<cards.length-1;i++)
		{
			for(int j=i+1;j<cards.length;j++)
			{
				if( cards[i].compareTo(cards[j].nr)>0)// n-am inteles cum se face compareTo, aici m-am blocat
				{
					Cards temp= cards[i];
					cards[i]=cards[j];
					cards[j]=temp;
				}
			}
		}
	}
	/*public void putCards()
	{
		this.cards[0].name="2";
		this.cards[1].setName("3");
		this.cards[2].setName("4");
		this.cards[3].setName("5");
		this.cards[4].setName("6");
		this.cards[5].setName("7");
		this.cards[6].setName("8");
		this.cards[7].setName("9");
		this.cards[8].setName("10");
		this.cards[9].setName("J");
		this.cards[10].setName("Q");
		this.cards[11].setName("K");
		this.cards[12].setName("A");
	}*/

	@Override
	public Object next() {
		if(this.hasNext())
			{
			if(cards[pos]==null)
				{
				pos++;
				return null;
				}
			else
				return this.cards[pos++].name;
			}
		return null;
	}
	@Override
	public boolean hasNext() {
		if(pos<cards.length)
			return true;
		else
			return false;
	}
	
	public void remove() throws IllegalStateException
	{
		for(int i=pos-1;i<cards.length-1;i++)
		{
			cards[i]=cards[i+1];
		}
		cards[cards.length-1]=null;
		pos--;
	}
	public void printCards()
	{
		pos=0;
		while (hasNext()) 
            System.out.print(next() + " ");
		System.out.println();
	}
	public void setPos(int pos)
	{
		this.pos=pos;
	}


}
