/* Escreva um programa que receba, via teclado, o valor e os dias de atraso de um determinado livro e 
  mostre o valor total da multa a ser paga.
 
  Se tiver atraso, é cobrado R$ 1,50 por dia de atraso.*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
     
     int diasAtraso;
     float valorLocacao,valorMulta,valorTotal;
     
     System.out.println("Valor da Locação:");
     valorLocacao = ler.nextFloat();
     System.out.println("Dias de Atraso:");
     diasAtraso = ler.nextInt();
    
     valorMulta = 1.50f;
    
     valorTotal = valorLocacao + (diasAtraso * valorMulta);
     
     System.out.println(String.format("\n O valor total é: R$%.2f",valorTotal));
     
     
     if (diasAtraso > 1) {
         System.out.println("\n A Entrega Está Atrasada");
     }
     
     else { 
         System.out.println("\n A entrega Está Dentro do Prazo");
         
     }
    
    
    	}
}
