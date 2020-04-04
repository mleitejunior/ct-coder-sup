import java.io.IOException;
import java.util.Scanner;
import java.util.Locale; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double X1 = sc.nextDouble();
        double Y1 = sc.nextDouble();
        
        double X2 = sc.nextDouble();
        double Y2 = sc.nextDouble();
        
        double DISTXY = Math.sqrt(Math.pow(X2 - X1,2) + Math.pow(Y2 - Y1,2));
        
        System.out.printf("%.4f\n", DISTXY);
 
    }
 
}
