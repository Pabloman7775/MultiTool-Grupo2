import java.util.Scanner;

public class adivina_el_numero {

    public static void adivina_el_numero_submenu() {

    }

    public static void adivina_el_numero_explicación() {

    }

    public static void adivina_el_numero_jugar() {

        Scanner leer = new Scanner(System.in);
        System.out.print("Adivine el número entre 1 y 50: ");
        int adivina = leer.nextInt();
        adivina_el_numero_generar_aleatorio();

    }

    public static int adivina_el_numero_generar_aleatorio() {
        int aleatorio = (int) Math.floor(Math.random() * (51 - 1) + 1);
        return aleatorio;
    }

    public static void adivina_el_numero_intentos() {

    }

    public static void adivina_el_numero_salir() {

    }
}