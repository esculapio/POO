/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Gustavo
 */
// Clase CalculoArea que contiene el método main()

import figuras.Figura;
import figuras.Rectangulo;
import figuras.Triangulo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculoArea {

    private static final String RECTANGULO =
        "Rectángulo";
    private static final String TRIANGULO =
        "Triángulo";

    public static void main(String[] args) throws
IOException {
        System.out.println("Módulo 3 - Cálculo de Área");
        
        char opcionFigura;
        do
        {
            System.out.println("\nSeleccione la figura con la que desea trabajar");
            System.out.println("A. Rectángulo");
            System.out.println("B. Triángulo"); 
System.out.println("C. Salir");
            System.out.println("Seleccione una opción (A, B, C): ");
            opcionFigura = (char) System.in.read();
            System.out.println("\nOpción seleccionada: " + opcionFigura);
            System.in.read(); // Se elimina del buffer de entrada el caracter <Enter>
            
            String figuraSeleccionada = null;
            
            switch (opcionFigura)
            {
                case 'A':
                    figuraSeleccionada = RECTANGULO;
                    break;
                case 'B':
                    figuraSeleccionada = TRIANGULO;
                    break;
                case 'C':
                    System.out.println("Saliendo de la aplicación");
                    break;
                default:
                    System.out.println("Opción ingresada incorrecta.");
            }
            
            if (figuraSeleccionada != null) {
                // Ingreso de datos sobre la figura
                System.out.println("Usted decidió calcular el área de un: " + figuraSeleccionada);
                float areaFigura = 0;

                System.out.println("Ingrese los datos solicitados");
                BufferedReader br = new
                    BufferedReader(new InputStreamReader(System.in));

                System.out.println("Ingrese el nombre de la figura: ");
                String nombreFigura = br.readLine();

                System.out.println("Ingrese el alto de la figura: ");
                int alto = Integer.parseInt(br.readLine());

                System.out.println("Ingrese el ancho de la figura: ");
                int ancho = Integer.parseInt(br.readLine());

                if
                    (figuraSeleccionada.equals(RECTANGULO)) { 
                               // Datos específicos para un rectángulo
                    boolean esCuadrado = false;
                    if (alto == ancho) {
                        esCuadrado = true;
                    }

                    // Se crea un objeto de tipo Rectangulo
                    Rectangulo rectangulo = new
                    Rectangulo(nombreFigura, alto, ancho, esCuadrado);
                    areaFigura = rectangulo.calcularArea();

                    System.out.println("\nLa figura tiene las siguientes características:\n" + rectangulo.toString());
                } 
                else if
                        (figuraSeleccionada.equals(TRIANGULO)) {
                    // Datos específicos para un triángulo
                    System.out.println("Ingrese con un número el tipo de triángulo (1.Equilátero, 2.Isósceles, 3.Escaleno): ");
                    String opcionIngresadaTipoTriangulo = br.readLine();
                    String tipoTriangulo = null;
                    
                if
                    (opcionIngresadaTipoTriangulo.equals("1")) {
                        tipoTriangulo = Triangulo.TIPO_TRIANGULO_EQUILATERO;
                    } 
                
                else if
                    (opcionIngresadaTipoTriangulo.equals("2")) {
                        tipoTriangulo = Triangulo.TIPO_TRIANGULO_ISOSCELES;
                    } 
                
                else if
                    (opcionIngresadaTipoTriangulo.equals("3")) {
                        tipoTriangulo = Triangulo.TIPO_TRIANGULO_ESCALENO;
                    } 
                
                else {
                        System.out.println("Tipo de triángulo ingresado incorrecto.");
                    }
                    
                    // Se crea un objeto de tipo Triangulo
                    Triangulo triangulo = new
                    Triangulo(nombreFigura, alto, ancho, tipoTriangulo);
                    areaFigura = triangulo.calcularArea();

                    System.out.println("\nLa figura tiene las siguientes características:\n" + triangulo.toString());
                }
                System.out.println("El área de la figura es: " + areaFigura);
                System.out.println("La cantidad de figuras creadas es: " + Figura.cantidadDeFigurasCreadas);
            }
        }
        while (opcionFigura != 'C');
     }
    
}