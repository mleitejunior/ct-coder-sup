import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
        int tempoGastoViagem = ler.nextInt();
        int velocidadeMediaViagem = ler.nextInt();
        
        float distanciaPercorrida = tempoGastoViagem * velocidadeMediaViagem;
        
        System.out.println((String.format("%.3f", distanciaPercorrida / 12)));

    }
}
