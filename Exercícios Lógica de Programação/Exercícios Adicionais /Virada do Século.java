/*Elabore um programa para ler o ano de nascimento de uma pessoa e mostrar:

Se a pessoa nasceu no ano 2000: “Você nasceu no ano da virada do século”

Se a pessoa não nasceu no ano 2000: “Você não nasceu no ano da virada do século”*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	int anoNascimento;
	
	    System.out.println("Qual o seu Ano de Nascimento:");
	anoNascimento = ler.nextInt();
	
	if (anoNascimento == 2000) {
	    System.out.println("\n Você nasceu no ano da virada do século!");
	}
	
	else {
	    System.out.println("\n Você não nasceu no ano da virada do século!");
	}
	
	
	}
}
