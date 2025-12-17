import java.util.Scanner;

public class PRINCIPAL {
        static final int MAX_TAREAS = 15;
        static String[] tareas = new String[MAX_TAREAS];
        static int contador = 0;


    public static void main(String[] args) {
        boolean fin = false;

        Scanner numScanner = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("          ~ MENU PRINCIPAL ~");
        System.out.println("=====================================");
        System.out.println("1: Conversor Múltiplo");
        System.out.println("2: Analizador de texto");
        System.out.println("3: Gestor de Tareas");
        System.out.println("4: Adivina el número");
        System.out.println("0: SALIR");
        System.out.println("=====================================");

        switch (numero()) {
            case 1:
                System.out.println();
                System.out.println();
                System.out.println();
                mostrar_menu_conversor();
                break;

            case 2:
                System.out.println();
                System.out.println();
                System.out.println();
                iniciarAnalizadorDeTexto();
                break;

            case 3:
                System.out.println();
                System.out.println();
                System.out.println();
                iniciarGestorTareas(args);
                break;

            case 4:
                System.out.println();
                System.out.println();
                System.out.println();
                adivina_el_numero_submenu();
                break;

            case 0:
                System.out.println("Hasta luego...");
                break;

            default:
                System.out.println("Opcion no valida intente de nuevo");
                main(args);                
            break;

        }
    }
//====================================================================
//                      COMPROVAR NUMERO
//====================================================================

   public static int numero() {
    Scanner sc = new Scanner(System.in);
    int numero = 10;
    String a;
        a = sc.next();
        if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("0")) {
            numero = Integer.parseInt(a);
        }

    return numero;
    }
//====================================================================





//====================================================================
//                      CONVERSOR MULTIPLO
//====================================================================
//--------------------------------------------------------------------------
    public static void mostrar_menu_conversor() {
        boolean fin = false;

        Scanner numScanner = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("         CONVERSOR MÚLTIPLO");
        System.out.println("=====================================");
        System.out.println("1: Celsius ↔ Fahrenheit");
        System.out.println("2: Metros ↔ Pies");
        System.out.println("3: Kilogramos ↔ Libras");
        System.out.println("0: Salir");
        System.out.println("=====================================");

        switch (numScanner.nextInt()) {
            case 1:
                Cel_Far();
                break;

            case 2:
                Met_pies();
                break;

            case 3:
                KG_libras();
                break;

            case 0:
                System.out.println("salir");
                main(null);
                break;

            default:
                System.out.println("Opcion no valida intente de nuevo");
                break;

        }
    }
//--------------------------------------------------------------------------





//--------------------------------------------------------------------------
    public static void Cel_Far() {
        int numero;
        Scanner numScanner = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("        HA ELEGIDO");
        System.out.println("   Celsius  <--->  Fahrenheit");
        System.out.println("=====================================");

        System.out.println("Elija la operacion que va a hacer: (1 o 2)");
        System.out.println("1: Celsius → Fahrenheit");
        System.out.println("2: Fahrenheit → Celsius");
        switch (numScanner.nextInt()) {
            case 1:
                    System.out.println("=====================================");
                    System.out.println("        HA ELEGIDO");
                    System.out.println("   Celsius  -->  Fahrenheit");
                    System.out.println("=====================================");

                    System.out.println("Indica el numero que quieres convertir:");
                     numero = numScanner.nextInt();
                    System.out.println(numero + " grados Celsius --> " + (numero*2+30) + " grados Fahrenheit");

                break;
            case 2:
                    System.out.println("=====================================");
                    System.out.println("        HA ELEGIDO");
                    System.out.println("   Fahrenheit  -->  Celsius");
                    System.out.println("=====================================");

                    System.out.println("Indica el numero que quieres convertir:");
                     numero = numScanner.nextInt();
                    System.out.println(numero + " grados Fahrenheit --> " + (numero-30)/2 + " grados Celsius");
                break;
        
            default:
                System.out.println("Operación no valida");
                mostrar_menu_conversor();
                break;
        }
        mostrar_menu_conversor();
    }
//--------------------------------------------------------------------------





