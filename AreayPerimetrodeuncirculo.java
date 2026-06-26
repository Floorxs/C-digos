import java.util.Scanner;

public class AreayPerimetrodeuncirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el radio
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área y el perímetro
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        // Mostrar resultados
        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);

        scanner.close();
    }
}
