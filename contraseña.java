import java.util.Scanner;

public class contraseña {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String contraseña = "2602";

        System.out.print("Ingrese la contraseña: ");
        String ingreso = sc.nextLine();

        if (ingreso.equals(contraseña)) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Contraseña incorrecta");
        }

        sc.close();
    }
}