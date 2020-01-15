
public interface AtributiiAngajat {

	public int getStock(Medicament medicament);
	public void setStock(Medicament medicament, int stock);
	public void addMedicament(Medicament medicament, int stock);
	public void deleteMedicament(Medicament medicament);
	public void verificaDacaEsteVandut(Medicament medicament);
}
