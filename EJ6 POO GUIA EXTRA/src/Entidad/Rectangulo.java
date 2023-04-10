/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Rectangulo {
    private int lado1, lado2;
    
    public Rectangulo(int lado1, int lado2)
    {
        this.lado1=lado1;
        this.lado2=lado2;
    }
    
    public void calcular_Area()
    {
        int area=0;
        
        area=this.lado1*this.lado2;
        
        System.out.println("El area del rectangulo es de " +area);
        
    
    }    
}
