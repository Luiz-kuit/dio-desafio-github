/******************************************************************************

3. Problema: Um delivery que oferece tipos de prato (R$ 10,00 e R$ 13,00) e cobra R$ 7,00 de taxa de entrega,
independente da quantidade de pratos.
Requisito: Mostrar o valor da conta, considerando que o cliente pode pedir quantidades diferentes para cada tipo
de prato.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
        float prato1 = 10;
        float prato2 = 13;
        float taxa = 7;
        int quantidade1;
        int quantidade2;
        float total;
        
        System.out.print("Qual quantidade do prato de R$10,00 : ");
        quantidade1 = ler.nextInt();
        
        System.out.print("Qual quantidade do prato de R$13,00 : ");
        quantidade2 = ler.nextInt();
        
        total = (quantidade1 * prato1 + quantidade2 * prato2) + taxa;
        
        System.out.println("Valor da conta: " + total);
	}
}
