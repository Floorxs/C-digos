import java.util.Scanner;

public class DosNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Ingresa el primer número entero: ");
        num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        num2 = sc.nextInt();

        System.out.println("Primer número: " + num1);
        System.out.println("Segundo número: " + num2);

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));

        sc.close();
    }
}