package modelo;

import java.util.ArrayList;
import java.util.Arrays;

import utils.Utils;
import vista.Ventana;

public class Modelo {
	
	private Ventana vista;
	private ArrayList<Nodo> nodosModelo = new ArrayList<Nodo>();
	private ArrayList<Arista> aristasModelo = new ArrayList<Arista>();
	
	public Modelo(Ventana vista) {
		this.vista = vista;
	}
	
	public void crearGrafo() {
		
		this.nodosModelo.clear();
		
		int num = Utils.rnd.nextInt(4)+6;
		
		for (int i = 0; i < num; i++) {
			nodosModelo.add(new Nodo(Utils.numToLetra(i)));
		}
		
		for (int i = 0; i < num; i++) {
			nodosModelo.get(i).setVecinos(crearVecinos());
		}
		
		this.vista.getPanel().setNodosVista(this.nodosModelo);
		this.vista.getPanel().repaint();
	}
	
	public ArrayList<Nodo> crearVecinos(){
		
		int numVecinos = Utils.rnd.nextInt(3);
		int[] vecinos = new int[numVecinos];
		// Toca diseñar este método.
		
	}

}
