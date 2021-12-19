/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		
		//Declaração de variáveis
		double nota1,nota2;
		double media;
		
		//Entrada de dados
		System.out.println("Qual a 1 nota: ");
		nota1 = lerTeclado.nextDouble();
		System.out.println("Qual a 2 nota: ");
		nota2 = lerTeclado.nextDouble();
		
		//processamento
		media = (nota1 + nota2) / 2; 
		
		//Saída
		System.out.println("\nSua média é: " + media);
		
	    if (media >= 6){
	        System.out.println("Aprovado");   
	    }    
		 else { 
		    System.out.println("Reprovado");
		 }
	
		
	}
}
