package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import modelo.Arista;
import modelo.Nodo;

public class Panel extends JPanel {
	
	private ArrayList<Nodo> nodosVista = new ArrayList<Nodo>();
	private ArrayList<Arista> aristasVista = new ArrayList<Arista>();
	
	public Panel() {
		this.setSize(500,300);
		this.setBackground(Color.black);
		this.setVisible(true);
	}
	
	
	@Override
	
	public void paint(Graphics g) {
		
		
		for (Nodo n : nodosVista) {
			g.setColor(Color.red);
			g.fillOval(n.getX(), n.getY(), 30, 30);
			g.setColor(Color.white);
			g.drawString(n.getNombre(), n.getX()+10, n.getY()+20);
		}
	
	}


	public ArrayList<Nodo> getNodosVista() {
		return nodosVista;
	}


	public void setNodosVista(ArrayList<Nodo> nodosVista) {
		this.nodosVista = nodosVista;
	}


	public ArrayList<Arista> getAristasVista() {
		return aristasVista;
	}


	public void setAristasVista(ArrayList<Arista> aristasVista) {
		this.aristasVista = aristasVista;
	}
	
	
	

}
