/*  Escreva um programa para receber o preço de um produto e
informar as opções de pagamento com seus respectivos valores.

Preço do produto R$: 150,00

Opções de pagamento
A vista com desconto de 10% R$: 135,00
3 x de R$ 50,00
Total de R$: 150,00
*/


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		
		int precoProduto = 150;
		int desconto = 10; 
		int opcaoPagamento;
		
		
		
            System.out.println("Opçao de Pagamento: "); 
		opcaoPagamento = ler.nextInt();
		
		desconto = precoProduto - (desconto * precoProduto)/100;
		
		
		 if (opcaoPagamento == 1){
		    System.out.println("Pagamento a vista com 10% de desconto: " + desconto);
		    
		 } else 
		    System.out.println("Pagamento Parcelado fica no total: " + precoProduto); 
		    
		  
		
	}
}
