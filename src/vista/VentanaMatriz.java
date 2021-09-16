package vista;

import modelo.Arista;
import modelo.Nodo;

import javax.swing.*;
import java.util.ArrayList;

public class VentanaMatriz extends JDialog {

    private ArrayList<Nodo> nodosAdyacencia = new ArrayList<Nodo>();
    private ArrayList<Arista> aristasAdyacencia = new ArrayList<Arista>();
    private JTextArea areaTexto = new JTextArea();

    public VentanaMatriz(){
        this.setVisible(false);
        this.setSize(200, 200);
        this.setComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void setComponents() {
        this.add(areaTexto);
        this.areaTexto.setBounds(10,10,180,180);
        this.areaTexto.setEditable(false);
    }

    public void setText(String titulo, String[][] matriz){
        String s = titulo + "\n";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                s = s + "[" + matriz[i][j] + "]";
            }
            s = s + "\n";
        }
        this.areaTexto.setText(s);
    }

}
