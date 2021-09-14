package vista;

import javax.swing.JButton;
import javax.swing.JFrame;

import controlador.Controller;

public class Ventana extends JFrame {

	private Panel panel = new Panel();
	private Controller controller;
	private JButton botonAdyacencia = new JButton("Adyacencia");
	private JButton botonIncidencia = new JButton("Incidencia");
	private JButton botonPesos = new JButton("Pesos");
	
	
	public Ventana() {
		
		this.setSize(500, 500);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.initComponents();
		this.setVisible(true);	
		
	}
	
	
	private void initComponents() {
		
		this.add(panel);
		this.add(botonAdyacencia);
		this.botonAdyacencia.setBounds(10, 350, 100, 30);
		this.add(botonIncidencia);
		this.botonIncidencia.setBounds(10, 400, 100, 30);
		this.add(botonPesos);
		this.botonPesos.setBounds(10, 450, 100, 30);
		
	}


	public void setController(Controller cont) {
		this.controller = cont;
		this.botonIncidencia.addActionListener(cont);
		this.botonAdyacencia.addActionListener(cont);
		
	}


	public Panel getPanel() {
		return panel;
	}


	public void setPanel(Panel panel) {
		this.panel = panel;
	}


	public JButton getBotonAdyacencia() {
		return botonAdyacencia;
	}


	public void setBotonAdyacencia(JButton botonAdyacencia) {
		this.botonAdyacencia = botonAdyacencia;
	}


	public JButton getBotonIncidencia() {
		return botonIncidencia;
	}


	public void setBotonIncidencia(JButton botonIncidencia) {
		this.botonIncidencia = botonIncidencia;
	}


	public JButton getBotonPesos() {
		return botonPesos;
	}


	public void setBotonPesos(JButton botonPesos) {
		this.botonPesos = botonPesos;
	}
	
	

	
	
}
