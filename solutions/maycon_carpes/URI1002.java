import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 //AREA =  N ao  RAIO AO QUADRADO
         //n = 3.14159 (flutuante = duble )
         // ENTRADA = RAIO (duble - ponto fluante dupla precisão)
         //SAÍDA = ARÈA (double)
         
         //Decorar novo Scanner
         Scanner classdeEntrada = new Scanner(System.in); 
         
         double N = 3.14159d;
         double raio = classdeEntrada.nextDouble();
         double area  = N * raio * raio; 
         
            System.out.println("A=" + String.format("%.4f", area));
    }
 
}
