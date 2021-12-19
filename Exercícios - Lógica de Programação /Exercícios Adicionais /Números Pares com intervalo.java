/*Escreva um programa para receber
um número inteiro e mostrar todos os números pares positivos até o número
digitado.

Número Pares entre Intervalo Informado.

*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int primeiro, ultimo;
		    
		System.out.println(" Digite o primeiro numero");
		primeiro = ler.nextInt();
		System.out.println(" Digite o ultimo numero");
		ultimo = ler.nextInt();
		
		for(int i = primeiro; i <= ultimo; i++ ){
		    if(i%2==0){
	            System.out.println("Numeros Pares = " + i);
		    }
		}
		
		
		
		
		
		
	}
}