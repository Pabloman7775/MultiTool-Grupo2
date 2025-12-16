import java.util.Scanner;

public class gestorTareas {
    static final int MAX_TAREAS = 15;
    static String[] tareas = new String[MAX_TAREAS];
    static Scanner leer = new Scanner(System.in);
    static int contador = 0;
    public static void main(String[] args) {
        int opcion = 0;
        do {
        opcion = opcionMenu();
        if (opcion == 0) {
            System.out.println();
            System.out.println("Saliendo del programa...");
            System.out.println();
        }
        else {
            llamadasFunciones(opcion);
        }
        } while (opcion != 0);
    }

    static int opcionMenu() {
        int opcion = 0;
        System.out.println();
        System.out.println("=== GESTOR DE TAREAS ===");
        System.out.println("OPCIONES:");
        System.out.println("  1. Añadir Tarea");
        System.out.println("  2. Listar Tareas");
        System.out.println("  3. Buscar Palabra");
        System.out.println("  O. Volver");
        System.out.println();
        System.out.print("Introduce tu opción (0-3): ");
        opcion = leer.nextInt();
        return opcion;
    }

    static void llamadasFunciones(int opcion) {
        switch (opcion) {
            case 1:
                añadirTarea();
                break;
            case 2:
                listarTareas();
                break;
            case 3:
                pedirPalabra();
                break;
            default:
                System.out.println();
                System.out.println("Introduce una opción válida.");
                System.out.println();
                opcionMenu();
        }
    }
    
    static void añadirTarea() {
        boolean existe = false;
        if (contador == 15) {
            System.out.println();
            System.out.println("No te queda espacio para crear tareas nuevas.");
        }
        else {
            System.out.println();
            System.out.println("=== AÑADIR TAREA ===");
            System.out.print("Introduce Tarea: ");
            String tarea = leer.next();
            for (int i = 0; i < contador; i++) {
                if (tarea.toLowerCase().equals(tareas[i])) {
                    System.out.println();
                    System.out.println("Esta tarea ya existe en la posición " + i);
                    System.out.println();
                    existe = true;
                }
            }
            if (existe == false) {
                tareas[contador] = tarea;
                contador++;
                System.out.println();
                System.out.println("Tarea '" +  tarea + "'correctamente creada");
            }
        }
    }

    static void listarTareas() {
        System.out.println();
        System.out.println("=== TAREAS ===");
        if (contador == 0) {
            System.out.println("No hay tareas para mostrar.");
        }
        else{
            for (int i = 0; i < contador; i++) {
            System.out.println(i + ". " + tareas[i]);            
        }
        }
        System.out.println();
    }

    static void pedirPalabra() {
        String palabra;
        System.out.println("=== BUSCAR POR PALABRA ===");
        System.out.print("Introduce palabra: ");
        palabra = leer.next();
        buscarPorPalabra(palabra);
    }

    static void buscarPorPalabra(String palabra) {
        int encontradas = 0;
        System.out.println();
        System.out.println("Palabras encontradas:");
        for (int i = 0; i < contador; i++) {
            if (tareas[i].toLowerCase().contains(palabra)) {
                System.out.println(i + ". "+ tareas[i]);
                encontradas++;
            }
        }
        System.out.println();
        if (encontradas == 0) {
            System.out.println("No se ha encontrado nada similar a " + palabra);
        }
        else {
            System.out.println("Se han encontrado " + encontradas + " palabras relacionadas a '" + palabra + "'");
        }
    }
}
