import java.util.Scanner;

public class AnalizadorDeTexto {

    public static Scanner leer =  new Scanner(System.in);
    public static void main(String[] args) {

        iniciarAplicacion();

    }


// Inicio de aplicación (Main)

    public static void iniciarAplicacion() {
        int eleccion;

        do {
            eleccion = mostrarMenuYLeerOpcion();
            
            switch (eleccion) {
                case 1:
                    contarVocalesUI();
                    break;

                case 2:
                    contarPalabrasUI();
                    break;

                case 3:
                    palabraMasLargaUI();
                    break;

                case 0:
                    System.out.println("\nHas salido del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println("\nPulsa ENTER para continuar...");
            leer.nextLine();

        } while (eleccion != 0);
    }


// Menú y validación de entradas

    public static int mostrarMenuYLeerOpcion() {

        boolean entradaValida = false;

        String opcion;

        do {

            System.out.println("\n=== ANALIZADOR DE TEXTO ===");
            System.out.println("1. Contar vocales");
            System.out.println("2. Contar palabras");
            System.out.println("3. Palabra más larga");
            System.out.println("0. Salir del programa");
            System.out.print("\nElige una opción: ");

            opcion = leer.nextLine();
            if (opcion.equals("0") || opcion.equals("1") || opcion.equals("2")|| opcion.equals("3")) {
                entradaValida = true;
            } else {
                System.out.println("\nEntrada no válida. Introduce un valor compatible:");
                
                System.out.println("\nPulsa ENTER para continuar...");
                leer.nextLine();

                entradaValida = false;
            }
        } while (entradaValida == false);

        // Conversión de String a int
        int opcionInt = Integer.parseInt(opcion);

        return opcionInt;
    }


    public static String leerYComprobarTexto() {

        String texto = "";

        boolean textoValido = false;
        
        do {
            System.out.print("Introduce un texto: ");
            texto = leer.nextLine();

            if (!(texto == null || texto.isEmpty())) {
                textoValido = true;
                
            } else if (texto == null || texto.isEmpty()) {
                System.out.println("El texto introducido es incorrecto.");
                
                System.out.println("\nPulsa ENTER para continuar...");
                leer.nextLine();
                textoValido = false;
            }

        } while (textoValido == false);


        return texto;
    }


// Métodos interfaz del usuario

    public static void palabraMasLargaUI() {
        System.out.println("\n=== PALABRA MAS LARGA ===");
        System.out.println("La palabra más larga del texto es '" + palabraMasLarga(leerYComprobarTexto()) + "'.");
    }


    public static void contarVocalesUI() {
        System.out.println("\n=== CONTAR VOCALES ===");
        System.out.println("El texto introducido contiene un total de " + contarVocales(leerYComprobarTexto()) + " vocales.");
    }


    public static void contarPalabrasUI() {
        System.out.println("\n=== CONTAR PALABAS ===");
        System.out.println("El texto contiene un total de " + contarPalabras(leerYComprobarTexto()) + " palabras.");
    }


// Métodos logicos

    public static int contarVocales(String texto) {

        texto = texto.toLowerCase();
        int contadorVocales = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {
                contadorVocales++;
            }
        }

        return contadorVocales;
    }


    public static int contarPalabras(String texto) {

        if (texto == null || texto.length() == 0) {
            return 0;
        }

        int conteoPalabras = 0;

        boolean dentroPalabra = false;

        for (int i = 0; i < texto.length(); i++) {
            char caracterActual = texto.charAt(i);

            if (caracterActual != ' ' && !dentroPalabra) {
                conteoPalabras++;
                dentroPalabra = true;
            } else if (caracterActual == ' ') {
                dentroPalabra = false;
            }
        }

        return conteoPalabras;
    }


    public static String palabraMasLarga(String texto) {

        if (texto == null || texto.length() == 0) {
            return "";
        }

        String palabraActual = "";
        String palabraMasLarga = "";

        for (int i = 0; i < texto.length(); i++) {
            char caracterActual = texto.charAt(i);

            if (caracterActual != ' ') {
                palabraActual += caracterActual;
            } else {
                if (palabraActual.length() > palabraMasLarga.length()) {
                    palabraMasLarga = palabraActual;
                }
                palabraActual = ""; // solo aquí
            }
        }

        // Comparar la última palabra (por si el texto no termina en espacio)
        if (palabraActual.length() > palabraMasLarga.length()) {
            palabraMasLarga = palabraActual;
        }

        return palabraMasLarga;
    }

}