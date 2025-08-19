import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\tCálculo de Bhaskara");

        try {

            System.out.println("\nDigite o valor de A: ");
            double a = scanner.nextDouble();

            System.out.println("\nDigite o valor de B: ");
            double b = scanner.nextDouble();

            System.out.println("\nDigite o valor de C: ");
            double c = scanner.nextDouble();

            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                throw new ArithmeticException();
            }

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("\t\nResultado:" + "\nX1 = " + x1 + "\nX2 = " + x2);

        } catch (ArithmeticException e) {
            System.out.println("O valor delta é inválido.");

        } catch (Exception e) {
            System.out.println("Insira um valor numérico!");
        } finally {
            scanner.close();
        }

    }
}
