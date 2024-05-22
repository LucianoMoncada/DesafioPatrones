import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de caracteres a mostrar: ");
        int n = scanner.nextInt();

        // Patrón 1
        System.out.println("Patrón 1:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.print("*");
            else
                System.out.print(".");
        }
        System.out.println();

        // Patrón 2
        System.out.println("Patrón 2:");
        for (int i = 0; i <= n; i++) {
            System.out.print(i % 4 + 1);
        }
        System.out.println();

        // Patrón 3
        System.out.println("Patrón 3:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.print("||");
            else
                System.out.print("*");
        }
        System.out.println();

        scanner.close();
    }
}