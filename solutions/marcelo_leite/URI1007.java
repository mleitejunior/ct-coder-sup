import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);
        
        int A = ler.nextInt();
        int B = ler.nextInt();
        int C = ler.nextInt();
        int D = ler.nextInt();
        int DIFERENCA = (A*B - C*D);
                
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
