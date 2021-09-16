package vista;

import javax.swing.*;

import controlador.Controller;

import java.util.ArrayList;

public class Ventana extends JFrame {

	private Panel panel = new Panel();
	private Controller controller;
	private JButton botonAdyacencia = new JButton("Crear Matriz de Adyacencia");
	private JButton botonIncidencia = new JButton("Crear Matriz de Incidencia");
	private JButton botonPesos = new JButton("Crear Matriz de Pesos");
	private JButton botonGenerar = new JButton("Generar Grafo");
	private JButton botonLiberar = new JButton("Liberar Grafo");
	private JButton botonVerificarAdyacencia = new JButton("Verificar Adyacencia");
	private JButton botonObtenerPeso = new JButton("Obtener Peso");
	private JButton botonEliminarArista = new JButton("Eliminar Arista");
	private JLabel labelOrigen = new JLabel("Origen:");
	private JLabel labelDestino = new JLabel("Destino:");
	private VentanaMatriz ventanaMatriz = new VentanaMatriz();

	private JComboBox<String> cboOrigen = new JComboBox<String>();
	private JComboBox<String> cboDestino = new JComboBox<String>();
	
	
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
		this.add(botonVerificarAdyacencia);
		this.botonVerificarAdyacencia.setBounds(800,620,200,30);
		this.add(botonObtenerPeso);
		this.botonObtenerPeso.setBounds(800,655,200,30);
		this.add(botonEliminarArista);
		this.botonEliminarArista.setBounds(800,690,200,30);
		this.add(botonGenerar);
		this.botonGenerar.setBounds(300,620,200,30);
		this.add(botonLiberar);
		this.botonLiberar.setBounds(300,655,200,30);
		this.add(labelOrigen);
		this.labelOrigen.setBounds(600,620,70,30);
		this.add(labelDestino);
		this.labelDestino.setBounds(600,655,70,30);
		this.add(cboOrigen);
		this.cboOrigen.setBounds(675,620,70,30);
		this.add(cboDestino);
		this.cboDestino.setBounds(675,655,70,30);

		
	}


	public void setController(Controller cont) {
		this.controller = cont;
		this.botonIncidencia.addActionListener(cont);
		this.botonAdyacencia.addActionListener(cont);
		this.botonGenerar.addActionListener(cont);
		this.botonLiberar.addActionListener(cont);
		this.cboOrigen.addItemListener(cont);
		this.cboDestino.addItemListener(cont);
		this.botonVerificarAdyacencia.addActionListener(cont);
		this.botonObtenerPeso.addActionListener(cont);
		this.botonEliminarArista.addActionListener(cont);
		
	}

	public void setCboOrigen(ArrayList<String> lista){
		for (int i = 0; i < lista.size(); i++) {
			this.cboOrigen.addItem(lista.get(i));
		}
	}

	public void setCboDestino(ArrayList<String> lista){
		for (int i = 0; i < lista.size(); i++) {
			this.cboDestino.addItem(lista.get(i));
		}
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

	public VentanaMatriz getVentanaMatriz() {
		return ventanaMatriz;
	}

	public void setVentanaMatriz(VentanaMatriz ventanaMatriz) {
		this.ventanaMatriz = ventanaMatriz;
	}

	public JButton getBotonGenerar() {
		return botonGenerar;
	}

	public JButton getBotonLiberar() {
		return botonLiberar;
	}

	public JComboBox<String> getCboOrigen() {
		return cboOrigen;
	}

	public JComboBox<String> getCboDestino() {
		return cboDestino;
	}

	public JButton getBotonVerificarAdyacencia() {
		return botonVerificarAdyacencia;
	}

	public JButton getBotonObtenerPeso() {
		return botonObtenerPeso;
	}

	public JButton getBotonEliminarArista() {
		return botonEliminarArista;
	}
}

