import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int number,salaryHora;
        double horas, salary;
        
        number = sc.nextInt();
        salaryHora = sc.nextInt();
        horas = sc.nextDouble();
       
        salary = salaryHora*horas;
      
        System.out.println("NUMBER = "+number);        
        System.out.printf("SALARY = U$ %.2f\n",salary);
 
    }
 
}
