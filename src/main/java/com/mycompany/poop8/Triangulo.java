/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.poop8;

/**
 *
 * @author 
 */
/**
 * La clase Triangulo es una subclase de Poligono y representa un triángulo en un espacio bidimensional.
 * Almacena información sobre los ángulos y dimensiones del triángulo y proporciona métodos para calcular su área y perímetro.
 */
public class Triangulo extends Poligono{
    private int alfa, beta, gama; //angulos
    private float a, b, c;
    private float base, alt;
    /**
     * Constructor vacío de la clase Triangulo.
     */
    public Triangulo() {
    }
    /**
     * Constructor de la clase Triangulo que permite especificar ángulos y dimensiones del triángulo.
     *
     * @param alfa  Ángulo alfa del triángulo.
     * @param beta  Ángulo beta del triángulo.
     * @param gama  Ángulo gama del triángulo.
     * @param a     Longitud del lado a del triángulo.
     * @param b     Longitud del lado b del triángulo.
     * @param c     Longitud del lado c del triángulo.
     * @param base  Base del triángulo.
     * @param alt   Altura del triángulo.
     */
    public Triangulo(int alfa, int beta, int gama, float a, float b, float c, float base, float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.alt = alt;
    }
     // Getters y setters para acceder a los atributos

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public int getGama() {
        return gama;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
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

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public void setGama(int gama) {
        this.gama = gama;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }
    
    /**
     * Calcula y devuelve el área del triángulo.
     *
     * @return El área del triángulo.
     */
    @Override
    public int area(){
        return (int)(base*alt)/2;
    }
    /**
     * Calcula y devuelve el perímetro del triángulo.
     *
     * @return El perímetro del triángulo.
     */
    public int perimetro(){
        return (int)(a+b+c);
    }
    /**
     * Sobrescribe el método toString de la clase Poligono para proporcionar una representación en cadena de la instancia de Triangulo.
     *
     * @return Una cadena que representa la instancia de Triangulo.
     */
    @Override
    public String toString() {
        return super.toString() + "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", alt=" + alt + '}';
    }
 
}
