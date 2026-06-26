import java.util.LinkedList;
import java.util.Queue;

public class Filapersonas {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Karla");
        fila.add("Luis");
        fila.add("Jesús");
        fila.add("Angel");
        fila.add("Miguel");

        System.out.println("Al frente: " + fila.peek());

        System.out.println("Atendiendo: " + fila.poll());
        System.out.println("Atendiendo: " + fila.poll());

        System.out.println("Fila restante: " + fila);
    }
}