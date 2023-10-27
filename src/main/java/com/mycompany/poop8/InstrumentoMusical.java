/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main.java.com.mycompany.poop8;

/**
 *
 * @author 
 */
/**
 * La interfaz InstrumentoMusical define métodos que deben ser implementados por las clases que representan instrumentos musicales.
 */
public interface InstrumentoMusical {
    /**
     * Método que representa tocar el instrumento.
     * Implementado por las clases concretas para definir cómo se toca el instrumento.
     */
    void tocar();
    /**
     * Método que representa afinar el instrumento.
     * Implementado por las clases concretas para definir cómo se afina el instrumento.
     */
    void afinar();
    /**
     * Método que proporciona el tipo de instrumento.
     *
     * @return El tipo del instrumento en forma de una cadena.
     * Implementado por las clases concretas para especificar el tipo de instrumento.
     */
    String tipoInstrument();
    
    
}
