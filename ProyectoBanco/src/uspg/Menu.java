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

    public int Otto = 500;
    public int Mario = 1000;
    public int Noemi = 1500;

     

    public void saldo() {
        int opcion1 = 0;

        if (opcion1 == 1) {
            
            Menu user1 = new Saldo();
            
        }  else if (opcion1 == 2) {
                Menu user2 = new Saldo();
                
            } else if (opcion1 == 3) {
                
                Menu user3 = new Saldo();
                
            }
    }


    public int getOtto() {
        return Otto;
    }

    public void setOtto(int Otto) {
        this.Otto = Otto;
    }

    public int getMario() {
        return Mario;
    }

    public void setMario(int Mario) {
        this.Mario = Mario;
    }

    public int getNoemi() {
        return Noemi;
    }

    public void setNoemi(int Noemi) {
        this.Noemi = Noemi;
    }

    Scanner scn = new Scanner(System.in);
    protected double depositos;

    public void Depositos() {
        depositos = scn.nextDouble();
    }

}
