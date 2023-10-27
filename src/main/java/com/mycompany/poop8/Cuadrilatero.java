/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.poop8;

/**
 *
 * @author 
 */
public class Cuadrilatero extends Poligono{
    private int alfa, gama, beta;
    private float a, b;
    private float base, alt;
    /**
     * Constructor vacío de la clase Cuadrilatero.
     */
    public Cuadrilatero() {
    }
    /**
     * Constructor de la clase Cuadrilatero que permite especificar ángulos y dimensiones del cuadrilátero.
     *
     * @param alfa  Ángulo alfa del cuadrilátero.
     * @param gama  Ángulo gama del cuadrilátero.
     * @param beta  Ángulo beta del cuadrilátero.
     * @param a     Longitud del lado a del cuadrilátero.
     * @param b     Longitud del lado b del cuadrilátero.
     * @param base  Base del cuadrilátero.
     * @param alt   Altura del cuadrilátero.
     */
    public Cuadrilatero(int alfa, int gama, int beta, float a, float b, float base, float alt) {
        this.alfa = alfa;
        this.gama = gama;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.alt = alt;
    }
    
    // Getters y setters para acceder a los atributos
    public int getAlfa() {
        return alfa;
    }

    public int getGama() {
        return gama;
    }

    public int getBeta() {
        return beta;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getBase() {
        return base;
    }

    public float getAlt() {
        return alt;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public void setGama(int gama) {
        this.gama = gama;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }
    /**
     * Calcula y devuelve el perímetro del cuadrilátero.
     *
     * @return El perímetro del cuadrilátero.
     */
    @Override
    public int perimetro() {
        return (int)(2*a+2*b); 
    }
    /**
     * Sobrescribe el método toString de la clase Poligono para proporcionar una representación en cadena de la instancia de Cuadrilatero.
     *
     * @return Una cadena que representa la instancia de Cuadrilatero.
     */
    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{" + "alfa=" + alfa + ", gama=" + gama + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", alt=" + alt + '}';
    }
    /**
     * Calcula y devuelve el área del cuadrilátero.
     *
     * @return El área del cuadrilátero.
     */
    @Override
    public int area() {
        return (int)(alt*base); 
    }
    
}
