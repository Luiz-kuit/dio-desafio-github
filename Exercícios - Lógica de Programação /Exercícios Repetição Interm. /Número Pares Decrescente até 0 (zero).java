/******************************************************************************

Escreva um programa para receber um número inteiro e mostrar
todos os números pares positivos do número digitado até 0.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, contador;
		
		System.out.print("Digite o numero: ");
		numero = ler.nextInt();
		
		
		for (int i = numero ; i >= 0 ; i-=2){
		    System.out.print(i);
                    
		}
		
	}
}