package modelo;

import java.util.ArrayList;
import java.util.Arrays;

import jdk.jshell.execution.Util;
import utils.Utils;
import vista.Ventana;

import javax.swing.*;

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

	public void borrarGrafo(){
		this.nodosModelo.clear();
		this.vista.getPanel().setNodosVista(nodosModelo);
		this.vista.getPanel().repaint();
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
				Arista a = new Arista(nombre,Utils.rnd.nextInt(20)+1, n.getX() + 13, n.getY() + 13, vecino.getX() + 13, vecino.getY() + 13);
				if (!n.yaEsArista(a)){
					n.getAristas().add(a);
				}
				if(!vecino.yaEsArista(a)){
					vecino.getAristas().add(a);
				}
			}
		}
		this.vista.getPanel().setNodosVista(this.nodosModelo);
		this.vista.setCboOrigen(this.setOrigenDestino());
		this.vista.setCboDestino(this.setOrigenDestino());
		this.vista.getPanel().repaint();
	}

	public void setAdyacencia(){
		String titulo = "Matriz de Adyacencia: \n";
		String[][] matriz = new String[nodosModelo.size()+1][nodosModelo.size()+1];
		matriz[0][0] = "*";

		for (int i = 0; i < matriz.length; i++) {
			try{
				matriz [0][i+1] = nodosModelo.get(i).getNombre();
				matriz [i+1][0] = nodosModelo.get(i).getNombre();
			}
			catch (Exception e){
			}
		}
		
		for (int fila = 1; fila < matriz.length; fila++) {
			for (int columna = 1; columna < matriz.length; columna++) {

				if(nodosModelo.get(fila-1).getVecinos().contains(nodosModelo.get(columna-1))){
					matriz[fila][columna] = "1";
				}
				else{
					matriz[fila][columna] = "0";
				}
				if(fila == columna){
					matriz[fila][columna] = "*";
				}
			}
		}
		this.vista.getAdyacencia().setText(titulo,matriz);
	}

	public ArrayList<String> setOrigenDestino(){

		ArrayList<String> listaOrigen = new ArrayList<String>();

		for (int i = 0; i < nodosModelo.size(); i++) {
			listaOrigen.add(nodosModelo.get(i).getNombre());
		}
		return listaOrigen;
	}

	public void verificarAdyacencia(String a, String b){

		if(a.equals(b)){
			JOptionPane.showMessageDialog(null, "No puedes verificar" +
					"la adyacencia del mismo Nodo");
		}
		else {

			Nodo nodoA = new Nodo("");
			Nodo nodoB = new Nodo("");
			for (int i = 0; i < nodosModelo.size(); i++) {
				if (nodosModelo.get(i).getNombre().equals(a)) {
					nodoA = nodosModelo.get(i);
				}
				if (nodosModelo.get(i).getNombre().equals(b)) {
					nodoB = nodosModelo.get(i);
				}
			}

			if (nodoA.esVecino(nodoB) || nodoB.esVecino(nodoA)) {
				JOptionPane.showMessageDialog(null, "Nodo " + nodoA.getNombre() +
						" y Nodo " + nodoB.getNombre() + " SI son adyacentes");
			}

			else{
				JOptionPane.showMessageDialog(null, "Nodo " + nodoA.getNombre() +
						" y Nodo " + nodoB.getNombre() + " NO son adyacentes");
			}
		}
	}

	public void obtenerPeso(String a, String b){
		String alDerecho = a+b;
		String alReves = b+a;
		int peso = 0;

		for (int i = 0; i < nodosModelo.size(); i++) {
			for (int j = 0; j < nodosModelo.get(i).getAristas().size(); j++) {
				if(nodosModelo.get(i).getAristas().get(j).getNombre().equals(alDerecho)
				|| nodosModelo.get(i).getAristas().get(j).getNombre().equals(alReves)){
					peso = nodosModelo.get(i).getAristas().get(j).getPeso();
				}
			}
		}

		if(peso == 0){
			JOptionPane.showMessageDialog(null, "La arista NO existe");
		}

		else{
			JOptionPane.showMessageDialog(null, "El peso de la arista es " + peso);
		}

	}

	public void eliminarArista(String a, String b){
		String alDerecho = a+b;
		String alReves = b+a;
		Boolean hayArista = false;

		for (int i = 0; i < nodosModelo.size(); i++) {
			for (int j = 0; j < nodosModelo.get(i).getAristas().size(); j++) {
				if(nodosModelo.get(i).getAristas().get(j).getNombre().equals(alDerecho)
						|| nodosModelo.get(i).getAristas().get(j).getNombre().equals(alReves)){
					nodosModelo.get(i).getAristas().remove(j);
					hayArista = true;
				}
			}
		}

		if(hayArista){
			JOptionPane.showMessageDialog(null, "La arista ha sido " +
					"eliminada exitosamente");
		}

		else{
			JOptionPane.showMessageDialog(null,"La arista NO existe ,por lo tanto " +
					"no puede ser eliminada");
		}
		this.vista.getPanel().setNodosVista(nodosModelo);
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
