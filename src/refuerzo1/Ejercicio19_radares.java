package refuerzo1;

import java.util.Scanner;

public class Ejercicio19_radares {
    public static void main(String[] args) {
        double distancia;
        double velocidadMax;
        double tiempo;
        double velocidadMedia = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la distancia, la velocidad máxima y el tiempo ");
        distancia = sc.nextDouble();
        velocidadMax = sc.nextDouble();
        tiempo = sc.nextDouble();

        if(distancia <= 0 || velocidadMax <= 0 || tiempo <= 0){
            System.out.println("ERROR");
        }else {
            velocidadMedia = distancia / tiempo * 3.6;
        }
        if (velocidadMedia <= velocidadMax){
            System.out.println("OK");
        } else if (velocidadMedia <= velocidadMax * 1.2) {
            System.out.println("MULTA");
        }else {
            System.out.println("PUNTOS");
        }
    }
}
