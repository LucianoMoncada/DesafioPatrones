import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de patrón a mostrar (1-4): ");
        int choice = scanner.nextInt();
        System.out.print("Ingrese el valor de n para el patrón: ");
        int n = scanner.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Patrón 1:");
                drawPattern1(n);
                break;
            case 2:
                System.out.println("Patrón 2:");
                drawPattern2(n);
                break;
            case 3:
                System.out.println("Patrón 3:");
                drawPattern3(n);
                break;
            case 4:
                System.out.println("Patrón 4:");
                drawPattern4(n);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    // Método para dibujar Patrón 1
    public static void drawPattern1(int n) {
        for (int i = 1; i <= n; i++) {
            // En la primera y última fila, se imprimen asteriscos
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++)
                    System.out.print("*");
            } else { // En las filas intermedias
                // Se imprime un asterisco al principio
                System.out.print("*");
                // Se imprimen espacios en blanco
                for (int j = 1; j <= n - 2; j++)
                    System.out.print(" ");
                // Se imprime un asterisco al final
                System.out.print("*");
            }
            System.out.println(); // Salto de línea para la siguiente iteración
        }
    }

    // Método para dibujar Patrón 2
    public static void drawPattern2(int n) {
        for (int i = 1; i <= n; i++) {
            // En la primera y última fila, se imprimen asteriscos
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++)
                    System.out.print("*");
            } else { // En las filas intermedias
                // Se imprimen espacios en blanco
                for (int j = n - i; j > 0; j--)
                    System.out.print(" ");
                // Se imprime un asterisco
                System.out.print("*");
            }
            System.out.println(); // Salto de línea para la siguiente iteración
        }
    }

    // Método para dibujar Patrón 3
    public static void drawPattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Imprimir asterisco si estamos en una posición diagonal
                if (j == i || j == n - i + 1)
                    System.out.print("*");
                else // Imprimir espacio en blanco en todas las demás posiciones
                    System.out.print(" ");
            }
            System.out.println(); // Salto de línea para la siguiente fila
        }
    }

    // Método para dibujar Patrón 4
    public static void drawPattern4(int n) {
        // Imprimir patrón según el valor de 'n'
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios en blanco
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Imprimir asterisco
            System.out.print("*");

            // Imprimir espacios en blanco en la parte derecha
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Si es la última línea, agregar un asterisco adicional
            if (i == n) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}