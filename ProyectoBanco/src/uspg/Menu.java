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

    public void Operaciones() {
        int opcion1 = 0;
        int opcion2 = 0;
        int bandera = 0;

        System.out.println("Opción usuario");
        opcion1 = scn.nextInt();

        if (opcion1 == 1) {

            do {

                //Bucle menú 
                System.out.println("-----Por favor seleccione una opción-----");
                System.out.println("    1.Deposito de efectivo");
                System.out.println("    2.Retiro de dinero");
                System.out.println("    3.Saldo en la cuenta");
                System.out.println("    4.Clientes");
                System.out.println("    5.Salir");

                System.out.println("-----------------------------------------");

                System.out.print("-Opción: ");
                opcion2 = scn.nextInt();

                if (opcion2 == 1) {

                    System.out.println("   ---Deposito--- ");

                    Menu deposito = new Depositos();
                    deposito.Transaccion1();

                } else if (opcion2 == 2) {
                    System.out.println("   ---Retiros--- ");

                    //Menu retiros = new Retiros();
                    //retiros.Transaccion1();
                } else if (opcion2 == 3) {
                    System.out.println("   ---Saldo--- ");

                    Menu saldo = new Saldo();
                    saldo.Transaccion1();

                } else if (opcion2 == 4) {
                    System.out.println("   ---Clientes--- ");

                    //Menu clientes = new Clientes();
                    //Clientes.Transaccion1();
                } else if (opcion2 == 5) {
                    System.out.println("---------------------");
                    System.out.println("Gracias vuelva pronto");
                    System.out.println("---------------------");
                    bandera = 2;
                }

            } while (bandera != 2);

        } else if (opcion1 == 2) {

            do {

                //Bucle menú 
                System.out.println("-----Por favor seleccione una opción-----");
                System.out.println("    1.Deposito de efectivo");
                System.out.println("    2.Retiro de dinero");
                System.out.println("    3.Saldo en la cuenta");
                System.out.println("    4.Clientes");
                System.out.println("    5.Salir");

                System.out.println("-----------------------------------------");

                System.out.print("-Opción: ");
                opcion2 = scn.nextInt();

                if (opcion2 == 1) {

                    System.out.println("   ---Deposito--- ");

                    Menu deposito = new Depositos();
                    deposito.Transaccion1();

                } else if (opcion2 == 2) {
                    System.out.println("   ---Retiros--- ");

                    //Menu retiros = new Retiros();
                    //retiros.Transaccion1();
                } else if (opcion2 == 3) {
                    System.out.println("   ---Saldo--- ");

                    Menu saldo = new Saldo();
                    saldo.Transaccion1();

                } else if (opcion2 == 4) {
                    System.out.println("   ---Clientes--- ");

                    //Menu clientes = new Clientes();
                    //Clientes.Transaccion1();
                } else if (opcion2 == 5) {
                    System.out.println("---------------------");
                    System.out.println("Gracias vuelva pronto");
                    System.out.println("---------------------");
                    bandera = 2;
                }

            } while (bandera != 2);
        } else if (opcion1 == 3) {

            do {

                //Bucle menú 
                System.out.println("-----Por favor seleccione una opción-----");
                System.out.println("    1.Deposito de efectivo");
                System.out.println("    2.Retiro de dinero");
                System.out.println("    3.Saldo en la cuenta");
                System.out.println("    4.Clientes");
                System.out.println("    5.Salir");

                System.out.println("-----------------------------------------");

                System.out.print("-Opción: ");
                opcion2 = scn.nextInt();

                if (opcion2 == 1) {

                    System.out.println("   ---Deposito--- ");

                    Menu deposito = new Depositos();
                    deposito.Transaccion1();

                } else if (opcion2 == 2) {
                    System.out.println("   ---Retiros--- ");

                    //Menu retiros = new Retiros();
                    //retiros.Transaccion1();
                } else if (opcion2 == 3) {
                    System.out.println("   ---Saldo--- ");

                    Menu saldo = new Saldo();
                    saldo.Transaccion1();

                } else if (opcion2 == 4) {
                    System.out.println("   ---Clientes--- ");

                    //Menu clientes = new Clientes();
                    //Clientes.Transaccion1();
                } else if (opcion2 == 5) {
                    System.out.println("---------------------");
                    System.out.println("Gracias vuelva pronto");
                    System.out.println("---------------------");
                    bandera = 2;
                }

            } while (bandera != 2);

            Menu user3 = new Saldo();

            do {

                //Bucle menú 
                System.out.println("-----Por favor seleccione una opción-----");
                System.out.println("    1.Deposito de efectivo");
                System.out.println("    2.Retiro de dinero");
                System.out.println("    3.Saldo en la cuenta");
                System.out.println("    4.Clientes");
                System.out.println("    5.Salir");

                System.out.println("-----------------------------------------");

                System.out.print("-Opción: ");
                opcion2 = scn.nextInt();

                if (opcion2 == 1) {

                    System.out.println("   ---Deposito--- ");

                    Menu deposito = new Depositos();
                    deposito.Transaccion1();

                } else if (opcion2 == 2) {
                    System.out.println("   ---Retiros--- ");

                    //Menu retiros = new Retiros();
                    //retiros.Transaccion1();
                } else if (opcion2 == 3) {
                    System.out.println("   ---Saldo--- ");

                    Menu saldo = new Saldo();
                    saldo.Transaccion1();

                } else if (opcion2 == 4) {
                    System.out.println("   ---Clientes--- ");

                    //Menu clientes = new Clientes();
                    //Clientes.Transaccion1();
                } else if (opcion2 == 5) {
                    System.out.println("---------------------");
                    System.out.println("Gracias vuelva pronto");
                    System.out.println("---------------------");
                    bandera = 2;
                }

            } while (bandera != 2);

        }

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
    //getters and setters
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
    /*
     protected double depositos;

     public void Depositos() {
     depositos = scn.nextDouble();
     }
     */

}
