/******************************************************************************

Escreva um programa que armazene 6 nomes de pessoas em um array.
Depois de armazenar os nomes, receba outro nome para procurar no array.
Informar, conforme o caso, uma das mensagens abaixo:

Nome encontrado na Xª posição
Nome não encontrado

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String nomes [] = new String [6];
		String nomeProcurar;
		int posicao = -1;
		
		for (int i = 0; i < nomes.length; i++){
		    System.out.print("Digite o " + (i+1) + "º nome: ");
		    nomes[i] = ler.nextLine();
		}
		

		System.out.println("\nDigite o nome a procurar: ");
		nomeProcurar = ler.nextLine();
		
        for (int i = 0; i < nomes.length; i++){
            
            if (nomeProcurar.equals(nomes[i])){
                posicao = i;  
                   
            }                
        }		    
		if (posicao == -1){
		    System.out.print("\nNome não encontrado");    
		}
		else {
		    System.out.println("\nNome econtrado na " + (posicao+1) + "º Posição");
		}
		
		
	}
}
