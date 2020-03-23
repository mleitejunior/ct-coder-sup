import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        double N = 3.14159d;
        double raio = sc.nextDouble();
       
            System.out.println("A=" + String.format("%.4f", + N * raio * raio));
       
 
    }
 
}
