package app;

import controlador.Controller;
import modelo.Arista;
import modelo.Modelo;
import modelo.Nodo;
import utils.Utils;
import vista.Ventana;

public class App {

	public static void main(String[] args) {
		Ventana v = new Ventana();
		Modelo m = new Modelo(v);
		Controller c = new Controller(v,m);

		m.crearGrafo();

		for (int i = 0; i < m.getNodosModelo().size(); i++) {
			Nodo n = m.getNodosModelo().get(i);

			System.out.println("Nodo: " + n.getNombre());
			System.out.println("Vecinos: ");
			for (Nodo vecino: n.getVecinos()) {
				System.out.print(vecino.getNombre() + " ");
			}
			System.out.println("\n Aristas: ");
			for (Arista a: n.getAristas()) {
				System.out.print(a.getNombre() + ". ");
			}
			System.out.println();
		}
	}
}
