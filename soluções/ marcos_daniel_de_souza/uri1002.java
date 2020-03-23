import java.io.IOException;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        double Raio = sc.nextDouble();
        double Area = 3.14159 * Math.pow(Raio,2);
        System.out.println(String.format("A=%.4f",Area));
    }
 
}
