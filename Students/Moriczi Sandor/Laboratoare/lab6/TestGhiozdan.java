import java.util.*;
public class TestGhiozdan {

	static void add(Ghiozdan g, int n)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("insert 1 for Manual, 2 for Caiet");
		for(int i=0;i<5;i++)
		{
			int nr=scan.nextInt();
			while(nr<1 || nr>2)
			{
				System.out.println("nr gresit, te rog sa fie 1 sau 2");
				nr=scan.nextInt();
			}
			if(nr==1)
			{
				Manual m= new Manual();
				g.addManual(m);
			}
			else
				if(nr==2)
				{
					Caiet c= new Caiet();
					g.addCaiet(c);
				}
		}
	}
	public static void main(String[] args) {
		Ghiozdan g=new Ghiozdan(10);
		TestGhiozdan.add(g,5);//5 este numarul de elemente din lista de rechizite
		System.out.println("rechizite " +g.getNrRechizite() + " , manuale "+ g.getNrManuale()+ " , caiete "+ g.getNrCaiete());
		g.listItems();
		System.out.println();
		g.listCaiet();
		System.out.println();
		g.listManual();
	}

}
