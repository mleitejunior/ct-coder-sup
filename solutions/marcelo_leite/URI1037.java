import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        if (valor > 100d) {
            System.out.println("Fora de intervalo");
        } else if (valor > 75d && valor <= 100d) {
            System.out.println("Intervalo (75,100]");
        } else if (valor > 50d && valor <= 75d) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 25d && valor <= 50d) {
            System.out.println("Intervalo (25,50]");
        } else if (valor >= 0d && valor <= 25d) {
            System.out.println("Intervalo [0,25]");
        } else if (valor < 0) {
            System.out.println("Fora de intervalo");
        }
    }
}
