/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.poop8;

/**
 *
 * @author 
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {
    
    
     /**
     * Implementación del método tocar para un instrumento de viento.
     * Imprime un mensaje que indica cómo tocar el instrumento de viento.
     */
    @Override
    public void tocar() {
        System.out.println("Tocar instrumento de viento");
    }
    /**
     * Implementación del método afinar para un instrumento de viento.
     * Imprime un mensaje que indica cómo afinar un instrumento de viento.
     */
    @Override
    public void afinar() {
        System.out.println("Afinar un instrumento de viento");
    }
    /**
     * Implementación del método tipoInstrument para un instrumento de viento.
     * Devuelve una cadena que indica el tipo del instrumento, que es "Instrumento de viento".
     *
     * @return El tipo del instrumento en forma de una cadena.
     */
    @Override
    public String tipoInstrument() {
        return "Instrumento de viento";
    }
    
}
