/******************************************************************************

Escreva um programa para receber a idade e o sexo de 4 pessoas.
No final mostrar:

Quantidade de pessoas do sexo feminino
Quantidade de pessoas do sexo masculino
Idade média das pessoas do sexo feminino
Idade média das pessoas do sexo masculino

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		char sexo;
        int quantidadeMasc = 0;
        int quantidadeFem = 0;
        int acumIdadeMasc = 0;
        int acumIdadeFem = 0;
        int mediaIdadeMasc;
        int mediaIdadeFem;
		
		for(int i = 0; i < 4; i++) {
            System.out.print("Digite a "  + (i+1) + " idade: ");
            idade = ler.nextInt();
            
            
            System.out.print("Digite seu Sexo [M/F]: "); 
            ler.nextLine();
            sexo = ler.nextLine().charAt(0);
            sexo = Character.toUpperCase(sexo);
            
            
            if (sexo == 'M') {
                quantidadeMasc++;
                acumIdadeMasc+=idade;
            } 
            if (sexo == 'F') {
                quantidadeFem++;
                acumIdadeFem+=idade;
            }
            
		}
		
		mediaIdadeMasc = acumIdadeMasc / quantidadeMasc;
		mediaIdadeFem = acumIdadeFem / quantidadeFem; 
		
        System.out.println("\nQuantidade de Pessoas do sexo masculino: " + quantidadeMasc);
		System.out.println("Quantidade de Pessoas do sexo Feminino: " + quantidadeFem);
		System.out.println("Idade média das pessoas do sexo masculino: " + mediaIdadeMasc);
		System.out.println("Idade média das pessoas do sexo feminino: " + mediaIdadeFem);
		
		
	}
}