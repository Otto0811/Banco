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
public class Retiros_Otto extends Menu {
    
    @Override
    public void Transaccion1() {
        
        System.out.print("Monto a retirar: ");
        Retiros1();
        
        if (retiros1 <= getSaldo1()) {
            
            setSaldo1(getSaldo1() - retiros1);

            System.out.println("------------------------------");
            System.out.println("Usted retiro:" + retiros1);
            System.out.println("Tu saldo actual es:" + getSaldo1());
            System.out.println("------------------------------");

        } else {

            System.out.println("------------------");
            System.out.println("Saldo Infuficiente");
            System.out.println("------------------");
        }
    }
    
    @Override
    public void Transaccion2() {
        
        System.out.print("Monto a retirar: ");
        Retiros2();
        
        if (retiros2 <= getSaldo2()) {

            setSaldo2(getSaldo2() - retiros2);

            System.out.println("------------------------------");
            System.out.println("Usted retiro:" + retiros2);
            System.out.println("Tu saldo actual es:" + getSaldo2());
            System.out.println("------------------------------");

        } else {

            System.out.println("------------------");
            System.out.println("Saldo Infuficiente");
            System.out.println("------------------");
        }
    }
    
    @Override
    public void Transaccion3() {
        
        System.out.print("Monto a retirar: ");
        Retiros3();
        
        if (retiros3 <= getSaldo3()) {

            setSaldo3(getSaldo3() - retiros3);

            System.out.println("------------------------------");
            System.out.println("Usted retiro:" + retiros3);
            System.out.println("Tu saldo actual es:" + getSaldo3());
            System.out.println("------------------------------");

        } else {

            System.out.println("------------------");
            System.out.println("Saldo Infuficiente");
            System.out.println("------------------");
        }
    }

}
