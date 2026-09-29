package Bucles;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        int num;
        int contador=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 números");

        for (int i = 0; i < 10; i++){
            num = sc.nextInt();
            if (num >= 0){
                contador++;
            }

        }
        System.out.println("Has introducido " + contador + " números positivos");
    }
}
