import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     Scanner ler = new Scanner(System.in);

        String nomeFuncionario = ler.nextLine();
        double salarioFixo = ler.nextDouble();
        double totalVenda = ler.nextDouble();
        double totalReceber = (salarioFixo + (totalVenda * 0.15d));

        System.out.println("TOTAL = R$ " +  String.format("%.2f", totalReceber));

    }
}
