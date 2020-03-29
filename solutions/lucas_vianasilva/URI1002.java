import java.io.IOException;
import java.util.Scanner;
import java.util.Locale; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
                Locale.setDefault(Locale.US);
                Scanner input = new Scanner(System.in);
                
                double raio = input.nextDouble();
                double pi = 3.14159;
                double area = pi * (raio*raio);
               
                System.out.printf("A=%.4f%n" , area);
                input.close();
 
    }
 
}
