import java.util.ArrayList;
import java.util.Random;

public class Doctor {

	private String nume;
	
	public void getBoala( Pacient pacient)
	{
		Random rand= new Random(50);
		int nr=rand.nextInt();
		if(nr<=25)
		{
			pacient.setAfectie(afectiune.acuta);
		}
		else
			pacient.setAfectie(afectiune.cronica);
	}
	public ArrayList<Medicament> setReteta(Pacient pacient)
	{
		ArrayList<Medicament> reteta= new ArrayList<Medicament>();
		if(pacient.getAfectie()==afectiune.acuta)
		{
			Medicament med= new Medicament("aspirin","a",12,6);
			reteta.add(med);
		}
		else
		{
			Medicament med= new Medicament("aspirin","a",12,6);
			Medicament med1= new Medicament("aspirin2","a",12,6);
			Medicament med2= new Medicament("aspirin3","a",12,6);
			reteta.add(med);
			reteta.add(med1);
			reteta.add(med2);
		}
			return reteta;
	}
}
