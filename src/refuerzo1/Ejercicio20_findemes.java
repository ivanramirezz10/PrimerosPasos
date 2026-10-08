package refuerzo1;

import java.util.Scanner;

public class Ejercicio20_findemes {
    public static void main(String[] args) {
        int saldo;
        int cambio;
        int saldoFinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el saldo y el cambio estimado:");
        saldo = sc.nextInt();
        cambio  = sc.nextInt();

        saldoFinal = saldo + cambio;

        if (saldoFinal >= 0){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }

    }
}