import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#.00");
        
        int funcionario= scan.nextInt();
        int salariohoras= scan.nextInt();
        double horas = scan.nextDouble();
        double salariofinal = (horas*salariohoras);
        
         System.out.println("NUMBER = "+funcionario);
           System.out.println("SALARY = U$ " + dc.format(salariofinal));
         
    }
 
}
