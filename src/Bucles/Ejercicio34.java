package Bucles;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int resultado = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dos números");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        for (int i = 1; i <= num2; i++){
            resultado = resultado + num1;
        }
        System.out.println("El resultado de la multiplicación es de: " + resultado);
    }
}
