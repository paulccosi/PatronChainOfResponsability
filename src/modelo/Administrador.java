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
public class Administrador implements IManejador{
    
    
       private IManejador sucesor;
    @Override
    public void peticion(String descripcion, int tiempoDeEspera) {
        if(tiempoDeEspera > 40){
            JOptionPane.showMessageDialog(null, "La peticion: "+descripcion+"esta siendo atendido por el administrador");
        
        }
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