//--------------------------------------------------------------------------
    public static void Met_pies() {
        double numero;
        Scanner numScanner = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("        HA ELEGIDO");
        System.out.println("       Pies  <--->  Metros");
        System.out.println("=====================================");

        System.out.println("Elija la operacion que va a hacer: (1 o 2)");
        System.out.println("1: Metros → Pies");
        System.out.println("2: Pies → Metros");
        switch (numScanner.nextInt()) {
            case 1:
                    System.out.println("=====================================");
                    System.out.println("        HA ELEGIDO");
                    System.out.println("   Metros  -->  Pies");
                    System.out.println("=====================================");

                    System.out.println("Indica el numero que quieres convertir:");
                     numero = numScanner.nextDouble();
                    System.out.println(numero + " Metros --> " + (numero*3) + "  Pies");

                break;
            case 2:
                    System.out.println("=====================================");
                    System.out.println("        HA ELEGIDO");
                    System.out.println("   Pies  -->  Metros");
                    System.out.println("=====================================");

                    System.out.println("Indica el numero que quieres convertir:");
                     numero = numScanner.nextDouble();
                    System.out.println(numero + " Pies --> " + (numero/3) + " Metros");
                break;
        
            default:
                System.out.println("Operación no valida");
                mostrar_menu_conversor();
                break;
        }
        mostrar_menu_conversor();
    }
//--------------------------------------------------------------------------





//--------------------------------------------------------------------------
    public static void KG_libras() {
        double numero;
        Scanner numScanner = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("        HA ELEGIDO");
        System.out.println("     Libras  <--->  Kilogramos");
        System.out.println("=====================================");

        System.out.println("Elija la operacion que va a hacer: (1 o 2)");
        System.out.println("1: Kg → libras");
        System.out.println("2: libras → Kg");
        switch (numScanner.nextInt()) {
            case 1:
                    System.out.println("=====================================");
                    System.out.println("        HA ELEGIDO");
                    System.out.println("   Kg  -->  libras");
                    System.out.println("=====================================");

                    System.out.println("Indica el numero que quieres convertir:");
                     numero = numScanner.nextDouble();
                    System.out.println(numero + " Kg --> " + (numero*2) + "  libras");

                break;
            case 2:
                    System.out.println("=====================================");
                    System.out.println("        HA ELEGIDO");
                    System.out.println("   libras  -->  Kg");
                    System.out.println("=====================================");

                    System.out.println("Indica el numero que quieres convertir:");
                     numero = numScanner.nextDouble();
                    System.out.println(numero + " libras --> " + (numero/2) + " Kg");
                break;
        
            default:
                System.out.println("Operación no valida");
                break;
        }
        mostrar_menu_conversor();
    }
//====================================================================

//====================================================================
//                        Analizador de texto
//====================================================================

    public static void iniciarAnalizadorDeTexto() {
        int eleccion;
        Scanner leer = new Scanner(System.in);

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
                    main(null);
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
        Scanner leer = new Scanner(System.in);

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
        Scanner leer = new Scanner(System.in);

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

//====================================================================

//====================================================================
//                      GESTOR DE TAREAS
//====================================================================
        public static void iniciarGestorTareas(String[] args) {
            Scanner leer = new Scanner(System.in);
            int opcion = 0;
            do {
             opcion = opcionMenu();
            if (opcion == 0) {
                System.out.println();
                System.out.println("Saliendo del programa...");
                main(args);
               
        }
        else {
            llamadasFunciones(opcion);
        }
        } while (opcion != 0);
    }
    
    public static int opcionMenu() {
    Scanner leer = new Scanner(System.in);

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



    public static void llamadasFunciones(int opcion) {
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
                break;
        }
    }
    
    public static void añadirTarea() {
        Scanner leer = new Scanner(System.in);

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

    public static void listarTareas() {
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

    public static void pedirPalabra() {
        Scanner leer = new Scanner(System.in);

        String palabra;
        System.out.println("=== BUSCAR POR PALABRA ===");
        System.out.print("Introduce palabra: ");
        palabra = leer.next();
        buscarPorPalabra(palabra);
    }

    public static void buscarPorPalabra(String palabra) {
        Scanner leer = new Scanner(System.in);

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
//====================================================================
//                      ADIVINA EL NUMERO
//====================================================================

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
        main(tareas);
    }

}
