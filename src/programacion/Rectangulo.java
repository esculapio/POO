/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

/**
 *
 * @author Gustavo
 */
public class Rectangulo  extends Figura{ // la palabra reservavada extend exteiende o hereda los atributos definidos de la superclase (en este caso Figuras)
    boolean cuadrado; // Se usa variable booleana para indicar si el triangulo es un cuadrado o no
    boolean isCuadrado(){
        return cuadrado;
    }
    
    void setCuadrad (boolean b){
        cuadrado = b;
    }
    
    float calcularArea () {        // aqui defino el comportamiento del método abstracto declarado en Figura.java
        float area = (float) (alto * ancho) /2;
        return area;
    }
    
  /* a continuación definimos los constructores por parámetros y por defecto de la clase Rectángulo
  */
    
    Rectangulo (String nom, int alt, int anc, boolean cuad) {
        nombre = nom;
        alto = alt;
        ancho = anc;
        cuadrado = cuad;
    }
    
    Rectangulo () {
    }
    
}
 