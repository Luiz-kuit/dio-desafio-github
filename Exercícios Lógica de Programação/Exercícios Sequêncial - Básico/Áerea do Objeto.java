/*  A área do objeto abaixo pode ser determinada pela metade da área
de um círculo mais a metade da área de um quadrado. Escreva um
algoritmo para receber o lado do quadrado e mostrar a área do
objeto.
*/


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		
		int lado, aerea;
		
		    System.out.println("Digite o lado do quadrado ");
	    lado = ler.nextInt();
	    
	    aerea = lado * lado;
	    
	        System.out.println(" A Área do objeto é:  " + aerea);
	    
	    
		
		
	}
}
