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
public class Triangulo extends Figura {
    /* Esta variable es utilizada para indicar
     * si el triángulo es equilátero,
     * isósceles o escaleno.
     */
    private String tipoTriangulo;
    
    // Constantes estáticas utilizadas para indicar el tipo de triángulo
    public static final String
TIPO_TRIANGULO_EQUILATERO = "Equilátero";
    public static final String TIPO_TRIANGULO_ISOSCELES
        = "Isósceles";
    public static final String TIPO_TRIANGULO_ESCALENO
        = "Escaleno";

    public Triangulo() {
        Figura.cantidadDeFigurasCreadas++;
    }

    public Triangulo(String nom, int alt, int anc, String tipo) {
        nombre = nom;
        alto = alt;
        ancho = anc;
        tipoTriangulo = tipo;
        Figura.cantidadDeFigurasCreadas++;
    }

    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

    public void setTipoTriangulo(String tipo) {
        tipoTriangulo = tipo;
    } 
/*
 * Implementación del método abstracto heredado de la clase Figura
*/
    public float calcularArea() {
        float area = (float)(alto * ancho) / 2;
        return area;
    }
    
    public String toString() {
        String s = "Nombre: " + nombre + 
                   "\n" + 
                   "Alto: " + alto + 
                   "\n" + 
                   "Ancho: " + ancho +
                   "\n" + 
                   "Tipo de triángulo: " +
tipoTriangulo;
        return s;
    }

} 