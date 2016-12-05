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
public  class Figura {
// public abstract class Figura {  // el uso de abstract la convienrte en una clase abstracta que no puede ser derivada 
    // Voy definiendo los atributos de la clase escribiendo como  tipo_de_dato identificadorAtributo1;
    String nombre;
    int alto;
    int ancho;
    final int constante = 10; //Definicion de una Constante
    static int cantidadDeFiguras; //Atributo Estático, existe una única copia sin depender de ninguna instancia 
    //Figura.cantidadDeFiguras = Figura.cantidadDeFiguras++;
    
  /* la declaración de un método en Java sigue la siguiente estructura: 
   *                 tipo_de_dato_devuelto identificadorMetodo(parametros) 
   *                {
   *                 cuerpo_del_método;
   *                 }   
*/
    int getAlto() {     //Son métodos "getters", para devolver algún tipo de valor de un atributo
        return alto;
    }
     int getAncho() {
        return ancho;
    }
      String getNombre() {
        return nombre;
    }
      
      
      
      /* En caso de querer definir un conjunto de mpetidos que permitan modificar los valores de los atributos de una clase,
      vamos a suar el método de los "setters"
      */
      void setAlto (int a){
          alto = a;
      }
      void setAncho (int a) {
          ancho = a;
      }
      void setNombre (String n){
          nombre = n;
      }
      
    /*
     * Aqui redefino el método del toString para la clase figura y que voy a usar en 
      la clase principal
    */
        
       public String toString() { 
                String s = "Nombre: " + nombre +  "\n" + 
                "Alto: " + alto + 
                "\n" + 
                "Ancho: " + ancho;
                return s;
       }
}

