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

    public int Usuario1 = 500;
    public int Usuario2 = 1000;
    public int Usuario3 = 1500;
    
    public abstract void Usuario1();
    public abstract void Usuario2();
    public abstract void Usuario3();

    public void saldo() {
        int opcion1 = 0;
        
        System.out.println("opcción");
        opcion1 = scn.nextInt();

        if (opcion1 == 1) {
            
            Menu user1 = new Saldo();
            user1.Usuario1();
            
        }  else if (opcion1 == 2) {
            
                Menu user2 = new Saldo();
                user2.Usuario2();
                
            } else if (opcion1 == 3) {
                
                Menu user3 = new Saldo();
                user3.Usuario3();
                
            }
    }

    public int getUsuario1() {
        return Usuario1;
    }

    public void setUsuario1(int Usuario1) {
        this.Usuario1 = Usuario1;
    }

    public int getUsuario2() {
        return Usuario2;
    }

    public void setUsuario2(int Usuario2) {
        this.Usuario2 = Usuario2;
    }

    public int getUsuario3() {
        return Usuario3;
    }

    public void setUsuario3(int Usuario3) {
        this.Usuario3 = Usuario3;
    }

    
    protected double depositos;

    public void Depositos() {
        depositos = scn.nextDouble();
    }

}
