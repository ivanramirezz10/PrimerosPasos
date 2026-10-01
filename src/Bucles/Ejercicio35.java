package Bucles;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        int divisor;
        int dividiendo;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dos números");
        dividiendo = sc.nextInt();
        divisor = sc.nextInt();
        int resto = dividiendo;

        while (resto >= divisor){
            resto = resto - divisor;
        }
        System.out.println("El resto es " + resto);
    }
}
