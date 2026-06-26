import java.util.ArrayList;

public class Listadenombres {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Karla");
        nombres.add("Jesús");
        nombres.add("Jaqueline");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Angel");

        System.out.println("Lista de nombres:");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}