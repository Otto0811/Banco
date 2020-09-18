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

    protected int transaccion1, transaccion2, transaccion3;

    protected int deposito1, deposito2, deposito3;

    protected int retiros1, retiros2, retiros3;

    private static int Saldo1, Saldo2, Saldo3;

    private static String usuario1, usuario2, usuario3;

    private static int noCuenta1, noCuenta2, noCuenta3;

//------------------------------------------------------------------------------
    public void Operaciones() {

        int opcion1 = 0;
        int opcion2 = 0;

        do {
//------------------------------------------------------------------------------
            System.out.print("Número de usuario: ");
            opcion1 = scn.nextInt();

//------------------------------------------------------------------------------
            if (opcion1 == 1) {
//------------------------------------------------------------------------------            
                System.out.print("Usuario: ");
                usuario1 = scn.next();

                System.out.print("Número de cuenta: ");
                noCuenta1 = scn.nextInt();
//------------------------------------------------------------------------------            
                do {

                    //Bucle menú 
                    System.out.println("-----Por favor seleccione una opción-----");
                    System.out.println("    1.Deposito de efectivo");
                    System.out.println("    2.Retiro de dinero");
                    System.out.println("    3.Saldo en la cuenta");
                    System.out.println("    4.Clientes");
                    System.out.println("    5.Salir del Usuario");

                    System.out.println("-----------------------------------------");

                    System.out.print("-Opción: ");
                    opcion2 = scn.nextInt();
//------------------------------------------------------------------------------
                    if (opcion2 == 1) {

                        System.out.println("   ---Deposito--- ");

                        Menu deposito = new Depositos();
                        deposito.Transaccion1();
//------------------------------------------------------------------------------
                    } else if (opcion2 == 2) {
                        System.out.println("   ---Retiros--- ");

                        Menu retiros = new Retiros_Otto();
                        retiros.Transaccion1();
                        //------------------------------------------------------------------------------                   
                    } else if (opcion2 == 3) {
                        System.out.println("   ---Saldo--- ");

                        Menu saldo = new Saldo();
                        saldo.Transaccion1();
//------------------------------------------------------------------------------
                    } else if (opcion2 == 4) {
                        System.out.println("   ---Clientes--- ");

                        Clientes();
                        //------------------------------------------------------------------------------                   
                    } else if (opcion2 == 5) {
                        System.out.println("---------------------");
                        System.out.println("Ha salido del Usuario :" + usuario1);
                        System.out.println("---------------------");
                        break;
//------------------------------------------------------------------------------                  
                    }
//------------------------------------------------------------------------------                
                } while (opcion2 != 5);
//------------------------------------------------------------------------------
            } else if (opcion1 == 2) {

                System.out.print("Usuario: ");
                usuario2 = scn.next();

                System.out.print("Número de cuenta: ");
                noCuenta3 = scn.nextInt();

                do {

                    //Bucle menú 
                    System.out.println("-----Por favor seleccione una opción-----");
                    System.out.println("    1.Deposito de efectivo");
                    System.out.println("    2.Retiro de dinero");
                    System.out.println("    3.Saldo en la cuenta");
                    System.out.println("    4.Clientes");
                    System.out.println("    5.Salir del Usuario");

                    System.out.println("-----------------------------------------");

                    System.out.print("-Opción: ");
                    opcion2 = scn.nextInt();
//------------------------------------------------------------------------------
                    if (opcion2 == 1) {

                        System.out.println("   ---Deposito--- ");

                        Menu deposito = new Depositos();
                        deposito.Transaccion1();
//------------------------------------------------------------------------------
                    } else if (opcion2 == 2) {
                        System.out.println("   ---Retiros--- ");

                        Menu retiros = new Retiros_Otto();
                        retiros.Transaccion2();
//------------------------------------------------------------------------------                    
                    } else if (opcion2 == 3) {
                        System.out.println("   ---Saldo--- ");

                        Menu saldo = new Saldo();
                        saldo.Transaccion1();
//------------------------------------------------------------------------------
                    } else if (opcion2 == 4) {
                        System.out.println("   ---Clientes--- ");

                        Clientes();
//------------------------------------------------------------------------------                    
                    } else if (opcion2 == 5) {
                        System.out.println("---------------------");
                        System.out.println("Ha salido del Usuario :" + usuario2);
                        System.out.println("---------------------");
                        break;
//------------------------------------------------------------------------------                  
                    }
//------------------------------------------------------------------------------                
                } while (opcion2 != 5);

//------------------------------------------------------------------------------            
            } else if (opcion1 == 3) {

                System.out.print("Usuario: ");
                usuario3 = scn.next();

                System.out.print("Número de cuenta: ");
                noCuenta3 = scn.nextInt();

                do {

                    //Bucle menú 
                    System.out.println("-----Por favor seleccione una opción-----");
                    System.out.println("    1.Deposito de efectivo");
                    System.out.println("    2.Retiro de dinero");
                    System.out.println("    3.Saldo en la cuenta");
                    System.out.println("    4.Clientes");
                    System.out.println("    5.Salir del Usuario");
                    System.out.println("    6.Salir ");

                    System.out.println("-----------------------------------------");

                    System.out.print("-Opción: ");
                    opcion2 = scn.nextInt();
//------------------------------------------------------------------------------
                    if (opcion2 == 1) {

                        System.out.println("   ---Deposito--- ");

                        Menu deposito = new Depositos();
                        deposito.Transaccion1();
//------------------------------------------------------------------------------
                    } else if (opcion2 == 2) {
                        System.out.println("   ---Retiros--- ");

                        Menu retiros = new Retiros_Otto();
                        retiros.Transaccion3();
//------------------------------------------------------------------------------                    
                    } else if (opcion2 == 3) {
                        System.out.println("   ---Saldo--- ");

                        Menu saldo = new Saldo();
                        saldo.Transaccion1();
//------------------------------------------------------------------------------
                    } else if (opcion2 == 4) {
                        System.out.println("   ---Clientes--- ");

                        Clientes();
//------------------------------------------------------------------------------                   
                    } else if (opcion2 == 5) {
                        System.out.println("---------------------");
                        System.out.println("Ha salido de :" + usuario3);
                        System.out.println("---------------------");
                        break;
//------------------------------------------------------------------------------                  
                    } else if (opcion2 == 6) {
                        System.out.println("---------------------");
                        System.out.println("Hasta luego");
                        System.out.println("---------------------");
                        break;

                    }
//------------------------------------------------------------------------------                
                } while (opcion2 != 5);
//------------------------------------------------------------------------------
            }
//------------------------------------------------------------------------------        
        } while (opcion2 != 6);
//------------------------------------------------------------------------------        
    }

