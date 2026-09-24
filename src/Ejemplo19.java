import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        //DATOS
        int precioporhora;
        int horas;
        double Salariobruto;
        double impuestos;

        //Scanner
        System.out.println("Introduce tus horas trabajadas y el precio");
        Scanner sc = new Scanner(System.in);
        horas = sc.nextInt();
        precioporhora = sc.nextInt();

        Salariobruto = horas * precioporhora;

        //ALGORITMO
        if (horas < 35) {
            System.out.println("Tu salario es de " + Salariobruto);
        } else {
            System.out.println("Tu salario es de " + (Salariobruto * 1.5));
        }

        if (Salariobruto <= 500) {
            impuestos = 0;
        } else if (Salariobruto <= 900) {
            impuestos = ((Salariobruto - 500) * 0.25);
        } else {
            impuestos = ((400 * 0.25) + (Salariobruto - 900) * 0.45);
            
        }


    }
}
