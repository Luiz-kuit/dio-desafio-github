/******************************************************************************

Escreva um programa que armazene 6 nomes de pessoas em um array.
Depois de armazenar os nomes, receba outro nome para procurar no array.

 - Informar, quantas vezes o nome procurado ocorre no array
 - Se o nome não for encontrado mostrar a mensagem “Nome não encontrado”.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String nomes [] = new String [6];
		String nomeProcurar;
		int cont = 0;
		
		for (int i = 0; i < nomes.length; i++){
		    System.out.print("Digite o " + (i+1) + "º nome: ");
		    nomes[i] = ler.nextLine();
		}
		

		System.out.println("\nDigite o nome a procurar: ");
		nomeProcurar = ler.nextLine();
		
        for (int i = 0; i < nomes.length; i++){
            
            if (nomeProcurar.equals(nomes[i])){
                cont++;  
                   
            }                
        }
        if (cont == 0){
            System.out.println("Nome não encontrado");    
        }
        else{
            System.out.println("O nome é encontrado " + (cont) + "x");    
        }
        
		
		
	}
}
