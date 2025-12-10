import java.util.Scanner;

public class AnalizadorDeTexto {

    public static Scanner leer =  new Scanner(System.in);
    public static void main(String[] args) {

        //iniciarAplicacion();

        String texto = "Mi bombo clat";

        palabraMasLarga(texto);
        
    }



    static void iniciarAplicacion() {
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
                    System.out.println("Has salido del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println("\nPulsa ENTER para continuar...");
            leer.nextLine();

        } while (eleccion != 0);
    }



    static int mostrarMenuYLeerOpcion() {

        System.out.println("\n=== ANALIZADOR DE TEXTO ===");
        System.out.println("1. Contar vocales");
        System.out.println("2. Contar palabras");
        System.out.println("3. Palabra más larga");
        System.out.println("0. Salir del programa");
        System.out.print("Elige una opción: ");

        int opcion = leer.nextInt();
        leer.nextLine(); // limpiar buffer
        return opcion;
    }      



    public static void contarVocalesUI() {

    }



    public static void contarPalabrasUI() {
        
    }



    public static void palabraMasLargaUI() {
        
    }



    public static int contarVocales(String texto) {

        texto = texto.toLowerCase();
        int contadorVocales = 0;

        for (int i = 0; i < texto.length()-1; i++) {
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
            } else if (palabraActual.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabraActual;
            }
        }
    
    
    }





}