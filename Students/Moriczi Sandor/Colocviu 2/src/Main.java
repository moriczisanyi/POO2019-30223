import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		
		Farmacie farmacie = new Farmacie("Farmacie", "principala", "03213", "farmacie.com");
		Medicament medicament= new Medicament("aspirina","a",12,20);
		Medicament medicament2= new Medicament("paracetamol","a",12,20);
		ArrayList <Medicament> med= new ArrayList<Medicament>();
		File text = new File("F:\\POO\\Colocviu2\\src\\input.txt");
        try {
			Scanner scan = new Scanner(text);
			int n=scan.nextInt();
			for(int i=0;i<n;i++)
			{
				Medicament mednou= new Medicament(scan.next(),scan.next(), scan.nextInt(), scan.nextInt());
				med.add(mednou);
				throw new IncompleteDataException("a");
			}
			
		}
        catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IncompleteDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
		farmacie.getStock().put(medicament, 2);
		Set<Map.Entry<Medicament, Integer>> entrySet = farmacie.getStock().entrySet();
		/*for (Map.Entry<Medicament, Integer> entry : entrySet) {
			System.out.println(entry.getKey().getName() + "\t" + entry.getValue());
		}*/
		Data data= new Data(2000,11,23);
		Angajat ang= new Angajat("a",2,data,10,farmacie);
		ang.setStock(medicament,5);
		/*for (Map.Entry<Medicament, Integer> entry : entrySet) {
			System.out.println(entry.getKey().getName() + "\t" + entry.getValue());
		}
		ang.deleteMedicament(medicament);
		for (Map.Entry<Medicament, Integer> entry : entrySet) {
			System.out.println(entry.getKey().getName() + "\t" + entry.getValue());
		}
		ang.addMedicament(medicament2, 1);
		for (Map.Entry<Medicament, Integer> entry : entrySet) {
			System.out.println(entry.getKey().getName() + "\t" + entry.getValue());
		}*/
		
		try{
			ang.addMedicament(med.get(0), 2);
		ang.addMedicament(med.get(1), 5);
		ang.addMedicament(med.get(2), 10);
		}
		catch (IndexOutOfBoundsException e)
    	{
    		System.out.println(e.getMessage());
    	}
		for (Map.Entry<Medicament, Integer> entry : entrySet) {
			System.out.println(entry.getKey().getName() + "\t" + entry.getValue());
		}
	}
}
