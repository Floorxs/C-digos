public class perro {

    String nombre;
    String raza;
    int edad;

    // Constructor
    public perro(String n, String r, int e) {
        nombre = n;
        raza = r;
        edad = e;
    }

    public void ladrar() {
        System.out.println("¡Guau! ¡Guau!");
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre);
        System.out.println("Soy de raza " + raza);
        System.out.println("Tengo " + edad + " años.");
    }

    public static void main(String[] args) {

        perro p = new perro("Pancracio", "Chihuhua", 8);

        p.presentarse();
        p.ladrar();
    }
}