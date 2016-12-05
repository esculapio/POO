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
public class Ejemplo {
    public static void main (String [] args) {

        Figura.metodoEstatico();        //Aqui llamo al métodp estático declarado en la cclase Figura
            System.out.println("\n");   // Hago un salto de linea para hacer espacio
        
    /* Definimos un objeto de tipo Rectangulo cuya variable
     * de referencia tendrá el nombre "rectangulo".
     * Para su inicialización invocamos al constructor
     * por parámetros de la clase Rectangulo.
     */
   
    Rectangulo rectangulo = 
            new Rectangulo("Rectángulo", 5,10, false);
        
    /* Mostramos en pantalla los valores
     * de los atributos del objeto "rectangulo".
     */
    System.out.println("Atributos del objeto rectangulo");
    System.out.println("Nombre figura: " + rectangulo.getNombre());
    System.out.println("Alto: " + rectangulo.getAlto());
    System.out.println("Ancho: " + rectangulo.getAncho());
    System.out.println("¿Es cuadrado?: " +     rectangulo.isCuadrado());
        
    System.out.println("\n");
        
    /* Definimos un objeto de tipo Triangulo cuya variable
     * de referencia tendrá el nombre "triangulo".
     * Para su inicialización invocamos al constructor
     * por defecto de la clase Triangulo.
     */
    Triangulo triangulo = 
            new Triangulo();
        
    /* Mostramos en pantalla los valores
     * por defecto de los atributos del
     * objeto "triangulo".
     */
    System.out.println("Valores por defecto del objeto triangulo");
    System.out.println("Nombre figura: " + triangulo.getNombre());
    System.out.println("Alto: " + triangulo.getAlto());
    System.out.println("Ancho: " + triangulo.getAncho());
    System.out.println("Tipo de triángulo: " + triangulo.getTipoTriangulo());
    
    /* Modificamos los valores de los 
     * atributos del objeto "triangulo".
     */
    triangulo.setNombre("Triángulo");
    triangulo.setAlto(4);
    triangulo.setAncho(6);
    triangulo.setTipoTriangulo("Isósceles");
      
    System.out.println("\n");
        
    /* Mostramos en pantalla los valores
     * de los atributos del objeto "triangulo".
     */
    System.out.println("Valores posteriores del objeto triangulo");
    System.out.println("Nombre figura: " + triangulo.getNombre());
    System.out.println("Alto: " + triangulo.getAlto());
    System.out.println("Ancho: " + triangulo.getAncho());
    System.out.println("Tipo de triángulo: " + triangulo.getTipoTriangulo());

    }
   
    
}
