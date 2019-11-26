package ex34;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Persoana[] persoane= new Persoana[10];
		persoane[0]= new Persoana("bob","yo",25);
		persoane[1]= new Persoana("alex","bbb",21);
		persoane[2]= new Persoana("aaa","sas",22);
		Arrays.sort(persoane,0,3);
		Persoana.printArr(persoane);
	}

}
