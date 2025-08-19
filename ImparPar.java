public class ImparPar {
    public static void main(String[] args) {
        System.out.println("\t Números Pares e Impares de 0 a 30");

        System.out.println("\n\n");

        System.out.println("Números impares: ");

        for (int i = 0; i <= 30; i++) {
            if (!(i % 2 == 0)) {
                System.out.println(" " + i);
            } 
        }

        System.out.println("\n\n");
        System.out.println("Números pares: ");

        for (int i = 0; i <= 30; i++) {
            if ((i % 2 == 0)) {
                System.out.println(" " + i);
            } 
        }
    }
}
