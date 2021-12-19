/******************************************************************************

Escreva um programa para receber a idade de 7 pessoas e mostrar:

• a quantidade de pessoas com 18 anos ou mais
• a idade da pessoa mais idosa
• a idade da pessoa mais nova
• a idade média
• a quantidade de pessoas com idade igual a maior idade

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		int qtda18 = 0;
		int idadeMNova = 99;
		int idadeMVelha = 0;
		int acumIdade = 0;
		int idadeMedia;
		int contIdade = 0; 
		
		for (int i = 0; i < 7; i++){
		    System.out.print("Digite a " + (i+1) + " Idade: ");
		    idade = ler.nextInt();
		    acumIdade += idade;
		    
		    
		    if (idade >= 18){
    		    qtda18++;
    		    
		    }
		    if (idade < idadeMNova){ 
                idadeMNova = idade;
		   
		    }
		    if (idade > idadeMVelha){
		        idadeMVelha = idade;
		           
		    }
		    if (idadeMVelha == idade){
		        contIdade++;
		    }
		    
		    
		}
		
		idadeMedia = acumIdade / 7;
		
		System.out.println("\nQuantidade de pessoas com 18 anos ou mais: " + qtda18);
		System.out.println("A idade da pessoa mais idosa: " + idadeMVelha);
		System.out.println("A idade da pessoa mais nova: " + idadeMNova);
		System.out.println("Idade média: " + idadeMedia);
		System.out.print("Quantidade de pessoas com idade igual a maior idade: " + contIdade);
		
		
	}
}