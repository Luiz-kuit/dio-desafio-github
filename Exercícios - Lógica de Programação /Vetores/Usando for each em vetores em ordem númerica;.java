/*

Usando for each em vetores em ordem númerica;

*/

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
        double v[] = {3.5, 2.7, 9};
        
        Arrays.sort(v);
        
        for (double valor: v){
            System.out.println(valor);
        }
	}
}
