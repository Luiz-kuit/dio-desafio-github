/******************************************************************************

Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.

conta = valor + (valor * aumento / 100);

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);	
		
		int qtdeCigarrosPorDia, quantosAnos, totalCigarros, diasPerdidos;
		
		
		System.out.print("quantidade de cigarros fumados por dias: ");
        qtdeCigarrosPorDia = ler.nextInt();        	
		
        System.out.print("quantos anos já fumou: ");
        quantosAnos = ler.nextInt();
        
        totalCigarros = (quantosAnos * 360) * qtdeCigarrosPorDia;
        diasPerdidos = (totalCigarros * 10) / 24; 
        
        System.out.println("Dias perdidos de vida: " + diasPerdidos);
        
		
	}
}
