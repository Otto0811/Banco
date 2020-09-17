/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg;

/**
 *
 * @author marit
 */
public class Depositos extends Menu {


    @Override
    public void Transaccion1() {
        System.out.println("********************");
       System.out.println("Ingresar el monto de deposito");
       
       Depositos();
       transacciones=getSaldo1();
        
       setSaldo1(transacciones+deposito1);
       
        System.out.println("*******************");
        System.out.println("Se deposito a su cuenta: Q"+depositos);
        System.out.println("*******************");
        System.out.println("Su actual saldo es de: Q"+getSaldo1());
        System.out.println("*******************");
    }

    @Override
    public void Transaccion2() {
       System.out.println("********************");
       System.out.println("Ingresar el monto de deposito");
       
       Depositos();
       transacciones=getSaldo2();
        
       setSaldo2(transacciones+deposito2);
       
        System.out.println("*******************");
        System.out.println("Se deposito a su cuenta: Q"+depositos);
        System.out.println("*******************");
        System.out.println("Su actual saldo es de: Q"+getSaldo2());
        System.out.println("*******************");
    }

    @Override
    public void Transaccion3() {
        System.out.println("********************");
       System.out.println("Ingresar el monto de deposito");
       
       Depositos();
       transacciones=getSaldo3();
        
       setSaldo3(transacciones+deposito1);
       
        System.out.println("*******************");
        System.out.println("Se deposito a su cuenta: Q"+depositos);
        System.out.println("*******************");
        System.out.println("Su actual saldo es de: Q"+getSaldo3());
        System.out.println("*******************");
    }
        
    }

