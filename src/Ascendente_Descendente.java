import java.util.Scanner;

public class Ascendente_Descendente {
    public static void main(String[] args) {
        double valor1;
        double valor2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu primer valor");
        valor1 = sc.nextDouble();
        System.out.println("Introduce tu segundo valor");
        valor2 = sc.nextDouble();

        if (valor1 > valor2) {
            System.out.println("Este es el orden ascendente");
            System.out.println(valor2);
            System.out.println(valor1);
        } else {
            System.out.println("Este es el orden ascendente");
        System.out.println(valor1);
        System.out.println(valor2); }


    }
}
