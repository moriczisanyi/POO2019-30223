package ex62;

import java.awt.Color;

public class TestClass {
	public static void main(String[] args) {
		Minge minge=null;
		try
		{
		minge.setCol(Color.black);
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
	}
}
