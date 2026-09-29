package Bucles;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        double nota;
        double media = 0;
        double suma = 0;
        int cuantas = 0;
        Scanner sc = new Scanner(System.in);

        do {
            nota = sc.nextDouble();
            if (nota >= -1){
                suma = suma + nota;
                cuantas++;
                if (nota == 10){
                    System.out.println("Tienes un diez");
                }
            }
        }while (nota != -1);
        media = suma/cuantas;
        System.out.println("Media: " + media);
    }
}
