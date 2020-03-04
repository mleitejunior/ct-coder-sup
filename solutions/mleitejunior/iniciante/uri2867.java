import java.io.IOException;
import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int C, N, M, numero;
        
        
        Scanner sc = new Scanner(System.in);
        
        C = sc.nextInt();
        
        for (int i = 0; i < C; i++) {
            N = sc.nextInt();
            M = sc.nextInt();
                        
            System.out.println((int) Math.floor(Math.log10(Math.pow(N,M)))+1);
        }
    }
}