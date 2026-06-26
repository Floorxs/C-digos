public class funciones {

    // 1. Saludo simple
    public static void saludo() {
        System.out.println("¡Hola amigo!");
    }

    // 2. Saludo con nombre
    public static void saludoNombre(String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }

    // 3. Factorial
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // 4. Factura con IVA (21% por defecto)
    public static double calcularFactura(double cantidad) {
        return cantidad * 1.21;
    }

    public static double calcularFactura(double cantidad, double iva) {
        return cantidad * (1 + iva / 100);
    }

    // 5. Área de un círculo
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Volumen de un cilindro usando la función anterior
    public static double volumenCilindro(double radio, double altura) {
        return areaCirculo(radio) * altura;
    }

    public static void main(String[] args) {

        saludo();

        saludoNombre("Karla");

        System.out.println("Factorial de 26 = " + factorial(5));

        System.out.println("Factura con IVA por defecto = " +
                calcularFactura(100));

        System.out.println("Factura con IVA del 16% = " +
                calcularFactura(100, 16));

        System.out.println("Área del círculo (radio 3) = " +
                areaCirculo(3));

        System.out.println("Volumen del cilindro (radio 3, altura 5) = " +
                volumenCilindro(3, 5));
    }
}