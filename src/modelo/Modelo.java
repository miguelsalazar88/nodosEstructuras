package modelo;

import java.util.ArrayList;
import java.util.Arrays;

import jdk.jshell.execution.Util;
import utils.Utils;
import vista.Ventana;

public class Modelo {
	
	private Ventana vista;
	private ArrayList<Nodo> nodosModelo = new ArrayList<Nodo>();
	private ArrayList<Arista> aristasModelo = new ArrayList<Arista>(); //No se si lo necesito
	
	public Modelo(Ventana vista) {
		this.vista = vista;
	}
	
	public void crearGrafo() {
		
		this.nodosModelo.clear();
		
		int num = Utils.rnd.nextInt(4)+6;
		
		for (int i = 0; i < num; i++) {
			nodosModelo.add(new Nodo(Utils.numToLetra(i)));
		}

		this.crearVecinos();
	}
	
	public void crearVecinos(){

	int numAristas = Utils.rnd.nextInt(nodosModelo.size())+nodosModelo.size();
		System.out.println("Vamos a repartir " + numAristas + " aristas");

		while (numAristas >= 0){
			Nodo a = nodosModelo.get(Utils.rnd.nextInt(nodosModelo.size()));
			Nodo b = nodosModelo.get(Utils.rnd.nextInt(nodosModelo.size()));

			if (a.yaEsVecino(b)){
				b = nodosModelo.get(Utils.rnd.nextInt(nodosModelo.size()));
			}
			else{
				a.agregarVecino(b);
			}
			numAristas--;
		}

		this.crearAristas();
	}

	public void crearAristas(){
		for (Nodo n: nodosModelo) {
			for (Nodo vecino: n.getVecinos()) {
				String nombre = n.getNombre() + vecino.getNombre();
				n.getAristas().add(new Arista(nombre,n.getX()+13,n.getY()+13, vecino.getX()+13, vecino.getY()+13));
			}
		}
		this.vista.getPanel().setNodosVista(this.nodosModelo);
		this.vista.getPanel().repaint();
	}

	//Getters y Setters


	public ArrayList<Nodo> getNodosModelo() {
		return nodosModelo;
	}

	public void setNodosModelo(ArrayList<Nodo> nodosModelo) {
		this.nodosModelo = nodosModelo;
	}

	public ArrayList<Arista> getAristasModelo() {
		return aristasModelo;
	}

	public void setAristasModelo(ArrayList<Arista> aristasModelo) {
		this.aristasModelo = aristasModelo;
	}
}
