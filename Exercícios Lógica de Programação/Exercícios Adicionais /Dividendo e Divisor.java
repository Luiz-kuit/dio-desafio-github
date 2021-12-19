/*Elabore um programa para ler dois números (dividendo e divisor), calcule a divisão e mostre o resultado.

Obs.: Se o divisor for zero a divisão não pode ocorrer e deverá ser mostrado “Impossível divisão por 0”.*/

import java.util.Scanner;

public class Main
{
	    public static void main(String[] args) {
	
	    Scanner ler = new Scanner(System.in);
	
	float dividendo,divisor,total;
	
	    System.out.println("Dividendo:");
	dividendo = ler.nextFloat();
	    System.out.println("Divisor:");
	divisor = ler.nextFloat();
	
	total = dividendo / divisor;
	
  	    System.out.println(String.format("\n Valor da divisão: %.1f",total));

 	if (divisor == 0) {
        System.out.println("\n Impossível divisão por 0 ");
	   }

	}
}
