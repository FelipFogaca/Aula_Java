import java.util.Scanner;

public class ValorSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t Cálculo Salário");

        try {

            System.out.println("\n Informe o valor da sua hora de trabalho: ");
            double valorHora = scanner.nextDouble();
            
            if(valorHora <= 0 ){
                throw new ArithmeticException();
            }

            System.out.println("\n Informe a quantidade de horas trabalhadas: ");
            double horaTrabalhada = scanner.nextDouble();
            
            if(horaTrabalhada <= 0){
                throw new ArithmeticException();
            }

            if (horaTrabalhada > 40){

               double horaExtra = (horaTrabalhada - 40);
               double saldoHora = 40;

               double valorShrExtra = (saldoHora * valorHora);
               
               double valorHrExtra = (valorHora * 1.5);
               
               double valorExtra = (horaExtra*valorHrExtra);
               
               double valorChrExtra = (valorExtra + valorShrExtra);

               System.out.println("\n O valor do salário sem hora extra é R$"+valorShrExtra);
               System.out.println("\n O valor total da hora extra é R$"+valorExtra);
               System.out.println("\n O valor total é R$"+valorChrExtra);
             
            } else {
                double salario = (valorHora * horaTrabalhada); 

                System.out.println("\n O valor do salário sem hora extra é R$"+salario);
            }
        
        } catch (ArithmeticException e) {
            System.out.println("\n!!VALOR INVÁLIDO!!");
        } catch (Exception e) {
            System.out.println("\n!!DIGITE APENAS VALORES NUMÉRICOS!!");
        } finally {
            scanner.close();
        }

    }
}
