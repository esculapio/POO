/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

/**
 *
 * @author Gustavo Ramos
 */
public class Triangulo  extends Figura{
    String tipoTriangulo;
    /* Esta Variable es utilizada para indica si el 
    *triangulo es Equilatero, isóceles o escaleno
    */
        
    String getTipoTriangulo (){
        return tipoTriangulo;
    }
    
    void setTipoTriangulo (String tipo){
        tipoTriangulo = tipo;
    }
    
    
      float calcularArea () {     // aqui defino el comportamiento del método abstracto declarado en Figura.java
        float area = alto * ancho;
        return area;
    }
      
  /* a continuación definimos los constructores por parámetros y por defecto de la clase Rectángulo
  */
    
    Triangulo (String nom, int alt, int anc, String tipo) {
        nombre = nom;
        alto = alt;
        ancho = anc;
        tipoTriangulo = tipo;
    }
    
    Triangulo () {
    }      
}
