import java.util.Scanner;
import java.time.LocalDate;

public class VotarNao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t Devo votar ou não?");

        try {
            
            System.out.println("\nInforme o mês de seu nascimento de forma númerica: ");
            int mes = scanner.nextInt();

            if (mes <=0){
                throw new ArithmeticException();
            }
            
            System.out.println("\nInforme o ano de seu nascimento de forma númerica: ");
            int ano = scanner.nextInt();

            if (ano <=0){
                throw new ArithmeticException();
            }
            LocalDate hoje = LocalDate.now();
            int anoAtual = hoje.getYear();
            int mesAtual = hoje.getMonthValue();

            int idade = anoAtual - ano;

            if (mesAtual <mes) {
                idade--;
            }
            
            if (idade<16){
                System.out.println("\nVocê ainda não pode votar, pois tem "+ idade + "anos");
            } 
            if (idade >=16 && idade <18 ) {
                System.out.println("\nComo você tem " + idade + " anos você pode votar, mas não é obrigatório!");
            }
            if (idade > 18){
                System.out.println("\nComo você tem " + idade + " anos você deve votar, pois é obrigatório!");
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
