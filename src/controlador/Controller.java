package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
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
		
	}

}
