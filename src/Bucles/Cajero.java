package Bucles;

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        double saldo;
        int opcion;
        double cantidad;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu dinero");
        saldo = sc.nextDouble();

        do {
            System.out.println("CAJERO");
            System.out.println("1. Retirar dinero");
            System.out.println("2. Ingresar dinero");
            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();
            if (opcion == 1){
                System.out.println("¿Cuánto dinero quieres retirar?");
                cantidad = sc.nextDouble();
                if (cantidad <= saldo){
                    saldo = saldo - cantidad;
                    System.out.println("Saldo actual: " + saldo);
                }else {
                    System.out.println("No tienes suficiente saldo");
                }
            } else if (opcion == 2) {
                System.out.println("¿Cuanto dinero quieres ingresar?");
                cantidad = sc.nextDouble();
                saldo = saldo + cantidad;
                System.out.println("Saldo actual " + saldo);
            }

            }while (opcion != 4);
        }
    }

