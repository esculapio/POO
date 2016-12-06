/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Gustavo
 */
public class Rectangulo extends Figura {
    private boolean cuadrado; // variable booleana que indica si el triángulo es un cuadrado o no.

    public Rectangulo() {
        Figura.cantidadDeFigurasCreadas++;
    }

    public Rectangulo(String nom, int alt, int anc,
boolean cuad) {
        nombre = nom;
        alto = alt;
        ancho = anc;
        cuadrado = cuad;
        Figura.cantidadDeFigurasCreadas++;
    }

    public boolean isCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(boolean b) {
        cuadrado = b;
    }

    /*
     * Implementación del método abstracto heredado de la clase Figura
     */
    public float calcularArea() {
        float area = alto * ancho;
        return area;
    } 
    
    public String toString() {
        String s = "Nombre: " + nombre + 
                   "\n" + 
                   "Alto: " + alto + 
                   "\n" + 
                   "Ancho: " + ancho +
                   "\n" + 
                   "¿Es cuadrado?: " + cuadrado;
        return s;
    }
  }

