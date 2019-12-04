package ex5;

public class Camera {
	private int numar;
	
	public Camera(int nr)
	{
		this.numar=nr;
	}
	public int getNumar() {
		return numar;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}
	@Override
	public String toString() {
		return "Camera [numar=" + numar + "]";
	}
	
}
