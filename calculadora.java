import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        int a = sc.nextInt();

        System.out.print("Segundo número: ");
        int b = sc.nextInt();

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Opción: ");
        int op = sc.nextInt();

        switch (op) {
            case 1: System.out.println("Resultado: " + (a + b)); break;
            case 2: System.out.println("Resultado: " + (a - b)); break;
            case 3: System.out.println("Resultado: " + (a * b)); break;
            case 4: System.out.println("Resultado: " + (a / b)); break;
            default: System.out.println("Opción no válida");
        }

        sc.close();
    }
}