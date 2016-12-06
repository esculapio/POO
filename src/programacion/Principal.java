/*
 * Código que emplea el metodo toString() que devuelve una cadena de caraceteres .
 * que sea una representación significativa del objeto. Retorna un String formado por 
 * el nombre completo de la clase, seguido del símbolo @ y una representación en hexadecimal del
 * código hash del objeto
/**
 *
 * @author Gustavo
 */
package programacion;  // indica la pertenencia a un paquete (agrupacion de clases
                      // o interfaces que tienen alguna relación 

public class Principal {
    public static void main (String [] args){
        Figura figura = new Figura (); //Aqui deberia Error COmpilacion si la clase padre es Abstracta
        figura.setNombre("Figura Ejemplo");
        figura.setAlto(2);
        figura.setAncho(4);
        
        System.out.println (figura.toString());
        /* para que no a aparezaca la @ con el hash hay que tener redefinido en la
        * clase Figura el método toString ()
        */
    }
       
} 
