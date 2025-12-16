import java.util.Scanner;

public class adivina_el_numero {

    public static void adivina_el_numero_submenu() {

    }

    public static void adivina_el_numero_explicación() {

    }

    public static void adivina_el_numero_jugar() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Adivine el número entre 1 y 50: ");
        int adivina, intentos;

        int aleatorio = adivina_el_numero_generar_aleatorio();

        do {
            adivina = leer.nextInt();
            if (adivina_el_numero_adivinado(adivina, aleatorio)) {
                System.out.println("Correcto! El número era " + adivina_el_numero_generar_aleatorio() + ".");
                break;
            } else {
                System.out.println("Incorrecto, pruebe otra vez: ");
            }
            intentos++;
        } while (adivina_el_numero_adivinado(adivina, aleatorio) == false);

        adivina_el_numero_intentos(intentos);

        leer.close();
    }

    public static int adivina_el_numero_generar_aleatorio() {
        int aleatorio = (int) Math.floor(Math.random() * (51 - 1) + 1);
        return aleatorio;
    }

    public static boolean adivina_el_numero_adivinado(int adivina, int aleatorio) {
        boolean adivinado = false;
        if (adivina == aleatorio) {
            adivinado = true;
        }
        return adivinado;
    }

    public static void adivina_el_numero_intentos() {

    }

    public static void adivina_el_numero_salir() {

    }
}