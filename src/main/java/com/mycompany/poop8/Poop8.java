/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.java.com.mycompany.poop8;

/**
 *
 * @author 
 */
public class Poop8 {

    public static void main(String[] args) {
       //Poligono poligono = new Poligono(); no s epuede como es una clase abstracta
       Poligono poligono;
       Triangulo triangulo = new Triangulo();
       triangulo.setBase(2);
       triangulo.setAlt(5);
       
       Cuadrilatero cuadrilatero = new Cuadrilatero();
       cuadrilatero.setAlt(5);
       cuadrilatero.setBase(20);
       //System.out.println(poligono);
       
       System.out.println(triangulo);
       System.out.println(cuadrilatero);
       
       System.out.println(cuadrilatero.area());
       System.out.println(triangulo.area());
       
       poligono = new Triangulo();
        System.out.println(poligono);
        
        getPoligono(poligono);
        poligono = new Cuadrilatero();
        getPoligono(poligono);
        
        Flauta flauta = new Flauta();
        System.out.println(flauta.tipoInstrument());
        
        System.out.println(Meses.NOMBRES_MESES[Meses.UNO]); 
        
    }

    private static void getPoligono(Poligono poligono) {
        if(poligono instanceof Triangulo){
            System.out.println("Es Triangulo");
        }
        if(poligono instanceof Cuadrilatero){
            System.out.println("Es Cuadrilatero");
        }
        if(poligono instanceof Poligono){
            System.out.println("Es Poligono");
        }
    }
}
