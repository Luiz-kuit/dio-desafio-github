/*Escreva um programa para receber a idade de 5 pessoas 
e mostrar a quantidade de pessoas com 18 anos ou mais*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		
		int idade;
		int contador = 0;
		int idade18 = 0;
		
	do {
	    System.out.println("Digite sua Idade:");
	    idade = ler.nextInt();
	    
	    if (idade >= 18) 
	        idade18++;
	    
	        contador++;
	    
	} while (contador < 5); 
	
  	
        System.out.printf("A Quantidade de pessoas com 18 anos ou mais é de :%d.", idade18);
        ler.close();
	
	 
	}
}
