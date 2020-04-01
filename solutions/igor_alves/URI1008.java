import java.io.IOException;
import java.util.Scanner;
import java.util.Locale; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int numfuncionario = sc.nextInt();
        int horastrab = sc.nextInt();
        double valorporhora = sc.nextDouble();
        double salario = (horastrab * valorporhora);
        
        System.out.println("NUMBER = " + numfuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
 
    }
 
}
