/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;  // indica la pertenencia a un paquete (agrupacion de clases
                      // o interfaces que tienen alguna relación 

/**
 * @author Gustavo R.
 */
public  abstract class Figura {
// public abstract class Figura {  // el uso de abstract la convienrte en una clase abstracta que no puede ser derivada 
    // Voy definiendo los atributos de la clase escribiendo como  tipo_de_dato identificadorAtributo1; Uso el protected para proteger la defincion
    // y que SOLO sea accesible a las clases del mismo paquete o sublcases de otros paquetes que se encuentren por herencia
    protected String nombre;
    protected int alto;
    protected int ancho;
    final int constante = 10; //Definicion de una Constante
    static int cantidadDeFiguras; //Atributo Estático, existe una única copia sin depender de ninguna instancia 
    //Figura.cantidadDeFiguras = Figura.cantidadDeFiguras++;
    
    abstract float calcularArea(); // Aqui defino un método abstracto que hereda hacia las subclases hijas
    
  /* A continuación se va a definir un constructor para poder incializar los atributos
   * nombre, alto y ancho. EL constructor es un método especial que se define explícita
   * o implicitamente y debe tener el mismo nombre que el de la clase
   */  
    
    Figura(String nom, int alt, int anc) {
        nombre = nom;
        alto = alt;
        ancho = anc;
      } 
    
      Figura (){  // Esto es un constructor por defecto, que no recibe parámetros y su cuerdo poestá vacío.
                 // y permite que se inicien los atributos con valores predeterminados de acuerdo a los tipos de datos
    }
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
                String s = "Nombre: " + nombre + 
                "\n" + 
                "Alto: " + alto + 
                "\n" + 
                "Ancho: " + ancho;
                return s;
       }
       
       /* ahora vamos a crear un métodp de clase o estático, el cual
        * NO depende de una instancia en particular y puede ser usado de manera
        * global,SIN depender de objetos. Las operaciones comunes a todas las instancias
        * suelen marcarse como métodps estáticos
       */
       static void metodoEstatico () {
           System.out.println("Se ejecutó un método estático");
       }
}
 
