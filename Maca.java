import java.util.Scanner;

public class Maca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t Valor das Maçãs");

        try {
            
            System.out.println("\nComprando mais de uma dúzia cada uma custará R$1,00"+"\nComprando menos de uma dúzia cada uma ");
            System.out.println("\nInforme a quantidade de maçãs que irá comprar: ");
            double unmaca = next.Double();

            if (unmaca<12){
               double valoCompra = (unmaca * 1.30)
               System.out.println("\n O valor total da compra foi R$"+valoCompra);
            }else {
                double vlCompra = (unmaca * 1)
                System.out.println("\n O valor total da compra foi R$"+vlCompra);
            }


        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
