/*

Usando for each escrevendo vários números em vários vetores;

*/

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
        int vet[] = new int [20];
        Arrays.fill(vet, 10);
        
        for(int valor:vet){
            System.out.print(valor + " ");    
        }
        
        
        
        
	}
}
