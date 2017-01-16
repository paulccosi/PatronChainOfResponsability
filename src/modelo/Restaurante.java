/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Wx8-PC
 */
public class Restaurante implements IManejador{
    
       private IManejador sucesor;
    @Override
    public void peticion(String descripcion, int tiempoDeEspera) {
       
        Mesero mesero = new Mesero();
        setSucesor(mesero);
        
        Chef chef = new Chef();
        
        Administrador admin = new Administrador();
        chef.setSucesor(admin);
            sucesor.peticion(descripcion, tiempoDeEspera);
        }
    

    @Override
    public IManejador getSucesor() {
        return sucesor;
    }

    @Override
    public void setSucesor(IManejador sucesor) {
       this.sucesor = sucesor;
    
}
    
}
