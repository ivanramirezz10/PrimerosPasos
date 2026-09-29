package Bucles;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        int num;
        int positivos = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce números(0 para terminar)");

        do {
            num = sc.nextInt();
            if (num >= 0){
                positivos = positivos + 1;
            }
        }while (num != 0);
        System.out.println("Hay " + positivos + " números positivos");
    }
}
