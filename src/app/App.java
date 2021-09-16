package app;

import controlador.Controller;
import modelo.Arista;
import modelo.Modelo;
import modelo.Nodo;
import utils.Utils;
import vista.Ventana;

import javax.swing.*;

public class App {

	public static void main(String[] args) {
		Ventana v = new Ventana();
		Modelo m = new Modelo(v);
		Controller c = new Controller(v,m);
	}
}
