import java.util.Scanner;

public class Velocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velocidade Média");

        try {

            System.out.println("Digite a distância percorrida: ");
            double distancia = scanner.nextDouble();

            System.out.println("Digite a o tempo que levou ");
            double tempo = scanner.nextDouble();

            if (tempo == 0) {
                throw new ArithmeticException();
            }

            double velocidade = (distancia / tempo);
            System.out.println("A velocidade média foi: " + velocidade + "km/h");

        } catch (ArithmeticException e) {
            System.out.println("Valor de tempo inválido!");
        } catch (Exception e) {
            System.out.println("Insira apenas valores numéricos!");
        } finally {
            scanner.close();
        }

    }
}
