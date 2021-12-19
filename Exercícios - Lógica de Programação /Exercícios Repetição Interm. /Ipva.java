/******************************************************************************
Escreva um programa para receber a placa e o valor de 6 veículos e
informar o mês de pagamento do IPVA de cada veículo.



TABELA DE PAGAMENTO     Final da Placa Mês de Pagamento
                        
       1 a 3                       Janeiro
       4 a 6                       Fevereiro
       7 a 9                       Março
         0                         Abril

No final mostrar o total arrecadado com IPVA, por mês e o total geral.
Obs.: O valor do IPVA é 10% do valor do veículo
*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
	    String placa, finalPlaca;
	    final float porcentagemIpva = 0.1f;
	    float vlrVeiculo, valorIpva, totalJaneiro = 0, totalFevereiro = 0, totalMarco = 0, totalAbril = 0, totalGeral = 0;
	    
	    for (int cont = 0; cont < 6; cont++) {
	    
            System.out.print("Qual o valor do " + (cont+1) + "° veículo:"); 
            vlrVeiculo = ler.nextFloat();
            ler.nextLine();
            
            System.out.print("Qual a placa do " + (cont+1) + "° veículo:");
            placa = ler.nextLine();
            finalPlaca = placa.substring(placa.length()-1);
            
            valorIpva = vlrVeiculo * porcentagemIpva;
            
            if (finalPlaca.equals("0")){
                System.out.println("O mês de Pagamento é Abril");
                totalAbril += valorIpva;
                
            } else if (finalPlaca.equals("1") || finalPlaca.equals("2") || finalPlaca.equals("3")){
                System.out.println("O mês de Pagamento é Janeiro");
                totalJaneiro += valorIpva;
                
            } else if (finalPlaca.equals("4") || finalPlaca.equals("5") || finalPlaca.equals("6")){
                System.out.println("O mês de Pagamento é Fevereiro");    
                totalFevereiro += valorIpva;
            
            } else {
                System.out.println("O mês de Pagamento é Março"); 
                totalMarco += valorIpva;
                
            }
            
        }
        ler.close();
        
        totalGeral = totalJaneiro + totalFevereiro + totalMarco + totalAbril;
        System.out.println("\nIpva Arrecadado em Janeiro: R$" + String.format("%.3f", totalJaneiro));
        System.out.println("Ipva Arrecadado em Fevereiro: R$" + String.format("%.3f", totalFevereiro));    
        System.out.println("Ipva Arrecadado em Março: R$" + String.format("%.3f", totalMarco));
        System.out.println("Ipva Arrecadado em Abril: R$" + String.format("%.3f", totalAbril));
        System.out.println("Total Geral Arrecadado Com IPVA: R$" + String.format("%.3f", totalGeral));
        
	}
}