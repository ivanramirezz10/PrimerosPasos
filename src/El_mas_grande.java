import java.util.Scanner;

public class El_mas_grande {
    public static void main(String[] args) {
        double valor1, valor2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tus números");
        valor1 = sc.nextDouble();
        valor2 = sc.nextDouble();

        System.out.println("Este es el valor más grande");
        if (valor1 > valor2) {
            System.out.println(valor1);
        } else {
            System.out.println(valor2);
        }

    }
}
