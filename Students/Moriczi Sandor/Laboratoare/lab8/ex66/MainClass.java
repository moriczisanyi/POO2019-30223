package ex66;

import java.util.Scanner;

public class MainClass {
	public static void numarMaiMicCaZece(int nr) throws WrongNumberException
	{
		if(nr<10)
		{
			throw new WrongNumberException("este un numar prea mic");
		}
		else
			System.out.println("numar bun");
	}
	public static void citireNumarMaiMareCa5() throws Exception
	{
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		try {
		MainClass.numarMaiMicCaZece(n);
		}
		catch(WrongNumberException wre)
		{
			System.out.println(wre.getMessage());
			if(n<5)
			{
				throw new WrongInputException("este sub 5");
			}
		}
	}
	public static void main(String[] args) throws Exception {
		for(int i=0;i<3;i++)
		{
		try{
			MainClass.citireNumarMaiMareCa5();
		}
		catch (WrongInputException wie)
		{
			System.out.println(wie.getMessage());
		}
		}

	}

}
