/******************************************************************************

2. Uma indústria de peças automotivas trabalha em 2 turnos. Diariamente o responsável de cada turno registra a quantidade
de peças produzida em seu turno.
Elabore um programa para ler a quantidade de peças produzidas em cada turno de um dia e mostrar o total de peças
produzidas no dia.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
        float turno1;
        float turno2;
        float total;
        
        System.out.print("Qual a qtd. de peças produzidas no 1º turno: ");
		turno1 = ler.nextFloat();
		
		System.out.print("Qual a qtd. de peças produzidas no 2º turno: ");
		turno2 = ler.nextFloat();
		
		total = turno1 + turno2;
		
		System.out.println("\nTotal de peças produzidas no dia: " + total);
		
		
	}
}
