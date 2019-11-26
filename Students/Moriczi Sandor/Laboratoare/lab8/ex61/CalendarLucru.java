package ex61;
public class CalendarLucru {
	private Zi[] zile;
	
	public CalendarLucru()
	{
		zile= new Zi[7];
		zile[0]= new Zi("Luni",Luc.Lucratoare);
		zile[1]= new Zi("Marti",Luc.Lucratoare);
		zile[2]= new Zi("Miercuri",Luc.Lucratoare);
		zile[3]= new Zi("Joi",Luc.Lucratoare);
		zile[4]= new Zi("Vineri",Luc.Lucratoare);
		zile[5]= new Zi("Sambata",Luc.Nelucratoare);
		zile[6]= new Zi("Duminica",Luc.Nelucratoare);
		
	}
	public void setSelectedZiLucratoare(int ziua)
	{
		this.zile[ziua].setLucratoare();
	}
	public void setSelectedZiNelucratoare(int ziua)
	{
		this.zile[ziua].setNelucratoare();
	}
	public Zi[] getZile() {
		return zile;
	}
	public void setZile(Zi[] zile) {
		this.zile = zile;
	}
	
}
