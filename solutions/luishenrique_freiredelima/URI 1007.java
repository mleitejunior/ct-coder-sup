import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,diferenca;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
         diferenca = (a*b-c*d);
         System.out.println("DIFERENCA = "+ diferenca);
 
    }
 
}
