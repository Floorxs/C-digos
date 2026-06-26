import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class cafeteria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<String> clientes = new LinkedList<>();
        Stack<String> cancelados = new Stack<>();

        int opcion;

        do {
            System.out.println("\n1. Llegar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Cancelar pedido");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Mostrar cancelaciones");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    clientes.add(nombre);
                    break;

                case 2:
                    if (!clientes.isEmpty()) {
                        System.out.println("Atendiendo a: " + clientes.poll());
                    } else {
                        System.out.println("No hay clientes.");
                    }
                    break;

                case 3:
                    System.out.print("Nombre a cancelar: ");
                    nombre = sc.nextLine();

                    if (clientes.remove(nombre)) {
                        cancelados.push(nombre);
                        System.out.println("Pedido cancelado.");
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Clientes: " + clientes);
                    break;

                case 5:
                    System.out.println("Cancelados: " + cancelados);
                    break;

                case 6:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 6);

        sc.close();
    }
}