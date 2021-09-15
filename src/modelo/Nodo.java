package modelo;

import java.util.ArrayList;

import utils.Utils;

public class Nodo {
	
	private String nombre;
	private int x;
	private int y;
	private ArrayList<Nodo> vecinos = new ArrayList<Nodo>();
	private ArrayList<Arista> aristas = new ArrayList<Arista>();
	
	
	public Nodo(String nombre) {
		this.nombre = nombre;
		this.setPosicion();
	}
	
	public void setPosicion() {
		this.x = Utils.rnd.nextInt(1150);
		this.y = Utils.rnd.nextInt(250);
	}

	public void agregarVecino(Nodo n){

		this.vecinos.add(n);
		n.vecinos.add(this);

	}

	public boolean yaEsVecino (Nodo n){
		boolean yaEsvecino = false;

		if (n.getNombre().equals(this.getNombre())){
			yaEsvecino = true;
		}
		else {
			for (Nodo vecino : vecinos) {
				if (vecino.getNombre().equals(n.getNombre())) {
					yaEsvecino = true;
				}
			}
		}
		return yaEsvecino;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public ArrayList<Nodo> getVecinos() {
		return vecinos;
	}


	public void setVecinos(ArrayList<Nodo> vecinos) {
		this.vecinos = vecinos;
	}


	public ArrayList<Arista> getAristas() {
		return aristas;
	}

	
	
	
	
}
