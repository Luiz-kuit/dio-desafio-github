/*Escreva um programa para conceder um aumento percentual de
salário. Mostrar o salario aumentado.*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float salario, percentual, total;
		
		    System.out.println("Salário: ");
		salario = ler.nextFloat();
		
	    	System.out.println("Percentual Aumentado: ");
		percentual = ler.nextFloat();
		
		total = salario + (salario * percentual / 100);
		    
		    System.out.println(" O salário ficou: " + total);

		    
		
	}
}
