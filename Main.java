import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Información
        System.out.println("=== Registro de Visitante ===");
        System.out.print("Ingrese el nombre del visitante: ");
        String nombre = scanner.nextLine();
        int edad;
        while (true) {
            System.out.print("Ingrese la edad del visitante: ");
            if (scanner.hasNextInt()) {
                edad = scanner.nextInt();
                if (edad < 0 || edad > 105) {
                    System.out.println("Número inválido, intente de nuevo.");
                } else {
                    break;
                }
            } else {
                System.out.println("Entrada no válida, intente de nuevo.");
                scanner.next(); //
            }
        }
        scanner.nextLine();
        // Tipos de documento
        System.out.println("Tipos de documento:");
        System.out.println("D - Documento de identidad");
        System.out.println("P - Pasaporte");
        System.out.println("L - Licencia de conducir");
        System.out.println("C - Carnet de visitante");
        char tipoDocumento;
        while (true) {
            System.out.print("Ingrese el tipo de documento: ");
            tipoDocumento = scanner.next().toUpperCase().charAt(0);
            if (tipoDocumento == 'D' || tipoDocumento == 'P' || tipoDocumento == 'L' || tipoDocumento == 'C') {
                break;
            } else {
                System.out.println("Error: tipo de documento no válido. Intente de nuevo.");
            }
        }
        scanner.nextLine(); //salto de línea
        System.out.print("Ingrese el número del documento: ");
        String numeroDocumento = scanner.nextLine();
        // Visita
        int horas;
        while (true) {
            System.out.print("Ingrese las horas completas de visita: ");
            if (scanner.hasNextInt()) {
                horas = scanner.nextInt();
                if (horas >= 0) {
                    break;
                } else {
                    System.out.println("Error: las horas no pueden ser negativas. Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida, intente de nuevo.");
                scanner.next();
            }
        }
        int minutos;
        while (true) {
            System.out.print("Ingrese los minutos adicionales (entre 0 y 59): ");
            if (scanner.hasNextInt()) {
                minutos = scanner.nextInt();
                if (minutos >= 0 && minutos < 60) {
                    break;
                } else {
                    System.out.println("Error: minutos fuera de rango. Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida, intente de nuevo.");
                scanner.next();
            }
        }
        // SALIDA A PANTALLA
        System.out.println("\n=== Información del Visitante ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Tipo de documento: " + tipoDocumento);
        System.out.println("Número de documento: " + numeroDocumento);
        System.out.printf("Tiempo de visita registrado: %d:%02d horas\n", horas, minutos);
        scanner.close();
    }
}