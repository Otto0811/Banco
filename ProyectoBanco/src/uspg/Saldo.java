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

    
        public void Otto (){
            System.out.println("---------------------------");
            System.out.println("El saldo del Otto actualmente es de: Q" + getOtto() +".00"  );
            System.out.println("---------------------------");
        }
    
        public void Mario (){
            System.out.println("---------------------------");
            System.out.println("El saldo del Mario actualmente es de: Q" + getMario () + ".00" );
            System.out.println("---------------------------");
        
        }
    
        public void Noemi(){
            System.out.println("---------------------------");
            System.out.println("El saldo del Noemi actualmente es de: Q" + getNoemi () + ".00" );
            System.out.println("---------------------------");
        }
    
}
