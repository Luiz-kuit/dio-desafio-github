/******************************************************************************

Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.

- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int anoNascimento, anoBase = 2021, idade, cont = 0; 
		
		System.out.print("Qual o ano de nascimento: ");
		anoNascimento = ler.nextInt();
		
		idade = anoBase - anoNascimento; 
		
		if (idade < 18){
		    
		    System.out.println("Falta " + (18 - idade) + " Anos Para se alistar");
		    
		}
		else if (idade > 18){
		    
		    System.out.println("já se passaram " + (idade - 18) + " Anos do alistamento");
		}
		
		
		
		
		
		
	}
}
