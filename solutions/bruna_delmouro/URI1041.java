import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);

        double x,y;
        x = scan.nextDouble();
        y = scan.nextDouble();

        /*para que algum dos quadrantes Q1, Q2, Q3, Q4
        seja exibido na tela, é necessário que a variável 
        x E(&&) y estejam de acordo com os operadores de comparaçao.
        Existe também um outro porém. Se x não(!) for igual a zero mas y sim,
        então o ponto da coordenada estará no Eixo X. O mesmo acontece para a variavel y.
        */
        if (x > 0 && y > 0) {
            System.out.println("Q1");

        } else if (x < 0 && y > 0) {
            System.out.println("Q2");

        } else if (x < 0 && y < 0) {
            System.out.println("Q3");

        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
            
        } else if (x == 0 && y == 0) {
            System.out.println("Origem");
            
        } else if (x != 0 && y == 0) {
            System.out.println("Eixo X");
        } else if (y != 0 && x == 0) {
            System.out.println("Eixo Y");
            
        }
 
    }
 
}
