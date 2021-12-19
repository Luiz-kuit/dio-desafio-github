/*Escreva um programa para receber 6 nomes e mostrar quantos começam com
vogal e quantos começam com consoante.

Obs.: Considerar que na primeira posição do nome tem sempre uma letra.
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
        String nome;
        int vogal = 0, consoante = 0;
        
        for (int cont = 0; cont < 6; cont++){
            
            System.out.print("Qual o " + (cont+1) + "° nome:");
            nome = ler.nextLine();
            nome = (nome.substring(0,1));
            nome = nome.toUpperCase(); 
            
            if (nome.equals("A") || nome.equals("E") || nome.equals("I") || nome.equals("O") || nome.equals("U")){
                vogal++;
                
            } else {
                consoante++;
            }
        }
        ler.close();
        
        System.out.println("\nTotal de nomes que começam com vogais: " + vogal);
        System.out.println("Total de nomes que começam com consoantes: " + consoante);
		
		
	}
}

