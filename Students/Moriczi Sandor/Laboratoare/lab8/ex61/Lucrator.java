package ex61;

public class Lucrator {
	private String nume;
	private CalendarLucru zileLucratoare;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public CalendarLucru getZileLucratoare() {
		return zileLucratoare;
	}
	public void setZileLucratoare(CalendarLucru zileLucratoare) {
		this.zileLucratoare = zileLucratoare;
	}
	public void lucreaza(String ziua) throws Exception
	{
		for(int i=0;i<this.zileLucratoare.getZile().length;i++)
		{
			if(this.zileLucratoare.getZile()[i].getNume().contentEquals(ziua))
			{
				if(this.zileLucratoare.getZile()[i].esteLucratoare())
				{
					System.out.println(nume + " lucreaza " + this.zileLucratoare.getZile()[i]);
					break;
				}
				else
					{
					throw new Exception("nu este zi lucratoare");//aici daca imi puteti explica de ce mereu imi arunca cea de a doua exceptie
					}
			}
		}
		throw new WrongDayException("nu este o zi a saptamanii");
	}
}
