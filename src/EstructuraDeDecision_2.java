import java.util.Scanner;

public class EstructuraDeDecision_2 {
    public static void main(String[] args) {
        double consumomensual;
        double importe;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu consumo mensual(kWh)");
        consumomensual = sc.nextDouble();

        if (consumomensual <= 100) {
            System.out.println(importe = consumomensual * 0.1);
        } else if (consumomensual <= 300) {
            System.out.println(importe = 100 * 0.1 + (consumomensual -100) * 0.15);
        } else if (consumomensual > 300) {
            System.out.println(importe = 100 * 0.1 + 200 * 0.15 + (consumomensual - 300) * 0.2);
        }
    }
}
