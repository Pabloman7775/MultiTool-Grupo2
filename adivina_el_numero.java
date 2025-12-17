import java.util.Scanner;

public class adivina_el_numero {

    public static void main(String[] args) {
        adivina_el_numero_submenu();
    }

    public static void adivina_el_numero_submenu() {
        System.out.println("\n===========================\n     ADIVINA EL NÚMERO\n===========================\nPara seleccionar una opción introduzca el número correspondiente el número correspondiente:\n1. Explicación del juego\n2. Jugar\n3. Mostrar intentos del último juego\n0. Salir");
        Scanner leer = new Scanner(System.in);
        System.out.print("\nSeleccione opción: ");
        adivina_el_numero_seleccionar(leer.nextInt());
        leer.close();
    }

    public static void adivina_el_numero_seleccionar(int opcion) {
        switch (opcion) {
            case 0:
                adivina_el_numero_salir();
                break;

            case 1:
                adivina_el_numero_explicación();
                break;

            case 2:
                adivina_el_numero_jugar();
                break;

            case 3:
                adivina_el_numero_intentos();
                break;

            default:
                System.out.println("Error: esa opción no existe");
                adivina_el_numero_submenu();
                break;
        }
    }

    public static void adivina_el_numero_explicación() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------\nReglas:\nLa máquina generará un número aleatorios del 1 al 50 y el usuario deberá tratar de adivinarlo probando diferentes números en la terminal.\n------------------------------------------------------------------------------------------------------------------------------------------\nCómo jugar:\nEl juego no terminará hasta que el usuario decida salir o haya acertado el número.\nSi se cumple este último caso, se notificará al usuario mediante un mensaje y se volverá al menú de la utilidad.\nPara salir el usuario deberá escribir \"-1\".\n------------------------------------------------------------------------------------------------------------------------------------------");
        adivina_el_numero_submenu();
    }

    //Variable para almacenar el número de intentos.
    static int adivina_el_numero_intentos_anterior = 0;

    public static void adivina_el_numero_jugar() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Adivine el número entre 1 y 50: ");
        int adivina, intentos = 0;

        int aleatorio = adivina_el_numero_generar_aleatorio();

        do {
            adivina = leer.nextInt();
            if (adivina_el_numero_adivinado(adivina, aleatorio)) {
                System.out.println("Correcto! El número era " + aleatorio + ".");
                intentos++;
                break;
            } else if (adivina == -1) {
                System.out.println("El usuario ha elgido salir\nSe reiniciará el número de intentos");
                intentos = 0;
                break;
            } else {
                System.out.println("Incorrecto, pruebe otra vez: ");
                intentos++;
            }
        } while (adivina_el_numero_adivinado(adivina, aleatorio) == false);

        adivina_el_numero_intentos_anterior = intentos;

        adivina_el_numero_submenu();

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
        if (adivina_el_numero_intentos_anterior != 0) {
            System.out.println("Número de intentos del último juego: " + adivina_el_numero_intentos_anterior);
        } else {
            System.out.println("Error: todavía no se ha jugado");
        }

        adivina_el_numero_submenu();
    }

    public static void adivina_el_numero_salir() {
        main(null);
    }
}