import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 

        
        // Instanciar o Scanner para receber os dados
        Scanner sc = new Scanner(System.in);
        
        // Reservar espaço para o primeiro numero
        // Receber primeiro int do usuario
        int A = sc.nextInt();
        
        // Receber segundo int do usuario
        int B = sc.nextInt();
        
        // Somar os dois numeros e salvar na variavel X
        int X = A + B;
        
        // sout + TAB
        // Mostra algum valor na tela
        System.out.println("X = " + X);
    }
 
}
