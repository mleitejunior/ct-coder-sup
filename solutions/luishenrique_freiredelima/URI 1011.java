import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = 3.14159;
        double volume;
        
        volume = (4/3.0)*pi*Math.pow(r,r);
        System.out.printf("VOLUME = %.3f\n",volume);
    }
}
