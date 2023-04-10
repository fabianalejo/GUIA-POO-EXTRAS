/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4.poo.guia.extra;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJ4POOGUIAEXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float dinero_a_retirar, resto;
        String nombre_del_usuario;
        
        
        Scanner leer= new Scanner(System.in);
        
        Cuenta cuentita= new Cuenta();
        
        do{
        System.out.println("Bienvenido Cesar cuanta tarasca queres sacar??");
        dinero_a_retirar= leer.nextFloat();
        
       resto= cuentita.retirar_dinero(dinero_a_retirar);
        
       
       if(resto<0)
            System.out.println("Ingresar un importe menor"); 
           else
       System.out.println("Te quedaron " + resto + "$ Chau tomatela");
        
        } while(resto<0);
    }
    
}
