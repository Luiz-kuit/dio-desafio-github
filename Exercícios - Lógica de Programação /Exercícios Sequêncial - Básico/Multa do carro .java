/******************************************************************************

Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

*******************************************************************************/

import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int velocidade, calculoMulta, valorMulta;
		
		System.out.print("Digite a velocidade: ");
		velocidade = ler.nextInt();
		
		if (velocidade > 80){
            calculoMulta = velocidade - 80;
            valorMulta = calculoMulta * 5;
            
            	    
		   System.out.println("Valor da Multa " + valorMulta);
		}
		
		
		
		
	}
}
