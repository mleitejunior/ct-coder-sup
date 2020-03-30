import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double raio = entrada.nextDouble();
        double pi = 3.14159;
        double result = (4/3.0) * (pi * raio * raio * raio);
        System.out.printf("VOLUME = %.3f\n", result);
       
       
       
    }
   
}
