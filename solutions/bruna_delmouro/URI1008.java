import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#.00");
        
        int num = scan.nextInt();
        int numHoras = scan.nextInt();
        double salarioHora = scan.nextDouble();
        double total;
        
        total = numHoras * salarioHora;

        System.out.println("NUMBER = " + num);
        System.out.println("SALARY = U$ " + dc.format(total));
 
    }
 
}
