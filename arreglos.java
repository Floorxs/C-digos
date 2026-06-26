import java.util.Random;

public class arreglos {
    public static void main(String[] args) {

        Random random = new Random();

        int[] calificaciones = new int[10];
        int suma = 0;
        int aprobados = 0;
        int reprobados = 0;
        int mayor = 0;
        int menor = 100;

        // Llenar el arreglo con calificaciones aleatorias
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = random.nextInt(101); // 0 a 100
        }

        System.out.println("Calificaciones de los alumnos:");

        // Recorrer el arreglo
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i]);

            suma += calificaciones[i];

            if (calificaciones[i] >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }

            if (calificaciones[i] > mayor) {
                mayor = calificaciones[i];
            }

            if (calificaciones[i] < menor) {
                menor = calificaciones[i];
            }
        }

        double promedio = (double) suma / calificaciones.length;

        System.out.println("\nResultados:");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.println("Calificación más alta: " + mayor);
        System.out.println("Calificación más baja: " + menor);
        System.out.println("Promedio del grupo: " + promedio);
    }
}
