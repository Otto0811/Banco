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


    public void Transaccion1() {
        System.out.println("********************");
       System.out.println("Ingresar el monto de deposito");
       
       //Se ingresan datos a depositos1
       Deposito1();
       
       //Toma los datos de Saldo1
       transaccion1=getSaldo1();
       
       //Actualiza los datos de Saldo1 
       setSaldo1(transaccion1+deposito1);
       
       //Mensaje
        System.out.println("*******************");
        System.out.println("Se deposito a su cuenta: Q"+deposito1);
        System.out.println("*******************");
        System.out.println("Su actual saldo es de: Q"+getSaldo1());
        System.out.println("*******************");
    }
//------------------------------------------------------------------------------
    public void Transaccion2() {
       System.out.println("********************");
       System.out.println("Ingresar el monto de deposito");
       
       Deposito2();
       
       transaccion2=getSaldo2();
        
       setSaldo2(transaccion2+deposito2);
       
        System.out.println("*******************");
        System.out.println("Se deposito a su cuenta: Q"+deposito2);
        System.out.println("*******************");
        System.out.println("Su actual saldo es de: Q"+getSaldo2());
        System.out.println("*******************");
    }
//------------------------------------------------------------------------------
    public void Transaccion3() {
        System.out.println("********************");
       System.out.println("Ingresar el monto de deposito");
       
       Deposito3();
       
       transaccion3=getSaldo3();
        
       setSaldo3(transaccion3+deposito1);
       
        System.out.println("*******************");
        System.out.println("Se deposito a su cuenta: Q"+deposito3);
        System.out.println("*******************");
        System.out.println("Su actual saldo es de: Q"+getSaldo3());
        System.out.println("*******************");
    }
        
    }

