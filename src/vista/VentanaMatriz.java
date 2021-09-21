package vista;

import modelo.Arista;
import modelo.Nodo;

import javax.swing.*;
import java.util.ArrayList;

public class VentanaMatriz extends JDialog {

    private ArrayList<Nodo> nodosAdyacencia = new ArrayList<Nodo>();
    private ArrayList<Arista> aristasAdyacencia = new ArrayList<Arista>();
    private JTable tabla = new JTable(15,15);

    public VentanaMatriz(){
        this.setVisible(false);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.add(tabla);
        this.tabla.setBounds(10,10,450,450);
    }


    public void imprimirMatriz(String[][] matriz){

        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[0].length; columnas++) {

                this.tabla.setValueAt(matriz[filas][columnas],filas,columnas);
                //Prueba

            }
        }

    }
}
