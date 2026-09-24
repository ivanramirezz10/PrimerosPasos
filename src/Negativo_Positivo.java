import java.util.Scanner;

public class Negativo_Positivo {
    public static void main(String[] args) {
        double valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu valor");
        valor = sc.nextDouble();
        if (valor < 0)
            System.out.println("Tu valor es negativo");
        else
            System.out.println("Tu valor es positivo");
    }
}
