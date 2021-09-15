package vista;

import javax.swing.*;

import controlador.Controller;

public class Ventana extends JFrame {

	private Panel panel = new Panel();
	private Controller controller;
	private JButton botonAdyacencia = new JButton("Crear Matriz de Adyacencia");
	private JButton botonIncidencia = new JButton("Crear Matriz de Incidencia");
	private JButton botonPesos = new JButton("Crear Matriz de Pesos");
	private JLabel labelOrigen = new JLabel("Origen");
	private JLabel labelDestino = new JLabel("Destino");
	
	
	public Ventana() {
		
		this.setSize(1200, 750);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.initComponents();
		this.setVisible(true);	
		
	}
	
	
	private void initComponents() {
		
		this.add(panel);
		this.add(botonAdyacencia);
		this.botonAdyacencia.setBounds(10, 620, 200, 30);
		this.add(botonIncidencia);
		this.botonIncidencia.setBounds(10, 655, 200, 30);
		this.add(botonPesos);
		this.botonPesos.setBounds(10, 690, 200, 30);
		
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
