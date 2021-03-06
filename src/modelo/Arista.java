package modelo;

public class Arista implements Comparable<Arista> {
	
	private String nombre;
	private int peso;
	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public Arista(String nombre, int peso, int x1, int y1, int x2, int y2) {
		this.nombre = nombre;
		this.peso = peso;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}


	@Override
	public int compareTo(Arista o) {
		return this.getNombre().compareTo(o.getNombre());
	}
}
