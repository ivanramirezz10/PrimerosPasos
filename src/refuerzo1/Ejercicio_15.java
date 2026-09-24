package refuerzo1;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {

        int t;
        int horas;
        int minutos;
        int segundos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tiempo en segundos:");
        t = sc.nextInt();

        horas = t / 3600;
        minutos = (t % 3600) / 60;
        segundos = t % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
