import java.util.Scanner;

public class Ejemplo13 {
    public static void main(String[] args) {
        double valor1;
        double valor2;
        int ad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tus números");
        valor1 = sc.nextDouble();
        valor2 = sc.nextDouble();
        System.out.println("¿Cómo quieres ordenarlos? 1 = Ascendente, 2 = Descendente");
        ad = sc.nextInt();

        if (ad == 1) {
            System.out.println("Este es el orden ascendente");

            if (valor1 > valor2) {
                System.out.println(valor2);
                System.out.println(valor1);
            } else {
                System.out.println(valor1);
                System.out.println(valor2);
            }

        } else {
            System.out.println("Este es el orden descendente");

            if (valor1 > valor2) {
                System.out.println(valor1);
                System.out.println(valor2);
            } else {
                System.out.println(valor2);
                System.out.println(valor1);
            }
        }
    }
}
