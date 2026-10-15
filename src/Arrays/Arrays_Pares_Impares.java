package Arrays;

public class Arrays_Pares_Impares {
    public static void main(String[] args) {
        int[] numeros = {3, 4, 8, 5, 1};
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                pares++;
            }else {
                impares++;
            }
        }
        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);

    }
}
