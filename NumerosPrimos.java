public class NumerosPrimos {

    public static boolean primo(int n) {

        if (n <= 1) {
            return false;
        }

        for (int divisor = 2; divisor < n; divisor++) {

            if (n % divisor == 0) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("Los números primos del 1 al 200 son:");

        for (int numero = 1; numero <= 200; numero++) {

            if (primo(numero)) {
                System.out.println(numero);
            }

        }

    }
}