/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.poo.guia.extra;

import ENTIDAD.Cancion;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJ1POOGUIAEXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tit, aut;
        
        Scanner leer= new Scanner(System.in) ;
        
        
        
        
        Cancion Can= new Cancion();
        
        System.out.println("Ingrese titulo de la cancion");
        tit= leer.nextLine();
        
        System.out.println("Ingrese autor de la cancion");
        aut=leer.nextLine();
        
        Can.setAutor(aut);
        Can.setTitulo(tit);
        
        
        System.out.println("titulo de la cancion es  " +Can.getTitulo());
        System.out.println("Autor de la cancion es  " +Can.getAutor());
        
    }
    
}
