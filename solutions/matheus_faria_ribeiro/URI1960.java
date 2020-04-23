package uri1960;

import java.util.Scanner;

public class Uri1960 {

    public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
     //esta parte representa os numeros romanos em decimais quanto cada um vale
    	int[] vaNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    	String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    	int Numero = leia.nextInt();
    	int i = 0;
        // aqui esta o comando de repetiçao para que possa somar os valores
    	while (Numero > 0) {
    		if (Numero >= vaNum[i]) {
                        Numero -= vaNum[i];
    			System.out.print(vaRom[i]);
    			
        	} else {
        		i++;
        	}
        }
    	System.out.print("\n");
    }
	
}
