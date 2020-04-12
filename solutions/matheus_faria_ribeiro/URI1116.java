import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

 
    public static void main(String[] args) throws IOException {
 
      
Scanner input  = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0");
        int n;
        double a, b;
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            a = input.nextInt();
            b = input.nextInt();
            if(b!=0){
                System.out.println( df.format (a/b));
                

            }

            if(b==0){
            System.out.println("divisao impossivel");
            }

        }

    }

}
