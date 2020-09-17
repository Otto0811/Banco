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
    
    private static int Saldo;
    
    Scanner scn = new Scanner (System.in);
    protected double depositos;
    
    public void Depositos (){
         depositos = scn.nextDouble();
    }
    
    String[] usuarios = new String[3];
    int[] contSaldo = new int[3];
    int[] noCuenta = new int[3];
   
    
}
