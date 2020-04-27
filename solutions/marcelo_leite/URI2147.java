import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int qtdDeCasos = sc.nextInt();
        sc.nextLine();
        String palavra;
        
        
        for (int i = 0; i < qtdDeCasos; i++) {
            // Receber string do usuario
            palavra = sc.nextLine();
                        
            if(palavra.length() >= 9 && palavra.length() <= 10000){
                float tempoParaDigitar = palavra.length() * 0.01f;
                System.out.printf("%.2f\n", tempoParaDigitar);
            }

        }  
    }
}
