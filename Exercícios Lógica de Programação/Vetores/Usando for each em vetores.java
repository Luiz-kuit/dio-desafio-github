/*

Usando for each em vetores

*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
        double v[] = {3.5, 2.7, 9};
        
        for (double valor: v){
            System.out.println(valor);
        }
	}
}
