import java.io.IOException;
 
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int codProduto;
        int quantProduto;

        float valorProduto;

        codProduto = input.nextInt();
        quantProduto = input.nextInt();

        if (codProduto >= 0 && codProduto <= 5) {
            switch (codProduto) {
                case 1:
                    valorProduto = 4.00f;
                    System.out.printf("Total: R$ %.2f\n", (valorProduto * quantProduto));
                    break;

                case 2:
                    valorProduto = 4.50f;
                    System.out.printf("Total: R$ %.2f\n", (valorProduto * quantProduto));
                    break;

                case 3:
                    valorProduto = 5.00f;
                    System.out.printf("Total: R$ %.2f\n", (valorProduto * quantProduto));
                    break;

                case 4:
                    valorProduto = 2.00f;
                    System.out.printf("Total: R$ %.2f\n", (valorProduto * quantProduto));
                    break;

                case 5:
                    valorProduto = 1.50f;
                    System.out.printf("Total: R$ %.2f\n", (valorProduto * quantProduto));
                    break;
                default:

            }
        }
    }
}
