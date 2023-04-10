/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2.poo.guia.extra;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJ2POOGUIAEXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x1,x2,y1,y2;
        
        Scanner leer= new Scanner(System.in);
                
        System.out.println("Ingrese primer coordenadas de puntos (x1,y1):");
        x1=leer.nextInt();
        y1=leer.nextInt();
        
        System.out.println("Ingrese segunda coordenadas de puntos (x1,y1):");
        x2=leer.nextInt();
        y2=leer.nextInt();
        
        
        
        
        Puntos Puntitos= new Puntos(x1,x2,y1,y2);
        
        Puntitos.Calcularpuntos();
        
        
        
    }
    
}
