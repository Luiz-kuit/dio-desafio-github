/*
Escr

*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		
		
		System.out.print("Nome 1: ");
        String texto1 = ler.nextLine();
        
        System.out.print("Nome 2: ");
        String texto2 = ler.nextLine();
		
        
        if (texto1.compareTo(texto2) > 0) {
        
        String vazio = texto1;
        texto1 = texto2;
        texto2 = vazio;
        
        }  
        
        System.out.println(texto1);
        System.out.println(texto2);
		
	}
}
