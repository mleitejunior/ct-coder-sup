import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double C = sc.nextDouble();
    double MEDIA = (A * 2 + B * 3 + C * 5)/10.0;

    System.out.printf("MEDIA = %.1f\n",MEDIA);
    
    }
 
}
