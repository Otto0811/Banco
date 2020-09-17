/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg;

/**
 *
 * @author Otto
 */
public class ProyectoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Depositos depositos = new Depositos();
        depositos.transaccion();
        
        Saldo sd = new Saldo();
        sd.Otto();
        System.out.println("-----------------------------------");
        sd.Mario();
        System.out.println("-----------------------------------");
        sd.Noemi();
        System.out.println("-----------------------------------");
        
    }
    
}

