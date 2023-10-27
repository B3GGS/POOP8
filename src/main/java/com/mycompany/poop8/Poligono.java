/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.poop8;

/**
 *
 * @author 
 */
public abstract class Poligono extends Object{
    /**
     * Constructor vacío de la clase Poligono.
     *
     */
    public Poligono(){
    }
    /**
     * Método abstracto que debe ser implementado por las clases concretas que heredan de Poligono.
     * Calcula y devuelve el área del polígono.
     *
     * @return El área del polígono.
     */
    public abstract int area();
    /**
     * Método abstracto que debe ser implementado por las clases concretas que heredan de Poligono.
     * Calcula y devuelve el perímetro del polígono.
     *
     * @return El perímetro del polígono.
     */
    public abstract int perimetro();
    /**
     * Sobrescribe el método toString de la clase Object para proporcionar una representación en cadena de la instancia de Poligono.
     *
     * @return Una cadena que representa la instancia de Poligono.
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
