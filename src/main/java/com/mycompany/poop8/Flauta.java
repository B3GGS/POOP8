/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.poop8;

/**
 *
 * @author 
 */
public class Flauta extends InstrumentoViento {
    /**
     * Implementación del método tipoInstrument para una flauta.
     * Devuelve una cadena que indica el tipo del instrumento, que incluye "Instrumento de viento" y "Flauta".
     *
     * @return El tipo del instrumento en forma de una cadena.
     */
    @Override
    public String tipoInstrument() {
        return super.tipoInstrument() + ", Flauta";
    }
    /**
     * Implementación del método afinar para una flauta.
     * Llama al método afinar de la clase base (InstrumentoViento).
     */
    @Override
    public void afinar() {
        super.afinar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    /**
     * Implementación del método tocar para una flauta.
     * Llama al método tocar de la clase base (InstrumentoViento).
     */
    @Override
    public void tocar() {
        super.tocar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
