/*O álcool gel passou a ser subsidiado pelo governo e nenhum estabelecimento poderá vender o produto por preço igual ou superior ao preço praticado em dezembro/2019.

Elabore um programa para ler o preço atual e o preço praticado em dezembro/2019 e mostrar “Venda não pode ser realizada – Preço superfaturado”, 

se o preço atual for equivalente ou ultrapassar o preço praticado em dezembro/2019.*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	float precoAtual,precoPraticado;
	
	    System.out.println("Preço atual:");
	precoAtual = ler.nextFloat();
	
	precoPraticado = 10.00f;
	
    	System.out.println(String.format("\n Preço Atual: R$%.2f",precoAtual));
	
	if (precoAtual >= precoPraticado){
	    System.out.println("\n Venda não pode ser realizada – Preço superfaturado");
	}
	
	else {
	    System.out.println("\n Venda Autorizada");
	}
		
		
		
	}
}
