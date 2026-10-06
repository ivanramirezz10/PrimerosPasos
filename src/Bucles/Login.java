package Bucles;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
      int MAX_INTENTOS = 3;
      int intentos = 0;
      String contrasena;
      String contrasenaCorrecta = "daw2026";

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce la contraseña: ");
            contrasena = sc.nextLine();
            if (contrasena.equals(contrasenaCorrecta)){
                System.out.println("Acceso concedido");
                break;
            } else {
                intentos++;
                System.out.println("Contraseña Incorrecta. " + "Te quedan " + (MAX_INTENTOS - intentos) + " intentos.");

            }
        }while (intentos < MAX_INTENTOS);
        if (intentos == MAX_INTENTOS && !contrasena.equals(contrasenaCorrecta)){
            System.out.println("Contraseña bloqueada");
        }
    }
}
