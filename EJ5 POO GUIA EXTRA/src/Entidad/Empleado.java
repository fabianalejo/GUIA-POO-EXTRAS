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
public class Empleado {
    private String nombre;
    private double salario;
            private int edad;
    
    public Empleado(String nombre, int edad, double salario)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcular_salario()
    {
        double salario_total;
        
        if(this.edad>30)
            salario_total=this.salario+this.salario*0.1;
        else 
            salario_total=this.salario+this.salario*0.05;
        
        System.out.println("El salario de " +this.nombre + " Con una edad de " +this.edad + " es de " + salario_total + " $");
    }
    
    
}
 