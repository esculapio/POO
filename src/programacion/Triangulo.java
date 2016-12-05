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
    
    
}
