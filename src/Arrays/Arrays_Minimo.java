package Arrays;

public class Arrays_Minimo {
    public static void main(String[] args) {
        int[] numeros = {3, 4, 8, 5, 1};
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
    }
}
