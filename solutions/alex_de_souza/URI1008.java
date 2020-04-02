import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         
         int numFuncionario, horasTrabalhadas;
         double salarioPorHora, salarioTotal;
         
         numFuncionario = sc.nextInt();
         horasTrabalhadas = sc.nextInt();
         salarioPorHora = sc.nextDouble();
         
         
         System.out.println("NUMBER = " + numFuncionario);
         
         salarioTotal = salarioPorHora * horasTrabalhadas;
         
         System.out.printf("SALARY = U$ %.2f\n", salarioTotal);
    
 
    }
 
}
