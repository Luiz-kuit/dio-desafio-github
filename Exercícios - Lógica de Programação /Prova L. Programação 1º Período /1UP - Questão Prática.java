/******************************************************************************

Um colaborador de uma fábrica trabalha diariamente 8 horas normais e até mais 4 horas extras. 

Escreva um programa para: 

a) Carregar em um vetor a quantidade de peças que um colaborador produz em cada hora de trabalho. 
A produção nas horas extras ficam nas últimas posições do vetor.

   Caso não haja produção em alguma hora normal, deve ser informado o valor -1 (um negativo).
   Caso não haja produção em alguma hora extra, deve ser informado o valor 0 (zero).

b) Mostrar:

   - Produção diária nas horas normais.
   - Produção diária nas horas extras.
   - Total de extras realizadas no dia.

c) Receber o valor do salário hora do trabalhador e mostrar: 
   - Salário diário (o valor da hora extra é 50% do valor da hora normal).

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[] qtdePecas = new int [12];
		int acumHorasNormais = 0, acumHorasExtras = 0, contHorasExtras = 0;
		double salarioHoraNormal, vlrSalarioHoraNormal,vlrSalarioHoraExtra, contSalarioDiario = 0, porcetagemHoraExtra = 0.5, totalHoraExtra;
		
		for (int i = 0; i < 8; i++){
            System.out.print("Quantidade de peças da " + (i+1) + "ª hora: ");
            qtdePecas[i] = ler.nextInt();
            acumHorasNormais += qtdePecas[i];
                        
            if (qtdePecas[i] == -1){
                acumHorasNormais++;
                System.out.println("Não há produção na hora informada");        
            }
            		    
		}
		
		for (int i = 8; i < 12; i++){
            System.out.print("Quantidade de peças da " + (i+1) + "ª hora (Hora Extra): ");
            qtdePecas[i] = ler.nextInt();
            acumHorasExtras += qtdePecas[i];
            contHorasExtras++;  
                        
             if (qtdePecas[i] == 0){
                 contHorasExtras+=-1;
                System.out.println("Não há produção na hora extra informada");        
            }
            
		}
		
		System.out.println("\nProdução diária nas horas normais: " + acumHorasNormais + " Peças");
		System.out.println("Produção diária nas horas extras: " + acumHorasExtras + " Peças");
		System.out.println("Total de horas extras realizadas no dia: " + contHorasExtras + "h");
		
		{
        System.out.print("\nQual o salário hora do trabalhador: ");
        salarioHoraNormal = ler.nextDouble();
            
            for (int i = 0; i < 8; i++){
                contSalarioDiario++;        
                
            }
            
            		        
		}
		vlrSalarioHoraNormal = salarioHoraNormal * contSalarioDiario;
		vlrSalarioHoraExtra = salarioHoraNormal * porcetagemHoraExtra; 
		totalHoraExtra = vlrSalarioHoraExtra * contHorasExtras;
		
		System.out.println("\nO salário diário normal é de: R$ " + String.format("%.2f", vlrSalarioHoraNormal));
		System.out.println("\nO salário de hora extra diário é de: R$ " + String.format("%.2f", vlrSalarioHoraExtra));
		System.out.println("\nSalário diário de hora extra é de: R$ " + String.format("%.2f", totalHoraExtra));
	}
}
