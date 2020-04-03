import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner sc = new Scanner(System.in);
//nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5
         double A, B, C, MEDIA;
        
         A = sc.nextDouble();
         B = sc.nextDouble();
         C = sc.nextDouble();
        
         MEDIA = ((A*2) + (B*3) + (C*5))/10;
         System.out.printf("MEDIA = %.1f\n",MEDIA);
 
    }
 
}
