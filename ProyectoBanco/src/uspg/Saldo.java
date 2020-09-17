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
public class Saldo extends Menu {

    public int Saldo;

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    } 

    Saldo() {
       
        System.out.println("------------------------------------");
        System.out.println("Su saldo actual es de: Q"+getSaldo() + depositos );
        System.out.println("------------------------------------");
    }
}
