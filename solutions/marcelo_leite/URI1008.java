import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);
        
        int NumberEmployee = ler.nextInt();
        int NumberHours = ler.nextInt();
        double CashForHours = ler.nextDouble();
        double Salary = (NumberHours * CashForHours);
        
                System.out.println("NUMBER = " + NumberEmployee);
                System.out.println("SALARY = U$ " + String.format("%.2f", Salary));
        // TODO code application logic here
    }
    
}
