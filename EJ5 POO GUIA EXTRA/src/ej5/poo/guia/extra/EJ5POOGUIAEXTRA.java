/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5.poo.guia.extra;

import Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJ5POOGUIAEXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salario_base;
        String nombre, resp;
        int edad;
        
        
        Scanner leer= new Scanner (System.in).useDelimiter("\n");
        
        do{
        
        System.out.println("Ingrese nombre del empleado");
        nombre= leer.next();
            
        
        System.out.println("Ingrese edad del Empleado " + nombre);
        edad= leer.nextInt();
        
        System.out.println("Ingrese salario base que paga la empresa");
        salario_base=leer.nextDouble();
        
        Empleado empleadito= new Empleado(nombre,edad, salario_base );
        
        empleadito.calcular_salario();
        
        System.out.println("Desea repetir la operacion?");
        resp=leer.next();
                
    } while("SI".equals(resp)|| "si".equals(resp));
    }
    
}
