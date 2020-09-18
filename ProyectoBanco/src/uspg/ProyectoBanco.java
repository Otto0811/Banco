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
         /*
        Depositos depositos = new Depositos();
        depositos.transaccion();
        */
        Menu menu = new Saldo();
        menu.setSaldo1(500);
        menu.setSaldo2(2000);
        menu.setSaldo3(10000);
        


        Saldo sd = new Saldo();
        System.out.println("-----------------------------------");
        sd.Usuario1();
        System.out.println("-----------------------------------");
        sd.Usuario2();
        System.out.println("-----------------------------------");
        sd.Usuario3();
        System.out.println("-----------------------------------");


        menu.Operaciones();

        

    }
    
    
}

