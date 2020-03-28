import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();
        System.out.println("TRIANGULO: " +
                String.format("%.3f", (A*C/2)));
        System.out.println("CIRCULO: " +
                String.format("%.3f", (3.14159d * (C * C))));
        System.out.println("TRAPEZIO: " +
                String.format("%.3f", ((A + B) / 2) * C));
        System.out.println("QUADRADO: " +
                String.format("%.3f", (B * B)));
        System.out.println("RETANGULO: " +
                String.format("%.3f", (A * B)));



    }
}
