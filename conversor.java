import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        mostrar_menu_conversor();
    }

    
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
                break;

            default:
                System.out.println("Opcion no valida intente de nuevo");
                mostrar_menu_conversor();
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
//--------------------------------------------------------------------------
}