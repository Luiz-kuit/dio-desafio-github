/******************************************************************************

 Considerando que foi alugada uma van para um grupo familiar que
		 * deseja ratear o valor total da locação entre os integrantes do
		 * grupo de acordo com a seguinte regras:
		 * - Mulheres pagam 4/5 do que homens pagam
		 * - Crianças pagam 1/2 do que mulheres pagam
		 * 
		 *   O programa deverá ler a quantidade de homens, mulheres e criança e mostrar:
		 *   - Valor que cada homem deve pagar
		 *   - Valor que cada mulher deve pagar
		 *   - Valor que cada criança deve pagar

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);		
		
		
		final int homens = 5;
		final int mulheres = 4;
		final int criancas = 2;
		float vlrLocacao;
		int qtdeHomens, qtdeMulheres, qtdeCriancas;
		float valorUnidade, vlrHomem, vlrMulher, vlrCrianca;
		
		System.out.print("Qual o valor da locação: ");
		vlrLocacao = ler.nextFloat();
		
		System.out.print("\nQuantidade de Homens: ");
		qtdeHomens = ler.nextInt();
		
		System.out.print("Quantidade de Mulheres: ");
		qtdeMulheres = ler.nextInt();
		
		System.out.print("Quantidade de Crianças : ");
		qtdeCriancas = ler.nextInt();
		
		valorUnidade = vlrLocacao / (qtdeHomens * homens + qtdeMulheres * mulheres + qtdeCriancas * criancas);
		
		vlrHomem = valorUnidade * homens;
		vlrMulher = valorUnidade * mulheres;
		vlrCrianca = valorUnidade * criancas;
		
		System.out.println("\nCada homem paga: R$ "+ vlrHomem);
		System.out.println("Cada mulher paga: R$ "+ vlrMulher);
		System.out.println("Cada criança paga: R$ "+ vlrCrianca);
		
	}
}
