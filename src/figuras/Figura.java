/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
// Clase Figura
package figuras; 

public abstract class Figura {
    protected String nombre;
    protected int alto;
    protected int ancho;
    
    /* Atributo estático que indica la cantidad
     * de figuras creadas.
     */
    public static int cantidadDeFigurasCreadas;

    public int getAlto() {
        return alto;
    }

    public void setAlto(int a) {
        alto = a;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int a) {
        ancho = a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }
    
    /**
     * Método abstracto responsable del cálculo del área de una figura. 
      * Cada subclase es responsable de definir su propia implementación
     * de acuerdo al tipo de figura.
     */
    public abstract float calcularArea();

    public String toString() {
        String s = "Nombre: " + nombre + 
                   "\n" + 
                   "Alto: " + alto + 
                   "\n" + 
                   "Ancho: " + ancho;
        return s;
    }

} 
