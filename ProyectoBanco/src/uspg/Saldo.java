/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg;

/**
 *
 * @author Bryan Sandoval
 */
public class Saldo extends Menu {


    
        
        public void Usuario1 (){
            System.out.println("---------------------------");
            System.out.println("El saldo del Usuario 1 actualmente es de: Q" + getSaldo1() +".00"  );
            System.out.println("---------------------------");
        }
    
        
        public void Usuario2 (){
            System.out.println("---------------------------");
            System.out.println("El saldo del Usuario 2 actualmente es de: Q" + getSaldo2 () + ".00" );
            System.out.println("---------------------------");
        
        }
    
        
        public void Usuario3 (){
            System.out.println("---------------------------");
            System.out.println("El saldo del Usuario 3 actualmente es de: Q" + getSaldo3 () + ".00" );
            System.out.println("---------------------------");
        }

        
    
    //Mensaje de Saldo 1
    @Override
    public void Transaccion1() {

        System.out.println("---------------------------");
        System.out.println("El saldo del usuario 1 actualmente es de: Q" + getSaldo1());
        System.out.println("---------------------------");

    }
//------------------------------------------------------------------------------
    @Override
    public void Transaccion2() {
        System.out.println("---------------------------");
        System.out.println("El saldo del usuario 2 actualmente es de: Q" + getSaldo2());
        System.out.println("---------------------------");
    }
//------------------------------------------------------------------------------
    @Override
    public void Transaccion3() {
        System.out.println("---------------------------");
        System.out.println("El saldo del usuario 3 actualmente es de: Q" + getSaldo3());
        System.out.println("---------------------------");
    }


    
}
