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
    Scanner scn = new Scanner (System.in);
    protected double depositos;
    
    public void Depositos (){
         depositos = scn.nextDouble();
    }
    
}
