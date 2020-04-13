import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
         Scanner ler = new Scanner(System.in);

        int afastMinuPorKm = 2;
        int distanciaKmaPercorrer = ler.nextInt();
        System.out.println(distanciaKmaPercorrer * afastMinuPorKm + " minutos");
    }
}
