/*
 * Esto es un ejemplo del concepto de Interface, el cual es una clase abstracta que provee
 * solo métodos abstractos y constantes. Por lo general terminan en "able".
 * Las clases NO HEREDAN INTERFACES, solamente las implementan mediante la palabra clave "implements"
 */
package programacion;  // indica la pertenencia a un paquete (agrupacion de clases
                      // o interfaces que tienen alguna relación 

/**
 *
 * @author Gustavo R.
 */
public interface Comparable {
    int compareTo (Object X);
    
}
