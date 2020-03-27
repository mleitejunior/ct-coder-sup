import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner ler = new Scanner(System.in);

        int codPeca1 = ler.nextInt();
        int qtdPecasCompradas1 = ler.nextInt();
        double valorPeca1 = ler.nextDouble();
        int codPeca2 = ler.nextInt();
        int qtdPecasCompradas2 = ler.nextInt();
        double valorPeca2 = ler.nextDouble();
        double valorTotalAPagar =
                (qtdPecasCompradas1 * valorPeca1 + qtdPecasCompradas2 * valorPeca2);

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorTotalAPagar));
    }
}
