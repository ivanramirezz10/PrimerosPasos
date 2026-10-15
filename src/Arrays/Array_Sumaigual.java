package Arrays;

import java.util.Scanner;

public class Array_Sumaigual {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 1, 3, 5,};
        int especifico;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número");
        especifico = sc.nextInt();

        for (int i = 0; i < numeros.length; i++){
                for (int j = i + 1 ; j < numeros.length; j++){
                    if (numeros[i] + numeros[j] == especifico){
                        System.out.println(numeros[i] + " + " + numeros[j] + " = " + especifico);
                    }
                }
        }
    }
}
