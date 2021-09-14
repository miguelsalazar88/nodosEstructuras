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
		this.x = Utils.rnd.nextInt(450);
		this.y = Utils.rnd.nextInt(250);
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


	public void setAristas(ArrayList<Arista> aristas) {
		this.aristas = aristas;
	}
	
	
	
	
}
