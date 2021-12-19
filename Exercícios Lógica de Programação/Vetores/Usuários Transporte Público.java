/******************************************************************************

A quantidade de usuários pagantes em transporte público por semana fica armazenado em um vetor,
onde a primeira posição corresponde ao primeiro dia da semana (domingo).

Escreva um programa para: 

a) Carregar o vetor com a quantidade de usuários de cada dia (valores positivos)

b) Receber o número do dia da semana (Criticar para só receber de 1 a 7) e mostrar:

    - Quantidade de pagantes da tarifa A (estimado em 60%)
    - Quantidade de pagantes da tarifa B (estimado em 40%)
    - Apurado estimado (Tarifa A = R$ 3,50; Tarifa B = R$ 4,50)

c) Quantidade de usuários no final de semana. 

d) Quantidade de usuários nos dias úteis. 

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int [] qtdeUsuarios = new int [7];
		int acumUsuarios = 0, acumFinalSemana = 0, acumDiasUteis = 0;
		float qtdePagantesA, qtdePagantesB, porcentagemPagantesA = 0.6f, porcentagemPagantesB = 0.4f;
		float apuradoEstimadoA, apuradoEstimadoB, tarifaA = 3.50f, tarifaB = 4.50f;
		
		for (int i = 0; i < qtdeUsuarios.length; i++){
		    System.out.print("Quantidade de usuários do " + (i+1) + " dia: ");
		    qtdeUsuarios[i] = ler.nextInt();
		    acumUsuarios += qtdeUsuarios[i];
		    
		}
        
        qtdePagantesA = acumUsuarios * porcentagemPagantesA;
        System.out.println("\nQuantidade de pagantes da tarifa A: " + String.format("%.0f", qtdePagantesA));
        
        qtdePagantesB = acumUsuarios * porcentagemPagantesB;
        System.out.println("\nQuantidade de pagantes da tarifa B: " + String.format("%.0f", qtdePagantesB));
		
		apuradoEstimadoA = qtdePagantesA * tarifaA;
		System.out.println("\nApurado estimado da tarifa A: R$ " + String.format("%.2f", apuradoEstimadoA));
		
		apuradoEstimadoB = qtdePagantesB * tarifaB;
		System.out.println("\nApurado estimado da tarifa B: R$ " + String.format("%.2f", apuradoEstimadoB));
		
		
		for (int i = 0; i < 7; i+=6){
            acumFinalSemana += qtdeUsuarios[i];
            
		}
		System.out.println("\nQuantidade de usuários no final de semana: " + acumFinalSemana);
		
		for (int i = 1; i < 6; i++){
            acumDiasUteis += qtdeUsuarios[i];
		
		}
		System.out.println("\nQuantidade de usuários nos dias úteis: " + acumDiasUteis);
		
		
	}
}
