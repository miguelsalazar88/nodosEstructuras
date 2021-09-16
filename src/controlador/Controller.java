package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import modelo.Arista;
import modelo.Modelo;
import modelo.Nodo;
import vista.Ventana;

public class Controller implements ActionListener {
	
	private Ventana vista;
	private Modelo modelo;
	
	
	public Controller(Ventana vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
		this.vista.setController(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource().equals(this.vista.getBotonGenerar())){
			this.modelo.crearGrafo();

			//Prueba

			System.out.println("********* Nuevo Grafo ************ ");
			System.out.println();

			for (int i = 0; i < this.modelo.getNodosModelo().size(); i++) {
				Nodo n = this.modelo.getNodosModelo().get(i);

				System.out.print("Nodo: " + n.getNombre());
				System.out.print(", Vecinos: ");
				for (Nodo vecino: n.getVecinos()) {
					System.out.print(vecino.getNombre() + " ");
				}
				System.out.print(" Aristas: ");
				for (Arista a: n.getAristas()) {
					System.out.print(a.getNombre() + + a.getPeso() + ". ");
				}
				System.out.println();
			}

			System.out.println("Lista de Aristas: ");

		}
		if(e.getSource().equals(this.vista.getBotonAdyacencia())){
			this.modelo.setAdyacencia();
			this.vista.getVentanaMatriz().setVisible(true);
		}

		if (e.getSource().equals(this.vista.getBotonIncidencia())){
			this.vista.getVentanaMatriz().setVisible(true);
			this.modelo.setIncidencia();
		}

		if(e.getSource().equals(this.vista.getBotonLiberar())){
			this.modelo.borrarGrafo();
			System.out.println("Se borró");
		}

		if(e.getSource().equals(this.vista.getBotonVerificarAdyacencia())){
			this.modelo.verificarAdyacencia(this.vista.getCboOrigen().getSelectedItem().toString(),
					this.vista.getCboDestino().getSelectedItem().toString());
		}

		if(e.getSource().equals(this.vista.getBotonObtenerPeso())){
			this.modelo.obtenerPeso(this.vista.getCboOrigen().getSelectedItem().toString(),
					this.vista.getCboDestino().getSelectedItem().toString());
		}

		if(e.getSource().equals(this.vista.getBotonEliminarArista())){
			this.modelo.eliminarArista(this.vista.getCboOrigen().getSelectedItem().toString(),
					this.vista.getCboDestino().getSelectedItem().toString());
		}

		if(e.getSource().equals(this.vista.getBotonPesos())){
			this.modelo.setMatrizPesos();
			this.vista.getVentanaMatriz().setVisible(true);
		}
	}
}
