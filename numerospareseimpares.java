import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class numerospareseimpares {
    public static void main(String[] args) {

        Queue<Integer> numeros = new LinkedList<>();
        Queue<Integer> pares = new LinkedList<>();
        Queue<Integer> impares = new LinkedList<>();

        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int n = r.nextInt(50) + 1;
            numeros.add(n);

            if (n % 2 == 0) {
                pares.add(n);
            } else {
                impares.add(n);
            }
        }

        System.out.println("Cola original: " + numeros);
        System.out.println("Cola de pares: " + pares);
        System.out.println("Cola de impares: " + impares);
    }
}