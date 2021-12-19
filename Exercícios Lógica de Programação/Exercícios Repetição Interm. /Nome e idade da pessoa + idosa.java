/*Escreva um programa para receber o nome e a idade de 4 pessoas e
mostrar:
• o nome e a idade da pessoa mais idosa

Obs.: Considerar que não há pessoas com a mesma idade

*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome, nomeMVelha = null;
		int idade;
		int idadeMVelha = 0; 
		
		for (int i = 0; i < 4; i++){
		    System.out.print("Qual o " +(i+1)+ "ª nome: ");
		    nome = ler.nextLine();
		   
		    System.out.print("Qual a sua idade: ");
		    idade = ler.nextInt();
		    ler.nextLine();
		    
		    
		    if (idade > idadeMVelha){
		        idadeMVelha = idade;
		        nomeMVelha = nome;
		        
		    }
		    
		}
        
        System.out.println("\nA Pessoa Mais Idosa é " + nomeMVelha + " Com " + idadeMVelha + " Anos");
     
	}
}