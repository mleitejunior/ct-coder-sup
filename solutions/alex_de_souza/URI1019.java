import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        int totalSegundos = input.nextInt();
        
        int qtdHoras = totalSegundos / 3600;
        totalSegundos = totalSegundos % 3600;
        
        int qtdMinutos = totalSegundos / 60;
        totalSegundos = totalSegundos % 60;
        
        int qtdSegundos = totalSegundos;
        
        System.out.println(qtdHoras + ":" + qtdMinutos + ":" + qtdSegundos);

 
    }
 
}
