import java.util.Scanner;

public class pizzeria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a Pizza Planeta");

        // Datos del cliente
        System.out.print("Ingresa tu nombre: ");
        String nombreCliente = sc.nextLine();

        int numeroOrden = (int)(Math.random() * 1000) + 1;

        System.out.println("\nORDEN DE COMPRA");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Número de orden: #" + numeroOrden);

        System.out.println("\nSelecciona el tipo de pizza:");
        System.out.println("1. Vegetariana");
        System.out.println("2. No vegetariana");

        int opcion = sc.nextInt();

        String ingredientes = "";
        double costo = 0;

        if (opcion == 1) {

            System.out.println("\nPizza Vegetariana");
            System.out.println("Selecciona ingredientes (escribe 1 si, 0 no):");

            System.out.print("Queso: ");
            int queso = sc.nextInt();

            System.out.print("Tomate: ");
            int tomate = sc.nextInt();

            System.out.print("Pimientos: ");
            int pimientos = sc.nextInt();

            System.out.print("Champiñones: ");
            int champinones = sc.nextInt();

            System.out.print("Cebolla: ");
            int cebolla = sc.nextInt();

            if (queso == 1) ingredientes += "Queso, ";
            if (tomate == 1) ingredientes += "Tomate, ";
            if (pimientos == 1) ingredientes += "Pimientos, ";
            if (champinones == 1) ingredientes += "Champiñones, ";
            if (cebolla == 1) ingredientes += "Cebolla, ";

            costo = 120;

        } else if (opcion == 2) {

            System.out.println("\nPizza No Vegetariana");
            System.out.println("Selecciona ingredientes (escribe 1 si, 0 no):");

            System.out.print("Pepperoni: ");
            int pepperoni = sc.nextInt();

            System.out.print("Jamón: ");
            int jamon = sc.nextInt();

            System.out.print("Salchicha: ");
            int salchicha = sc.nextInt();

            System.out.print("Tocino: ");
            int tocino = sc.nextInt();

            if (pepperoni == 1) ingredientes += "Pepperoni, ";
            if (jamon == 1) ingredientes += "Jamón, ";
            if (salchicha == 1) ingredientes += "Salchicha, ";
            if (tocino == 1) ingredientes += "Tocino, ";

            costo = 150;

        } else {
            System.out.println("Opción no válida");
            System.exit(0);
        }

        // TICKET FINAL
        System.out.println("\n----------------------------");
        System.out.println("TICKET DE COMPRA");
        System.out.println("----------------------------");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Orden: #" + numeroOrden);

        if (opcion == 1) {
            System.out.println("Tipo: Pizza Vegetariana");
        } else {
            System.out.println("Tipo: Pizza No Vegetariana");
        }

        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Total a pagar: $" + costo);
        System.out.println("----------------------------");
        System.out.println("Gracias por su compra");

        sc.close();
    }
}