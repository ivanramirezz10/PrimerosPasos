package Bucles;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        int num;
        String resultado = " ";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            resultado = resultado + " " + i;
            System.out.println(resultado);
        }
    }
}
