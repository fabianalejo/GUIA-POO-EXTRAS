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
public class Cuenta {
    private float saldo;
    private String titular;
    
    public Cuenta()
    {
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public float retirar_dinero(float retiro)
    {
        float resto;
        this.saldo=100;
        
        resto=this.saldo-retiro;
        
        if (resto<0)
            System.out.println("Saldo insuficiente para realizar operacion");
       
            
     return resto;
    }
}
  
