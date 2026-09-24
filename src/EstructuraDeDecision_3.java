import java.util.Scanner;

public class EstructuraDeDecision_3 {
    public static void main(String[] args) {
        int lado1, lado2;
        int lado3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los tres lados del triangulo");
        lado1 = sc.nextInt();
        lado2 = sc.nextInt();
        lado3 = sc.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("EQUILÁTERO");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("ISÓSCELES");
            } else {
                System.out.println("ESCALENO");
            }

        } else {
            System.out.println("IMPOSIBLE");
        }

            

    }}
