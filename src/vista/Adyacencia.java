package vista;

import modelo.Arista;
import modelo.Nodo;

import javax.swing.*;
import java.util.ArrayList;

public class Adyacencia extends JDialog {

    private ArrayList<Nodo> nodosAdyacencia = new ArrayList<Nodo>();
    private ArrayList<Arista> aristasAdyacencia = new ArrayList<Arista>();
    private JTextArea areaTexto = new JTextArea();

    public Adyacencia(){
        this.setVisible(false);
        this.setSize(500, 500);
        this.setComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void setComponents() {
        this.add(areaTexto);
        this.areaTexto.setBounds(50,50,400,400);
        this.areaTexto.setEditable(false);
    }

    public void setText(String[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
            }
        }
    }

}
