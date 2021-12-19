/*Escreva um programa para receber quantos dias e horas durou uma
viagem e mostrar a duração da viagem em horas.*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int dias, horas, total; 
		 
		
		    System.out.println("Quantos dias durou a viagem: ");
		dias = ler.nextInt();
		
		    System.out.println("Quantas horas durou a viagem: ");
		horas = ler.nextInt();
		
		total = (dias * 24) + horas;
		
		    System.out.println(" Total de horas: " + total);
		
 		
		
		
	}
}
