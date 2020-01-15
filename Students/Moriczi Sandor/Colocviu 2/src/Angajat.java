

public class Angajat implements AtributiiAngajat{
	
	private String nume;
	private int id;
	private Data data;
	private int bonus;
	private Farmacie farmacie;
	
	
	public Angajat(String nume, int id, Data data, int bonus, Farmacie farmacie) {
		this.nume = nume;
		this.id = id;
		this.data = data;
		this.bonus = bonus;
		this.farmacie = farmacie;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public int getStock(Medicament med) {
		int i=farmacie.getStock().get(med);
		return i;
		
	}
	@Override
	public void setStock(Medicament med,int stock) {
		farmacie.getStock().put(med, farmacie.getStock().get(med)-farmacie.getStock().get(med) +stock);
		
	}
	@Override
	public void addMedicament(Medicament med,int stock) {
		farmacie.getStock().put(med, stock);
		
	}
	@Override
	public void deleteMedicament(Medicament med) {
		//hashMap.put("New_Key", hashMap.get("Old_Key"));
		farmacie.getStock().remove(med);
		
	}
	@Override
	public void verificaDacaEsteVandut(Medicament med) {
		// TODO Auto-generated method stub
		
	}
}
