/*Escreva um programa para receber a idade de 5 pessoas 
e mostrar a quantidade de pessoas com 18 anos ou mais*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade;
		int idade18 = 0;
		int cont = 0;
		
		while (cont < 5){
		    cont++;
		    System.out.println("Digite sua Idade");
		    idade = ler.nextInt();
		        
		    
		    if (idade >= 18){
		        idade18++;
		        
		        }
		      
		    }
		        
		    System.out.printf("A quantidade de pessoas com 18 ou + é de: %d.", idade18);      
		      
		
	}
}
