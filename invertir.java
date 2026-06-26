import java.util.Scanner;
import java.util.Stack;

public class invertir {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        System.out.print("Escribe una palabra: ");
        String palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            pila.push(palabra.charAt(i));
        }

        String invertida = "";

        while (!pila.isEmpty()) {
            invertida += pila.pop();
        }

        System.out.println("Palabra invertida: " + invertida);

        if (palabra.equalsIgnoreCase(invertida)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }

        sc.close();
    }
}