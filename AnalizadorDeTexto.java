import java.util.Scanner;

public class AnalizadorDeTexto {

    public static Scanner leer =  new Scanner(System.in);
    public static void main(String[] args) {
        
        mostrarMenuYElegir();
        
    }

    public static void mostrarMenuYElegir() {

    int eleccion;        

        do {
            System.out.println("=== ANALIZADOR DE TEXTO ==="); 
            System.out.println("1. Contar vocales");
            System.out.println("2. Contar palabras");
            System.out.println("3. Palabra más larga");
            System.out.println("Saliendo del programa...");

            eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    contarVocales();
                    break;
                case 2:
                    contarPalabras();
                    break;
                case 3:
                    palabraMasLarga();
                    break;
                case 0:
                    salirPrograma();
                    break;
            }

        } while (eleccion <= 3 && eleccion >= 0);
        
        
    }

    public static void contarVocales(){

    }

    public static void contarPalabras(){
        
    }

    public static void palabraMasLarga(){
        
    }

    public static void salirPrograma(){
        System.out.println("Has salido del programa.");
    }


}