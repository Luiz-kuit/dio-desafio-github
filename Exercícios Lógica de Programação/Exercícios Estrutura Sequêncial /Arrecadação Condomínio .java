/******************************************************************************

4. Problema: No mês de novembro é cobrado 1,5 vez (uma vez e meia) o valor da taxa de condomínio, para que seja
pago o 13a salário de seus funcionários, mais uma taxa extra para a festa de final de ano. A cobrança é realizada
para cada imóvel do condomínio.
Requisito: Mostrar a previsão de arrecadação do condomínio no mês de novembro, considerando o valor de um
mês convencional e o valor da taxa extra.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		float txCondominio = 350;
		float vlr13 = 1.5f;
		float txExtra = 120;
		float arrecadacaoCondominio;
		
        arrecadacaoCondominio = (txCondominio * vlr13) + txExtra;	        
		
		System.out.println("Previsão de Arrecadação: " + arrecadacaoCondominio);
		
		
		
		
		
	}
}
