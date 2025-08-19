import java.util.Scanner;

public class NumeroDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\tNúmero decrescente.");

        try {

            System.out.println("\nInforme o número: ");

            double numero = 0;

            if (numero < 0){
                throw new ArithmeticException();
            }

            for (double i = numero; i > 0; i--){
                System.out.println("\nSequência: "+ i);
            }
        } catch (ArithmeticException e){
            System.out.println("\t!!O valor informado não pode ser negativo!!");
        }
         catch (Exception e) {
            System.out.println("\t!!Informe um valor numérico!!\n\n\n\n");
        } finally {
            scanner.close();
        }
    }
}
