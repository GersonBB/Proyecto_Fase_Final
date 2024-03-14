package uvg.edu.gt;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;
import java.util.Scanner;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora_mega calculadora = new Calculadora_mega();
        Vector<String> operaciones = new Vector<String>();

        // Modifica la ruta del archivo de texto
        String rutaArchivo = "C:\\Users\\gerso\\OneDrive\\Escritorio\\Proyecto_Fase2\\src\\main\\java\\uvg\\edu\\gt\\datos.txt";

        try {
            FileReader r = new FileReader(rutaArchivo);
            BufferedReader buffer = new BufferedReader(r);

            String temp = "";

            while ((temp = buffer.readLine()) != null) {
                operaciones.add(temp);
            }
            buffer.close(); // Es buena práctica cerrar el BufferedReader
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Menú principal
        boolean salir = false;
        while (!salir) {
            System.out.println("Bienvenido al Intérprete LISP");
            System.out.println("---------------------------------------");
            System.out.println("1. Ejecutar operaciones desde archivo");
            System.out.println("2. Ingresar operaciones manualmente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    ejecutarOperacionesDesdeArchivo(operaciones, calculadora);
                    break;
                case 2:
                    ingresarOperacionesManualmente(scanner, calculadora);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }

        scanner.close();
    }

    private static void ejecutarOperacionesDesdeArchivo(Vector<String> operaciones, Calculadora_mega calculadora) {
        System.out.println("Operaciones archivo txt");
        for (String operacion : operaciones) {
            System.out.println(operacion);
        }

        System.out.println("Resultados txt");
        for (String operacion : operaciones) {
            try {
                System.out.println(" " + calculadora.Calculo(operacion));
            } catch (Exception e) {
                System.out.println("Error al procesar la operación.");
            }
        }
    }

    private static void ingresarOperacionesManualmente(Scanner scanner, Calculadora_mega calculadora) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione el tipo de operación que desea realizar:");
            System.out.println("1. SETQ");
            System.out.println("2. EQUAL");
            System.out.println("3. LIST");
            System.out.println("4. ATOM");
            System.out.println("5. COND");
            System.out.println("6. Salir al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado SETQ. Ingrese la operación LISP: ");
                    break;
                case 2:
                    System.out.println("Ha seleccionado EQUAL. Ingrese la operación LISP: ");
                    break;
                case 3:
                    System.out.println("Ha seleccionado LIST. Ingrese la operación LISP: ");
                    break;
                case 4:
                    System.out.println("Ha seleccionado ATOM. Ingrese la operación LISP: ");
                    break;
                case 5:
                    System.out.println("Ha seleccionado COND. Ingrese la operación LISP: ");
                    break;
                case 6:
                    System.out.println("Saliendo al menú principal...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

            if (opcion >= 1 && opcion <= 5 && continuar) {
                System.out.print("Ingrese la operación LISP: ");
                String operacion = scanner.nextLine();
                try {
                    System.out.println("Resultado: " + calculadora.Calculo(operacion));
                } catch (Exception e) {
                    System.out.println("Error al procesar la operación. Por favor, intente nuevamente.");
                }
            } else if (opcion == 6) {
                continuar = false;
            }
        }
    }
}
