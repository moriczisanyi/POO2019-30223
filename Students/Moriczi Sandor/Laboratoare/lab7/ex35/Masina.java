package ex35;

import java.awt.Color;

public class Masina implements Cloneable{
	private String marca;
	private Color c;

	public Masina(String marca, Color c) {
		this.marca = marca;
		this.c = c;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}
	public Object clone() throws CloneNotSupportedException
	{
		Masina cloned=(Masina)super.clone();
		return cloned;
	}
	public String toString() {
		return "Masina [marca=" + marca + ", c=" + c + "]";
	}
}
