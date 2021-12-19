/*

Usando for each pegando a posição do numero;

*/

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
        int vet[] = {3, 7, 8, 2};
        for (int v:vet){
            System.out.print(v + " ");
        }
        System.out.println("");
        int posicaoVet = Arrays.binarySearch(vet, 1);
        System.out.println("A posição do vet é: " + posicaoVet);
        
        
        
	}
}
