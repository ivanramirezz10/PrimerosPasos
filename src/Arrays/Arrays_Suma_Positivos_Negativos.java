package Arrays;

public class Arrays_Suma_Positivos_Negativos {
    public static void main(String[] args) {
        int[] numeros = {5, 6, -1, -4, 7};
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < 0){
                sumaNegativos += numeros[i];
            }else {
                sumaPositivos += numeros[i];
            }
        }
    }
}
