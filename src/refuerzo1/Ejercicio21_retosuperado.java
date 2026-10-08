package refuerzo1;

import java.util.Scanner;

public class Ejercicio21_retosuperado {
    public static void main(String[] args) {
        double altura;
        double micras;
        double grosor;
        int dobleces = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el grosor y la altura");
        micras = sc.nextDouble();
        altura = sc.nextDouble();

        grosor = micras / 1000000;


        while (grosor <= altura){
            grosor = grosor * 2;
            dobleces++;
        }
    }
}
