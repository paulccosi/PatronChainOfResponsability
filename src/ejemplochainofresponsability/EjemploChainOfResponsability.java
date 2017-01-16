/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplochainofresponsability;

import javax.swing.JOptionPane;
import modelo.Restaurante;

/**
 *
 * @author Wx8-PC
 */
public class EjemploChainOfResponsability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String descripcion = JOptionPane.showInputDialog("Ingrese descripcion de la peticion");
        int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo de espera de la peticion"));
        
        Restaurante restaurante = new Restaurante();
        restaurante.peticion(descripcion, tiempo);
    }
    
}
