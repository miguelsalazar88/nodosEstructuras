package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import modelo.Modelo;
import vista.Ventana;

public class Controller implements ActionListener, ItemListener {
	
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
		}
		if(e.getSource().equals(this.vista.getBotonAdyacencia())){
			this.modelo.setAdyacencia();
			this.vista.getVentanaMatriz().setVisible(true);
		}

		if (e.getSource().equals(this.vista.getBotonIncidencia())){
			this.modelo.setIncidencia();
			this.vista.getVentanaMatriz().setVisible(true);
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
			System.out.println("Me lleva");
		}

	}


	@Override
	public void itemStateChanged(ItemEvent e) {

	}
}
