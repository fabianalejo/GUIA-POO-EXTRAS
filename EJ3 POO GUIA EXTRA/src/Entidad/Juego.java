/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Juego {
    
    Scanner leer= new Scanner(System.in);
    
    public Juego()
    {
    }
    public void iniciar_juego()
    {
        int num1, num2;
        int intentos, aciertos, erroneos;
        
        intentos=aciertos=erroneos=0;
        
        
        
        System.out.println("Jugador uno ingresa numero a ser adivinado");
        num1=leer.nextInt();
        
        
        
        System.out.println("La cantidad de intentos sera de 4 oportunidades");
        
        while(intentos<=3)
        {
        System.out.println("Jugador dos ingresa numero adivinar");
        num2= leer.nextInt();
                    
            if(num1==num2)
            {
                System.out.println("Jugador numero 2 ha acertado el numero");
                ++intentos;
                break;
            }
            else{
                   if(num1<num2)
                   {
                       System.out.println("Baja un poquito el numero que elegiste");
                       ++erroneos;
                       ++intentos;
                       System.out.println(" ");
                   }
                   else
                   { System.out.println("Subi un poquito el numero que elegiste");
                       ++erroneos;
                       ++intentos;
                       System.out.println(" ");
                   }
            }
        }
        
        if (erroneos==4)
            System.out.println("Numeros de intentos alcanzado sin aciertos");
        
        else
            System.out.println("La cantidad de intentos que se tomo el jugador 2 para acertar fue de " + intentos);
    }
    
    
    
}
