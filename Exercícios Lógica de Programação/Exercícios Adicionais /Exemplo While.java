/******************************************************************************
Receba 

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		
		char tipoCurso = ' ';
		
		while (tipoCurso != 'G' && tipoCurso != 'P') { 
		
		    System.out.println("Tipo do Curso [G/P]:");
		    tipoCurso = ler.nextLine().charAt(0);
		    tipoCurso = Character.toUpperCase(tipoCurso);
		
		if (tipoCurso != 'G' && tipoCurso != 'P') {
		    System.out.println("Tipo do Curso Incorreto");
		    }
		
		}
		
		if (tipoCurso == 'G'){
		    System.out.println("Graduação");
		   
		} 
		
		else {
		    System.out.println("Pos Graduação");
		}
		    
		}
		
		
	  }
        

