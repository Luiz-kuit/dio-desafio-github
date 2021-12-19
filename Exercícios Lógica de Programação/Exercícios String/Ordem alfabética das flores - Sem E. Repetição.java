/*Problema: Ordenar alfabeticamente os nomes de flores.

Requisitos: Como vendedor da loja de flores eu gostaria que o sistema leia o

nome de 3 flores e mostrar os nomes em ordem alfabética.

Recomendação:
• Não utilizar estrutura de repetição.
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String flor1, flor2, flor3,vazio1, vazio2, vazio3;
		flor1 = "";
		flor2 = "";
		flor3 = "";
		vazio1 = "";
		vazio2 = "";
		vazio3 = "";
		
		System.out.print("Qual a 1° flor: ");
		flor1 = ler.nextLine();
        
        System.out.print("Qual a 2° flor: ");
        flor2 = ler.nextLine();
        
        System.out.print("Qual a 3° flor: ");
        flor3 = ler.nextLine();
        
		if(flor1.compareTo(flor2) < 0 && flor1.compareTo(flor3) < 0) {
            vazio1 = flor1;
            if (flor2.compareTo(flor3) < 0) {
                vazio2 = flor2;
                vazio3 = flor3;
		    }
		    else {
	            vazio2 = flor3;
	            vazio3 = flor2;
		    }
		}
            		            
		if (flor2.compareTo(flor1) < 0 && flor2.compareTo(flor3) < 0) {
		     vazio1 = flor2;
             if(flor1.compareTo(flor3) < 0){
                vazio2 = flor1;
                vazio3 = flor3;
             }
             else{
                vazio2 = flor3;
                vazio3 = flor1;
            }
                
		}
		if (flor3.compareTo(flor1) < 0 && flor3.compareTo(flor2) < 0) {
             vazio1 = flor3;
             if(flor1.compareTo(flor2) < 0){
                vazio2 = flor1;
                vazio3 = flor2;           
             }
             else{
                vazio2 = flor2;
                vazio3 = flor1;
             }
		}    
            
		System.out.println("\nOrdem alfabética das flores: ");
		System.out.println("1- "+vazio1);
		System.out.println("2- "+vazio2);
		System.out.println("3- "+vazio3);
	}
}
