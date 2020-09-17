/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg;

import java.util.Scanner;

/**
 *
 * @author marit
 */
public abstract class Menu {
    Scanner scn = new Scanner(System.in);

    public int Saldo1 = 500;
    public int Saldo2 = 1000;
    public int Saldo3 = 1500;
    
    protected int transacciones, deposito1, deposito2, deposito3;
    
    public abstract void Transaccion1();
    public abstract void Transaccion2();
    public abstract void Transaccion3();

    public void saldo() {
        int opcion1 = 0;
        
        System.out.println("opcción");
        opcion1 = scn.nextInt();

        if (opcion1 == 1) {
            
            Menu user1 = new Saldo();
            user1.Transaccion1();
            
        }  else if (opcion1 == 2) {
            
                Menu user2 = new Saldo();
                user2.Transaccion2();
                
            } else if (opcion1 == 3) {
                
                Menu user3 = new Saldo();
                user3.Transaccion3();
                
            }
        
    }

    public int getSaldo1() {
        return Saldo1;
    }

    public void setSaldo1(int Saldo1) {
        this.Saldo1 = Saldo1;
    }

    public int getSaldo2() {
        return Saldo2;
    }

    public void setSaldo2(int Saldo2) {
        this.Saldo2 = Saldo2;
    }

    public int getSaldo3() {
        return Saldo3;
    }

    public void setSaldo3(int Saldo3) {
        this.Saldo3 = Saldo3;
    }

    
    
    protected double depositos;

    public void Depositos() {
        depositos = scn.nextDouble();
    }

}
