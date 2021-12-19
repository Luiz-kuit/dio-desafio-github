/*
Escreva um programa para:
1. Receber a placa e o valor de 6 veículos.
2. Para cada veículo informado, mostrar o mês de pagamento do IPVA de acordo
com a tabela a seguir.
3. No final mostrar o total arrecadado com IPVA, por mês e geral.

TABELA DE PAGAMENTO     Final da Placa Mês de Pagamento
                        
       1 a 3                       Janeiro
       4 a 6                       Fevereiro
       7 a 9                       Março
         0                         Abril

Obs.:
• O valor do IPVA é 10% do valor do veículo.
• Considerar o modelo de placa tradicional de 7 posições (AAA9999)

*/

import java.util.Scanner;

    public class Main
    {
	    public static void main(String[] args) {
		    Scanner ler = new Scanner(System.in);
		    
		    String placa, finalPlaca;
		    int cont = 0;
		    final float porcentagemIpva = 0.1f;
		    float vlrVeiculo, valorIpva, totalJaneiro = 0, totalFevereiro = 0, totalMarco = 0, totalAbril = 0, totalGeral = 0;
	    
		    
		    while (cont < 6) {
            
                cont++;

        		System.out.println("Qual o valor do " + cont + "° veículo: ");
        		vlrVeiculo = ler.nextFloat();
        		ler.nextLine();

                System.out.println("Qual a placa do " + cont + "° veículo: ");	        	    
                placa = ler.nextLine();
                finalPlaca = placa.substring(6);
        		
		        valorIpva = vlrVeiculo * porcentagemIpva;
		    
		        if (finalPlaca.equals("0")) {
		        System.out.println("O mês do pagamento é Abril");
		        totalAbril += valorIpva;
		        
		        } else if (finalPlaca.equals("1") || finalPlaca.equals("2") || finalPlaca.equals("3")) {
		        System.out.println("O mês do pagamento é Janeiro");    
		        totalJaneiro += valorIpva;
		              
		        } else if (finalPlaca.equals("4") || finalPlaca.equals("5") || finalPlaca.equals("6")) {
		          System.out.println("O mês do pagamento é Fevereiro"); 
		          totalFevereiro += valorIpva;  
		            
		        } else {
		          System.out.println("O mês do pagamento é Março");  
		          totalMarco += valorIpva;
		        }
		       
                
		    }
            ler.close();
    
		    totalGeral = totalJaneiro + totalFevereiro + totalMarco + totalAbril;
            System.out.println("\nIPVA Arrecadado em Janeiro: R$" + String.format("%.3f", totalJaneiro));
		    System.out.println("IPVA Arrecadado em Fevereiro: R$" + String.format("%.3f", totalFevereiro));
		    System.out.println("IPVA Arrecadado em Março: R$" + String.format("%.3f", totalMarco));             
		    System.out.println("IPVA Arrecadado em Abril: R$" + String.format("%.3f", totalAbril));          
		    System.out.println("Total Geral Arrecadado Com IPVA : R$" + String.format("%.3f", totalGeral));
		    
		    
	    }
    }
