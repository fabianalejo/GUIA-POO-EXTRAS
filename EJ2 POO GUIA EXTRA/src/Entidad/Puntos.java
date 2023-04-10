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
public class Puntos {
    private int x1,x2,y1,y2;
    
    public Puntos( int x11, int x2, int y1, int y2)
    {
        this.x1=x11;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    
    public void Calcularpuntos()
    {
         double distancia;
         
         distancia = Math.sqrt((Math.pow((this.x2 - this.x1), 2)) + (Math.pow((this.y2 - this.y1), 2)));
         System.out.println("La distancia entre los puntos x1:  " +this.x1+ " y1 : " +this.y1+ " y los puntos x2: " + this.x2 + " y2: " + this.y2 + " es : " + distancia);
    }
    
    } 
    

