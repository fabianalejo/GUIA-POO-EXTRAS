/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6.poo.guia.extra;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJ6POOGUIAEXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int largo, ancho;
        
        
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese largo del rectangulo");
        largo=leer.nextInt();
        
        System.out.println("Ingrese ancho del rectangulo");
        ancho=leer.nextInt();
        
        Rectangulo calculo_por_teclado=new Rectangulo(largo, ancho);
        
        calculo_por_teclado.calcular_Area();
        
        
        Rectangulo rectangulo1= new Rectangulo(4,6);
        
        System.out.println("");
        
        System.out.println("Calculo del area del rectangulo por valores constantes");
        System.out.println(""); 
        rectangulo1.calcular_Area();
        System.out.println("");
    }
    
}
