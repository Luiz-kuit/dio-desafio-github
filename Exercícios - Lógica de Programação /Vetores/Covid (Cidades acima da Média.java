/*Escreva um programa para receber a quantidade de pessoas contraminadas com o corona vírus nas 5 cidades
principais cidades de um estado. Ao final mostrar quantas cidades tiveram
iguais ou superiores a média geral

*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String cidades [] = new String [5];
		int quantidadePessoas [] = new int [5];
		int totalQuantidade = 0;
		float mediaGeral;
		int contIgualAcimaMedia = 0;
		
		for (int i = 0; i < quantidadePessoas.length; i++) {
		    System.out.printf("\n%dº Cidade Contaminada: ", (i+1));
		    cidades[i] = ler.nextLine();
		    
		    System.out.printf("\nQuantas Pessoas Foram Contaminadas na %dº Cidade: ", (i+1));
		    quantidadePessoas[i] = ler.nextInt();
		    ler.nextLine();
		    totalQuantidade += quantidadePessoas[i];
		}
		
		mediaGeral = totalQuantidade / quantidadePessoas.length;
		
        for(int i = 0; i < quantidadePessoas.length; i++){
            
            if (quantidadePessoas[i] >= mediaGeral){
                contIgualAcimaMedia++;
            }
        }            		
		
		System.out.print("------------------------------------------------------");
		
		System.out.println("\nA Média Geral de Contaminados é: " + mediaGeral);
		System.out.println("\n" + contIgualAcimaMedia + " Cidade(s) Está(ão) Igual ou Acima da Média");
	}
}
