/******************************************************************************

1. Problema: Conversão de hora para minutos e segundos
Requisito: A partir de uma determinada hora informada, mostrar:
• A hora em minutos
• A hora em segundos

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int horas;
		int minutos = 60;
		int segundos = 3600;
		
		System.out.print("Digite a quantidade de Horas: ");
		horas = ler.nextInt();
		
		
		System.out.println("Hora em minutos = " + horas * minutos + " Minutos");
		System.out.println("Hora em segundos = " + horas * segundos + " Segundos");
		
		
		
		
	}
}