//------------------------------------------------------------------------------ 
    //Metodo Retiro
    public void Retiros1() {
        retiros1 = scn.nextInt();
    }

    public void Retiros2() {
        retiros2 = scn.nextInt();
    }

    public void Retiros3() {
        retiros3 = scn.nextInt();
    }
//------------------------------------------------------------------------------
    //Metodo Deposito

    public void Deposito1() {
        deposito1 = scn.nextInt();
    }

    public void Deposito2() {
        deposito2 = scn.nextInt();
    }

    public void Deposito3() {
        deposito3 = scn.nextInt();
    }
//------------------------------------------------------------------------------
    //Transacciones

    public abstract void Transaccion1();

    public abstract void Transaccion2();

    public abstract void Transaccion3();
//------------------------------------------------------------------------------
    //Clientes

    public void Clientes() {
        System.out.println("Usuario: " + usuario1 + " / Número de cuenta: " + noCuenta1 + " / Saldo: " + getSaldo1());

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        System.out.println("Usuario: " + usuario2 + " / Número de cuenta: " + noCuenta2 + " / Saldo: " + getSaldo2());

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        System.out.println("Usuario: " + usuario3 + " / Número de cuenta: " + noCuenta3 + " / Saldo: " + getSaldo3());
    }
//------------------------------------------------------------------------------
    //getters and setters Saldos

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
//------------------------------------------------------------------------------

    public int getRetiros1() {
        return retiros1;
    }

    public void setRetiros1(int retiros1) {
        this.retiros1 = retiros1;
    }

    public int getRetiros2() {
        return retiros2;
    }

    public void setRetiros2(int retiros2) {
        this.retiros2 = retiros2;
    }

    public int getRetiros3() {
        return retiros3;
    }

    public void setRetiros3(int retiros3) {
        this.retiros3 = retiros3;
    }

}
