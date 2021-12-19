/*Escreva um programa para:
Receber o salário dos 4 funcionários que trabalham no setor de RH.
Calcular e mostrar o salário médio
Para os funcionário que recebem abaixo da média, conceder um aumento de 10%.
Mostrar o novo salário (se recebeu aumento)
Mostrar o valor total do aumento salarial
Mostrar o total do salarial do setor de RH
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double salarios[] = new double[4];
		double totalSalarios = 0;
		double media;
		double aumento;
		double totalAumento = 0;
		double totalSalariosRh = 0;
		
		for (int i = 0; i < salarios.length; i++) {
		    System.out.printf("Qual o salario do %dº funcionário: ", (i+1));
		    salarios[i] = ler.nextDouble();
		    totalSalarios += salarios[i];
		}
        
        media = totalSalarios / salarios.length;
        System.out.printf("\nSalário médio: %.2f", media);
        
        for(int i = 0; i < salarios.length; i++) {
            
            if(salarios[i] < media){
               aumento = salarios[i]*.10;
               salarios[i] = salarios[i] + aumento;
               System.out.printf("\nRecebeu um aumento de: %.2f ", salarios[i]);
               totalAumento += aumento;
            }
               totalSalariosRh += salarios[i];    
        }
        
        System.out.printf("\nTotal de Aumento: %.2f", totalAumento);
        System.out.printf("\nTotal de Salários", totalSalariosRh);
	}
	
}
