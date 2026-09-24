import java.util.Scanner;

public class EstructuraDeDecision_1 {
    public static void main(String[] args) {
        double peso, altura;

        System.out.println("Introduce tu peso(kg) y altura(m)");
        Scanner sc = new Scanner(System.in);
        peso = sc.nextDouble();
        altura = sc.nextDouble();

        double MasaCorporal = MasaCorporal = peso / (altura * altura);

        if (MasaCorporal < 18.5) {
            System.out.println("Tu masa corporal es de " + MasaCorporal + ", estas bajo de peso");
        } else if (MasaCorporal < 24.9) {
            System.out.println("Tu masa corporal es de " + MasaCorporal + ", estas normal de peso");
        } else if (MasaCorporal < 29.9) {
            System.out.println("Tu masa corporal es de " + MasaCorporal + ", estas en sobrepeso de peso");
        } else if (MasaCorporal >=30){
            System.out.println("Tu masa corporal es de " + MasaCorporal + ", tienes obesidad");
        }


    }
}
