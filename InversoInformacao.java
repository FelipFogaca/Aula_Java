import java.util.Scanner;

public class InversoInformacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tInversor de informação");

        try {
            
            System.out.println("\n Informe o primeiro número: ");
            double a = scanner.nextDouble();
            
            System.out.println("\n Informe o segundo número: ");
            double b = scanner.nextDouble();

            double c = b;
             b = a;
             a = c;

            System.out.println("\n O valor de a: " + a);
            System.out.println("\n O valor de b: " + b);

        } catch (Exception e) {
            System.out.println("\n Informe apenas valores numéricos!!");
        } finally {
            scanner.close();
        }

    }

}
