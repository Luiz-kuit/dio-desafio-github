/******************************************************************************

Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.

*******************************************************************************/

import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero;
		
		System.out.print("Digite o numero: ");
		numero = ler.nextInt();
		
		if(numero %2==0 ){
		    System.out.println("O numero é PAR");
		}
		else {
		    System.out.println("O numero é IMPAR");
		}
		
	}
}
