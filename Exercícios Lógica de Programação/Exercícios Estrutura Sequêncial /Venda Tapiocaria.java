/******************************************************************************

Um tapiocaria comercializa tapioca simples por R$ 5,00 e tapioca gourmet por R$ 8,00.
Elabore um programa que leia a quantidade de tapiocas vendidas de cada tipo e quanto gastou para comprar os
ingredientes. Mostre:
• Quantidade total de tapiocas vendidas
• O valor apurado com as vendas de tapiocas simples
• O valor apurado com as vendas de tapiocas gourmet
• O valor total bruto apurado com as vendas
• O valor total líquido* aputado com as vendas
* Valor total líquido, descontar o valor gasto com ingredientes

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        float tapiocaSimples = 5f;
        float tapiocaGourmet = 8f;
        float gastoIngredientes;
        int quantidadeSimples, quantidadeGourmet;
        float vlrBruto, vlrLiquido;
        float totalS, totalG;
        
        System.out.print("Quantidade Vendida de Tapioca Simples: ");
        quantidadeSimples = ler.nextInt();
        
        System.out.print("Quantidade Vendida de Tapioca Gourmet: ");
        quantidadeGourmet = ler.nextInt();
		
		System.out.print("\nGasto com Ingredientes: ");
		gastoIngredientes = ler.nextFloat();
		
		totalS = quantidadeSimples * tapiocaSimples;
		totalG = quantidadeGourmet * tapiocaGourmet;
		vlrBruto = totalS + totalG;
		vlrLiquido = vlrBruto - gastoIngredientes;
		
		System.out.print("--------------------------------------------------------------");
		
		System.out.println("\nValor apurado com as vendas de tapiocas simples: " + totalS);
		System.out.println("Valor apurado com as vendas de tapiocas gourmet: " + totalG);
		System.out.println("Valor total bruto apurado com as vendas " + vlrBruto);
		System.out.println("Valor total líquido apurado com as vendas " + vlrLiquido);
		
		
	}
}
