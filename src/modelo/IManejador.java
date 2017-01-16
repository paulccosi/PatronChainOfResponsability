/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Wx8-PC
 */
public interface IManejador {
    public void peticion(String descripcion, int tiempoDeEspera);
    public IManejador getSucesor();
    public void setSucesor(IManejador sucesor);
}
